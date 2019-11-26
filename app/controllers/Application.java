package controllers;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.megadix.jfcm.CognitiveMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mysql.cj.xdevapi.JsonNumber;

import flexjson.JSON;
import models.dao.CourseDao;
import models.dao.FeedbackDao;
import models.dao.FeedbackPredictionDao;
import models.dao.FirstLevelFeedbackAssociationDao;
import models.dao.GroupsAssociationDao;
import models.dao.MeasurementsAssociationDao;
import models.dao.SecondLevelFeedbackAssociationDao;
import models.dao.UserDao;
import models.dao.UserHistoryDao;
import models.dao.UserMeasureDao;
import models.dto.FeedbackDto;
import models.dto.FeedbackPredictionDto;
import models.dto.FirstLevelFeedbackAssociationDto;
import models.dto.GroupsAssociationDto;
import models.dto.MeasurementsAssociationDto;
import models.dto.SecondLevelFeedbackAssociationDto;
import models.dto.UserDto;
import models.dto.UserHistoryDto;
import models.dto.UserMeasureDto;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utilities.ActionAssociation;
import utilities.DateUtil;
import utilities.MapHandler;
import utilities.Measures;

public class Application extends Controller {
	 
	public Result authenticate(Http.Request request, String email, String password) {

		UserDto user = null;
		try {
			 user= new UserDao().doLogin(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(Json.toJson(user).toString());
	    return ok(Json.toJson(user).toString()).addingToSession(request, "connected",Json.toJson(user).toString());
	
	}
	
	public Result courseDetails(Http.Request request, String courseId) {
		//Retrieve all the course's info 
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		
		return ok(views.html.course_details.render(user));
		
	}
	
	public Result courseMembers(Http.Request request, String courseId) {
		//Change this body method if you want to retrieve all students by a courseId. Use UserHistoryDao.retrieveAllStudentsByCourseId
		List<UserDto> members= null;
		ArrayList<String>[] result= null;
		try {
			members= UserDao.doRetrieveStudents();
			result= new ArrayList[members.size()];
			
			for(int i=0; i<members.size(); i++) {
				String status;
				UserHistoryDto user = UserHistoryDao.retrieveUserByCourseAndUserId(courseId, members.get(i).getUserId());
				String lastEvent = user.getLastEvent();
		
				result[i]= new ArrayList<String>();
				result[i].add(members.get(i).getEmail());
				result[i].add(members.get(i).getUserId());
				result[i].add(members.get(i).getName());
				result[i].add(members.get(i).getSurname());
				result[i].add(lastEvent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok(Json.toJson(result));
	}
	
	public Result studentStats(Http.Request request) {
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		
		return ok(views.html.student_measures.render(user));
	}

	public Result fetchStudentStats(Http.Request request, String courseId, String userId) {
		  List<UserMeasureDto> userMeasures = null;
		  ArrayList<Object> toJson = new ArrayList<Object>();
		  try {
			   userMeasures = UserMeasureDao.retieveUserMeasure(courseId, userId);
			   String startDate = UserHistoryDao.retrieveStartDate(courseId, userId);
			   toJson.add(userMeasures);
			   toJson.add(startDate);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  
		  return ok(Json.toJson(toJson));
	}
	
	public Result fetchStudentRecords(Http.Request request, String courseId, String userId) {
		  
		  List<UserMeasureDto> userMeasures = null;
		  List<FeedbackDto> userFeedback = null;
		  ArrayList<Object> toJson = new ArrayList<Object>();
		  
		  try {
		   
		   int courseLife = CourseDao.retrieveCourseLife(courseId);
		   userMeasures = UserMeasureDao.retieveUserMeasure(courseId, userId);
		   userFeedback = FeedbackDao.retrieveFeedbackList(courseId, userId);
		   String startDate = UserHistoryDao.retrieveStartDate(courseId, userId);
		   toJson.add(userMeasures);
		   toJson.add(courseLife);
		   toJson.add(startDate);
		   toJson.add(userFeedback);
		   
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  
		  return ok(Json.toJson(toJson));
	}
	
	public Result fetchFeedback(Http.Request request, String userId) {
		
		List<FeedbackDto> userFeedback = null;
		
		try {
			userFeedback = FeedbackDao.retrieveFeedbackListByUser(userId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ok(Json.toJson(userFeedback));
	}
	
	public Result retrieveStudentsStatus(Http.Request request, String courseId) throws ConfigurationException, Exception {
		
		List<UserHistoryDto> studentsList = UserHistoryDao.retrieveAllStudentsByCourseId(courseId);
		Measures measure= null;	
		
		ObjectMapper  mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		
		try {
			for(UserHistoryDto u : studentsList) {
				CognitiveMap map = MapHandler.loadFromXML();
				
				int weekNumber = UserMeasureDao.retieveUserLastWeekNumber(courseId, u.getUserId());
				if(weekNumber != -1) {
					if(! u.isDropped()) {
						MapHandler.setConceptsValues(map, u, weekNumber);
						
						measure =  MapHandler.executeOnTheFly(map, u, weekNumber);
						String q_eng= ActionAssociation.getConceptQualifier(measure.getEngagement_value());
						String q_mot= ActionAssociation.getConceptQualifier(measure.getMotivation_value());
						
						MeasurementsAssociationDto measurementAssociation= MeasurementsAssociationDao.doRetrieveAssociation(q_mot, q_eng);
						
						node.set(u.getUserId(), mapper.convertValue(measurementAssociation.getStatusType(), JsonNode.class));
					}else {
						node.set(u.getUserId(), mapper.convertValue("dropped", JsonNode.class));
					}
					
				}else {
					node.set(u.getUserId(), mapper.convertValue("undefined", JsonNode.class));

				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return ok(node);
	}
	
	public Result sendFeedback(Http.Request request, String courseId, String userId, int actionId, String actionType, String name, String description, String date) throws ParseException {
		//Calendar calendar = Calendar.getInstance();
		//String currentDate = DateUtil.format((GregorianCalendar) calendar);
		String currentDate= DateUtil.format(new GregorianCalendar(2019, 4-1, 19));
		try {
			FeedbackDao.updateFeedback(currentDate, actionId, actionType, name, description, courseId, userId, date);
			//TODO notification system: send a notification both user and teacher.
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return ok(Json.toJson("200"));
	}

	public Result executeMap(Http.Request request, String courseId, String userId, int weekNumber) {

		try {
			CognitiveMap map = MapHandler.loadFromXML();
			UserHistoryDto user = UserHistoryDao.retrieveStudentHistoryById(userId);
			MapHandler.setConceptsValues(map, user, weekNumber);
			//System.out.println("LastLesson: "+map.getConcept("c14").getOutput());
			
			MapHandler.execute(map, user,weekNumber);
			FeedbackDao.createBaseFeedback(courseId, userId, weekNumber);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ok("200");
	}

	public Result fetchStudentMeasurements(Http.Request request, String courseId, String userId, int weekNumber) {
		List<UserMeasureDto> userMeasures = null;
		try {
			userMeasures = UserMeasureDao.retrieveWeekInterations(courseId, userId ,weekNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ok(Json.toJson(userMeasures));
	}
	
	public Result feedbackChoice(Http.Request request, String courseId, String userId, int weekNumber, double mot, double eng) {
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();

		String q_mot= ActionAssociation.getConceptQualifier(mot);
		String q_eng= ActionAssociation.getConceptQualifier(eng);
		
		FirstLevelFeedbackAssociationDto actionGroup= null;
		try {
			actionGroup = FirstLevelFeedbackAssociationDao.retrieveActionGroup(q_mot, q_eng);
			List<GroupsAssociationDto> groups= GroupsAssociationDao.retrieveActionsList(actionGroup.getGroupId());
			
			for(GroupsAssociationDto g: groups) { 
				List<SecondLevelFeedbackAssociationDto> actions= SecondLevelFeedbackAssociationDao.retrieveActionsList(g.getActionId());
				ArrayNode actionsList= mapper.valueToTree(actions);
				node.putArray(g.getType()).addAll(actionsList);
			}
						
			node.set("numActions", mapper.convertValue(groups.size(), JsonNode.class));
			
			UserMeasureDto currentMeasures= UserMeasureDao.retieveUserMeasure(courseId, userId, weekNumber);
			node.set("currentMeasures", mapper.convertValue(currentMeasures, JsonNode.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok(node);
	}
	
	public Result retrieveFeedbackImprovements(Http.Request request, int actionId) {
		ObjectMapper  mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();

		try {
			List<FeedbackPredictionDto> improvements= FeedbackPredictionDao.retrieveImprovementsByActionId(actionId);
			ArrayNode actionsList= mapper.valueToTree(improvements);
			node.putArray("improvements").addAll(actionsList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok(node);
	}
	
	public Result checkEfficacy(Http.Request request,String courseId, String userId, String prevDate, int prevWeek) {
		int efficacy= -1;
		try {
			UserMeasureDto prevMeasures= UserMeasureDao.retieveLastUserMeasure(courseId, userId, prevWeek);
			UserMeasureDto currMeasures= UserMeasureDao.retieveLastUserMeasure(courseId, userId, prevWeek+1);
			FeedbackDto lastFeedbackReceived= FeedbackDao.retrieveFeedbacByDate(courseId, userId, prevDate);
			List<FeedbackPredictionDto> improvements = FeedbackPredictionDao.retrieveImprovementsByActionId(lastFeedbackReceived.getActionId()); 
			//Check over curr_Measures and (preMeasures+improvements)
			if(improvements.size() == 1) {
				double prev_conceptValue=0.0;
				double curr_conceptValue=0.0;
				
				switch (improvements.get(0).getConcept()) {
				case "Forum Activities":
					prev_conceptValue= prevMeasures.getC7();
					curr_conceptValue= currMeasures.getC7();
					break;
				case "Interaction": 
					prev_conceptValue= prevMeasures.getC17();
					curr_conceptValue= currMeasures.getC17();
					break;
				case "Assignment": 
					prev_conceptValue= prevMeasures.getC16();
					curr_conceptValue= currMeasures.getC16();
					break;
				default:
					break;
				}
				
				if(curr_conceptValue > prev_conceptValue) {	//THERE WAS AN IMPROVEMENT
					efficacy=2;
				}else if(curr_conceptValue == prev_conceptValue) { 	//NO IMPROVEMENT
					efficacy=1;
				}else if(curr_conceptValue < prev_conceptValue){	//THERE WAS A WORSENING
					efficacy=0; 
				}
				
			}else {
				double prev_conceptsAvg= 0.0;
				double curr_conceptsAvg= 0.0;

				for(FeedbackPredictionDto f: improvements) {
					
					switch (f.getConcept()) {
					case "Forum Activities":
						prev_conceptsAvg += prevMeasures.getC7();
						curr_conceptsAvg += currMeasures.getC7();
						break;
					case "Interaction":
						prev_conceptsAvg += prevMeasures.getC17();
						curr_conceptsAvg += currMeasures.getC17();
						break;
					case "Assignment":
						prev_conceptsAvg += prevMeasures.getC16();
						curr_conceptsAvg += currMeasures.getC16();
						break;
					default:
						break;
					}
				}
				
				if(curr_conceptsAvg > prev_conceptsAvg) {	//THERE WAS AN IMPROVEMENT
					efficacy=2;
				}else if(curr_conceptsAvg == prev_conceptsAvg) { 	//NO IMPROVEMENT
					efficacy=1;
				}else if(curr_conceptsAvg < prev_conceptsAvg){	//THERE WAS A WORSENING
					efficacy=0; 
				}
			}
			FeedbackDao.updateFeedbackEfficacy(courseId, userId, prevDate, efficacy);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ok(Json.toJson(200));
	}
	
	public Result loadContents(Http.Request request,String contentType) {
		JsonNode node= null;
		UserDto user= null;
		if(request.session().getOptional("connected").isPresent()) {	
    		node = Json.parse(request.session().getOptional("connected").get());
    		user = Json.fromJson(node, UserDto.class);
		}
		return ok(views.html.contents_container.render(user, contentType));
	}
	
	public Result logout(Http.Request request) {
		return ok(views.html.index.render()).removingFromSession(request,"connected");
	}
	
	
	
}
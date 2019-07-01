package controllers;

import java.sql.Connection;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import models.dao.UserDao;
import models.dao.UserMeasureDao;
import models.dto.UserDto;
import models.dto.UserMeasureDto;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class Application extends Controller {
	 
	public Result authenticate(Http.Request request, String email, String password) {

		UserDto user = null;
		try {
			 user= new UserDao().doLogin(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Json.toJson(user).toString());
        return ok().addingToSession(request, "connected",Json.toJson(user).toString());
	}
	
	
	public Result courseDetails(Http.Request request, String courseId) {
		//Retrieve all the course's info 
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		return ok(views.html.course_details.render(user));
		
	}
	
	public Result studentStats(Http.Request request) {
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		return ok(views.html.student_measures.render(user));
	}

	
	public Result fetchStudentStats(Http.Request request, String courseId, String userId) {
		List<UserMeasureDto> userMeasures = null;
		try {
			userMeasures = UserMeasureDao.retieveUserMeasure(courseId, userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ok(Json.toJson(userMeasures));
	}
	

	public Result fetchStudentMeasurements(Http.Request request) {
		
		String userId;
		String courseId;
		int weekNumber;
		
		Connection conn = null;
        /*try {
            conn = ConnectionPool.getSingleton(IConstants.DB_KEY);
            QueryRunner qRunner = new QueryRunner();
            HashMap<String, String> fetchedMap= qRunner.query(conn, FileQueryReader.getQuery("FETCH_WEEK_MEASURE"), ,new Object[]{, });
            if(user == null){
                user = new UserDto();
                user.setEmail(username);
            }
            System.out.println(user.getEmail()+", "+user.getName());
            return user;
        } finally {
            ConnectionPool.close(conn);
        }*/

		return ok();
	}
	
	
	
	public Result logout(Http.Request request) {
		return ok(views.html.index.render()).removingFromSession(request,"connected");
	}
}

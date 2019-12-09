package controllers;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.dao.ContentsResultsDao;
import models.dao.LearningContentDao;
import models.dao.UserDao;
import models.dto.UserDto;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class ARSupport extends Controller {

	public Result doLogin(String email, String password){
	    UserDto user = null;
	    
	    try{
	        user = new UserDao().doLogin(email, password);
	    }
	    catch (Exception e){
	        e.printStackTrace();
	    }
	    
	    ObjectMapper mapper = new ObjectMapper();
	    ObjectNode node = mapper.createObjectNode();
	    
	    node.set("access", mapper.convertValue(user.getName() == null ? "n" : "y", JsonNode.class));
	    node.set("user", mapper.convertValue(user, JsonNode.class));
	    
	    return ok(node);
	}
	
	public Result isQuizCompleted(String courseId, String userId, String contentType, String topic) {
		System.out.println("Controllo quiz");
		ObjectMapper mapper = new ObjectMapper();
	    ObjectNode node = mapper.createObjectNode();
	    
	    try {
			boolean quiz = ContentsResultsDao.isQuizCompleted(courseId, userId, contentType, topic);
			
			node.set("isQuizCompleted", mapper.convertValue((quiz ? 1 : 0), JsonNode.class));
			
			return ok(node);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok();
	    
		
	}
	
	public Result saveQuizResult(String courseId, String userId, String contentType, String topic, int elapsedTime, int achievedScore, int totalScore) {
		System.out.println("Salvo il quiz");
		try {
			ContentsResultsDao.doSaveContentResult(courseId, userId, contentType, topic, elapsedTime, achievedScore, totalScore);
			return ok();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok();
	}
	
	public Result updateLessonTimer(String courseId, String userId, String contentType, String topic, int elapsedTime) {
		try {

			LearningContentDao.doUpdateRecord(courseId, userId, contentType, topic, elapsedTime, 1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok();
	}

}

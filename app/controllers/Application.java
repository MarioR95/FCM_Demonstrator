package controllers;

import java.sql.Connection;
import java.util.HashMap;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.fasterxml.jackson.databind.JsonNode;

import constants.IConstants;
import flexjson.JSONSerializer;
import models.dao.UserDao;
import models.database.ConnectionPool;
import models.database.FileQueryReader;
import models.dto.UserDto;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.TrimmedBeanHandler;

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
	
	
	public Result courseDetails(Http.Request request, String courseName) {
		//Retrieve all the course's info 
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		return ok(views.html.course_details.render(user));
		
	}
	
	
	public Result logout(Http.Request request) {
		return ok(views.html.index.render()).removingFromSession(request,"connected");
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
}

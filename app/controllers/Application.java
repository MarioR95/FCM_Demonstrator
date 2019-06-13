package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import flexjson.JSONSerializer;
import models.dao.UserDao;
import models.dto.UserDto;
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
	
	
	public Result courseDetails(Http.Request request, String courseName) {
		//Retrieve all the course's info 
		JsonNode node= Json.parse(request.session().getOptional("connected").get());
		UserDto user = Json.fromJson(node, UserDto.class);
		return ok(views.html.course_details.render(user));
		
	}
	
	
	public Result logout(Http.Request request) {
		return ok(views.html.index.render()).removingFromSession(request,"connected");
	}
}

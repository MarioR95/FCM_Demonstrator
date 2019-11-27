package controllers;

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

	    String response;

	    if (user.getRole() == 1){
	        response = "y";
	    }

	    else{
	        response = user.getName() == null ? "n" : "y";
	    }

	    return ok(response);
	}
	
	
}

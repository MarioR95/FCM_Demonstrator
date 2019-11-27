package controllers;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
	
	
}

package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import flexjson.JSONDeserializer;
import models.dto.UserDto;
import play.libs.Json;
import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }
    
    
    public Result buildDashboard(Http.Request request) {
    // Get the user role from the sessione and display the correct dashboard
    	
    	if(request.session().getOptional("connected").isPresent()) {
    		
    		JsonNode node = Json.parse(request.session().getOptional("connected").get());
    		UserDto user = Json.fromJson(node, UserDto.class);
    		
        	return ok( views.html.tdashboard.render(user));
        }
    	else {
    		return ok(views.html.index.render());
    	}
    	
    }
}

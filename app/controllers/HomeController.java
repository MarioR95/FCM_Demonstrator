package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }
    
    
    public Result buildDashboard(Http.Request request) {
    
    	if(request.session().getOptional("connected").isPresent()) {
    		String username= request.session().getOptional("connected").get();
        	return ok( views.html.tdashboard.render(username));
        }
    	else {
    		return ok(views.html.index.render());
    	}
    	
    }
}

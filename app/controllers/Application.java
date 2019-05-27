package controllers;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

public class Application extends Controller {
	 
	public Result authenticate(Http.Request request, String email, String password) {
        return ok().addingToSession(request, "connected", email);
	}
}

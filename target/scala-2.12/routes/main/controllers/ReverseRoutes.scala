// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Sep 18 11:38:58 CEST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def buildDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:38
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def studentStats(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentStats")
    }
  
    // @LINE:26
    def fetchStudentMeasurements(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentMeasurements" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:28
    def executeMap(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "executeMap" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:34
    def retrieveFeedbackImprovements(actionId:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackPrediction" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("actionId", actionId)))))
    }
  
    // @LINE:32
    def feedbackChoice(courseId:String, userId:String, weekNumber:Integer, mot:Double, eng:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackChoice" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("mot", mot)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("eng", eng)))))
    }
  
    // @LINE:20
    def courseMembers(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courseMembers" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:24
    def fetchStudentRecords(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentRecords" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:11
    def authenticate(email:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "authenticate" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:30
    def fetchFeedback(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchFeedback" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:17
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:13
    def courseDetails(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "course" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:22
    def fetchStudentStats(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentStats" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
  }


}

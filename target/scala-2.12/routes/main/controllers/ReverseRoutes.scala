// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Mon Dec 09 10:34:04 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:14
  class ReverseARSupport(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def isQuizCompleted(courseId:String, userId:String, contentType:String, topic:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "isQuizCompleted" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)))))
    }
  
    // @LINE:23
    def updateLessonTimer(courseId:String, userId:String, contentType:String, topic:String, elapsedTime:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateLessonTimer" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("elapsedTime", elapsedTime)))))
    }
  
    // @LINE:14
    def doLogin(email:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doLogin" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:20
    def saveQuizResult(courseId:String, userId:String, contentType:String, topic:String, elapsedTime:Integer, achievedScore:Integer, totalScore:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "saveQuizResult" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("elapsedTime", elapsedTime)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("achievedScore", achievedScore)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("totalScore", totalScore)))))
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def buildDashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:78
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:31
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def retrieveAssignmentsDone(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrieveAssignmentsDone" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:59
    def retrieveStudentsStatus(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrieveStudentsStatus" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:37
    def studentStats(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentStats")
    }
  
    // @LINE:49
    def fetchStudentMeasurements(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentMeasurements" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:51
    def executeMap(courseId:String, userId:String, weekNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "executeMap" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)))))
    }
  
    // @LINE:57
    def retrieveFeedbackImprovements(actionId:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackPrediction" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("actionId", actionId)))))
    }
  
    // @LINE:66
    def loadContents(contentType:String, topic:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loadContents" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)))))
    }
  
    // @LINE:55
    def feedbackChoice(courseId:String, userId:String, weekNumber:Integer, mot:Double, eng:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedbackChoice" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("weekNumber", weekNumber)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("mot", mot)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("eng", eng)))))
    }
  
    // @LINE:61
    def checkEfficacy(courseId:String, userId:String, prevDate:String, prevWeek:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkEfficacy" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("prevDate", prevDate)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("prevWeek", prevWeek)))))
    }
  
    // @LINE:43
    def courseMembers(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courseMembers" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:47
    def fetchStudentRecords(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentRecords" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:70
    def retrieveQuestions(contentType:String, topic:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrieveQuestions" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)))))
    }
  
    // @LINE:31
    def authenticate(email:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "authenticate" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:53
    def fetchFeedback(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchFeedback" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:72
    def updateLearingResult(courseId:String, userId:String, contentType:String, topic:String, elapsedTime:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateLearningResult" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("elapsedTime", elapsedTime)))))
    }
  
    // @LINE:39
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:34
    def courseDetails(courseId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "course" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)))))
    }
  
    // @LINE:63
    def sendFeedback(courseId:String, userId:String, actionId:Integer, actionType:String, name:String, description:String, date:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendFeedback" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("actionId", actionId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("actionType", actionType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("description", description)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("date", date)))))
    }
  
    // @LINE:45
    def fetchStudentStats(courseId:String, userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fetchStudentStats" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)))))
    }
  
    // @LINE:74
    def fetchQuizResult(courseId:String, userId:String, contentType:String, topic:String, elapsedTime:Integer, achievedScore:Integer, totalScore:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courseQuizResult" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("courseId", courseId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contentType", contentType)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("topic", topic)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("elapsedTime", elapsedTime)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("achievedScore", achievedScore)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("totalScore", totalScore)))))
    }
  
  }


}

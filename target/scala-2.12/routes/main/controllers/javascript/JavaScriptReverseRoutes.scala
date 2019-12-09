// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Dec 04 16:01:19 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:14
  class ReverseARSupport(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def isQuizCompleted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ARSupport.isQuizCompleted",
      """
        function(courseId0,userId1,contentType2,topic3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "isQuizCompleted" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic3)])})
        }
      """
    )
  
    // @LINE:23
    def updateLessonTimer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ARSupport.updateLessonTimer",
      """
        function(courseId0,userId1,contentType2,topic3,elapsedTime4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateLessonTimer" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic3), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("elapsedTime", elapsedTime4)])})
        }
      """
    )
  
    // @LINE:14
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ARSupport.doLogin",
      """
        function(email0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:20
    def saveQuizResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ARSupport.saveQuizResult",
      """
        function(courseId0,userId1,contentType2,topic3,elapsedTime4,achievedScore5,totalScore6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saveQuizResult" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic3), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("elapsedTime", elapsedTime4), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("achievedScore", achievedScore5), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("totalScore", totalScore6)])})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def buildDashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.buildDashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:79
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def retrieveStudentsStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveStudentsStatus",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrieveStudentsStatus" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:37
    def studentStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentStats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentStats"})
        }
      """
    )
  
    // @LINE:49
    def fetchStudentMeasurements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentMeasurements",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentMeasurements" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:51
    def executeMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.executeMap",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "executeMap" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:57
    def retrieveFeedbackImprovements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveFeedbackImprovements",
      """
        function(actionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackPrediction" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("actionId", actionId0)])})
        }
      """
    )
  
    // @LINE:66
    def loadContents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loadContents",
      """
        function(contentType0,topic1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loadContents" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic1)])})
        }
      """
    )
  
    // @LINE:55
    def feedbackChoice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.feedbackChoice",
      """
        function(courseId0,userId1,weekNumber2,mot3,eng4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackChoice" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("mot", mot3), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("eng", eng4)])})
        }
      """
    )
  
    // @LINE:61
    def checkEfficacy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkEfficacy",
      """
        function(courseId0,userId1,prevDate2,prevWeek3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkEfficacy" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("prevDate", prevDate2), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("prevWeek", prevWeek3)])})
        }
      """
    )
  
    // @LINE:43
    def courseMembers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseMembers",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courseMembers" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:47
    def fetchStudentRecords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentRecords",
      """
        function(courseId0,userId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentRecords" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1)])})
        }
      """
    )
  
    // @LINE:68
    def retrieveQuestions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveQuestions",
      """
        function(contentType0,topic1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrieveQuestions" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic1)])})
        }
      """
    )
  
    // @LINE:31
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function(email0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:53
    def fetchFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchFeedback",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchFeedback" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId0)])})
        }
      """
    )
  
    // @LINE:71
    def updateLearingResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateLearingResult",
      """
        function(courseId0,userId1,contentType2,topic3,elapsedTime4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateLearningResult" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic3), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("elapsedTime", elapsedTime4)])})
        }
      """
    )
  
    // @LINE:39
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:34
    def courseDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseDetails",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:63
    def sendFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sendFeedback",
      """
        function(courseId0,userId1,actionId2,actionType3,name4,description5,date6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendFeedback" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("actionId", actionId2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("actionType", actionType3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("description", description5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("date", date6)])})
        }
      """
    )
  
    // @LINE:45
    def fetchStudentStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentStats",
      """
        function(courseId0,userId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentStats" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1)])})
        }
      """
    )
  
    // @LINE:74
    def fetchQuizResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchQuizResult",
      """
        function(courseId0,userId1,contentType2,topic3,elapsedTime4,achievedScore5,totalScore6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courseQuizResult" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contentType", contentType2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("topic", topic3), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("elapsedTime", elapsedTime4), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("achievedScore", achievedScore5), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("totalScore", totalScore6)])})
        }
      """
    )
  
  }


}

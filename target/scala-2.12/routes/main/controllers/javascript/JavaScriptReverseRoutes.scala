// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Nov 27 11:23:37 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

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

  // @LINE:55
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def retrieveStudentsStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveStudentsStatus",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrieveStudentsStatus" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:25
    def studentStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentStats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentStats"})
        }
      """
    )
  
    // @LINE:37
    def fetchStudentMeasurements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentMeasurements",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentMeasurements" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:39
    def executeMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.executeMap",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "executeMap" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:45
    def retrieveFeedbackImprovements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveFeedbackImprovements",
      """
        function(actionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackPrediction" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("actionId", actionId0)])})
        }
      """
    )
  
    // @LINE:43
    def feedbackChoice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.feedbackChoice",
      """
        function(courseId0,userId1,weekNumber2,mot3,eng4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackChoice" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("mot", mot3), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("eng", eng4)])})
        }
      """
    )
  
    // @LINE:49
    def checkEfficacy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkEfficacy",
      """
        function(courseId0,userId1,prevDate2,prevWeek3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkEfficacy" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("prevDate", prevDate2), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("prevWeek", prevWeek3)])})
        }
      """
    )
  
    // @LINE:31
    def courseMembers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseMembers",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courseMembers" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:35
    def fetchStudentRecords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentRecords",
      """
        function(courseId0,userId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentRecords" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1)])})
        }
      """
    )
  
    // @LINE:19
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function(email0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:41
    def fetchFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchFeedback",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchFeedback" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId0)])})
        }
      """
    )
  
    // @LINE:27
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:22
    def courseDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseDetails",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:51
    def sendFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sendFeedback",
      """
        function(courseId0,userId1,actionId2,actionType3,name4,description5,date6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendFeedback" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("actionId", actionId2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("actionType", actionType3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name4), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("description", description5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("date", date6)])})
        }
      """
    )
  
    // @LINE:33
    def fetchStudentStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentStats",
      """
        function(courseId0,userId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentStats" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1)])})
        }
      """
    )
  
  }


}

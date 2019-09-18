// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Sep 18 11:38:58 CEST 2019

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

  
    // @LINE:7
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

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def studentStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentStats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentStats"})
        }
      """
    )
  
    // @LINE:26
    def fetchStudentMeasurements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentMeasurements",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentMeasurements" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:28
    def executeMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.executeMap",
      """
        function(courseId0,userId1,weekNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "executeMap" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2)])})
        }
      """
    )
  
    // @LINE:34
    def retrieveFeedbackImprovements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.retrieveFeedbackImprovements",
      """
        function(actionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackPrediction" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("actionId", actionId0)])})
        }
      """
    )
  
    // @LINE:32
    def feedbackChoice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.feedbackChoice",
      """
        function(courseId0,userId1,weekNumber2,mot3,eng4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackChoice" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("weekNumber", weekNumber2), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("mot", mot3), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("eng", eng4)])})
        }
      """
    )
  
    // @LINE:20
    def courseMembers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseMembers",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courseMembers" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:24
    def fetchStudentRecords: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchStudentRecords",
      """
        function(courseId0,userId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchStudentRecords" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId1)])})
        }
      """
    )
  
    // @LINE:11
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function(email0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:30
    def fetchFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.fetchFeedback",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetchFeedback" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userId", userId0)])})
        }
      """
    )
  
    // @LINE:17
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:13
    def courseDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.courseDetails",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("courseId", courseId0)])})
        }
      """
    )
  
    // @LINE:22
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

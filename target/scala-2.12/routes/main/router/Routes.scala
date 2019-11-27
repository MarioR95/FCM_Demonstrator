// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Nov 27 12:27:42 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_3: controllers.HomeController,
  // @LINE:14
  ARSupport_1: controllers.ARSupport,
  // @LINE:22
  Application_0: controllers.Application,
  // @LINE:59
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_3: controllers.HomeController,
    // @LINE:14
    ARSupport_1: controllers.ARSupport,
    // @LINE:22
    Application_0: controllers.Application,
    // @LINE:59
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_3, ARSupport_1, Application_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, ARSupport_1, Application_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.buildDashboard(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.ARSupport.doLogin(email:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Application.authenticate(request:Request, email:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course""", """controllers.Application.courseDetails(request:Request, courseId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentStats""", """controllers.Application.studentStats(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courseMembers""", """controllers.Application.courseMembers(request:Request, courseId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentStats""", """controllers.Application.fetchStudentStats(request:Request, courseId:String, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentRecords""", """controllers.Application.fetchStudentRecords(request:Request, courseId:String, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentMeasurements""", """controllers.Application.fetchStudentMeasurements(request:Request, courseId:String, userId:String, weekNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """executeMap""", """controllers.Application.executeMap(request:Request, courseId:String, userId:String, weekNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchFeedback""", """controllers.Application.fetchFeedback(request:Request, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feedbackChoice""", """controllers.Application.feedbackChoice(request:Request, courseId:String, userId:String, weekNumber:Integer, mot:Double, eng:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """feedbackPrediction""", """controllers.Application.retrieveFeedbackImprovements(request:Request, actionId:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """retrieveStudentsStatus""", """controllers.Application.retrieveStudentsStatus(request:Request, courseId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkEfficacy""", """controllers.Application.checkEfficacy(request:Request, courseId:String, userId:String, prevDate:String, prevWeek:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendFeedback""", """controllers.Application.sendFeedback(request:Request, courseId:String, userId:String, actionId:Integer, actionType:String, name:String, description:String, date:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~""",
      Seq("""anyhost""")
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_buildDashboard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_buildDashboard1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_3.buildDashboard(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buildDashboard",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ARSupport_doLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_ARSupport_doLogin2_invoker = createInvoker(
    ARSupport_1.doLogin(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ARSupport",
      "doLogin",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """doLogin""",
      """""",
      Seq("""anyhost""", """nocsrf""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Application_authenticate3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.authenticate(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String]),
      "POST",
      this.prefix + """authenticate""",
      """""",
      Seq("""anyhost""", """nocsrf""")
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_courseDetails4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course")))
  )
  private[this] lazy val controllers_Application_courseDetails4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.courseDetails(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "courseDetails",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """course""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_studentStats5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentStats")))
  )
  private[this] lazy val controllers_Application_studentStats5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.studentStats(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentStats",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """studentStats""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.logout(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """logout""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_courseMembers7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courseMembers")))
  )
  private[this] lazy val controllers_Application_courseMembers7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.courseMembers(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "courseMembers",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """courseMembers""",
      """ Database interaction routes""",
      Seq("""anyhost""")
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_fetchStudentStats8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentStats")))
  )
  private[this] lazy val controllers_Application_fetchStudentStats8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.fetchStudentStats(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchStudentStats",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String]),
      "GET",
      this.prefix + """fetchStudentStats""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_fetchStudentRecords9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentRecords")))
  )
  private[this] lazy val controllers_Application_fetchStudentRecords9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.fetchStudentRecords(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchStudentRecords",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String]),
      "GET",
      this.prefix + """fetchStudentRecords""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_fetchStudentMeasurements10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentMeasurements")))
  )
  private[this] lazy val controllers_Application_fetchStudentMeasurements10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.fetchStudentMeasurements(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchStudentMeasurements",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """fetchStudentMeasurements""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_executeMap11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("executeMap")))
  )
  private[this] lazy val controllers_Application_executeMap11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.executeMap(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "executeMap",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """executeMap""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_fetchFeedback12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchFeedback")))
  )
  private[this] lazy val controllers_Application_fetchFeedback12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.fetchFeedback(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchFeedback",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """fetchFeedback""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_feedbackChoice13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feedbackChoice")))
  )
  private[this] lazy val controllers_Application_feedbackChoice13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.feedbackChoice(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String], fakeValue[Integer], fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "feedbackChoice",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String], classOf[Integer], classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """feedbackChoice""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Application_retrieveFeedbackImprovements14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("feedbackPrediction")))
  )
  private[this] lazy val controllers_Application_retrieveFeedbackImprovements14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.retrieveFeedbackImprovements(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "retrieveFeedbackImprovements",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "GET",
      this.prefix + """feedbackPrediction""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Application_retrieveStudentsStatus15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("retrieveStudentsStatus")))
  )
  private[this] lazy val controllers_Application_retrieveStudentsStatus15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.retrieveStudentsStatus(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "retrieveStudentsStatus",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """retrieveStudentsStatus""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Application_checkEfficacy16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkEfficacy")))
  )
  private[this] lazy val controllers_Application_checkEfficacy16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.checkEfficacy(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "checkEfficacy",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String], classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """checkEfficacy""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Application_sendFeedback17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendFeedback")))
  )
  private[this] lazy val controllers_Application_sendFeedback17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Application_0.sendFeedback(fakeValue[play.mvc.Http.Request], fakeValue[String], fakeValue[String], fakeValue[Integer], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sendFeedback",
      Seq(classOf[play.mvc.Http.Request], classOf[String], classOf[String], classOf[Integer], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """sendFeedback""",
      """""",
      Seq("""anyhost""")
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq("""anyhost""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_HomeController_buildDashboard1_route(params@_) =>
      call { 
        controllers_HomeController_buildDashboard1_invoker.call(
          req => HomeController_3.buildDashboard(req))
      }
  
    // @LINE:14
    case controllers_ARSupport_doLogin2_route(params@_) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_ARSupport_doLogin2_invoker.call(ARSupport_1.doLogin(email, password))
      }
  
    // @LINE:22
    case controllers_Application_authenticate3_route(params@_) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Application_authenticate3_invoker.call(
          req => Application_0.authenticate(req, email, password))
      }
  
    // @LINE:25
    case controllers_Application_courseDetails4_route(params@_) =>
      call(params.fromQuery[String]("courseId", None)) { (courseId) =>
        controllers_Application_courseDetails4_invoker.call(
          req => Application_0.courseDetails(req, courseId))
      }
  
    // @LINE:28
    case controllers_Application_studentStats5_route(params@_) =>
      call { 
        controllers_Application_studentStats5_invoker.call(
          req => Application_0.studentStats(req))
      }
  
    // @LINE:30
    case controllers_Application_logout6_route(params@_) =>
      call { 
        controllers_Application_logout6_invoker.call(
          req => Application_0.logout(req))
      }
  
    // @LINE:34
    case controllers_Application_courseMembers7_route(params@_) =>
      call(params.fromQuery[String]("courseId", None)) { (courseId) =>
        controllers_Application_courseMembers7_invoker.call(
          req => Application_0.courseMembers(req, courseId))
      }
  
    // @LINE:36
    case controllers_Application_fetchStudentStats8_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None)) { (courseId, userId) =>
        controllers_Application_fetchStudentStats8_invoker.call(
          req => Application_0.fetchStudentStats(req, courseId, userId))
      }
  
    // @LINE:38
    case controllers_Application_fetchStudentRecords9_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None)) { (courseId, userId) =>
        controllers_Application_fetchStudentRecords9_invoker.call(
          req => Application_0.fetchStudentRecords(req, courseId, userId))
      }
  
    // @LINE:40
    case controllers_Application_fetchStudentMeasurements10_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("weekNumber", None)) { (courseId, userId, weekNumber) =>
        controllers_Application_fetchStudentMeasurements10_invoker.call(
          req => Application_0.fetchStudentMeasurements(req, courseId, userId, weekNumber))
      }
  
    // @LINE:42
    case controllers_Application_executeMap11_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("weekNumber", None)) { (courseId, userId, weekNumber) =>
        controllers_Application_executeMap11_invoker.call(
          req => Application_0.executeMap(req, courseId, userId, weekNumber))
      }
  
    // @LINE:44
    case controllers_Application_fetchFeedback12_route(params@_) =>
      call(params.fromQuery[String]("userId", None)) { (userId) =>
        controllers_Application_fetchFeedback12_invoker.call(
          req => Application_0.fetchFeedback(req, userId))
      }
  
    // @LINE:46
    case controllers_Application_feedbackChoice13_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("weekNumber", None), params.fromQuery[Double]("mot", None), params.fromQuery[Double]("eng", None)) { (courseId, userId, weekNumber, mot, eng) =>
        controllers_Application_feedbackChoice13_invoker.call(
          req => Application_0.feedbackChoice(req, courseId, userId, weekNumber, mot, eng))
      }
  
    // @LINE:48
    case controllers_Application_retrieveFeedbackImprovements14_route(params@_) =>
      call(params.fromQuery[Integer]("actionId", None)) { (actionId) =>
        controllers_Application_retrieveFeedbackImprovements14_invoker.call(
          req => Application_0.retrieveFeedbackImprovements(req, actionId))
      }
  
    // @LINE:50
    case controllers_Application_retrieveStudentsStatus15_route(params@_) =>
      call(params.fromQuery[String]("courseId", None)) { (courseId) =>
        controllers_Application_retrieveStudentsStatus15_invoker.call(
          req => Application_0.retrieveStudentsStatus(req, courseId))
      }
  
    // @LINE:52
    case controllers_Application_checkEfficacy16_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[String]("prevDate", None), params.fromQuery[Integer]("prevWeek", None)) { (courseId, userId, prevDate, prevWeek) =>
        controllers_Application_checkEfficacy16_invoker.call(
          req => Application_0.checkEfficacy(req, courseId, userId, prevDate, prevWeek))
      }
  
    // @LINE:54
    case controllers_Application_sendFeedback17_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("actionId", None), params.fromQuery[String]("actionType", None), params.fromQuery[String]("name", None), params.fromQuery[String]("description", None), params.fromQuery[String]("date", None)) { (courseId, userId, actionId, actionType, name, description, date) =>
        controllers_Application_sendFeedback17_invoker.call(
          req => Application_0.sendFeedback(req, courseId, userId, actionId, actionType, name, description, date))
      }
  
    // @LINE:59
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_2.versioned(path, file))
      }
  }
}

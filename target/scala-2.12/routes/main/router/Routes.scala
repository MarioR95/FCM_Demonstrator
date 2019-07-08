// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/FCM_Demonstrator/conf/routes
// @DATE:Mon Jul 08 10:24:46 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_2: controllers.HomeController,
  // @LINE:11
  Application_0: controllers.Application,
  // @LINE:31
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_2: controllers.HomeController,
    // @LINE:11
    Application_0: controllers.Application,
    // @LINE:31
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, Application_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Application_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.buildDashboard(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Application.authenticate(request:Request, email:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course""", """controllers.Application.courseDetails(request:Request, courseId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentStats""", """controllers.Application.studentStats(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courseMembers""", """controllers.Application.courseMembers(request:Request, courseId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentStats""", """controllers.Application.fetchStudentStats(request:Request, courseId:String, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentRecords""", """controllers.Application.fetchStudentRecords(request:Request, courseId:String, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudentMeasurements""", """controllers.Application.fetchStudentMeasurements(request:Request, courseId:String, userId:String, weekNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """executeMap""", """controllers.Application.executeMap(request:Request, courseId:String, userId:String, weekNumber:Integer)"""),
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
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_buildDashboard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_buildDashboard1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_2.buildDashboard(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buildDashboard",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    
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
      Seq("""nocsrf""")
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_courseDetails3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course")))
  )
  private[this] lazy val controllers_Application_courseDetails3_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_studentStats4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentStats")))
  )
  private[this] lazy val controllers_Application_studentStats4_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout5_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_courseMembers6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courseMembers")))
  )
  private[this] lazy val controllers_Application_courseMembers6_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_fetchStudentStats7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentStats")))
  )
  private[this] lazy val controllers_Application_fetchStudentStats7_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_fetchStudentRecords8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentRecords")))
  )
  private[this] lazy val controllers_Application_fetchStudentRecords8_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_fetchStudentMeasurements9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudentMeasurements")))
  )
  private[this] lazy val controllers_Application_fetchStudentMeasurements9_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_executeMap10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("executeMap")))
  )
  private[this] lazy val controllers_Application_executeMap10_invoker = createInvoker(
    
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
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_buildDashboard1_route(params@_) =>
      call { 
        controllers_HomeController_buildDashboard1_invoker.call(
          req => HomeController_2.buildDashboard(req))
      }
  
    // @LINE:11
    case controllers_Application_authenticate2_route(params@_) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_Application_authenticate2_invoker.call(
          req => Application_0.authenticate(req, email, password))
      }
  
    // @LINE:13
    case controllers_Application_courseDetails3_route(params@_) =>
      call(params.fromQuery[String]("courseId", None)) { (courseId) =>
        controllers_Application_courseDetails3_invoker.call(
          req => Application_0.courseDetails(req, courseId))
      }
  
    // @LINE:15
    case controllers_Application_studentStats4_route(params@_) =>
      call { 
        controllers_Application_studentStats4_invoker.call(
          req => Application_0.studentStats(req))
      }
  
    // @LINE:17
    case controllers_Application_logout5_route(params@_) =>
      call { 
        controllers_Application_logout5_invoker.call(
          req => Application_0.logout(req))
      }
  
    // @LINE:20
    case controllers_Application_courseMembers6_route(params@_) =>
      call(params.fromQuery[String]("courseId", None)) { (courseId) =>
        controllers_Application_courseMembers6_invoker.call(
          req => Application_0.courseMembers(req, courseId))
      }
  
    // @LINE:22
    case controllers_Application_fetchStudentStats7_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None)) { (courseId, userId) =>
        controllers_Application_fetchStudentStats7_invoker.call(
          req => Application_0.fetchStudentStats(req, courseId, userId))
      }
  
    // @LINE:24
    case controllers_Application_fetchStudentRecords8_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None)) { (courseId, userId) =>
        controllers_Application_fetchStudentRecords8_invoker.call(
          req => Application_0.fetchStudentRecords(req, courseId, userId))
      }
  
    // @LINE:26
    case controllers_Application_fetchStudentMeasurements9_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("weekNumber", None)) { (courseId, userId, weekNumber) =>
        controllers_Application_fetchStudentMeasurements9_invoker.call(
          req => Application_0.fetchStudentMeasurements(req, courseId, userId, weekNumber))
      }
  
    // @LINE:28
    case controllers_Application_executeMap10_route(params@_) =>
      call(params.fromQuery[String]("courseId", None), params.fromQuery[String]("userId", None), params.fromQuery[Integer]("weekNumber", None)) { (courseId, userId, weekNumber) =>
        controllers_Application_executeMap10_invoker.call(
          req => Application_0.executeMap(req, courseId, userId, weekNumber))
      }
  
    // @LINE:31
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}


package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object tdashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<!-- begin::Head -->
<head>
<meta charset="utf-8" />
<title>MOLIERE | Dashboard</title>
<meta name="description" content="Updates and statistics">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script
	src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*15.15*/("""{"""),format.raw/*15.16*/("""
		"""),format.raw/*16.3*/("""google : """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
			"""),format.raw/*17.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*19.3*/("""}"""),format.raw/*19.4*/(""",
		active : function() """),format.raw/*20.23*/("""{"""),format.raw/*20.24*/("""
			"""),format.raw/*21.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""
	"""),format.raw/*23.2*/("""}"""),format.raw/*23.3*/(""");
</script>
<!--end::Fonts -->
<!--begin::Page Vendors Styles(used by this page) -->
<link
	href="assets/vendors/custom/fullcalendar/fullcalendar.bundle.css"
	rel="stylesheet" type="text/css" />
<!--end::Page Vendors Styles -->
<!--begin::Global Theme Styles(used by all pages) -->
<link href="assets/vendors/global/vendors.bundle.css" rel="stylesheet"
	type="text/css" />
<link href="assets/stylesheets/style.bundle.css" rel="stylesheet"
	type="text/css" />
<!--end::Global Theme Styles -->
<!--begin::Layout Skins(used by all pages) -->
<link href="assets/stylesheets/skins/header/base/light.css"
	rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/skins/header/menu/light.css"
	rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/skins/brand/dark.css" rel="stylesheet"
	type="text/css" />
<link href="assets/stylesheets/skins/aside/dark.css" rel="stylesheet"
	type="text/css" />
<!--end::Layout Skins -->
<link rel="shortcut icon" href="assets/images/logos/favicon.ico" />
</head>
<!-- end::Head -->
<!-- begin::Body -->
<body
	class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	"""),_display_(/*53.3*/views/*53.8*/.html._layout(username)),format.raw/*53.31*/("""
	"""),format.raw/*54.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*56.22*/("""{"""),format.raw/*56.23*/("""
			"""),format.raw/*57.4*/(""""colors" : """),format.raw/*57.15*/("""{"""),format.raw/*57.16*/("""
				"""),format.raw/*58.5*/(""""state" : """),format.raw/*58.15*/("""{"""),format.raw/*58.16*/("""
					"""),format.raw/*59.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""",
				"base" : """),format.raw/*68.14*/("""{"""),format.raw/*68.15*/("""
					"""),format.raw/*69.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
			"""),format.raw/*72.4*/("""}"""),format.raw/*72.5*/("""
		"""),format.raw/*73.3*/("""}"""),format.raw/*73.4*/(""";
	</script>
	<!-- end::Global Config -->
	<!--begin::Global Theme Bundle(used by all pages) -->
	<script src="assets/vendors/global/vendors.bundle.js"
		type="text/javascript"></script>
	<script src="assets/javascripts/scripts.bundle.js"
		type="text/javascript"></script>
	<!--end::Global Theme Bundle -->
	<!--begin::Page Vendors(used by this page) -->
	<script
		src="assets/vendors/custom/fullcalendar/fullcalendar.bundle.js"
		type="text/javascript"></script>
	<script
		src="//maps.google.com/maps/api/js?key=AIzaSyBTGnKT7dt597vo9QgeQ7BFhvSRP4eiMSM"
		type="text/javascript"></script>
	<script src="assets/vendors/custom/gmaps/gmaps.js"
		type="text/javascript"></script>
	<!--end::Page Vendors -->
	<!--begin::Page Scripts(used by this page) -->
	<script src="assets/javascripts/pages/dashboard.js"
		type="text/javascript"></script>
	<!--end::Page Scripts -->
</body>
<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 03 13:54:01 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/tdashboard.scala.html
                  HASH: cf0b7478261b443ad600862eb2a231c913e4dc68
                  MATRIX: 953->1|1066->19|1094->21|1536->435|1565->436|1596->440|1633->449|1662->450|1694->455|1807->541|1835->542|1888->567|1917->568|1949->573|2008->605|2036->606|2066->609|2094->610|3447->1937|3460->1942|3504->1965|3534->1968|3662->2068|3691->2069|3723->2074|3762->2085|3791->2086|3824->2092|3862->2102|3891->2103|3925->2110|4171->2329|4199->2330|4243->2346|4272->2347|4306->2354|4459->2480|4487->2481|4519->2486|4547->2487|4578->2491|4606->2492
                  LINES: 28->1|33->1|34->2|47->15|47->15|48->16|48->16|48->16|49->17|51->19|51->19|52->20|52->20|53->21|54->22|54->22|55->23|55->23|85->53|85->53|85->53|86->54|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|99->67|99->67|100->68|100->68|101->69|103->71|103->71|104->72|104->72|105->73|105->73
                  -- GENERATED --
              */
          
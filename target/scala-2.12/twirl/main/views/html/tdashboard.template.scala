
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

object tdashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<!-- begin::Head -->
<head>
<meta charset="utf-8" />
<title>MOLIERE | Dashboard</title>
<meta name="description" content="Updates and statistics">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*17.15*/("""{"""),format.raw/*17.16*/("""
		"""),format.raw/*18.3*/("""google : """),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
			"""),format.raw/*19.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""",
		active : function() """),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""
			"""),format.raw/*23.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*24.3*/("""}"""),format.raw/*24.4*/("""
	"""),format.raw/*25.2*/("""}"""),format.raw/*25.3*/(""");
</script>


<style type="text/css">
	#kt_wrapper"""),format.raw/*30.13*/("""{"""),format.raw/*30.14*/("""
		"""),format.raw/*31.3*/("""padding-top: 60px;
	"""),format.raw/*32.2*/("""}"""),format.raw/*32.3*/("""
	
	"""),format.raw/*34.2*/(""".kt-widget__icon"""),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
		"""),format.raw/*35.3*/("""font-size:50px;
	"""),format.raw/*36.2*/("""}"""),format.raw/*36.3*/("""
	
	"""),format.raw/*38.2*/(""".kt-widget__details """),format.raw/*38.22*/("""{"""),format.raw/*38.23*/("""
		"""),format.raw/*39.3*/("""padding: 5px;
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/("""
	"""),format.raw/*41.2*/(""".kt-widget__item:hover """),format.raw/*41.25*/("""{"""),format.raw/*41.26*/("""
		"""),format.raw/*42.3*/("""background-color: #F6F6F9;
	"""),format.raw/*43.2*/("""}"""),format.raw/*43.3*/("""

"""),format.raw/*45.1*/("""</style>

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
	"""),_display_(/*76.3*/views/*76.8*/.html._layout(user, "dashWidget")),format.raw/*76.41*/("""
	"""),format.raw/*77.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*79.22*/("""{"""),format.raw/*79.23*/("""
			"""),format.raw/*80.4*/(""""colors" : """),format.raw/*80.15*/("""{"""),format.raw/*80.16*/("""
				"""),format.raw/*81.5*/(""""state" : """),format.raw/*81.15*/("""{"""),format.raw/*81.16*/("""
					"""),format.raw/*82.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*90.5*/("""}"""),format.raw/*90.6*/(""",
				"base" : """),format.raw/*91.14*/("""{"""),format.raw/*91.15*/("""
					"""),format.raw/*92.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
			"""),format.raw/*95.4*/("""}"""),format.raw/*95.5*/("""
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/(""";
	</script>
	<!-- end::Global Config -->
	<!--begin::Global Theme Bundle(used by all pages) -->
	<script src="assets/vendors/global/vendors.bundle.js" type="text/javascript"></script>
	<script src="assets/javascripts/scripts.bundle.js" type="text/javascript"></script>
	<!--end::Global Theme Bundle -->
	<!--begin::Page Vendors(used by this page) -->
	<script src="//maps.google.com/maps/api/js?key=AIzaSyBTGnKT7dt597vo9QgeQ7BFhvSRP4eiMSM" type="text/javascript"></script>
	<script src="assets/vendors/custom/gmaps/gmaps.js" type="text/javascript"></script>
	<!--end::Page Vendors -->
	<!--begin::Page Scripts(used by this page) -->
	<script src="assets/javascripts/pages/dashboard.js" type="text/javascript"></script>
	<!--end::Page Scripts -->
	<!--begin::Page Scripts(used by content) -->
	<script src="assets/javascripts/pages//layout/aside/menu/contentView.js" type="text/javascript"></script>
	<!--end::Page Scripts -->
	<script src="assets/vendors/custom/flot/flot.bundle.js" type="text/javascript"></script>
	<script src="assets/vendors/custom/fullcalendar/fullcalendar.bundle.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/components/calendar/google.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/components/charts/morris-charts.js"type="text/javascript"></script>
	<script src="assets/javascripts/pages/dash-widget-handler.js" type="text/javascript"></script>
</body>
<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Sep 18 11:38:59 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/tdashboard.scala.html
                  HASH: f24fcd98aca58b5751ab2af9d86cb3c0ceb2e2cf
                  MATRIX: 965->1|1086->27|1116->31|1623->510|1652->511|1683->515|1720->524|1749->525|1781->530|1894->616|1922->617|1975->642|2004->643|2036->648|2095->680|2123->681|2153->684|2181->685|2265->741|2294->742|2325->746|2373->767|2401->768|2434->774|2478->790|2507->791|2538->795|2583->813|2611->814|2644->820|2692->840|2721->841|2752->845|2795->861|2823->862|2853->865|2904->888|2933->889|2964->893|3020->922|3048->923|3079->927|4432->2254|4445->2259|4499->2292|4529->2295|4657->2395|4686->2396|4718->2401|4757->2412|4786->2413|4819->2419|4857->2429|4886->2430|4920->2437|5166->2656|5194->2657|5238->2673|5267->2674|5301->2681|5454->2807|5482->2808|5514->2813|5542->2814|5573->2818|5601->2819
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|62->30|62->30|63->31|64->32|64->32|66->34|66->34|66->34|67->35|68->36|68->36|70->38|70->38|70->38|71->39|72->40|72->40|73->41|73->41|73->41|74->42|75->43|75->43|77->45|108->76|108->76|108->76|109->77|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|114->82|122->90|122->90|123->91|123->91|124->92|126->94|126->94|127->95|127->95|128->96|128->96
                  -- GENERATED --
              */
          

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

object course_details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

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
	WebFont.load("""),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
		"""),format.raw/*19.3*/("""google : """),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""
			"""),format.raw/*20.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""",
		active : function() """),format.raw/*23.23*/("""{"""),format.raw/*23.24*/("""
			"""),format.raw/*24.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/(""");
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

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.css">
</head>
<!-- end::Head -->
<!-- begin::Body -->
<body
	class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	"""),_display_(/*60.3*/views/*60.8*/.html._layout(user, "courseDetails")),format.raw/*60.44*/("""
	"""),format.raw/*61.2*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >
		<div class="kt-subheader   kt-grid__item" id="kt_subheader">
    <div class="kt-subheader__main">
        
        <h3 class="kt-subheader__title">Algoritmi</h3>

        <span class="kt-subheader__separator kt-subheader__separator--v"></span>

        <span class="kt-subheader__desc">30/06/2019</span>
    </div>
</div>
<!-- end: course and expire date -->
<!-- begin:: Content -->

	<!-- begin: course and expire date -->

<!-- end:: Content -->
	

	<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*82.22*/("""{"""),format.raw/*82.23*/("""
			"""),format.raw/*83.4*/(""""colors" : """),format.raw/*83.15*/("""{"""),format.raw/*83.16*/("""
				"""),format.raw/*84.5*/(""""state" : """),format.raw/*84.15*/("""{"""),format.raw/*84.16*/("""
					"""),format.raw/*85.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""",
				"base" : """),format.raw/*94.14*/("""{"""),format.raw/*94.15*/("""
					"""),format.raw/*95.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""
			"""),format.raw/*98.4*/("""}"""),format.raw/*98.5*/("""
		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/(""";
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
	
	<!--begin::Page Scripts(used by content) -->
	<script src="assets/javascripts/pages//layout/aside/menu/contentView.js"
		type="text/javascript"></script>
	<!--end::Page Scripts -->
	<script src="./assets/javascripts/pages/components/charts/flotcharts.js" type="text/javascript"></script>
<script src="./assets/vendors/custom/flot/flot.bundle.js" type="text/javascript"></script>

	
</body>
<!-- end::Body -->
</html>
"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jun 18 10:25:14 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details.scala.html
                  HASH: bcfbf046d158e3aa187c38d9166695196715f28c
                  MATRIX: 969->1|1090->27|1120->31|1629->512|1658->513|1689->517|1726->526|1755->527|1787->532|1900->618|1928->619|1981->644|2010->645|2042->650|2101->682|2129->683|2159->686|2187->687|3656->2130|3669->2135|3726->2171|3756->2174|4435->2825|4464->2826|4496->2831|4535->2842|4564->2843|4597->2849|4635->2859|4664->2860|4698->2867|4944->3086|4972->3087|5016->3103|5045->3104|5079->3111|5232->3237|5260->3238|5292->3243|5320->3244|5351->3248|5379->3249
                  LINES: 28->1|33->1|35->3|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|92->60|92->60|92->60|93->61|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|125->93|125->93|126->94|126->94|127->95|129->97|129->97|130->98|130->98|131->99|131->99
                  -- GENERATED --
              */
          
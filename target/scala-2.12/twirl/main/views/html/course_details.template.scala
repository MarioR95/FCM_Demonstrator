
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
<title>MOLIERE | Course </title>
<meta name="description" content="Updates and statistics">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
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
<link href="assets/vendors/custom/fullcalendar/fullcalendar.bundle.css"rel="stylesheet" type="text/css" />
<!--end::Page Vendors Styles -->
<!--begin::Global Theme Styles(used by all pages) -->
<link href="assets/vendors/global/vendors.bundle.css" rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/style.bundle.css" rel="stylesheet" type="text/css" />
<!--end::Global Theme Styles -->
<!--begin::Layout Skins(used by all pages) -->
<link href="assets/stylesheets/skins/header/base/light.css" rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/skins/header/menu/light.css" rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/skins/brand/dark.css" rel="stylesheet" type="text/css" />
<link href="assets/stylesheets/skins/aside/dark.css" rel="stylesheet" type="text/css" />

<!--end::Layout Skins -->
<link rel="shortcut icon" href="assets/images/logos/logo-mini-2-md.png" />

</head>
<!-- end::Head -->
<!-- begin::Body -->
<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<div class="kt-subheader   kt-grid__item" id="kt_subheader">
	    <div class="kt-container  kt-container--fluid ">
	        <div class="kt-subheader__main"> 
	            <h3 class="kt-subheader__title">Mathematical Analysis II</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="+"""),_display_(/*56.50*/user/*56.54*/.getEmail()),format.raw/*56.65*/(""" """),format.raw/*56.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>         
	        </div>
    	</div>
	</div>            
		
	"""),_display_(/*62.3*/views/*62.8*/.html._layout(user, "courseDetails")),format.raw/*62.44*/("""
	
	"""),format.raw/*64.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*66.22*/("""{"""),format.raw/*66.23*/("""
			"""),format.raw/*67.4*/(""""colors" : """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""
				"""),format.raw/*68.5*/(""""state" : """),format.raw/*68.15*/("""{"""),format.raw/*68.16*/("""
					"""),format.raw/*69.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""",
				"base" : """),format.raw/*78.14*/("""{"""),format.raw/*78.15*/("""
					"""),format.raw/*79.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
			"""),format.raw/*82.4*/("""}"""),format.raw/*82.5*/("""
		"""),format.raw/*83.3*/("""}"""),format.raw/*83.4*/(""";
	</script>
	<!-- end::Global Config -->
	<!--begin::Global Theme Bundle(used by all pages) -->
	<script src="assets/vendors/global/vendors.bundle.js" type="text/javascript"></script>
	<script src="assets/javascripts/scripts.bundle.js" type="text/javascript"></script>
	<!--end::Global Theme Bundle -->
	<!--begin::Page Vendors(used by this page) -->
	<script src="assets/vendors/custom/fullcalendar/fullcalendar.bundle.js" type="text/javascript"></script>
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
	<!--begin:: Custom Scripts  -->
	<script src="assets/javascripts/pages/course-overview-handler.js" type="text/javascript"></script>
	"""),_display_(/*104.3*/{ 
	if(user.getRole() == 1) 	<!-- TEACHER'S CASE -->
		<script src="assets/javascripts/pages/datatable-members.js" type="text/javascript"></script>
	else	<!-- STUDENT'S CASE -->
		<script src="assets/javascripts/pages/datatable-members-student.js" type="text/javascript"></script>
		
	}),format.raw/*110.3*/("""
	"""),format.raw/*111.2*/("""<!--end: Custom Scripts  -->
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
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/course_details.scala.html
                  HASH: f5c86bf186171d53e7af51d1b49b2971473ab950
                  MATRIX: 969->1|1090->27|1120->31|1735->618|1764->619|1795->623|1832->632|1861->633|1893->638|2006->724|2034->725|2087->750|2116->751|2148->756|2207->788|2235->789|2265->792|2293->793|4050->2523|4063->2527|4095->2538|4124->2539|4334->2723|4347->2728|4404->2764|4437->2770|4565->2870|4594->2871|4626->2876|4665->2887|4694->2888|4727->2894|4765->2904|4794->2905|4828->2912|5074->3131|5102->3132|5146->3148|5175->3149|5209->3156|5362->3282|5390->3283|5422->3288|5450->3289|5481->3293|5509->3294|6815->4573|7128->4865|7159->4868
                  LINES: 28->1|33->1|35->3|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|88->56|88->56|88->56|88->56|94->62|94->62|94->62|96->64|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|109->77|109->77|110->78|110->78|111->79|113->81|113->81|114->82|114->82|115->83|115->83|136->104|142->110|143->111
                  -- GENERATED --
              */
          
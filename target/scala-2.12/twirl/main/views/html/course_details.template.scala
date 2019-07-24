
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
<link rel="shortcut icon" href="assets/images/logos/favicon.ico" />

</head>
<!-- end::Head -->
<!-- begin::Body -->
<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<div class="kt-subheader   kt-grid__item" id="kt_subheader">
	    <div class="kt-container  kt-container--fluid ">
	        <div class="kt-subheader__main"> 
	            <h3 class="kt-subheader__title">Algorithms</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="+"""),_display_(/*55.50*/user/*55.54*/.getEmail()),format.raw/*55.65*/(""" """),format.raw/*55.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>         
	        </div>
    	</div>
	</div>            
		
	"""),_display_(/*61.3*/views/*61.8*/.html._layout(user, "courseDetails")),format.raw/*61.44*/("""
	
	"""),format.raw/*63.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""
			"""),format.raw/*66.4*/(""""colors" : """),format.raw/*66.15*/("""{"""),format.raw/*66.16*/("""
				"""),format.raw/*67.5*/(""""state" : """),format.raw/*67.15*/("""{"""),format.raw/*67.16*/("""
					"""),format.raw/*68.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""",
				"base" : """),format.raw/*77.14*/("""{"""),format.raw/*77.15*/("""
					"""),format.raw/*78.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""
			"""),format.raw/*81.4*/("""}"""),format.raw/*81.5*/("""
		"""),format.raw/*82.3*/("""}"""),format.raw/*82.4*/(""";
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
	<script src="assets/javascripts/pages/datatable-members.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/datatable-members-student.js" type="text/javascript"></script>
	<!--end: Custom Scripts  -->
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
                  DATE: Wed Jul 17 11:23:26 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details.scala.html
                  HASH: cb3e9ad16116ab50bded90e61c18e7d6e1db69ac
                  MATRIX: 969->1|1090->27|1120->31|1735->618|1764->619|1795->623|1832->632|1861->633|1893->638|2006->724|2034->725|2087->750|2116->751|2148->756|2207->788|2235->789|2265->792|2293->793|4027->2500|4040->2504|4072->2515|4101->2516|4311->2700|4324->2705|4381->2741|4414->2747|4542->2847|4571->2848|4603->2853|4642->2864|4671->2865|4704->2871|4742->2881|4771->2882|4805->2889|5051->3108|5079->3109|5123->3125|5152->3126|5186->3133|5339->3259|5367->3260|5399->3265|5427->3266|5458->3270|5486->3271
                  LINES: 28->1|33->1|35->3|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|87->55|87->55|87->55|87->55|93->61|93->61|93->61|95->63|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|108->76|108->76|109->77|109->77|110->78|112->80|112->80|113->81|113->81|114->82|114->82
                  -- GENERATED --
              */
          
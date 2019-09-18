
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

object student_measures extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

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
<title>MOLIERE | Student Measures </title>
<meta name="description" content="Updates and statistics">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.js"></script>


<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*21.15*/("""{"""),format.raw/*21.16*/("""
		"""),format.raw/*22.3*/("""google : """),format.raw/*22.12*/("""{"""),format.raw/*22.13*/("""
			"""),format.raw/*23.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*25.3*/("""}"""),format.raw/*25.4*/(""",
		active : function() """),format.raw/*26.23*/("""{"""),format.raw/*26.24*/("""
			"""),format.raw/*27.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""
	"""),format.raw/*29.2*/("""}"""),format.raw/*29.3*/(""");
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

<link href="assets/stylesheets/pages/general/wizard/wizard-2.css" rel="stylesheet" type="text/css">
<link href="assets/stylesheets/pages/general/wizard/wizard-3.css" rel="stylesheet" type="text/css">

<!--end::Layout Skins -->
<link rel="shortcut icon" href="assets/images/logos/favicon.ico" />

<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.css">
</head>
<!-- end::Head -->
<!-- begin::Body -->
<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<div class="kt-subheader   kt-grid__item" id="kt_subheader">
	    <div class="kt-container  kt-container--fluid ">
	        <div class="kt-subheader__main"> 
	            <h3 class="kt-subheader__title">Student Stats</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="+"""),_display_(/*63.50*/user/*63.54*/.getEmail()),format.raw/*63.65*/(""" """),format.raw/*63.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>
	                <span class="kt-subheader__breadcrumbs-separator"></span>
	                <a href="/course?courseId=HarvardX/CB22x/2013_Spring"" class="kt-subheader__breadcrumbs-link">Algorithms</a>
	                <span class="kt-subheader__breadcrumbs-separator"></span>
	                <a href="#" class="kt-subheader__breadcrumbs-link" id="kt-subheader-user-info"></a>                     
	            </div>         
	        </div>
	    </div>
	</div>                            
	                                              	
	"""),_display_(/*73.3*/views/*73.8*/.html._layout(user, "studentStats")),format.raw/*73.43*/("""
	
	"""),format.raw/*75.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*77.22*/("""{"""),format.raw/*77.23*/("""
			"""),format.raw/*78.4*/(""""colors" : """),format.raw/*78.15*/("""{"""),format.raw/*78.16*/("""
				"""),format.raw/*79.5*/(""""state" : """),format.raw/*79.15*/("""{"""),format.raw/*79.16*/("""
					"""),format.raw/*80.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""",
				"base" : """),format.raw/*89.14*/("""{"""),format.raw/*89.15*/("""
					"""),format.raw/*90.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""
			"""),format.raw/*93.4*/("""}"""),format.raw/*93.5*/("""
		"""),format.raw/*94.3*/("""}"""),format.raw/*94.4*/(""";
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
	<!--begin:: Custom Scripts -->
	<script src="assets/vendors/custom/flot/flot.bundle.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/components/charts/flotcharts.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/fcmLoader.js"></script>

	<script src="assets/javascripts/pages/datatable-stats.js" type="text/javascript"></script>
	<!--end:: Custom Scripts -->
	<script src="assets/javascripts/pages/wizard/wizard-2.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/wizard/wizard-3.js" type="text/javascript"></script>
	
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
                  DATE: Wed Sep 18 11:38:59 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/student_measures.scala.html
                  HASH: d021961b3f5b6aa36451a4253eb74a9ccc2fb777
                  MATRIX: 971->1|1092->27|1122->31|1837->718|1866->719|1897->723|1934->732|1963->733|1995->738|2108->824|2136->825|2189->850|2218->851|2250->856|2309->888|2337->889|2367->892|2395->893|4448->2919|4461->2923|4493->2934|4522->2935|5177->3564|5190->3569|5246->3604|5279->3610|5407->3710|5436->3711|5468->3716|5507->3727|5536->3728|5569->3734|5607->3744|5636->3745|5670->3752|5916->3971|5944->3972|5988->3988|6017->3989|6051->3996|6204->4122|6232->4123|6264->4128|6292->4129|6323->4133|6351->4134
                  LINES: 28->1|33->1|35->3|53->21|53->21|54->22|54->22|54->22|55->23|57->25|57->25|58->26|58->26|59->27|60->28|60->28|61->29|61->29|95->63|95->63|95->63|95->63|105->73|105->73|105->73|107->75|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|112->80|120->88|120->88|121->89|121->89|122->90|124->92|124->92|125->93|125->93|126->94|126->94
                  -- GENERATED --
              */
          
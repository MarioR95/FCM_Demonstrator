
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
	                <a href="/dashboard?username="+"""),_display_(/*59.50*/user/*59.54*/.getEmail()),format.raw/*59.65*/(""" """),format.raw/*59.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>
	                <span class="kt-subheader__breadcrumbs-separator"></span>
	                <a href="/course?courseId=HarvardX/CB22x/2013_Spring"" class="kt-subheader__breadcrumbs-link">Algorithms</a>
	                <span class="kt-subheader__breadcrumbs-separator"></span>
	                <a href="#" class="kt-subheader__breadcrumbs-link" id="kt-subheader-user-info"></a>                     
	            </div>         
	        </div>
	    </div>
	</div>                            
	                                              	
	"""),_display_(/*69.3*/views/*69.8*/.html._layout(user, "studentStats")),format.raw/*69.43*/("""
	
	"""),format.raw/*71.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*73.22*/("""{"""),format.raw/*73.23*/("""
			"""),format.raw/*74.4*/(""""colors" : """),format.raw/*74.15*/("""{"""),format.raw/*74.16*/("""
				"""),format.raw/*75.5*/(""""state" : """),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""
					"""),format.raw/*76.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""",
				"base" : """),format.raw/*85.14*/("""{"""),format.raw/*85.15*/("""
					"""),format.raw/*86.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/("""
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/(""";
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
                  DATE: Mon Jul 08 09:26:29 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/student_measures.scala.html
                  HASH: 1735a4d24c81e7961230c9ae2aa3b12f8b3b00ff
                  MATRIX: 971->1|1092->27|1122->31|1837->718|1866->719|1897->723|1934->732|1963->733|1995->738|2108->824|2136->825|2189->850|2218->851|2250->856|2309->888|2337->889|2367->892|2395->893|4242->2713|4255->2717|4287->2728|4316->2729|4971->3358|4984->3363|5040->3398|5073->3404|5201->3504|5230->3505|5262->3510|5301->3521|5330->3522|5363->3528|5401->3538|5430->3539|5464->3546|5710->3765|5738->3766|5782->3782|5811->3783|5845->3790|5998->3916|6026->3917|6058->3922|6086->3923|6117->3927|6145->3928
                  LINES: 28->1|33->1|35->3|53->21|53->21|54->22|54->22|54->22|55->23|57->25|57->25|58->26|58->26|59->27|60->28|60->28|61->29|61->29|91->59|91->59|91->59|91->59|101->69|101->69|101->69|103->71|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|108->76|116->84|116->84|117->85|117->85|118->86|120->88|120->88|121->89|121->89|122->90|122->90
                  -- GENERATED --
              */
          
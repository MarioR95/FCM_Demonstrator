
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

<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*16.15*/("""{"""),format.raw/*16.16*/("""
		"""),format.raw/*17.3*/("""google : """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
			"""),format.raw/*18.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/(""",
		active : function() """),format.raw/*21.23*/("""{"""),format.raw/*21.24*/("""
			"""),format.raw/*22.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""
	"""),format.raw/*24.2*/("""}"""),format.raw/*24.3*/(""");
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
<body
	class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	"""),_display_(/*49.3*/views/*49.8*/.html._layout(user, "courseDetails")),format.raw/*49.44*/("""
	"""),format.raw/*50.2*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >
		<div class="kt-subheader   kt-grid__item" id="kt_subheader">
		</div>
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
		var KTAppOptions = """),format.raw/*72.22*/("""{"""),format.raw/*72.23*/("""
			"""),format.raw/*73.4*/(""""colors" : """),format.raw/*73.15*/("""{"""),format.raw/*73.16*/("""
				"""),format.raw/*74.5*/(""""state" : """),format.raw/*74.15*/("""{"""),format.raw/*74.16*/("""
					"""),format.raw/*75.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""",
				"base" : """),format.raw/*84.14*/("""{"""),format.raw/*84.15*/("""
					"""),format.raw/*85.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*87.5*/("""}"""),format.raw/*87.6*/("""
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/("""
		"""),format.raw/*89.3*/("""}"""),format.raw/*89.4*/(""";
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
	<script src="assets/javascripts/pages/components/charts/flotcharts.js" type="text/javascript"></script>
<script src="assets/vendors/custom/flot/flot.bundle.js" type="text/javascript"></script>

	
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
                  DATE: Mon Jun 24 09:38:30 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details.scala.html
                  HASH: c0b3a4778866184196b52305458b3086ca099358
                  MATRIX: 969->1|1090->27|1120->31|1623->506|1652->507|1683->511|1720->520|1749->521|1781->526|1894->612|1922->613|1975->638|2004->639|2036->644|2095->676|2123->677|2153->680|2181->681|3631->2105|3644->2110|3701->2146|3731->2149|4429->2819|4458->2820|4490->2825|4529->2836|4558->2837|4591->2843|4629->2853|4658->2854|4692->2861|4938->3080|4966->3081|5010->3097|5039->3098|5073->3105|5226->3231|5254->3232|5286->3237|5314->3238|5345->3242|5373->3243
                  LINES: 28->1|33->1|35->3|48->16|48->16|49->17|49->17|49->17|50->18|52->20|52->20|53->21|53->21|54->22|55->23|55->23|56->24|56->24|81->49|81->49|81->49|82->50|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|115->83|115->83|116->84|116->84|117->85|119->87|119->87|120->88|120->88|121->89|121->89
                  -- GENERATED --
              */
          
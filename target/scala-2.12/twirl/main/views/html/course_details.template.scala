
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

<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.css">

<script src="https://cdnjs.cloudflare.com/ajax/libs/vis/4.21.0/vis.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*22.15*/("""{"""),format.raw/*22.16*/("""
		"""),format.raw/*23.3*/("""google : """),format.raw/*23.12*/("""{"""),format.raw/*23.13*/("""
			"""),format.raw/*24.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*26.3*/("""}"""),format.raw/*26.4*/(""",
		active : function() """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
			"""),format.raw/*28.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
	"""),format.raw/*30.2*/("""}"""),format.raw/*30.3*/(""");
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
	"""),_display_(/*61.3*/views/*61.8*/.html._layout(user, "courseDetails")),format.raw/*61.44*/("""
	"""),format.raw/*62.2*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >
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
		var KTAppOptions = """),format.raw/*83.22*/("""{"""),format.raw/*83.23*/("""
			"""),format.raw/*84.4*/(""""colors" : """),format.raw/*84.15*/("""{"""),format.raw/*84.16*/("""
				"""),format.raw/*85.5*/(""""state" : """),format.raw/*85.15*/("""{"""),format.raw/*85.16*/("""
					"""),format.raw/*86.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""",
				"base" : """),format.raw/*95.14*/("""{"""),format.raw/*95.15*/("""
					"""),format.raw/*96.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*98.5*/("""}"""),format.raw/*98.6*/("""
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/("""
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/(""";
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
                  DATE: Mon Jun 17 14:11:49 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details.scala.html
                  HASH: 0736104f6f0e1a8762af5a60bcf04d6784552adf
                  MATRIX: 969->1|1090->27|1120->31|1829->712|1858->713|1889->717|1926->726|1955->727|1987->732|2100->818|2128->819|2181->844|2210->845|2242->850|2301->882|2329->883|2359->886|2387->887|3742->2216|3755->2221|3812->2257|3842->2260|4521->2911|4550->2912|4582->2917|4621->2928|4650->2929|4683->2935|4721->2945|4750->2946|4784->2953|5030->3172|5058->3173|5102->3189|5131->3190|5165->3197|5318->3323|5346->3324|5378->3329|5406->3330|5438->3334|5467->3335
                  LINES: 28->1|33->1|35->3|54->22|54->22|55->23|55->23|55->23|56->24|58->26|58->26|59->27|59->27|60->28|61->29|61->29|62->30|62->30|93->61|93->61|93->61|94->62|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|126->94|126->94|127->95|127->95|128->96|130->98|130->98|131->99|131->99|132->100|132->100
                  -- GENERATED --
              */
          
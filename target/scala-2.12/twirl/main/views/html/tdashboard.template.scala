
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
/*2.2*/import play.api.libs.json._


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<!-- begin::Head -->
<head>
<meta charset="utf-8" />
<title>MOLIERE | Dashboard</title>
<meta name="description" content="Updates and statistics">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script src="https://code.jquery.com/jquery-1.2.6.min.js"></script>
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


<script>




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
	"""),_display_(/*65.3*/views/*65.8*/.html._layout(user)),format.raw/*65.27*/("""
	"""),format.raw/*66.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*68.22*/("""{"""),format.raw/*68.23*/("""
			"""),format.raw/*69.4*/(""""colors" : """),format.raw/*69.15*/("""{"""),format.raw/*69.16*/("""
				"""),format.raw/*70.5*/(""""state" : """),format.raw/*70.15*/("""{"""),format.raw/*70.16*/("""
					"""),format.raw/*71.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*79.5*/("""}"""),format.raw/*79.6*/(""",
				"base" : """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
					"""),format.raw/*81.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*83.5*/("""}"""),format.raw/*83.6*/("""
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/("""
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""";
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
                  DATE: Thu Jun 06 12:13:25 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/tdashboard.scala.html
                  HASH: 928e1f8e4da7de131ad61218805b6f74f4f40a1a
                  MATRIX: 965->1|1064->30|1121->27|1149->59|1177->61|1688->544|1717->545|1748->549|1785->558|1814->559|1846->564|1959->650|1987->651|2040->676|2069->677|2101->682|2160->714|2188->715|2218->718|2246->719|3634->2081|3647->2086|3687->2105|3717->2108|3845->2208|3874->2209|3906->2214|3945->2225|3974->2226|4007->2232|4045->2242|4074->2243|4108->2250|4354->2469|4382->2470|4426->2486|4455->2487|4489->2494|4642->2620|4670->2621|4702->2626|4730->2627|4761->2631|4789->2632
                  LINES: 28->1|31->2|34->1|35->3|36->4|50->18|50->18|51->19|51->19|51->19|52->20|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|97->65|97->65|97->65|98->66|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|111->79|111->79|112->80|112->80|113->81|115->83|115->83|116->84|116->84|117->85|117->85
                  -- GENERATED --
              */
          
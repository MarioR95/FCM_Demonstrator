
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

object sdashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

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
<link rel="shortcut icon" href="assets/images/logos/logo-mini-2-md.png" />
</head>
<!-- end::Head -->
<!-- begin::Body -->
<body
	class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	"""),_display_(/*64.3*/views/*64.8*/.html._layout(user, "dashboard")),format.raw/*64.40*/("""

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
	<script src="assets/javascripts/pages/studentDashboardCharts.js" type="text/javascript"></script>
	<script src="assets/javascripts/pages/feedback-datatable.js" type="text/javascript"></script>
	<!--end::Page Scripts -->
	<!--begin::Page Scripts(used by content) -->
	<script src="assets/javascripts/pages//layout/aside/menu/contentView.js" type="text/javascript"></script>
	<!--end::Page Scripts -->
	<script src="assets/vendors/custom/flot/flot.bundle.js" type="text/javascript"></script>
	

	
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
                  DATE: Wed Nov 13 13:58:32 CET 2019
                  SOURCE: C:/Users/Mario/Desktop/MoliereDashboard/app/views/sdashboard.scala.html
                  HASH: 257521e2d94859926a79f35b59225ea98bd3cfec
                  MATRIX: 965->1|1086->27|1116->31|1623->510|1652->511|1683->515|1720->524|1749->525|1781->530|1894->616|1922->617|1975->642|2004->643|2036->648|2095->680|2123->681|2153->684|2181->685|3576->2054|3589->2059|3642->2091|3674->2096|3802->2196|3831->2197|3863->2202|3902->2213|3931->2214|3964->2220|4002->2230|4031->2231|4065->2238|4311->2457|4339->2458|4383->2474|4412->2475|4446->2482|4599->2608|4627->2609|4659->2614|4687->2615|4718->2619|4746->2620
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|96->64|96->64|96->64|98->66|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|111->79|111->79|112->80|112->80|113->81|115->83|115->83|116->84|116->84|117->85|117->85
                  -- GENERATED --
              */
          
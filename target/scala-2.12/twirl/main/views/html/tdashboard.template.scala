
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

object tdashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<!-- begin::Head -->
<head>
<meta charset="utf-8" />
<title>MOLIERE | Dashboard</title>
<meta name="description" content="Updates and statistics">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--begin::Fonts -->
<script
	src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
<script>
	WebFont.load("""),format.raw/*14.15*/("""{"""),format.raw/*14.16*/("""
		"""),format.raw/*15.3*/("""google : """),format.raw/*15.12*/("""{"""),format.raw/*15.13*/("""
			"""),format.raw/*16.4*/(""""families" : [ "Poppins:300,400,500,600,700",
					"Roboto:300,400,500,600,700" ]
		"""),format.raw/*18.3*/("""}"""),format.raw/*18.4*/(""",
		active : function() """),format.raw/*19.23*/("""{"""),format.raw/*19.24*/("""
			"""),format.raw/*20.4*/("""sessionStorage.fonts = true;
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""");
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
	"""),_display_(/*52.3*/views/*52.8*/.html._layout()),format.raw/*52.23*/("""
	"""),format.raw/*53.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*55.22*/("""{"""),format.raw/*55.23*/("""
			"""),format.raw/*56.4*/(""""colors" : """),format.raw/*56.15*/("""{"""),format.raw/*56.16*/("""
				"""),format.raw/*57.5*/(""""state" : """),format.raw/*57.15*/("""{"""),format.raw/*57.16*/("""
					"""),format.raw/*58.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""",
				"base" : """),format.raw/*67.14*/("""{"""),format.raw/*67.15*/("""
					"""),format.raw/*68.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""
			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/("""
		"""),format.raw/*72.3*/("""}"""),format.raw/*72.4*/(""";
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
</body>
<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 27 14:32:29 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/tdashboard.scala.html
                  HASH: 00c2f5b35fa4793108ca6efa5b5abfc11fd910c4
                  MATRIX: 1035->0|1477->414|1506->415|1537->419|1574->428|1603->429|1635->434|1748->520|1776->521|1829->546|1858->547|1890->552|1949->584|1977->585|2007->588|2035->589|3388->1916|3401->1921|3437->1936|3467->1939|3595->2039|3624->2040|3656->2045|3695->2056|3724->2057|3757->2063|3795->2073|3824->2074|3858->2081|4104->2300|4132->2301|4176->2317|4205->2318|4239->2325|4392->2451|4420->2452|4452->2457|4480->2458|4511->2462|4539->2463
                  LINES: 33->1|46->14|46->14|47->15|47->15|47->15|48->16|50->18|50->18|51->19|51->19|52->20|53->21|53->21|54->22|54->22|84->52|84->52|84->52|85->53|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|98->66|98->66|99->67|99->67|100->68|102->70|102->70|103->71|103->71|104->72|104->72
                  -- GENERATED --
              */
          

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

object ar_contents_container extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

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


<script src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>

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
<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<div class="kt-subheader   kt-grid__item" id="kt_subheader">
	    <div class="kt-container  kt-container--fluid ">
	        <div class="kt-subheader__main"> 
	            <h3 class="kt-subheader__title">Learn with AR</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="+"""),_display_(/*65.50*/user/*65.54*/.getEmail()),format.raw/*65.65*/(""" """),format.raw/*65.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>    
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	            	<a href="/course?courseId=HarvardX/CB22x/2013_Spring"> Mathematical Analysis II -</a>
					Two Variables Function
	            </div>         
	        </div>
    	</div>
	</div>     
	"""),_display_(/*75.3*/views/*75.8*/.html._layout(user, "ARContents")),format.raw/*75.41*/("""
	 
	"""),format.raw/*77.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*79.22*/("""{"""),format.raw/*79.23*/("""
			"""),format.raw/*80.4*/(""""colors" : """),format.raw/*80.15*/("""{"""),format.raw/*80.16*/("""
				"""),format.raw/*81.5*/(""""state" : """),format.raw/*81.15*/("""{"""),format.raw/*81.16*/("""
					"""),format.raw/*82.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*90.5*/("""}"""),format.raw/*90.6*/(""",
				"base" : """),format.raw/*91.14*/("""{"""),format.raw/*91.15*/("""
					"""),format.raw/*92.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
			"""),format.raw/*95.4*/("""}"""),format.raw/*95.5*/("""
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/(""";
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
                  DATE: Wed Nov 13 14:34:53 CET 2019
                  SOURCE: C:/Users/Mario/Desktop/MoliereDashboard/app/views/ar_contents_container.scala.html
                  HASH: adb806a3b9187091b493a897a5563468c573383f
                  MATRIX: 976->1|1097->27|1127->31|1634->510|1663->511|1694->515|1731->524|1760->525|1792->530|1905->616|1933->617|1986->642|2015->643|2047->648|2106->680|2134->681|2164->684|2192->685|4143->2610|4156->2614|4188->2625|4217->2626|4695->3078|4708->3083|4762->3116|4796->3123|4924->3223|4953->3224|4985->3229|5024->3240|5053->3241|5086->3247|5124->3257|5153->3258|5187->3265|5433->3484|5461->3485|5505->3501|5534->3502|5568->3509|5721->3635|5749->3636|5781->3641|5809->3642|5840->3646|5868->3647
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|97->65|97->65|97->65|97->65|107->75|107->75|107->75|109->77|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|114->82|122->90|122->90|123->91|123->91|124->92|126->94|126->94|127->95|127->95|128->96|128->96
                  -- GENERATED --
              */
          
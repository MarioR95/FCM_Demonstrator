
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

object contents_container extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.dto.UserDto,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""

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
					"Roboto:300,400,500,600,700"]
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

<link href="assets/stylesheets/pages/general/wizard/wizard-3.css" rel="stylesheet" type="text/css">
</head>
<!-- end::Head -->
<!-- begin::Body -->
<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">
	<div class="kt-subheader   kt-grid__item" id="kt_subheader">
	    <div class="kt-container  kt-container--fluid ">
	        <div class="kt-subheader__main"> 
	            <h3 class="kt-subheader__title">
		            """),_display_(/*65.16*/contentType/*65.27*/ match/*65.33*/ {/*66.7*/case "functions_sev_var" =>/*66.34*/{_display_(Seq[Any](format.raw/*66.35*/("""
							"""),format.raw/*67.8*/("""Functions of two variables
						""")))}/*69.7*/case "critical_points" =>/*69.32*/{_display_(Seq[Any](format.raw/*69.33*/("""
							"""),format.raw/*70.8*/("""Critical Points
						""")))}/*72.7*/case "AR" =>/*72.19*/ {_display_(Seq[Any](format.raw/*72.21*/("""
							"""),format.raw/*73.8*/("""AR Learning
						""")))}/*75.7*/case "Quiz" =>/*75.21*/ {_display_(Seq[Any](format.raw/*75.23*/("""
							"""),format.raw/*76.8*/("""Quiz
						""")))}/*78.7*/case _ =>/*78.16*/ {}}),format.raw/*79.7*/("""
	            """),format.raw/*80.14*/("""</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="+"""),_display_(/*83.50*/user/*83.54*/.getEmail()),format.raw/*83.65*/(""" """),format.raw/*83.66*/("""class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>    
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	            	<a href="/course?courseId=HarvardX/CB22x/2013_Spring"> Mathematical Analysis II -</a>
					"""),_display_(/*88.7*/contentType/*88.18*/ match/*88.24*/ {/*89.7*/case "functions_sev_var" =>/*89.34*/{_display_(Seq[Any](format.raw/*89.35*/("""
							"""),format.raw/*90.8*/("""Functions of two variables
						""")))}/*92.7*/case "critical_points" =>/*92.32*/{_display_(Seq[Any](format.raw/*92.33*/("""
							"""),format.raw/*93.8*/("""Critical Points
						""")))}/*95.7*/case "AR" =>/*95.19*/ {_display_(Seq[Any](format.raw/*95.21*/("""
							"""),format.raw/*96.8*/("""AR Learning
						""")))}/*98.7*/case "Quiz" =>/*98.21*/ {_display_(Seq[Any](format.raw/*98.23*/("""
							"""),format.raw/*99.8*/("""Quiz
						""")))}/*101.7*/case _ =>/*101.16*/ {}}),format.raw/*102.7*/("""
	            """),format.raw/*103.14*/("""</div>         
	        </div>
    	</div>
	</div>    
	"""),_display_(/*107.3*/contentType/*107.14*/ match/*107.20*/ {/*108.3*/case "AR" =>/*108.15*/ {_display_(Seq[Any](format.raw/*108.17*/("""
			"""),_display_(/*109.5*/views/*109.10*/.html._layout(user, "AR")),format.raw/*109.35*/("""
		""")))}/*111.3*/case "functions_sev_var" =>/*111.30*/ {_display_(Seq[Any](format.raw/*111.32*/("""
			"""),_display_(/*112.5*/views/*112.10*/.html._layout(user, "functions_sev_var")),format.raw/*112.50*/("""
		""")))}/*114.3*/case "critical_points" =>/*114.28*/{_display_(Seq[Any](format.raw/*114.29*/("""
			"""),_display_(/*115.5*/views/*115.10*/.html._layout(user, "critical_points")),format.raw/*115.48*/("""
		""")))}/*117.3*/case "Quiz" =>/*117.17*/ {_display_(Seq[Any](format.raw/*117.19*/("""
			"""),_display_(/*118.5*/views/*118.10*/.html._layout(user, "Quiz")),format.raw/*118.37*/("""
		""")))}/*120.3*/case _ =>/*120.12*/ {}}),format.raw/*122.3*/("""
	
	 
	"""),format.raw/*125.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	<script>
		var KTAppOptions = """),format.raw/*127.22*/("""{"""),format.raw/*127.23*/("""
			"""),format.raw/*128.4*/(""""colors" : """),format.raw/*128.15*/("""{"""),format.raw/*128.16*/("""
				"""),format.raw/*129.5*/(""""state" : """),format.raw/*129.15*/("""{"""),format.raw/*129.16*/("""
					"""),format.raw/*130.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*138.5*/("""}"""),format.raw/*138.6*/(""",
				"base" : """),format.raw/*139.14*/("""{"""),format.raw/*139.15*/("""
					"""),format.raw/*140.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*142.5*/("""}"""),format.raw/*142.6*/("""
			"""),format.raw/*143.4*/("""}"""),format.raw/*143.5*/("""
		"""),format.raw/*144.3*/("""}"""),format.raw/*144.4*/(""";
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
		
	<script src="assets/javascripts/pages/wizard/wizard-3.js" type="text/javascript"></script>
	
	<script src="assets/javascripts/pages/quiz-handler.js"></script>
	
	<script>
		$(document).ready(function()"""),format.raw/*169.31*/("""{"""),format.raw/*169.32*/("""
			"""),format.raw/*170.4*/("""var timeStamp = Math.floor(Date.now() / 1000);
			$("mjx-container").css("display", "inline");
			
			
			"""),_display_(/*174.5*/contentType/*174.16*/ match/*174.22*/ {/*175.5*/case "functions_sev_var" =>/*175.32*/ {_display_(Seq[Any](format.raw/*175.34*/("""
					
				""")))}/*179.5*/case "critical_points" =>/*179.30*/ {_display_(Seq[Any](format.raw/*179.32*/("""
					
				""")))}/*183.5*/case "Quiz" =>/*183.19*/ {_display_(Seq[Any](format.raw/*183.21*/("""
					"""),format.raw/*184.6*/("""var questions = 5;
					var n_question = 1;
					var current_question= n_question;
					$('button[data-ktwizard-type="action-next"]').prop("disabled",true);	
					checkScore(n_question);
					
					$('button[data-ktwizard-type="action-prev"]').click(function()"""),format.raw/*190.68*/("""{"""),format.raw/*190.69*/("""
						"""),format.raw/*191.7*/("""current_question --;
						if(isAnswered(current_question))"""),format.raw/*192.39*/("""{"""),format.raw/*192.40*/("""
							"""),format.raw/*193.8*/("""$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
						"""),format.raw/*194.7*/("""}"""),format.raw/*194.8*/("""
					"""),format.raw/*195.6*/("""}"""),format.raw/*195.7*/(""");
					
					$('button[data-ktwizard-type="action-next"]').click(function()"""),format.raw/*197.68*/("""{"""),format.raw/*197.69*/("""
						"""),format.raw/*198.7*/("""current_question++;
						if(!isAnswered(current_question))"""),format.raw/*199.40*/("""{"""),format.raw/*199.41*/("""
							"""),format.raw/*200.8*/("""$(this).prop("disabled", true);
						"""),format.raw/*201.7*/("""}"""),format.raw/*201.8*/("""else"""),format.raw/*201.12*/("""{"""),format.raw/*201.13*/("""
							"""),format.raw/*202.8*/("""$(this).prop("disabled", false);
						"""),format.raw/*203.7*/("""}"""),format.raw/*203.8*/("""
						"""),format.raw/*204.7*/("""n_question++;
						checkScore(n_question, questions);
					"""),format.raw/*206.6*/("""}"""),format.raw/*206.7*/(""");

				""")))}/*210.5*/case _ =>/*210.14*/ {}}),format.raw/*212.5*/("""
			
		"""),format.raw/*214.3*/("""}"""),format.raw/*214.4*/(""");
		
	</script>
</body>
<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType)

  def f:((models.dto.UserDto,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType) => apply(user,contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/contents_container.scala.html
                  HASH: b8b93daea6963d1f5f83aaf94bd2ae445e7ba3ab
                  MATRIX: 980->1|1122->48|1152->52|1659->531|1688->532|1719->536|1756->545|1785->546|1817->551|1929->636|1957->637|2010->662|2039->663|2071->668|2130->700|2158->701|2188->704|2216->705|4094->2557|4114->2568|4129->2574|4139->2584|4175->2611|4214->2612|4250->2621|4303->2664|4337->2689|4376->2690|4412->2699|4454->2731|4475->2743|4515->2745|4551->2754|4589->2782|4612->2796|4652->2798|4688->2807|4719->2829|4737->2838|4761->2849|4804->2864|5011->3044|5024->3048|5056->3059|5085->3060|5464->3413|5484->3424|5499->3430|5509->3440|5545->3467|5584->3468|5620->3477|5673->3520|5707->3545|5746->3546|5782->3555|5824->3587|5845->3599|5885->3601|5921->3610|5959->3638|5982->3652|6022->3654|6058->3663|6090->3685|6109->3694|6134->3705|6178->3720|6267->3782|6288->3793|6304->3799|6315->3805|6337->3817|6378->3819|6411->3825|6426->3830|6473->3855|6497->3864|6534->3891|6575->3893|6608->3899|6623->3904|6685->3944|6709->3953|6744->3978|6784->3979|6817->3985|6832->3990|6892->4028|6916->4037|6940->4051|6981->4053|7014->4059|7029->4064|7078->4091|7102->4100|7121->4109|7146->4120|7184->4130|7313->4230|7343->4231|7376->4236|7416->4247|7446->4248|7480->4254|7519->4264|7549->4265|7584->4272|7831->4491|7860->4492|7905->4508|7935->4509|7970->4516|8124->4642|8153->4643|8186->4648|8215->4649|8247->4653|8276->4654|9658->6007|9688->6008|9721->6013|9859->6124|9880->6135|9896->6141|9907->6149|9944->6176|9985->6178|10018->6204|10053->6229|10094->6231|10127->6257|10151->6271|10192->6273|10227->6280|10522->6546|10552->6547|10588->6555|10677->6615|10707->6616|10744->6625|10849->6702|10878->6703|10913->6710|10942->6711|11049->6789|11079->6790|11115->6798|11204->6858|11234->6859|11271->6868|11338->6907|11367->6908|11400->6912|11430->6913|11467->6922|11535->6962|11564->6963|11600->6971|11690->7033|11719->7034|11749->7057|11768->7066|11793->7083|11830->7092|11859->7093
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|97->65|97->65|97->65|97->66|97->66|97->66|98->67|99->69|99->69|99->69|100->70|101->72|101->72|101->72|102->73|103->75|103->75|103->75|104->76|105->78|105->78|105->79|106->80|109->83|109->83|109->83|109->83|114->88|114->88|114->88|114->89|114->89|114->89|115->90|116->92|116->92|116->92|117->93|118->95|118->95|118->95|119->96|120->98|120->98|120->98|121->99|122->101|122->101|122->102|123->103|127->107|127->107|127->107|127->108|127->108|127->108|128->109|128->109|128->109|129->111|129->111|129->111|130->112|130->112|130->112|131->114|131->114|131->114|132->115|132->115|132->115|133->117|133->117|133->117|134->118|134->118|134->118|135->120|135->120|135->122|138->125|140->127|140->127|141->128|141->128|141->128|142->129|142->129|142->129|143->130|151->138|151->138|152->139|152->139|153->140|155->142|155->142|156->143|156->143|157->144|157->144|182->169|182->169|183->170|187->174|187->174|187->174|187->175|187->175|187->175|189->179|189->179|189->179|191->183|191->183|191->183|192->184|198->190|198->190|199->191|200->192|200->192|201->193|202->194|202->194|203->195|203->195|205->197|205->197|206->198|207->199|207->199|208->200|209->201|209->201|209->201|209->201|210->202|211->203|211->203|212->204|214->206|214->206|216->210|216->210|216->212|218->214|218->214
                  -- GENERATED --
              */
          
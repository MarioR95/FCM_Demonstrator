
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

object contents_container extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.dto.UserDto,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String, topic: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

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
		            """),_display_(/*67.16*/contentType/*67.27*/ match/*67.33*/ {/*68.7*/case "pdf" =>/*68.20*/ {_display_(Seq[Any](format.raw/*68.22*/("""
							"""),_display_(/*69.9*/topic/*69.14*/ match/*69.20*/ {/*70.9*/case "functions_sev_var" =>/*70.36*/{_display_(Seq[Any](format.raw/*70.37*/("""
									"""),format.raw/*71.10*/("""Functions of two variables
								""")))}/*73.9*/case "critical_points" =>/*73.34*/{_display_(Seq[Any](format.raw/*73.35*/("""
									"""),format.raw/*74.10*/("""Critical Points
								""")))}/*76.9*/case _ =>/*76.18*/ {}}),format.raw/*77.9*/("""
						""")))}/*79.7*/case "assignment" =>/*79.27*/ {_display_(Seq[Any](format.raw/*79.29*/("""
							"""),_display_(/*80.9*/topic/*80.14*/ match/*80.20*/{/*81.9*/case "functions_sev_var" =>/*81.36*/ {_display_(Seq[Any](format.raw/*81.38*/("""
									"""),format.raw/*82.10*/("""Functions of two variables assignment 
								""")))}/*84.9*/case "critical_points" =>/*84.34*/ {_display_(Seq[Any](format.raw/*84.36*/("""
									"""),format.raw/*85.10*/("""Critical points assignment
								""")))}/*87.9*/case _ =>/*87.18*/ {}}),format.raw/*88.9*/("""
						""")))}/*90.7*/case "ar" =>/*90.19*/ {_display_(Seq[Any](format.raw/*90.21*/("""
							"""),format.raw/*91.8*/("""AR Learning
						""")))}/*93.7*/case "quiz" =>/*93.21*/ {_display_(Seq[Any](format.raw/*93.23*/("""
							"""),format.raw/*94.8*/("""Quiz
						""")))}/*96.7*/case _ =>/*96.16*/ {}}),format.raw/*97.7*/("""
	            """),format.raw/*98.14*/("""</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="""),_display_(/*101.48*/user/*101.52*/.getEmail()),format.raw/*101.63*/("""" class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>    
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	            	<a href="/course?courseId=HarvardX/CB22x/2013_Spring"> Mathematical Analysis II -</a>
					"""),_display_(/*106.7*/contentType/*106.18*/ match/*106.24*/ {/*107.7*/case "pdf" =>/*107.20*/ {_display_(Seq[Any](format.raw/*107.22*/("""
							"""),_display_(/*108.9*/topic/*108.14*/ match/*108.20*/ {/*109.9*/case "functions_sev_var" =>/*109.36*/{_display_(Seq[Any](format.raw/*109.37*/("""
									"""),format.raw/*110.10*/("""Functions of two variables
								""")))}/*112.9*/case "critical_points" =>/*112.34*/{_display_(Seq[Any](format.raw/*112.35*/("""
									"""),format.raw/*113.10*/("""Critical Points
								""")))}/*115.9*/case _ =>/*115.18*/ {}}),format.raw/*116.9*/("""
						""")))}/*118.7*/case "assignment" =>/*118.27*/ {_display_(Seq[Any](format.raw/*118.29*/("""
							"""),_display_(/*119.9*/topic/*119.14*/ match/*119.20*/{/*120.9*/case "functions_sev_var" =>/*120.36*/ {_display_(Seq[Any](format.raw/*120.38*/("""
									"""),format.raw/*121.10*/("""Functions of two variables assignment 
								""")))}/*123.9*/case "critical_points" =>/*123.34*/ {_display_(Seq[Any](format.raw/*123.36*/("""
									"""),format.raw/*124.10*/("""Critical points assignment
								""")))}/*126.9*/case _ =>/*126.18*/ {}}),format.raw/*127.9*/("""
						""")))}/*129.7*/case "ar" =>/*129.19*/ {_display_(Seq[Any](format.raw/*129.21*/("""
							"""),format.raw/*130.8*/("""AR Learning
						""")))}/*132.7*/case "quiz" =>/*132.21*/ {_display_(Seq[Any](format.raw/*132.23*/("""
							"""),format.raw/*133.8*/("""Quiz
						""")))}/*135.7*/case _ =>/*135.16*/ {}}),format.raw/*136.7*/("""
	            """),format.raw/*137.14*/("""</div>         
	        </div>
    	</div>
	</div>    
	"""),_display_(/*141.3*/contentType/*141.14*/ match/*141.20*/ {/*142.3*/case "ar" =>/*142.15*/ {_display_(Seq[Any](format.raw/*142.17*/("""
			"""),_display_(/*143.5*/views/*143.10*/.html._layout(user, "ar")),format.raw/*143.35*/("""
		""")))}/*145.3*/case "pdf" =>/*145.16*/ {_display_(Seq[Any](format.raw/*145.18*/("""
			"""),_display_(/*146.5*/topic/*146.10*/ match/*146.16*/ {/*147.5*/case "functions_sev_var" =>/*147.32*/ {_display_(Seq[Any](format.raw/*147.34*/("""
					"""),_display_(/*148.7*/views/*148.12*/.html._layout(user, "functions_sev_var_pdf")),format.raw/*148.56*/("""
				""")))}/*150.5*/case "critical_points" =>/*150.30*/{_display_(Seq[Any](format.raw/*150.31*/("""
					"""),_display_(/*151.7*/views/*151.12*/.html._layout(user, "critical_points_pdf")),format.raw/*151.54*/("""
				""")))}/*153.5*/case _ =>/*153.14*/ {}}),format.raw/*154.5*/("""
		
		""")))}/*157.3*/case "assignment" =>/*157.23*/ {_display_(Seq[Any](format.raw/*157.25*/("""
			"""),_display_(/*158.5*/topic/*158.10*/ match/*158.16*/ {/*159.5*/case "functions_sev_var" =>/*159.32*/ {_display_(Seq[Any](format.raw/*159.34*/("""
					"""),_display_(/*160.7*/views/*160.12*/.html._layout(user, "functions_sev_var_assignment")),format.raw/*160.63*/("""
				""")))}/*162.5*/case "critical_points" =>/*162.30*/{_display_(Seq[Any](format.raw/*162.31*/("""
					"""),_display_(/*163.7*/views/*163.12*/.html._layout(user, "critical_points_assignment")),format.raw/*163.61*/("""
				""")))}/*165.5*/case _ =>/*165.14*/ {}}),format.raw/*166.5*/("""
		""")))}/*168.3*/case "quiz" =>/*168.17*/ {_display_(Seq[Any](format.raw/*168.19*/("""
			"""),_display_(/*169.5*/views/*169.10*/.html._layout(user, "quiz")),format.raw/*169.37*/("""
		""")))}/*171.3*/case _ =>/*171.12*/ {}}),format.raw/*173.3*/("""
	
	 
	"""),format.raw/*176.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	
	<script>
		var KTAppOptions = """),format.raw/*179.22*/("""{"""),format.raw/*179.23*/("""
			"""),format.raw/*180.4*/(""""colors" : """),format.raw/*180.15*/("""{"""),format.raw/*180.16*/("""
				"""),format.raw/*181.5*/(""""state" : """),format.raw/*181.15*/("""{"""),format.raw/*181.16*/("""
					"""),format.raw/*182.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*190.5*/("""}"""),format.raw/*190.6*/(""",
				"base" : """),format.raw/*191.14*/("""{"""),format.raw/*191.15*/("""
					"""),format.raw/*192.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
			"""),format.raw/*195.4*/("""}"""),format.raw/*195.5*/("""
		"""),format.raw/*196.3*/("""}"""),format.raw/*196.4*/(""";
	</script>
	<!-- end::Global Config -->

	<script src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.1/MathJax.js?config=TeX-MML-AM_CHTML"></script>
	
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
	"""),_display_(/*220.3*/contentType/*220.14*/ match/*220.20*/ {/*221.3*/case "quiz" | "assignment" =>/*221.32*/ {_display_(Seq[Any](format.raw/*221.34*/("""
			"""),format.raw/*222.4*/("""<script src="assets/javascripts/pages/quiz-handler.js"></script>
		""")))}/*224.3*/case _ =>/*224.12*/ {}}),format.raw/*225.3*/("""
	
	"""),format.raw/*227.2*/("""<script>
		$(document).ready(function()"""),format.raw/*228.31*/("""{"""),format.raw/*228.32*/("""
			"""),format.raw/*229.4*/("""var startTime = Math.floor(Date.now()/1000);
								
			//Function that return the time elapsed on a page
			function getElapsedTime()"""),format.raw/*232.29*/("""{"""),format.raw/*232.30*/("""
				"""),format.raw/*233.5*/("""var currentTime= Math.floor(Date.now()/1000);
				return currentTime - startTime;
			"""),format.raw/*235.4*/("""}"""),format.raw/*235.5*/("""
			
			"""),_display_(/*237.5*/contentType/*237.16*/ match/*237.22*/ {/*238.5*/case "pdf" =>/*238.18*/ {_display_(Seq[Any](format.raw/*238.20*/("""
					"""),format.raw/*239.6*/("""$('a[href="/course?courseId=HarvardX/CB22x/2013_Spring"], a[href="/dashboard?username="""),_display_(/*239.93*/user/*239.97*/.getEmail()),format.raw/*239.108*/(""""]').click(function()"""),format.raw/*239.129*/("""{"""),format.raw/*239.130*/("""
						"""),format.raw/*240.7*/("""$.ajax("""),format.raw/*240.14*/("""{"""),format.raw/*240.15*/("""
							"""),format.raw/*241.8*/("""url: "/updateLearningResult",
							data: "courseId=HarvardX/CB22x/2013_Spring&userId="""),_display_(/*242.59*/user/*242.63*/.getUserId),format.raw/*242.73*/("""&contentType="""),_display_(/*242.87*/contentType),format.raw/*242.98*/("""&topic="""),_display_(/*242.106*/topic),format.raw/*242.111*/("""&elapsedTime="+getElapsedTime(),
							contentType: "application/json; charset=utf-8",
							dataType: "json",
							success: function(data)"""),format.raw/*245.31*/("""{"""),format.raw/*245.32*/("""
								"""),format.raw/*246.9*/("""window.location.replace("/course?courseId=HarvardX/CB22x/2013_Spring");
							"""),format.raw/*247.8*/("""}"""),format.raw/*247.9*/(""",
							error: function(err)"""),format.raw/*248.28*/("""{"""),format.raw/*248.29*/("""
								"""),format.raw/*249.9*/("""console.log(err)		
							"""),format.raw/*250.8*/("""}"""),format.raw/*250.9*/("""
						"""),format.raw/*251.7*/("""}"""),format.raw/*251.8*/(""");				
					"""),format.raw/*252.6*/("""}"""),format.raw/*252.7*/(""");	
				""")))}/*255.5*/case "quiz" | "assignment" =>/*255.34*/ {_display_(Seq[Any](format.raw/*255.36*/("""
					
					"""),format.raw/*257.6*/("""//RETRIEVE QUESTIONS
					$.ajax("""),format.raw/*258.13*/("""{"""),format.raw/*258.14*/("""
							"""),format.raw/*259.8*/("""url: "/retrieveQuestions",
							data:"contentType="""),_display_(/*260.27*/contentType),format.raw/*260.38*/("""&topic="""),_display_(/*260.46*/topic),format.raw/*260.51*/("""",
							contentType: "application/json; charset=utf-8",
							dataType: "json",
							success: function(data)"""),format.raw/*263.31*/("""{"""),format.raw/*263.32*/("""
								"""),format.raw/*264.9*/("""console.log(data)
								var n_questions = data["questions"].length;
								var n_answers;
								if(""""),_display_(/*267.14*/contentType),format.raw/*267.25*/("""" == "quiz")"""),format.raw/*267.37*/("""{"""),format.raw/*267.38*/("""
									"""),format.raw/*268.10*/("""n_answers= data["answers"].length;	
								"""),format.raw/*269.9*/("""}"""),format.raw/*269.10*/("""
								"""),format.raw/*270.9*/("""var n_question = 1;
								var current_question= 1;
								var questions_list= shuffle(data["questions"]);
								var answers_list = data["answers"];
								var answersFeedback

								//INIT QUESTIONS
								for(var i=0 ; i< n_questions; i++)"""),format.raw/*277.43*/("""{"""),format.raw/*277.44*/("""
									"""),format.raw/*278.10*/("""initFormQuestions(questions_list[i], (i+1),""""),_display_(/*278.55*/contentType),format.raw/*278.66*/("""");
								"""),format.raw/*279.9*/("""}"""),format.raw/*279.10*/("""
								
								"""),format.raw/*281.9*/("""if(""""),_display_(/*281.14*/contentType),format.raw/*281.25*/("""" == "assignment")"""),format.raw/*281.43*/("""{"""),format.raw/*281.44*/("""
									"""),format.raw/*282.10*/("""$(".feedback_container").remove();
								"""),format.raw/*283.9*/("""}"""),format.raw/*283.10*/("""
								"""),format.raw/*284.9*/("""appendFormActions();
								
								//RETRIEVE ANSWERS
								if(""""),_display_(/*287.14*/contentType),format.raw/*287.25*/("""" == "quiz")"""),format.raw/*287.37*/("""{"""),format.raw/*287.38*/("""
									"""),format.raw/*288.10*/("""for(var j=0; j<n_answers; j++ )"""),format.raw/*288.41*/("""{"""),format.raw/*288.42*/("""
										"""),format.raw/*289.11*/("""if(questions_list[current_question-1].questionId == answers_list[j].questionId)"""),format.raw/*289.90*/("""{"""),format.raw/*289.91*/("""
											"""),format.raw/*290.12*/("""answersFeedback= answers_list[j];
											console.log(answersFeedback);
										"""),format.raw/*292.11*/("""}"""),format.raw/*292.12*/("""
									"""),format.raw/*293.10*/("""}"""),format.raw/*293.11*/("""
								"""),format.raw/*294.9*/("""}"""),format.raw/*294.10*/("""
								
									
								"""),format.raw/*297.9*/("""$('button[data-ktwizard-type="action-next"]').prop("disabled",true);
								if(""""),_display_(/*298.14*/contentType),format.raw/*298.25*/(""""=="quiz")
									checkQuizScore(n_question, n_questions, questions_list[current_question-1].rightAnswer, answersFeedback);
								else 
									checkAssignmentScore(n_question, n_questions, questions_list[current_question-1].rightAnswer);
								$('button[data-ktwizard-type="action-prev"]').click(function(event)"""),format.raw/*302.76*/("""{"""),format.raw/*302.77*/("""
									"""),format.raw/*303.10*/("""event.preventDefault();
									$("#question_"+current_question).removeAttr("data-ktwizard-state");
									$("#nav_"+current_question).removeAttr("data-ktwizard-state");
									current_question --;
									$("#question_"+current_question).attr("data-ktwizard-state", "current");
									$("#nav_"+current_question).attr("data-ktwizard-state", "current");
									if(isAnswered(current_question))"""),format.raw/*309.42*/("""{"""),format.raw/*309.43*/("""
										"""),format.raw/*310.11*/("""$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
									"""),format.raw/*311.10*/("""}"""),format.raw/*311.11*/("""
								"""),format.raw/*312.9*/("""}"""),format.raw/*312.10*/(""");
								
								$('button[data-ktwizard-type="action-next"]').click(function(event)"""),format.raw/*314.76*/("""{"""),format.raw/*314.77*/("""
									"""),format.raw/*315.10*/("""event.preventDefault();
									
									$('button[data-ktwizard-type="action-prev"]').show();
									$("#nav_"+current_question).removeAttr("data-ktwizard-state");
									$("#question_"+current_question).removeAttr("data-ktwizard-state");
									
									current_question++;
									$("#question_"+current_question).attr("data-ktwizard-state", "current");
									$("#nav_"+current_question).attr("data-ktwizard-state", "current");
									
									
									//RETRIEVE ANSWERS
									for(var j=0; j<n_answers; j++ )"""),format.raw/*327.41*/("""{"""),format.raw/*327.42*/("""
										"""),format.raw/*328.11*/("""if(questions_list[current_question-1].questionId == answers_list[j].questionId)"""),format.raw/*328.90*/("""{"""),format.raw/*328.91*/("""
											"""),format.raw/*329.12*/("""answersFeedback= answers_list[j];
											console.log(answersFeedback);
										"""),format.raw/*331.11*/("""}"""),format.raw/*331.12*/("""
									"""),format.raw/*332.10*/("""}"""),format.raw/*332.11*/("""
														
									"""),format.raw/*334.10*/("""if(!isAnswered(current_question))"""),format.raw/*334.43*/("""{"""),format.raw/*334.44*/("""
										"""),format.raw/*335.11*/("""$(this).prop("disabled", true);
									"""),format.raw/*336.10*/("""}"""),format.raw/*336.11*/("""else"""),format.raw/*336.15*/("""{"""),format.raw/*336.16*/("""
										"""),format.raw/*337.11*/("""$(this).prop("disabled", false);
									"""),format.raw/*338.10*/("""}"""),format.raw/*338.11*/("""
									
									"""),format.raw/*340.10*/("""n_question++;
									if(""""),_display_(/*341.15*/contentType),format.raw/*341.26*/(""""=="quiz")
										checkQuizScore(n_question, n_questions, questions_list[current_question-1].rightAnswer, answersFeedback);
									else 
										checkAssignmentScore(n_question, n_questions, questions_list[current_question-1].rightAnswer);
									
									if(current_question == n_questions)
										$("#kt_wizard_v3").attr("data-ktwizard-state", "last");
																
								"""),format.raw/*349.9*/("""}"""),format.raw/*349.10*/(""");
								
								$('#submit-btn').click(function()"""),format.raw/*351.42*/("""{"""),format.raw/*351.43*/("""
									"""),format.raw/*352.10*/("""$.ajax("""),format.raw/*352.17*/("""{"""),format.raw/*352.18*/("""
										"""),format.raw/*353.11*/("""url: "/courseQuizResult",
										data: "courseId=HarvardX/CB22x/2013_Spring&userId="""),_display_(/*354.62*/user/*354.66*/.getUserId),format.raw/*354.76*/("""&contentType="""),_display_(/*354.90*/contentType),format.raw/*354.101*/("""&topic="""),_display_(/*354.109*/topic),format.raw/*354.114*/("""&elapsedTime="+getElapsedTime()+"&achievedScore="+getResult()+"&totalScore="+n_questions,
										contentType: "application/json; charset=utf-8",
										dataType: "json",
										success: function(data)"""),format.raw/*357.34*/("""{"""),format.raw/*357.35*/("""
											"""),format.raw/*358.12*/("""window.location.replace("/course?courseId=HarvardX/CB22x/2013_Spring");
										"""),format.raw/*359.11*/("""}"""),format.raw/*359.12*/(""",
										error: function(err)"""),format.raw/*360.31*/("""{"""),format.raw/*360.32*/("""
											"""),format.raw/*361.12*/("""console.log(err)		
										"""),format.raw/*362.11*/("""}"""),format.raw/*362.12*/("""
									"""),format.raw/*363.10*/("""}"""),format.raw/*363.11*/(""");
								"""),format.raw/*364.9*/("""}"""),format.raw/*364.10*/(""")
								
							"""),format.raw/*366.8*/("""}"""),format.raw/*366.9*/(""",
							error: function(err)"""),format.raw/*367.28*/("""{"""),format.raw/*367.29*/("""
								"""),format.raw/*368.9*/("""console.log(err)		
							"""),format.raw/*369.8*/("""}"""),format.raw/*369.9*/("""
						"""),format.raw/*370.7*/("""}"""),format.raw/*370.8*/(""");

				""")))}/*374.5*/case _ =>/*374.14*/ {}}),format.raw/*376.5*/("""
			"""),format.raw/*377.4*/("""$(".mjx-chtml").removeClass("MJXc-display");

		"""),format.raw/*379.3*/("""}"""),format.raw/*379.4*/(""");
				
	</script>
</body>
<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String,topic:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType,topic)

  def f:((models.dto.UserDto,String,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType,topic) => apply(user,contentType,topic)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 04 12:04:38 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/contents_container.scala.html
                  HASH: 43b3c0fa8293b56e944293cdc5eb26c0d0db2099
                  MATRIX: 987->1|1144->63|1174->67|1681->546|1710->547|1741->551|1778->560|1807->561|1839->566|1951->651|1979->652|2032->677|2061->678|2093->683|2152->715|2180->716|2210->719|2238->720|4011->2466|4031->2477|4046->2483|4056->2493|4078->2506|4118->2508|4154->2518|4168->2523|4183->2529|4193->2542|4229->2569|4268->2570|4307->2581|4362->2628|4396->2653|4435->2654|4474->2665|4518->2701|4536->2710|4560->2723|4587->2740|4616->2760|4656->2762|4692->2772|4706->2777|4721->2783|4730->2794|4766->2821|4806->2823|4845->2834|4912->2893|4946->2918|4986->2920|5025->2931|5080->2978|5098->2987|5122->3000|5149->3017|5170->3029|5210->3031|5246->3040|5284->3068|5307->3082|5347->3084|5383->3093|5414->3115|5432->3124|5456->3135|5499->3150|5705->3328|5719->3332|5752->3343|6134->3698|6155->3709|6171->3715|6182->3725|6205->3738|6246->3740|6283->3750|6298->3755|6314->3761|6325->3774|6362->3801|6402->3802|6442->3813|6498->3860|6533->3885|6573->3886|6613->3897|6658->3933|6677->3942|6702->3955|6730->3972|6760->3992|6801->3994|6838->4004|6853->4009|6869->4015|6879->4026|6916->4053|6957->4055|6997->4066|7065->4125|7100->4150|7141->4152|7181->4163|7237->4210|7256->4219|7281->4232|7309->4249|7331->4261|7372->4263|7409->4272|7448->4300|7472->4314|7513->4316|7550->4325|7582->4347|7601->4356|7626->4367|7670->4382|7759->4444|7780->4455|7796->4461|7807->4467|7829->4479|7870->4481|7903->4487|7918->4492|7965->4517|7989->4526|8012->4539|8053->4541|8086->4547|8101->4552|8117->4558|8128->4566|8165->4593|8206->4595|8241->4603|8256->4608|8322->4652|8348->4665|8383->4690|8423->4691|8458->4699|8473->4704|8537->4746|8563->4759|8582->4768|8607->4777|8635->4790|8665->4810|8706->4812|8739->4818|8754->4823|8770->4829|8781->4837|8818->4864|8859->4866|8894->4874|8909->4879|8982->4930|9008->4943|9043->4968|9083->4969|9118->4977|9133->4982|9204->5031|9230->5044|9249->5053|9274->5062|9298->5071|9322->5085|9363->5087|9396->5093|9411->5098|9460->5125|9484->5134|9503->5143|9528->5154|9566->5164|9698->5267|9728->5268|9761->5273|9801->5284|9831->5285|9865->5291|9904->5301|9934->5302|9969->5309|10216->5528|10245->5529|10290->5545|10320->5546|10355->5553|10509->5679|10538->5680|10571->5685|10600->5686|10632->5690|10661->5691|12048->7051|12069->7062|12085->7068|12096->7074|12135->7103|12176->7105|12209->7110|12297->7183|12316->7192|12341->7199|12375->7205|12444->7245|12474->7246|12507->7251|12674->7389|12704->7390|12738->7396|12853->7483|12882->7484|12920->7495|12941->7506|12957->7512|12968->7520|12991->7533|13032->7535|13067->7542|13182->7629|13196->7633|13230->7644|13281->7665|13312->7666|13348->7674|13384->7681|13414->7682|13451->7691|13568->7780|13582->7784|13614->7794|13656->7808|13689->7819|13726->7827|13754->7832|13929->7978|13959->7979|13997->7989|14105->8069|14134->8070|14193->8100|14223->8101|14261->8111|14316->8138|14345->8139|14381->8147|14410->8148|14451->8161|14480->8162|14509->8181|14548->8210|14589->8212|14631->8226|14694->8260|14724->8261|14761->8270|14843->8324|14876->8335|14912->8343|14939->8348|15084->8464|15114->8465|15152->8475|15289->8584|15322->8595|15363->8607|15393->8608|15433->8619|15506->8664|15536->8665|15574->8675|15859->8931|15889->8932|15929->8943|16002->8988|16035->8999|16076->9012|16106->9013|16154->9033|16187->9038|16220->9049|16267->9067|16297->9068|16337->9079|16409->9123|16439->9124|16477->9134|16578->9207|16611->9218|16652->9230|16682->9231|16722->9242|16782->9273|16812->9274|16853->9286|16961->9365|16991->9366|17033->9379|17149->9466|17179->9467|17219->9478|17249->9479|17287->9489|17317->9490|17376->9521|17487->9604|17520->9615|17872->9938|17902->9939|17942->9950|18380->10359|18410->10360|18451->10372|18560->10452|18590->10453|18628->10463|18658->10464|18776->10553|18806->10554|18846->10565|19419->11109|19449->11110|19490->11122|19598->11201|19628->11202|19670->11215|19786->11302|19816->11303|19856->11314|19886->11315|19942->11342|20004->11375|20034->11376|20075->11388|20146->11430|20176->11431|20209->11435|20239->11436|20280->11448|20352->11491|20382->11492|20433->11514|20490->11543|20523->11554|20952->11955|20982->11956|21066->12011|21096->12012|21136->12023|21172->12030|21202->12031|21243->12043|21359->12131|21373->12135|21405->12145|21447->12159|21481->12170|21518->12178|21546->12183|21787->12395|21817->12396|21859->12409|21971->12492|22001->12493|22063->12526|22093->12527|22135->12540|22194->12570|22224->12571|22264->12582|22294->12583|22334->12595|22364->12596|22412->12616|22441->12617|22500->12647|22530->12648|22568->12658|22623->12685|22652->12686|22688->12694|22717->12695|22747->12718|22766->12727|22791->12744|22824->12749|22902->12799|22931->12800
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|99->67|99->67|99->67|99->68|99->68|99->68|100->69|100->69|100->69|100->70|100->70|100->70|101->71|102->73|102->73|102->73|103->74|104->76|104->76|104->77|105->79|105->79|105->79|106->80|106->80|106->80|106->81|106->81|106->81|107->82|108->84|108->84|108->84|109->85|110->87|110->87|110->88|111->90|111->90|111->90|112->91|113->93|113->93|113->93|114->94|115->96|115->96|115->97|116->98|119->101|119->101|119->101|124->106|124->106|124->106|124->107|124->107|124->107|125->108|125->108|125->108|125->109|125->109|125->109|126->110|127->112|127->112|127->112|128->113|129->115|129->115|129->116|130->118|130->118|130->118|131->119|131->119|131->119|131->120|131->120|131->120|132->121|133->123|133->123|133->123|134->124|135->126|135->126|135->127|136->129|136->129|136->129|137->130|138->132|138->132|138->132|139->133|140->135|140->135|140->136|141->137|145->141|145->141|145->141|145->142|145->142|145->142|146->143|146->143|146->143|147->145|147->145|147->145|148->146|148->146|148->146|148->147|148->147|148->147|149->148|149->148|149->148|150->150|150->150|150->150|151->151|151->151|151->151|152->153|152->153|152->154|154->157|154->157|154->157|155->158|155->158|155->158|155->159|155->159|155->159|156->160|156->160|156->160|157->162|157->162|157->162|158->163|158->163|158->163|159->165|159->165|159->166|160->168|160->168|160->168|161->169|161->169|161->169|162->171|162->171|162->173|165->176|168->179|168->179|169->180|169->180|169->180|170->181|170->181|170->181|171->182|179->190|179->190|180->191|180->191|181->192|183->194|183->194|184->195|184->195|185->196|185->196|209->220|209->220|209->220|209->221|209->221|209->221|210->222|211->224|211->224|211->225|213->227|214->228|214->228|215->229|218->232|218->232|219->233|221->235|221->235|223->237|223->237|223->237|223->238|223->238|223->238|224->239|224->239|224->239|224->239|224->239|224->239|225->240|225->240|225->240|226->241|227->242|227->242|227->242|227->242|227->242|227->242|227->242|230->245|230->245|231->246|232->247|232->247|233->248|233->248|234->249|235->250|235->250|236->251|236->251|237->252|237->252|238->255|238->255|238->255|240->257|241->258|241->258|242->259|243->260|243->260|243->260|243->260|246->263|246->263|247->264|250->267|250->267|250->267|250->267|251->268|252->269|252->269|253->270|260->277|260->277|261->278|261->278|261->278|262->279|262->279|264->281|264->281|264->281|264->281|264->281|265->282|266->283|266->283|267->284|270->287|270->287|270->287|270->287|271->288|271->288|271->288|272->289|272->289|272->289|273->290|275->292|275->292|276->293|276->293|277->294|277->294|280->297|281->298|281->298|285->302|285->302|286->303|292->309|292->309|293->310|294->311|294->311|295->312|295->312|297->314|297->314|298->315|310->327|310->327|311->328|311->328|311->328|312->329|314->331|314->331|315->332|315->332|317->334|317->334|317->334|318->335|319->336|319->336|319->336|319->336|320->337|321->338|321->338|323->340|324->341|324->341|332->349|332->349|334->351|334->351|335->352|335->352|335->352|336->353|337->354|337->354|337->354|337->354|337->354|337->354|337->354|340->357|340->357|341->358|342->359|342->359|343->360|343->360|344->361|345->362|345->362|346->363|346->363|347->364|347->364|349->366|349->366|350->367|350->367|351->368|352->369|352->369|353->370|353->370|355->374|355->374|355->376|356->377|358->379|358->379
                  -- GENERATED --
              */
          
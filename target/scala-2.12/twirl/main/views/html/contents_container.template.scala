
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

<style type="text/css">
.mord .text"""),format.raw/*29.12*/("""{"""),format.raw/*29.13*/("""
	"""),format.raw/*30.2*/("""width: 100px;
	word-break:break-all;  
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

"""),format.raw/*34.1*/("""</style>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/katex@0.11.1/dist/katex.min.css" integrity="sha384-zB1R0rpPzHqg7Kpt0Aljp8JPLqbXI3bhnPWROx27a9N0Ll6ZP/+DiW/UqRcLbRjq" crossorigin="anonymous">

<!-- The loading of KaTeX is deferred to speed up page rendering -->
<script defer src="https://cdn.jsdelivr.net/npm/katex@0.11.1/dist/katex.min.js" integrity="sha384-y23I5Q6l+B6vatafAwxRu/0oK/79VlbSz7Q9aiSZUvyWYIYsd+qj+o24G5ZU2zJz" crossorigin="anonymous"></script>

<!-- To automatically render math in text elements, include the auto-render extension: -->
<script defer src="https://cdn.jsdelivr.net/npm/katex@0.11.1/dist/contrib/auto-render.min.js" integrity="sha384-kWPLUVMOks5AQFrykwIup5lo0m3iMkkHrD0uJ4H5cjeGihAutqP0yW0J6dpFiVkI" crossorigin="anonymous"
    onload="renderMathInElement(document.body);"></script>

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
		            """),_display_(/*78.16*/contentType/*78.27*/ match/*78.33*/ {/*79.7*/case "pdf" =>/*79.20*/ {_display_(Seq[Any](format.raw/*79.22*/("""
							"""),_display_(/*80.9*/topic/*80.14*/ match/*80.20*/ {/*81.9*/case "functions_sev_var" =>/*81.36*/{_display_(Seq[Any](format.raw/*81.37*/("""
									"""),format.raw/*82.10*/("""Functions of two variables
								""")))}/*84.9*/case "critical_points" =>/*84.34*/{_display_(Seq[Any](format.raw/*84.35*/("""
									"""),format.raw/*85.10*/("""Critical Points
								""")))}/*87.9*/case _ =>/*87.18*/ {}}),format.raw/*88.9*/("""
						""")))}/*90.7*/case "assignment" =>/*90.27*/ {_display_(Seq[Any](format.raw/*90.29*/("""
							"""),_display_(/*91.9*/topic/*91.14*/ match/*91.20*/{/*92.9*/case "functions_sev_var" =>/*92.36*/ {_display_(Seq[Any](format.raw/*92.38*/("""
									"""),format.raw/*93.10*/("""Functions of two variables assignment 
								""")))}/*95.9*/case "critical_points" =>/*95.34*/ {_display_(Seq[Any](format.raw/*95.36*/("""
									"""),format.raw/*96.10*/("""Critical points assignment
								""")))}/*98.9*/case _ =>/*98.18*/ {}}),format.raw/*99.9*/("""
						""")))}/*101.7*/case "ar" =>/*101.19*/ {_display_(Seq[Any](format.raw/*101.21*/("""
							"""),format.raw/*102.8*/("""AR Learning
						""")))}/*104.7*/case "quiz" =>/*104.21*/ {_display_(Seq[Any](format.raw/*104.23*/("""
							"""),format.raw/*105.8*/("""Quiz
						""")))}/*107.7*/case _ =>/*107.16*/ {}}),format.raw/*108.7*/("""
	            """),format.raw/*109.14*/("""</h3>
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	                <a href="/dashboard?username="""),_display_(/*112.48*/user/*112.52*/.getEmail()),format.raw/*112.63*/("""" class="kt-subheader__breadcrumbs-home"><i class="flaticon2-shelter"></i></a>                   
	            </div>    
	            <span class="kt-subheader__separator kt-hidden"></span>
	            <div class="kt-subheader__breadcrumbs">
	            	<a href="/course?courseId=HarvardX/CB22x/2013_Spring"> Mathematical Analysis II -</a>
					"""),_display_(/*117.7*/contentType/*117.18*/ match/*117.24*/ {/*118.7*/case "pdf" =>/*118.20*/ {_display_(Seq[Any](format.raw/*118.22*/("""
							"""),_display_(/*119.9*/topic/*119.14*/ match/*119.20*/ {/*120.9*/case "functions_sev_var" =>/*120.36*/{_display_(Seq[Any](format.raw/*120.37*/("""
									"""),format.raw/*121.10*/("""Functions of two variables
								""")))}/*123.9*/case "critical_points" =>/*123.34*/{_display_(Seq[Any](format.raw/*123.35*/("""
									"""),format.raw/*124.10*/("""Critical Points
								""")))}/*126.9*/case _ =>/*126.18*/ {}}),format.raw/*127.9*/("""
						""")))}/*129.7*/case "assignment" =>/*129.27*/ {_display_(Seq[Any](format.raw/*129.29*/("""
							"""),_display_(/*130.9*/topic/*130.14*/ match/*130.20*/{/*131.9*/case "functions_sev_var" =>/*131.36*/ {_display_(Seq[Any](format.raw/*131.38*/("""
									"""),format.raw/*132.10*/("""Functions of two variables assignment 
								""")))}/*134.9*/case "critical_points" =>/*134.34*/ {_display_(Seq[Any](format.raw/*134.36*/("""
									"""),format.raw/*135.10*/("""Critical points assignment
								""")))}/*137.9*/case _ =>/*137.18*/ {}}),format.raw/*138.9*/("""
						""")))}/*140.7*/case "ar" =>/*140.19*/ {_display_(Seq[Any](format.raw/*140.21*/("""
							"""),format.raw/*141.8*/("""AR Learning
						""")))}/*143.7*/case "quiz" =>/*143.21*/ {_display_(Seq[Any](format.raw/*143.23*/("""
							"""),format.raw/*144.8*/("""Quiz
						""")))}/*146.7*/case _ =>/*146.16*/ {}}),format.raw/*147.7*/("""
	            """),format.raw/*148.14*/("""</div>         
	        </div>
    	</div>
	</div>    
	"""),_display_(/*152.3*/contentType/*152.14*/ match/*152.20*/ {/*153.3*/case "ar" =>/*153.15*/ {_display_(Seq[Any](format.raw/*153.17*/("""
			"""),_display_(/*154.5*/views/*154.10*/.html._layout(user, "ar")),format.raw/*154.35*/("""
		""")))}/*156.3*/case "pdf" =>/*156.16*/ {_display_(Seq[Any](format.raw/*156.18*/("""
			"""),_display_(/*157.5*/topic/*157.10*/ match/*157.16*/ {/*158.5*/case "functions_sev_var" =>/*158.32*/ {_display_(Seq[Any](format.raw/*158.34*/("""
					"""),_display_(/*159.7*/views/*159.12*/.html._layout(user, "functions_sev_var_pdf")),format.raw/*159.56*/("""
				""")))}/*161.5*/case "critical_points" =>/*161.30*/{_display_(Seq[Any](format.raw/*161.31*/("""
					"""),_display_(/*162.7*/views/*162.12*/.html._layout(user, "critical_points_pdf")),format.raw/*162.54*/("""
				""")))}/*164.5*/case _ =>/*164.14*/ {}}),format.raw/*165.5*/("""
		
		""")))}/*168.3*/case "assignment" =>/*168.23*/ {_display_(Seq[Any](format.raw/*168.25*/("""
			"""),_display_(/*169.5*/topic/*169.10*/ match/*169.16*/ {/*170.5*/case "functions_sev_var" =>/*170.32*/ {_display_(Seq[Any](format.raw/*170.34*/("""
					"""),_display_(/*171.7*/views/*171.12*/.html._layout(user, "functions_sev_var_assignment")),format.raw/*171.63*/("""
				""")))}/*173.5*/case "critical_points" =>/*173.30*/{_display_(Seq[Any](format.raw/*173.31*/("""
					"""),_display_(/*174.7*/views/*174.12*/.html._layout(user, "critical_points_assignment")),format.raw/*174.61*/("""
				""")))}/*176.5*/case _ =>/*176.14*/ {}}),format.raw/*177.5*/("""
		""")))}/*179.3*/case "quiz" =>/*179.17*/ {_display_(Seq[Any](format.raw/*179.19*/("""
			"""),_display_(/*180.5*/views/*180.10*/.html._layout(user, "quiz")),format.raw/*180.37*/("""
		""")))}/*182.3*/case _ =>/*182.12*/ {}}),format.raw/*184.3*/("""
	 
	 
	"""),format.raw/*187.2*/("""<!-- begin::Global Config(global config for global JS sciprts) -->
	
	<script>
		var KTAppOptions = """),format.raw/*190.22*/("""{"""),format.raw/*190.23*/("""
			"""),format.raw/*191.4*/(""""colors" : """),format.raw/*191.15*/("""{"""),format.raw/*191.16*/("""
				"""),format.raw/*192.5*/(""""state" : """),format.raw/*192.15*/("""{"""),format.raw/*192.16*/("""
					"""),format.raw/*193.6*/(""""brand" : "#5d78ff",
					"dark" : "#282a3c",
					"light" : "#ffffff",
					"primary" : "#5867dd",
					"success" : "#34bfa3",
					"info" : "#36a3f7",
					"warning" : "#ffb822",
					"danger" : "#fd3995"
				"""),format.raw/*201.5*/("""}"""),format.raw/*201.6*/(""",
				"base" : """),format.raw/*202.14*/("""{"""),format.raw/*202.15*/("""
					"""),format.raw/*203.6*/(""""label" : [ "#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466" ],
					"shape" : [ "#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a" ]
				"""),format.raw/*205.5*/("""}"""),format.raw/*205.6*/("""
			"""),format.raw/*206.4*/("""}"""),format.raw/*206.5*/("""
		"""),format.raw/*207.3*/("""}"""),format.raw/*207.4*/(""";
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
	"""),_display_(/*230.3*/contentType/*230.14*/ match/*230.20*/ {/*231.3*/case "quiz" | "assignment" =>/*231.32*/ {_display_(Seq[Any](format.raw/*231.34*/("""
			"""),format.raw/*232.4*/("""<script src="assets/javascripts/pages/quiz-handler.js"></script>
		""")))}/*234.3*/case _ =>/*234.12*/ {}}),format.raw/*235.3*/("""
	
	"""),format.raw/*237.2*/("""<script>
		$(document).ready(function()"""),format.raw/*238.31*/("""{"""),format.raw/*238.32*/("""
			"""),format.raw/*239.4*/("""var startTime = Math.floor(Date.now()/1000);
			//Function that return the time elapsed on a page
			function getElapsedTime()"""),format.raw/*241.29*/("""{"""),format.raw/*241.30*/("""
				"""),format.raw/*242.5*/("""var currentTime= Math.floor(Date.now()/1000);
				return currentTime - startTime;
			"""),format.raw/*244.4*/("""}"""),format.raw/*244.5*/("""
			
			"""),_display_(/*246.5*/contentType/*246.16*/ match/*246.22*/ {/*247.5*/case "pdf" =>/*247.18*/ {_display_(Seq[Any](format.raw/*247.20*/("""
					"""),format.raw/*248.6*/("""$('a[href="/course?courseId=HarvardX/CB22x/2013_Spring"], a[href="/dashboard?username="""),_display_(/*248.93*/user/*248.97*/.getEmail()),format.raw/*248.108*/(""""]').click(function()"""),format.raw/*248.129*/("""{"""),format.raw/*248.130*/("""
						"""),format.raw/*249.7*/("""$.ajax("""),format.raw/*249.14*/("""{"""),format.raw/*249.15*/("""
							"""),format.raw/*250.8*/("""url: "/updateLearningResult",
							data: "courseId=HarvardX/CB22x/2013_Spring&userId="""),_display_(/*251.59*/user/*251.63*/.getUserId),format.raw/*251.73*/("""&contentType="""),_display_(/*251.87*/contentType),format.raw/*251.98*/("""&topic="""),_display_(/*251.106*/topic),format.raw/*251.111*/("""&elapsedTime="+getElapsedTime(),
							contentType: "application/json; charset=utf-8",
							dataType: "json",
							success: function(data)"""),format.raw/*254.31*/("""{"""),format.raw/*254.32*/("""
								"""),format.raw/*255.9*/("""window.location.replace("/course?courseId=HarvardX/CB22x/2013_Spring");
							"""),format.raw/*256.8*/("""}"""),format.raw/*256.9*/(""",
							error: function(err)"""),format.raw/*257.28*/("""{"""),format.raw/*257.29*/("""
								"""),format.raw/*258.9*/("""console.log(err)		
							"""),format.raw/*259.8*/("""}"""),format.raw/*259.9*/("""
						"""),format.raw/*260.7*/("""}"""),format.raw/*260.8*/(""");				
					"""),format.raw/*261.6*/("""}"""),format.raw/*261.7*/(""");	
				""")))}/*264.5*/case "quiz" | "assignment" =>/*264.34*/ {_display_(Seq[Any](format.raw/*264.36*/("""
					
					"""),format.raw/*266.6*/("""//RETRIEVE QUESTIONS
					$.ajax("""),format.raw/*267.13*/("""{"""),format.raw/*267.14*/("""
							"""),format.raw/*268.8*/("""url: "/retrieveQuestions",
							data:"contentType="""),_display_(/*269.27*/contentType),format.raw/*269.38*/("""&topic="""),_display_(/*269.46*/topic),format.raw/*269.51*/("""",
							contentType: "application/json; charset=utf-8",
							dataType: "json",
							success: function(data)"""),format.raw/*272.31*/("""{"""),format.raw/*272.32*/("""
								"""),format.raw/*273.9*/("""console.log(data)
								var n_questions = data["questions"].length;
								var n_answers;
								if(""""),_display_(/*276.14*/contentType),format.raw/*276.25*/("""" == "quiz")"""),format.raw/*276.37*/("""{"""),format.raw/*276.38*/("""
									"""),format.raw/*277.10*/("""n_answers= data["answers"].length;	
								"""),format.raw/*278.9*/("""}"""),format.raw/*278.10*/("""
								"""),format.raw/*279.9*/("""var n_question = 1;
								var current_question= 1;
								var questions_list= shuffle(data["questions"]);
								var answers_list = data["answers"];
								var answersFeedback

								//INIT QUESTIONS
								for(var i=0 ; i< n_questions; i++)"""),format.raw/*286.43*/("""{"""),format.raw/*286.44*/("""
									"""),format.raw/*287.10*/("""initFormQuestions(questions_list[i], (i+1),""""),_display_(/*287.55*/contentType),format.raw/*287.66*/("""");
								"""),format.raw/*288.9*/("""}"""),format.raw/*288.10*/("""
								
								"""),format.raw/*290.9*/("""if(""""),_display_(/*290.14*/contentType),format.raw/*290.25*/("""" == "assignment")"""),format.raw/*290.43*/("""{"""),format.raw/*290.44*/("""
									"""),format.raw/*291.10*/("""$(".feedback_container").remove();
								"""),format.raw/*292.9*/("""}"""),format.raw/*292.10*/("""
								"""),format.raw/*293.9*/("""appendFormActions(""""),_display_(/*293.29*/contentType),format.raw/*293.40*/("""");
								
								//RETRIEVE ANSWERS
								if(""""),_display_(/*296.14*/contentType),format.raw/*296.25*/("""" == "quiz")"""),format.raw/*296.37*/("""{"""),format.raw/*296.38*/("""
									"""),format.raw/*297.10*/("""for(var j=0; j<n_answers; j++ )"""),format.raw/*297.41*/("""{"""),format.raw/*297.42*/("""
										"""),format.raw/*298.11*/("""if(questions_list[current_question-1].questionId == answers_list[j].questionId)"""),format.raw/*298.90*/("""{"""),format.raw/*298.91*/("""
											"""),format.raw/*299.12*/("""answersFeedback= answers_list[j];
											console.log(answersFeedback);
										"""),format.raw/*301.11*/("""}"""),format.raw/*301.12*/("""
									"""),format.raw/*302.10*/("""}"""),format.raw/*302.11*/("""
								"""),format.raw/*303.9*/("""}"""),format.raw/*303.10*/("""
								
									
								"""),format.raw/*306.9*/("""$('button[data-ktwizard-type="action-next"]').prop("disabled",true);
								if(""""),_display_(/*307.14*/contentType),format.raw/*307.25*/(""""=="quiz")
									checkQuizScore(n_question, n_questions, questions_list[current_question-1].rightAnswer, answersFeedback);
								else 
									checkAssignmentScore(n_question, n_questions, questions_list[current_question-1].rightAnswer);
								$('button[data-ktwizard-type="action-prev"]').click(function(event)"""),format.raw/*311.76*/("""{"""),format.raw/*311.77*/("""
									"""),format.raw/*312.10*/("""event.preventDefault();
									$("#question_"+current_question).removeAttr("data-ktwizard-state");
									$("#nav_"+current_question).removeAttr("data-ktwizard-state");
									current_question --;
									$("#question_"+current_question).attr("data-ktwizard-state", "current");
									$("#nav_"+current_question).attr("data-ktwizard-state", "current");
									if(isAnswered(current_question))"""),format.raw/*318.42*/("""{"""),format.raw/*318.43*/("""
										"""),format.raw/*319.11*/("""$('button[data-ktwizard-type="action-next"]').prop("disabled",false);
									"""),format.raw/*320.10*/("""}"""),format.raw/*320.11*/("""
								"""),format.raw/*321.9*/("""}"""),format.raw/*321.10*/(""");
								
								$('button[data-ktwizard-type="action-next"]').click(function(event)"""),format.raw/*323.76*/("""{"""),format.raw/*323.77*/("""
									"""),format.raw/*324.10*/("""event.preventDefault();
									
									$('button[data-ktwizard-type="action-prev"]').show();
									$("#nav_"+current_question).removeAttr("data-ktwizard-state");
									$("#question_"+current_question).removeAttr("data-ktwizard-state");
									
									current_question++;
									$("#question_"+current_question).attr("data-ktwizard-state", "current");
									$("#nav_"+current_question).attr("data-ktwizard-state", "current");
									
									
									//RETRIEVE ANSWERS
									for(var j=0; j<n_answers; j++ )"""),format.raw/*336.41*/("""{"""),format.raw/*336.42*/("""
										"""),format.raw/*337.11*/("""if(questions_list[current_question-1].questionId == answers_list[j].questionId)"""),format.raw/*337.90*/("""{"""),format.raw/*337.91*/("""
											"""),format.raw/*338.12*/("""answersFeedback= answers_list[j];
											console.log(answersFeedback);
										"""),format.raw/*340.11*/("""}"""),format.raw/*340.12*/("""
									"""),format.raw/*341.10*/("""}"""),format.raw/*341.11*/("""
														
									"""),format.raw/*343.10*/("""if(!isAnswered(current_question))"""),format.raw/*343.43*/("""{"""),format.raw/*343.44*/("""
										"""),format.raw/*344.11*/("""$(this).prop("disabled", true);
									"""),format.raw/*345.10*/("""}"""),format.raw/*345.11*/("""else"""),format.raw/*345.15*/("""{"""),format.raw/*345.16*/("""
										"""),format.raw/*346.11*/("""$(this).prop("disabled", false);
									"""),format.raw/*347.10*/("""}"""),format.raw/*347.11*/("""
									
									"""),format.raw/*349.10*/("""n_question++;
									if(""""),_display_(/*350.15*/contentType),format.raw/*350.26*/(""""=="quiz")
										checkQuizScore(n_question, n_questions, questions_list[current_question-1].rightAnswer, answersFeedback);
									else 
										checkAssignmentScore(n_question, n_questions, questions_list[current_question-1].rightAnswer);
									
									if(current_question == n_questions)
										$("#kt_wizard_v3").attr("data-ktwizard-state", "last");
																
								"""),format.raw/*358.9*/("""}"""),format.raw/*358.10*/(""");
								
								$('#submit-btn').click(function()"""),format.raw/*360.42*/("""{"""),format.raw/*360.43*/("""
									"""),format.raw/*361.10*/("""var content="";
									var imgSrc="";
									if(getResult() == 0)"""),format.raw/*363.30*/("""{"""),format.raw/*363.31*/("""
										"""),format.raw/*364.11*/("""content= "You should study all the lessons in this chapter again, trying to use simpler content. You will be supported by a teacher to improve your learning.";	
										imgSrc= "sink.svg";
									"""),format.raw/*366.10*/("""}"""),format.raw/*366.11*/("""
									"""),format.raw/*367.10*/("""else if(getResult() == 1 || getResult() == 2)"""),format.raw/*367.55*/("""{"""),format.raw/*367.56*/("""
										"""),format.raw/*368.11*/("""content= "You should do better. Try to learn more using the additional content and ask for help on the forum to solve your doubts.";
										imgSrc="car-breakdown.svg";

									"""),format.raw/*371.10*/("""}"""),format.raw/*371.11*/("""
									"""),format.raw/*372.10*/("""else if(getResult() == 3 || getResult() == 4)"""),format.raw/*372.55*/("""{"""),format.raw/*372.56*/("""
										"""),format.raw/*373.11*/("""content= "Well done, you can move to the next chapter. Nevertheless, It could be useful to discuss with your colleagues the obtained results in online chat.";
										imgSrc="hammock.svg";
									"""),format.raw/*375.10*/("""}"""),format.raw/*375.11*/("""
									"""),format.raw/*376.10*/("""else if(getResult() == 5)"""),format.raw/*376.35*/("""{"""),format.raw/*376.36*/("""
										"""),format.raw/*377.11*/("""content="Very well, waiting for the next chapter you can relax.";	
										imgSrc="startup.svg";
									"""),format.raw/*379.10*/("""}"""),format.raw/*379.11*/("""
									
									"""),format.raw/*381.10*/("""$("#quiz-feedback-content").append(
											"<div>"+
											"	<img src='assets/images/files/"+imgSrc+"' alt='' style='height: 150px; width: 150px; margin:3% 5%; float: left;'>"+
											"	<h3 style='margin-top: 2%;'>You did "+getResult()+" of "+n_questions+" correct answers</h3><hr style='margin-left:27%;'>"+
											"</div>"+
											"<h5 class='text-justify'>"+content+"</h5>"
									);
										
									$.ajax("""),format.raw/*389.17*/("""{"""),format.raw/*389.18*/("""
										"""),format.raw/*390.11*/("""url: "/courseQuizResult",
										data: "courseId=HarvardX/CB22x/2013_Spring&userId="""),_display_(/*391.62*/user/*391.66*/.getUserId),format.raw/*391.76*/("""&contentType="""),_display_(/*391.90*/contentType),format.raw/*391.101*/("""&topic="""),_display_(/*391.109*/topic),format.raw/*391.114*/("""&elapsedTime="+getElapsedTime()+"&achievedScore="+getResult()+"&totalScore="+n_questions,
										contentType: "application/json; charset=utf-8",
										dataType: "json",
										success: function(data)"""),format.raw/*394.34*/("""{"""),format.raw/*394.35*/("""
											"""),format.raw/*395.12*/("""if(""""),_display_(/*395.17*/contentType),format.raw/*395.28*/("""" == "assignment")
												window.location.replace("/course?courseId=HarvardX/CB22x/2013_Spring");
										"""),format.raw/*397.11*/("""}"""),format.raw/*397.12*/(""",
										error: function(err)"""),format.raw/*398.31*/("""{"""),format.raw/*398.32*/("""
											"""),format.raw/*399.12*/("""console.log(err)		
										"""),format.raw/*400.11*/("""}"""),format.raw/*400.12*/("""
									"""),format.raw/*401.10*/("""}"""),format.raw/*401.11*/(""");
								"""),format.raw/*402.9*/("""}"""),format.raw/*402.10*/(""");
								
								$("#quiz-feedback-btn").click(function()"""),format.raw/*404.49*/("""{"""),format.raw/*404.50*/("""
									"""),format.raw/*405.10*/("""window.location.replace("/course?courseId=HarvardX/CB22x/2013_Spring");
								"""),format.raw/*406.9*/("""}"""),format.raw/*406.10*/(""");
								
							"""),format.raw/*408.8*/("""}"""),format.raw/*408.9*/(""",
							error: function(err)"""),format.raw/*409.28*/("""{"""),format.raw/*409.29*/("""
								"""),format.raw/*410.9*/("""console.log(err)		
							"""),format.raw/*411.8*/("""}"""),format.raw/*411.9*/("""
						"""),format.raw/*412.7*/("""}"""),format.raw/*412.8*/(""");

				""")))}/*416.5*/case _ =>/*416.14*/ {}}),format.raw/*418.5*/("""
		"""),format.raw/*419.3*/("""}"""),format.raw/*419.4*/(""");
				
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
                  DATE: Mon Dec 09 10:34:05 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/contents_container.scala.html
                  HASH: ce84da47bdf66b223bee492dc45a2d1c0b74ff6a
                  MATRIX: 987->1|1144->63|1174->67|1681->546|1710->547|1741->551|1778->560|1807->561|1839->566|1951->651|1979->652|2032->677|2061->678|2093->683|2152->715|2180->716|2210->719|2238->720|2319->773|2348->774|2378->777|2446->818|2474->819|2505->823|5017->3311|5037->3322|5052->3328|5062->3338|5084->3351|5124->3353|5160->3363|5174->3368|5189->3374|5199->3387|5235->3414|5274->3415|5313->3426|5368->3473|5402->3498|5441->3499|5480->3510|5524->3546|5542->3555|5566->3568|5593->3585|5622->3605|5662->3607|5698->3617|5712->3622|5727->3628|5736->3639|5772->3666|5812->3668|5851->3679|5918->3738|5952->3763|5992->3765|6031->3776|6086->3823|6104->3832|6128->3845|6156->3862|6178->3874|6219->3876|6256->3885|6295->3913|6319->3927|6360->3929|6397->3938|6429->3960|6448->3969|6473->3980|6517->3995|6723->4173|6737->4177|6770->4188|7152->4543|7173->4554|7189->4560|7200->4570|7223->4583|7264->4585|7301->4595|7316->4600|7332->4606|7343->4619|7380->4646|7420->4647|7460->4658|7516->4705|7551->4730|7591->4731|7631->4742|7676->4778|7695->4787|7720->4800|7748->4817|7778->4837|7819->4839|7856->4849|7871->4854|7887->4860|7897->4871|7934->4898|7975->4900|8015->4911|8083->4970|8118->4995|8159->4997|8199->5008|8255->5055|8274->5064|8299->5077|8327->5094|8349->5106|8390->5108|8427->5117|8466->5145|8490->5159|8531->5161|8568->5170|8600->5192|8619->5201|8644->5212|8688->5227|8777->5289|8798->5300|8814->5306|8825->5312|8847->5324|8888->5326|8921->5332|8936->5337|8983->5362|9007->5371|9030->5384|9071->5386|9104->5392|9119->5397|9135->5403|9146->5411|9183->5438|9224->5440|9259->5448|9274->5453|9340->5497|9366->5510|9401->5535|9441->5536|9476->5544|9491->5549|9555->5591|9581->5604|9600->5613|9625->5622|9653->5635|9683->5655|9724->5657|9757->5663|9772->5668|9788->5674|9799->5682|9836->5709|9877->5711|9912->5719|9927->5724|10000->5775|10026->5788|10061->5813|10101->5814|10136->5822|10151->5827|10222->5876|10248->5889|10267->5898|10292->5907|10316->5916|10340->5930|10381->5932|10414->5938|10429->5943|10478->5970|10502->5979|10521->5988|10546->5999|10585->6010|10717->6113|10747->6114|10780->6119|10820->6130|10850->6131|10884->6137|10923->6147|10953->6148|10988->6155|11235->6374|11264->6375|11309->6391|11339->6392|11374->6399|11528->6525|11557->6526|11590->6531|11619->6532|11651->6536|11680->6537|12953->7783|12974->7794|12990->7800|13001->7806|13040->7835|13081->7837|13114->7842|13202->7915|13221->7924|13246->7931|13280->7937|13349->7977|13379->7978|13412->7983|13569->8111|13599->8112|13633->8118|13748->8205|13777->8206|13815->8217|13836->8228|13852->8234|13863->8242|13886->8255|13927->8257|13962->8264|14077->8351|14091->8355|14125->8366|14176->8387|14207->8388|14243->8396|14279->8403|14309->8404|14346->8413|14463->8502|14477->8506|14509->8516|14551->8530|14584->8541|14621->8549|14649->8554|14824->8700|14854->8701|14892->8711|15000->8791|15029->8792|15088->8822|15118->8823|15156->8833|15211->8860|15240->8861|15276->8869|15305->8870|15346->8883|15375->8884|15404->8903|15443->8932|15484->8934|15526->8948|15589->8982|15619->8983|15656->8992|15738->9046|15771->9057|15807->9065|15834->9070|15979->9186|16009->9187|16047->9197|16184->9306|16217->9317|16258->9329|16288->9330|16328->9341|16401->9386|16431->9387|16469->9397|16754->9653|16784->9654|16824->9665|16897->9710|16930->9721|16971->9734|17001->9735|17049->9755|17082->9760|17115->9771|17162->9789|17192->9790|17232->9801|17304->9845|17334->9846|17372->9856|17420->9876|17453->9887|17537->9943|17570->9954|17611->9966|17641->9967|17681->9978|17741->10009|17771->10010|17812->10022|17920->10101|17950->10102|17992->10115|18108->10202|18138->10203|18178->10214|18208->10215|18246->10225|18276->10226|18335->10257|18446->10340|18479->10351|18831->10674|18861->10675|18901->10686|19339->11095|19369->11096|19410->11108|19519->11188|19549->11189|19587->11199|19617->11200|19735->11289|19765->11290|19805->11301|20378->11845|20408->11846|20449->11858|20557->11937|20587->11938|20629->11951|20745->12038|20775->12039|20815->12050|20845->12051|20901->12078|20963->12111|20993->12112|21034->12124|21105->12166|21135->12167|21168->12171|21198->12172|21239->12184|21311->12227|21341->12228|21392->12250|21449->12279|21482->12290|21911->12691|21941->12692|22025->12747|22055->12748|22095->12759|22195->12830|22225->12831|22266->12843|22497->13045|22527->13046|22567->13057|22641->13102|22671->13103|22712->13115|22925->13299|22955->13300|22995->13311|23069->13356|23099->13357|23140->13369|23371->13571|23401->13572|23441->13583|23495->13608|23525->13609|23566->13621|23705->13731|23735->13732|23786->13754|24259->14198|24289->14199|24330->14211|24446->14299|24460->14303|24492->14313|24534->14327|24568->14338|24605->14346|24633->14351|24874->14563|24904->14564|24946->14577|24979->14582|25012->14593|25156->14708|25186->14709|25248->14742|25278->14743|25320->14756|25379->14786|25409->14787|25449->14798|25479->14799|25519->14811|25549->14812|25640->14874|25670->14875|25710->14886|25819->14967|25849->14968|25898->14989|25927->14990|25986->15020|26016->15021|26054->15031|26109->15058|26138->15059|26174->15067|26203->15068|26233->15091|26252->15100|26277->15117|26309->15121|26338->15122
                  LINES: 28->1|33->1|35->3|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|54->22|54->22|55->23|56->24|56->24|57->25|57->25|61->29|61->29|62->30|64->32|64->32|66->34|110->78|110->78|110->78|110->79|110->79|110->79|111->80|111->80|111->80|111->81|111->81|111->81|112->82|113->84|113->84|113->84|114->85|115->87|115->87|115->88|116->90|116->90|116->90|117->91|117->91|117->91|117->92|117->92|117->92|118->93|119->95|119->95|119->95|120->96|121->98|121->98|121->99|122->101|122->101|122->101|123->102|124->104|124->104|124->104|125->105|126->107|126->107|126->108|127->109|130->112|130->112|130->112|135->117|135->117|135->117|135->118|135->118|135->118|136->119|136->119|136->119|136->120|136->120|136->120|137->121|138->123|138->123|138->123|139->124|140->126|140->126|140->127|141->129|141->129|141->129|142->130|142->130|142->130|142->131|142->131|142->131|143->132|144->134|144->134|144->134|145->135|146->137|146->137|146->138|147->140|147->140|147->140|148->141|149->143|149->143|149->143|150->144|151->146|151->146|151->147|152->148|156->152|156->152|156->152|156->153|156->153|156->153|157->154|157->154|157->154|158->156|158->156|158->156|159->157|159->157|159->157|159->158|159->158|159->158|160->159|160->159|160->159|161->161|161->161|161->161|162->162|162->162|162->162|163->164|163->164|163->165|165->168|165->168|165->168|166->169|166->169|166->169|166->170|166->170|166->170|167->171|167->171|167->171|168->173|168->173|168->173|169->174|169->174|169->174|170->176|170->176|170->177|171->179|171->179|171->179|172->180|172->180|172->180|173->182|173->182|173->184|176->187|179->190|179->190|180->191|180->191|180->191|181->192|181->192|181->192|182->193|190->201|190->201|191->202|191->202|192->203|194->205|194->205|195->206|195->206|196->207|196->207|219->230|219->230|219->230|219->231|219->231|219->231|220->232|221->234|221->234|221->235|223->237|224->238|224->238|225->239|227->241|227->241|228->242|230->244|230->244|232->246|232->246|232->246|232->247|232->247|232->247|233->248|233->248|233->248|233->248|233->248|233->248|234->249|234->249|234->249|235->250|236->251|236->251|236->251|236->251|236->251|236->251|236->251|239->254|239->254|240->255|241->256|241->256|242->257|242->257|243->258|244->259|244->259|245->260|245->260|246->261|246->261|247->264|247->264|247->264|249->266|250->267|250->267|251->268|252->269|252->269|252->269|252->269|255->272|255->272|256->273|259->276|259->276|259->276|259->276|260->277|261->278|261->278|262->279|269->286|269->286|270->287|270->287|270->287|271->288|271->288|273->290|273->290|273->290|273->290|273->290|274->291|275->292|275->292|276->293|276->293|276->293|279->296|279->296|279->296|279->296|280->297|280->297|280->297|281->298|281->298|281->298|282->299|284->301|284->301|285->302|285->302|286->303|286->303|289->306|290->307|290->307|294->311|294->311|295->312|301->318|301->318|302->319|303->320|303->320|304->321|304->321|306->323|306->323|307->324|319->336|319->336|320->337|320->337|320->337|321->338|323->340|323->340|324->341|324->341|326->343|326->343|326->343|327->344|328->345|328->345|328->345|328->345|329->346|330->347|330->347|332->349|333->350|333->350|341->358|341->358|343->360|343->360|344->361|346->363|346->363|347->364|349->366|349->366|350->367|350->367|350->367|351->368|354->371|354->371|355->372|355->372|355->372|356->373|358->375|358->375|359->376|359->376|359->376|360->377|362->379|362->379|364->381|372->389|372->389|373->390|374->391|374->391|374->391|374->391|374->391|374->391|374->391|377->394|377->394|378->395|378->395|378->395|380->397|380->397|381->398|381->398|382->399|383->400|383->400|384->401|384->401|385->402|385->402|387->404|387->404|388->405|389->406|389->406|391->408|391->408|392->409|392->409|393->410|394->411|394->411|395->412|395->412|397->416|397->416|397->418|398->419|398->419
                  -- GENERATED --
              */
          
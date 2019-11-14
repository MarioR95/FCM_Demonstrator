
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

object tdashwidgetcontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- begin: Chart1 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 58%; padding: 2%; height: 380px; margin: 0.5%; margin-bottom: 1.5%; float: left;">
	<div class="kt-portlet__head " style="padding: 0;">
		<div class="kt-widget14__header">
			<h4 class="kt-widget14__title">USERS RETENTION MONITORING</h4>
		</div>

		<a href="#"
			class="btn btn-label-success btn-sm btn-bold dropdown-toggle"
			data-toggle="dropdown" aria-expanded="false" style="height: 30px">
			WEEK </a>
		<div class="dropdown-menu dropdown-menu-fit dropdown-menu-right"
			x-placement="bottom-end"
			style="width: 230px; position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(362px, 46px, 0px);">
			<ul class="kt-nav">
				<li class="kt-nav__item"><a onclick="retention_1()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">05 Apr 2019 - 11 Apr 2019</span>
				</a></li>
				<li class="kt-nav__item"><a onclick="retention_2()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">12 Apr 2019 - 18 Apr 2019</span>
				</a></li>
				<li class="kt-nav__item"><a onclick="retention_3()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">19 Apr 2019 - 25 Apr 2019</span>
				</a></li>
			</ul>
		</div>
	</div>
	<div class="kt-portlet__body kt-portlet__body--fluid">
		<div class="kt-widget20">
			<div id="kt-retention-container" style="height:130px;"><div class="kt-widget20__chart chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
				<canvas id="kt-retention-plot" width="485" height="180" class="chartjs-render-monitor" style="display: block; height: 180px; width: 500px; margin: 0 auto;"></canvas>
			</div>
		</div>			 
	</div>
</div>
<!-- end: Chart1 -->
<!-- begin: Chart2 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 40%; padding: 2%; height: 380px; margin:.5%; float: left;">
	<div class="kt-portlet__head " style="padding: 0;">
		<div class="kt-widget14__header">
			<h4 class="kt-widget14__title">DROP-OUT MONITORING</h4>
		</div>
	</div>
	<div class="kt-portlet__body kt-portlet__body--fluid">
		<div class="kt-widget20">
			<div style="height:250px;"><div class="kt-widget20__chart chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
				<canvas id="kt_dropout" style="display: block; height: 350px; width: 350px;" width="437" height="350" class="chartjs-render-monitor"></canvas>			
			</div>
		</div>			 
	</div>
</div>
<!-- end: Chart2 -->
<!-- begin: Chart3 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 99%; height: 150px; clear: left; padding: 2%; margin: 0.5%;">
	<div class="kt-widget14__header">
		<h4 class="kt-widget14__title">COURSES OVERVIEW</h4>
	</div>
	<div class="kt-widget14__content row">
	    <div class="kt-widget__item col p-2" style="float: left;">
	        <div class="kt-widget__icon pr-3" style="float: left;">
	            <i class="flaticon2-file"></i>
	        </div>
	        <div class="kt-widget__details p-2">
	            <div class="kt-widget__title h4">Assignments</div>
	            <div class="kt-widget__value h6">80</div>
	        </div>
	    </div>
	    <div class="kt-widget__item col p-2" style="float: left;">
	        <div class="kt-widget__icon pr-1" style="float: left;">
	            <i class="flaticon2-arrow"></i>
	        </div>
	        <div class="kt-widget__details p-2">
	            <div class="kt-widget__title h4">Multimedia</div>
	            <div class="kt-widget__value h6">120</div>
	        </div>
	    </div>
	    <div class="kt-widget__item col p-2" style="float: left;">
	        <div class="kt-widget__icon pr-3" style="float: left;">
	            <i class="flaticon-chat"></i>
	        </div>
	        <div class="kt-widget__details">
	            <div class="kt-widget__title h4">Posts Done</div>
	            <div class="kt-widget__value h6">33</div>
	        </div>
	    </div>
	    <div class="kt-widget__item col p-2">
	        <div class="kt-widget__icon pr-3" style="float: left;">
	            <i class="flaticon2-group"></i>
	        </div>
	        <div class="kt-widget__details p-2">
	            <div class="kt-widget__title h4">Members</div>
	            <div class="kt-widget__value h6">43</div>
	        </div>
	    </div>

	</div>
</div>
<!-- end: Chart3 -->
<!-- begin: Chart4 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 33%; padding: 2%; height: 350px; margin: 1% 0.5%; float: left;">
	<div class="kt-portlet__head " style="padding: 0;">
		<div class="kt-widget14__header">
			<h4 class="kt-widget14__title">COURSES INTERACTION</h4>
		</div>

		<a href="#"
			class="btn btn-label-success btn-sm btn-bold dropdown-toggle"
			data-toggle="dropdown" aria-expanded="false" style="height: 30px">
			WEEK </a>
		<div class="dropdown-menu dropdown-menu-fit dropdown-menu-right"
			x-placement="bottom-end"
			style="width: 230px; position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(362px, 46px, 0px);">
			<ul class="kt-nav">
				<li class="kt-nav__item"><a onclick="interaction_plot_1()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">05 Apr 2019 - 11 Apr 2019</span>
				</a></li>
				<li class="kt-nav__item"><a onclick="interaction_plot_2()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">12 Apr 2019 - 18 Apr 2019</span>
				</a></li>
				<li class="kt-nav__item"><a onclick="interaction_plot_3()"
					class="kt-nav__link"> <i
						class="kt-nav__link-icon flaticon2-line-chart"></i> <span
						class="kt-nav__link-text">19 Apr 2019 - 25 Apr 2019</span>
				</a></li>
			</ul>
		</div>
	</div>
	<div class="kt-portlet__body kt-portlet__body--fluid">
		<div class="kt-widget20">
			<div id="courses-interaction-container" style="height:130px;"><div class="kt-widget20__chart chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
				<canvas id="kt_courses_interactions_chart" width="485" height="300" class="chartjs-render-monitor" style="display: block; height: 200px; width: 500px; margin: 0 auto;"></canvas>
			</div>
		</div>			 
	</div>
</div>
<!-- end: Chart4 -->
<!-- begin: Chart5 -->
<div 
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 31%; height: 350px; padding: 2%; margin: 1% 0.5%; display: inline; float: left;">
	<div class="kt-widget14__header" style="padding: 0px">
		<h4 class="kt-widget14__title">PREFERRED ACTIVITY</h4>
	</div>
	<div class="kt-portlet__body">
		<div class="kt-widget14__chart">
			<div id="legend"></div>	
			<div id="kt_chart_revenue_change" style="height: 250px; width: 220px; margin:0 auto;"></div>   
    	</div>
    </div>
</div>
<!-- end: Chart5 -->
<!-- begin: Chart6-->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 33%; height: 350px; padding: 2%; margin: 1% 0.5%; display: inline; float: left;">
	<div class="kt-widget14__header" style="padding: 0px">
		<h4 class="kt-widget14__title">COURSES PROGRESS (%)</h4>
	</div>
	<div class="kt-portlet__body kt-portlet__body--fluid">
		<div id="legend-bar"></div>
		<div id="kt_morris_3" style="height: 250px; position: relative; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
		</div>
	</div>
</div>
<!-- end: Chart6 -->
<!-- begin: Chart7 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 54%; height: 700px; padding: 2%; margin: 0.5% 0.5%; display: inline; float: left;">
	<div class="kt-portlet__head">
		<div class="kt-portlet__head-label">
			<span class="kt-portlet__head-icon"> <i
				class="flaticon-calendar-2"></i>
			</span>
			<h4 class="kt-portlet__head-title">SCHEDULE</h4>
		</div>
		<div class="kt-portlet__head-toolbar">
			<a href="#" class="btn btn-brand btn-elevate"> <i
				class="la la-plus"></i> Add Event
			</a>
		</div>
	</div>
	<div class="kt-portlet__body">
		<div id="kt_calendar" class="fc fc-ltr fc-unthemed">

	
		</div>
	</div>
</div>
<!-- end: Chart7 -->
<!-- begin: Chart8 -->
<div
	class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half"
	style="width: 44%; height:700px; padding: 2%; margin: 0.5% 0.5%; float: left;">
	<div class="kt-portlet__head kt-portlet__space-x">
		<div class="kt-widget14__header">
			<h4 class="kt-widget14__title">LAST FORUM ACTIVITY</h4>
		</div>
	</div>
	<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" style="padding: 0; width: 80%; margin: 0 auto; border: none;">        
		<div class="kt-portlet__body">
		    <ul class="nav nav-tabs" role="tablist">
		        <li class="nav-item">
		            <a class="nav-link active" data-toggle="tab" href="#kt_tabs_1_1">
		                <i class="flaticon2-talk"></i>Algorithms
		            </a>
		        </li>
		        <li class="nav-item">
		            <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_2">
		                <i class="flaticon2-talk"></i>Data Structures
		            </a>
		        </li>
		    </ul>                    
		
		    <div class="tab-content" >
		        <div class="tab-pane active" id="kt_tabs_1_1" role="tabpanel">
		        	<div class="kt-notes" style="padding:5%; height: 500px; width: 400px; overflow-y:auto">
	                    <div class="kt-notes__items">
	                        <div class="kt-notes__item"> 
	                            <div class="kt-notes__media">
	                                <img class="kt-hidden-" src="assets/images/users/100_3.jpg" alt="image">
	                                <span class="kt-notes__icon kt-font-boldest kt-hidden">
	                                    <i class="flaticon2-cup"></i>                                    
	                                </span> 
	                                <h3 class="kt-notes__user kt-font-boldest kt-hidden">
	                                                                                         
	                                </h3>                                 
	                            </div>    
	                            <div class="kt-notes__content"> 
	                                <div class="kt-notes__section">     
	                                    <div class="kt-notes__info">
	                                        <a href="#" class="kt-notes__title">
	                                            Big and Small O notation                                                        
	                                        </a>
	                                        <span class="kt-notes__desc">
	                                            9:30AM 18 Apr, 2019
	                                        </span>
	                                        <span class="kt-badge kt-badge--success kt-badge--inline">new</span>
	                                    </div>
	                                    <div class="kt-notes__dropdown"> 
	                                        <a href="#" class="btn btn-sm btn-icon-md btn-icon" data-toggle="dropdown" aria-expanded="false">
	                                            <i class="flaticon2-rectangular kt-font-brand"></i>
	                                        </a>
	                                        <div class="dropdown-menu dropdown-menu-right" x-placement="bottom-end" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(505px, 33px, 0px);">
	                                            <ul class="kt-nav">
	    
												</ul>                                        
											</div>
	                                    </div>
	                                </div>
	                                <span class="kt-notes__body">                                        
										Hello, I've trouble to understand the difference between the Big and Small O notation. Is there anyone who can help me?
	                                </span>  
	                            </div>                                             
	                        </div> 
	                        <div class="kt-notes__item"> 
	                            <div class="kt-notes__media">
	                                <img class="kt-hidden-" src="assets/images/users/100_2.jpg" alt="image">
	                                <span class="kt-notes__icon kt-font-boldest kt-hidden">
	                                    <i class="flaticon2-cup"></i>                                    
	                                </span> 
	                                <h3 class="kt-notes__user kt-font-boldest kt-hidden">
	                                                                                         
	                                </h3>                                 
	                            </div>    
	                            <div class="kt-notes__content"> 
	                                <div class="kt-notes__section">     
	                                    <div class="kt-notes__info">
	                                        <a href="#" class="kt-notes__title">
	                                            InsertionSort Impl.                                                        
	                                        </a>
	                                        <span class="kt-notes__desc">
	                                            10:30AM 10 Apr, 2019
	                                        </span>
	                                    </div>
	                                    <div class="kt-notes__dropdown"> 
	                                        <a href="#" class="btn btn-sm btn-icon-md btn-icon" data-toggle="dropdown" aria-expanded="false">
	                                            <i class="flaticon2-rectangular kt-font-brand"></i>
	                                        </a>
	                                        <div class="dropdown-menu dropdown-menu-right" x-placement="bottom-end" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(505px, 33px, 0px);">
	                                            <ul class="kt-nav">
	   
												</ul>                                        
											</div>
	                                    </div>
	                                </div>
	                                <span class="kt-notes__body">                                        
 										This is my first approach in Algorithms topics and I didn't understand how does Insertion Sort works. Is there anyone who can help me with this sorting algorithm implementation? Thanks.
 	                                </span>  
	                            </div>                     
	                        </div> 
	                    </div>
                	</div>
		        </div>
			    <div class="tab-pane" id="kt_tabs_1_2" role="tabpanel">
			    </div>
			</div>
		</div>
	</div>
</div>
<!-- end: Chart8 -->
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 28 10:38:37 CET 2019
                  SOURCE: C:/Users/Mario/Desktop/MoliereDashboard/app/views/tdashwidgetcontent.scala.html
                  HASH: 4366f486caa3fadc83ec5b8cea7cae415776ea03
                  MATRIX: 1043->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
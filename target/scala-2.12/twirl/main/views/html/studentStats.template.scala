
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

object studentStats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- begin: student details -->
<div class="kt-subheader   kt-grid__item" id="kt_subheader">
    <div class="kt-subheader__main">
        
        <h3 class="kt-subheader__title">Algoritmi</h3>

        <span class="kt-subheader__separator kt-subheader__separator--v"></span>

        <span class="kt-subheader__desc">0512102852 - Alfonso Menichino</span>
    </div>
</div>
<!-- end: student details -->
<!-- begin: Content -->

<!-- begin: Row with two widget -->
<div class="row">
	<!-- begin: first widget -->
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<span class="kt-portlet__head-icon kt-hidden"> <i
						class="la la-gear"></i>
					</span>
					<h3 class="kt-portlet__head-title">Temporal view of Motivation and Engagement</h3>
				</div>
			</div>
			<div class="kt-portlet__body">
				<div id="kt_flotcharts_2"
					style="height: 300px; padding: 0px; position: relative;">
					<canvas class="flot-base"
						style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1538px; height: 300px;"
						width="1538" height="300"></canvas>
					<div class="flot-text"
						style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; font-size: smaller; color: rgb(84, 84, 84);">
						<div class="flot-x-axis flot-x1-axis xAxis x1Axis"
							style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px;">
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 72px; text-align: center;">2</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 176px; text-align: center;">4</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 280px; text-align: center;">6</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 384px; text-align: center;">8</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 486px; text-align: center;">10</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 590px; text-align: center;">12</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 694px; text-align: center;">14</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 798px; text-align: center;">16</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 902px; text-align: center;">18</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1005px; text-align: center;">20</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1109px; text-align: center;">22</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1213px; text-align: center;">24</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1317px; text-align: center;">26</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1421px; text-align: center;">28</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; max-width: 96px; top: 283px; left: 1525px; text-align: center;">30</div>
								
						</div>
						<div class="flot-y-axis flot-y1-axis yAxis y1Axis"
							style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px;">
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 270px; left: 10px; text-align: right;">0</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 249px; left: 8px; text-align: right;">10</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 228px; left: 4px; text-align: right;">20</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 208px; left: 4px; text-align: right;">30</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 187px; left: 4px; text-align: right;">40</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 166px; left: 4px; text-align: right;">50</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 145px; left: 4px; text-align: right;">60</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 125px; left: 5px; text-align: right;">70</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 104px; left: 4px; text-align: right;">80</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 83px; left: 4px; text-align: right;">90</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 62px; left: 1px; text-align: right;">100</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 42px; left: 5px; text-align: right;">110</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 21px; left: 1px; text-align: right;">120</div>
							<div class="flot-tick-label tickLabel"
								style="position: absolute; top: 0px; left: 1px; text-align: right;">130</div>
						</div>
					</div>
					<canvas class="flot-overlay" width="1538" height="300"
						style="direction: ltr; position: absolute; left: 0px; top: 0px; width: 1538px; height: 300px;"></canvas>
					<div class="legend">
						<div
							style="position: absolute; width: 85px; height: 36px; top: 13px; right: 12px; background-color: rgb(255, 255, 255); opacity: 0.85;">
						</div>
						<table
							style="position: absolute; top: 13px; right: 12px;; font-size: smaller; color: #545454">
							<tbody>
								<tr>
									<td class="legendColorBox"><div
											style="border: 1px solid #ccc; padding: 1px">
											<div
												style="width: 4px; height: 0; border: 5px solid rgb(93, 120, 255); overflow: hidden"></div>
										</div></td>
									<td class="legendLabel">Unique Visits</td>
								</tr>
								<tr>
									<td class="legendColorBox"><div
											style="border: 1px solid #ccc; padding: 1px">
											<div
												style="width: 4px; height: 0; border: 5px solid rgb(253, 57, 149); overflow: hidden"></div>
										</div></td>
									<td class="legendLabel">Page Views</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end: first widget -->
</div>
<!-- end: Row with two widget -->

<!-- begin: Student table -->
<div class="row">
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div class="kt-portlet__body">
				<!--begin::Section-->
				<div class="kt-section">
					<div class="kt-section__content">
						<table class="table table-hover" style="text-align: center;">
						  	<thead class="thead-dark">
						    	<tr>
						      		<th>Week of Measure</th>
						      		<th>Start</th>
						      		<th>End</th>
						      		<th>Engagement</th>
						      		<th>Motivation</th>
						      		<th colspan="2">Student Feedback</th>
						      		<th colspan="2">Teacher Feedback</th>
						      		<th>Actions</th>
						    	</tr>
						  	</thead>
						  	<tbody>
						    	<tr>
							      	<th scope="row">1</th>
							      	<td>12/04/2019</td>
							      	<td>19/04/1019</td>
							      	<td>0.87</td>
							      	<td>0.25</td>
							      	<td>Type1</td>
							      	<td class="kt-font-success">Success</td>
							      	<td>Type2</td>
							      	<td class="kt-font-danger">Danger</td>
							      	<td>
								      	<div class="dropdown dropright">
				                            <button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				                                <i class="flaticon-more-1"></i>
				                            </button>
				                            <div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
				                                <a class="dropdown-item" href="#"><i class="flaticon-profile-1"></i> Details</a>
				                                <a class="dropdown-item" href="#"><i class="flaticon-analytics"></i> Stats</a>
				                                <div class="dropdown-divider"></div>
				                                <a class="dropdown-item kt-font-danger" href="#"><i class="flaticon-delete kt-font-danger"></i> Delete</a>
				                            </div>
			                        	</div>
		                        	</td>
						    	</tr>
						    	<tr>
							      	<th scope="row">2</th>
							      	<td>12/04/2019</td>
							      	<td>19/04/1019</td>
							      	<td>0.87</td>
							      	<td>0.25</td>
							      	<td>Type1</td>
							      	<td class="kt-font-success">Success</td>
							      	<td>Type2</td>
							      	<td class="kt-font-danger">Danger</td>
							      	<td>
								      	<div class="dropdown dropright">
				                            <button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				                                <i class="flaticon-more-1"></i>
				                            </button>
				                            <div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
				                                <a class="dropdown-item" href="#"><i class="flaticon-profile-1"></i> Details</a>
				                                <a class="dropdown-item" href="#"><i class="flaticon-analytics"></i> Stats</a>
				                                <div class="dropdown-divider"></div>
				                                <a class="dropdown-item kt-font-danger" href="#"><i class="flaticon-delete kt-font-danger"></i> Delete</a>
				                            </div>
			                        	</div>
		                        	</td>
						    	</tr>
						    	<tr>
							      	<th scope="row">3</th>
							      	<td>12/04/2019</td>
							      	<td>19/04/1019</td>
							      	<td>0.87</td>
							      	<td>0.25</td>
							      	<td>Type1</td>
							      	<td class="kt-font-success">Success</td>
							      	<td>Type2</td>
							      	<td class="kt-font-danger">Danger</td>
							      	<td>
								      	<div class="dropdown dropright">
				                            <button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				                                <i class="flaticon-more-1"></i>
				                            </button>
				                            <div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
				                                <a class="dropdown-item" href="#"><i class="flaticon-profile-1"></i> Details</a>
				                                <a class="dropdown-item" href="#"><i class="flaticon-analytics"></i> Stats</a>
				                                <div class="dropdown-divider"></div>
				                                <a class="dropdown-item kt-font-danger" href="#"><i class="flaticon-delete kt-font-danger"></i> Delete</a>
				                            </div>
			                        	</div>
		                        	</td>
						    	</tr>
						  	</tbody>
						</table>
					</div>
				</div>
				<!--end::Section-->
			</div>
		</div>
	</div>
</div>
<!-- end: Student table -->

<!-- begin: FCM Representation -->
<div class="row">
	Rappresentaizone della mappa FCM

</div>
<!-- end: FCM Representation -->
<!-- end: Content -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 10 11:46:41 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/studentStats.scala.html
                  HASH: af35c7442302881e5d94d3ffe0ec720e017f4960
                  MATRIX: 1037->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
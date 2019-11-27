
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

object scoursedetailscontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" style="padding: 0;">
            <div class="kt-portlet">
            
	            <div class="kt-portlet__body">
	                <ul class="nav nav-tabs" role="tablist">
	                    <li class="nav-item">
	                        <a class="nav-link active" data-toggle="tab" href="#kt_tabs_1_1">
	                            <i class="fas fa-info"></i>Info
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_2">
	                            <i class="fas fa-bullhorn"></i> News
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_3">
	                            <i class="far fa-chart-bar"></i> Stats
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_4">
	                            <i class="fas fa-book-open"></i> Didactics
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_5">
	                            <i class="fas fa-clipboard"></i> Assignment
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_6">
	                        <input type="hidden" id="loggedUser" value=""""),_display_(/*34.71*/user/*34.75*/.getUserId()),format.raw/*34.87*/(""""/>
	                            <i class="fas fa-users"></i> Members
	                        </a>
	                    </li>
	                </ul>                    
	
	                <div class="tab-content">
	                    <div class="tab-pane active" id="kt_tabs_1_1" role="tabpanel">
							<table class="table table-sm table-head-bg-brand" style="width:30%">
						  	<tbody>
						    	<tr>
							      	<th scope="row"><span class="fa fa-graduation-cap" aria-hidden="true"></span></th>
							      	<!--<td>ALGORITHMS DESIGN</td>-->
							      	<td>Mathematical Analysis II</td>
						    	</tr>
						    	<tr>
						      		<th scope="row"><span class="fa fa-star" aria-hidden="true"></span></th>
<!-- 						      		<td>COMPUTER SCIENCE</td> -->
										<td>MATHEMATICS SCIENCE</td>
						    	</tr>
						    	<tr>
						      		<th scope="row"><span class="fa fa-calendar" aria-hidden="true"></span></th>
						      		<td>2018/2019</td>
						    	</tr>
						    	<tr>
						      		<th scope="row"><span class="far fa-calendar-plus" aria-hidden="true"></span></th>
						      		<td>05-04-2019</td>
						    	</tr>
						  	</tbody>
						</table>
						Course goals: 
						<ul>
							<li>Study about Differential Equations</li>
							<li>Sequences and Series of functions</li>
							<li>Two variables function</li>
							<li>Double integrals</li>
							<!--  <li>Give students methods and knowledges to allow them to develop efficient algorithms</li>
							<li>Give methods for the resource analysis (space and time) used by algorithms</li>
							<li>Give a list of the most noted and efficient algorithms for the basic computational problems (sort, search, resources optimization, ...)</li>
							-->
						</ul>
	                    </div>
	                    <div class="tab-pane" id="kt_tabs_1_2" role="tabpanel">
	                    	<div class="kt-notes">
								<div class="kt-notes__items">
									<div class="kt-notes__item">
										<div class="kt-notes__media">
											<span class="kt-notes__circle"></span>
										</div>
										<div class="kt-notes__content">
											<div class="kt-notes__section">
												<div class="kt-notes__info">
													<a href="#" class="kt-notes__title"> TODO </a> 
													<span class="kt-notes__desc"> 9:30AM 16 June, 2015 </span>
													<span class="kt-badge kt-badge--brand kt-badge--inline">important</span>
												</div>
											</div>
											<span class="kt-notes__body"> Sed ut perspiciatis unde
												omnis iste natus error sit voluptatem accusantium doloremque
												laudantium, totam rem aperiam, eaque ipsa quae ab illo
												inventore veritatis et quasi architecto. 
											</span>
										</div>
									</div>
									<div class="kt-notes__item">		
										<div class="kt-notes__media">
											<span class="kt-notes__circle"></span>
										</div>
										<div class="kt-notes__content">
											<div class="kt-notes__section">
												<div class="kt-notes__info">
													<a href="#" class="kt-notes__title"> Upload materials</a> 
													<span class="kt-notes__desc"> 7:10AM 21 February, 2016 </span>
												</div>
											</div>
											<span class="kt-notes__body"> Sed ut perspiciatis unde
												omnis iste natus error sit voluptatem accusantium aque ipsa
												quae ab illo inventore veritatis et quasi architecto. 
											</span>
										</div>
									</div>
									<div class="kt-notes__item kt-notes__item--clean">
										<div class="kt-notes__media">
											<span class="kt-notes__circle"></span>
										</div>
										<div class="kt-notes__content">
											<div class="kt-notes__section">
												<div class="kt-notes__info">
													<a href="#" class="kt-notes__title"> Start </a> 
														<span class="kt-notes__desc"> 10:30AM 05 April, 2019 </span>
												</div>
											</div>
											<span class="kt-notes__body"> Course started. </span>
										</div>
									</div>
								</div>		
							</div>
	                    </div>
	                    <!-- begin:Statistiche -->
	                    <div class="tab-pane" id="kt_tabs_1_3" role="tabpanel">
	                    	<div class="kt-portlet">
									<div class="kt-portlet__body  kt-portlet__body--fit">
										<div class="row row-no-padding row-col-separator-xl">
											<div class="col-xl-6">
												<!--begin:: Widgets/Daily Sales-->
								<div class="kt-portlet kt-portlet--height-fluid">
									<div class="kt-widget14">
										<div class="kt-widget14__header kt-margin-b-30">
											<h3 class="kt-widget14__title">
												Daily Sales              
											</h3>
											<span class="kt-widget14__desc">
												Check out each collumn for more details
											</span>
										</div>
										<div class="kt-widget14__chart" style="height:120px;"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
											<canvas id="kt_chart_daily_sales" style="display: block; width: 478px; height: 120px;" width="478" height="120" class="chartjs-render-monitor"></canvas>
										</div>
									</div>
								</div>	
								<!--end:: Widgets/Daily Sales-->			</div>
											<div class="col-xl-6">
												<!--begin:: Widgets/Profit Share-->
								<div class="kt-portlet kt-portlet--height-fluid">
									<div class="kt-widget14">
										<div class="kt-widget14__header">
											<h3 class="kt-widget14__title">
												Profit Share            
											</h3>
											<span class="kt-widget14__desc">
												Profit Share between customers
											</span>
										</div>	 
										<div class="kt-widget14__content">	
											<div class="kt-widget14__chart"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
												<div class="kt-widget14__stat">45</div>
												<canvas id="kt_chart_profit_share" style="height: 140px; width: 140px; display: block;" width="140" height="140" class="chartjs-render-monitor"></canvas>
											</div> 
											<div class="kt-widget14__legends">
												<div class="kt-widget14__legend">
													<span class="kt-widget14__bullet kt-bg-success"></span>
													<span class="kt-widget14__stats">37% Sport Tickets</span>
												</div>
												<div class="kt-widget14__legend">
													<span class="kt-widget14__bullet kt-bg-warning"></span>
													<span class="kt-widget14__stats">47% Business Events</span>
												</div>
												<div class="kt-widget14__legend">
													<span class="kt-widget14__bullet kt-bg-brand"></span>
													<span class="kt-widget14__stats">19% Others</span>
												</div>
											</div>			
										</div> 
									</div>
								</div>		
								<!--end:: Widgets/Profit Share-->			</div>
	
										</div>
									</div>
								</div>
	
	                    	
	                    		<div class="kt-portlet">
						            <div class="kt-portlet__head">
						                <div class="kt-portlet__head-label">
						                    <span class="kt-portlet__head-icon kt-hidden">
						                        <i class="la la-gear"></i>
						                    </span>
						                    <h3 class="kt-portlet__head-title">
						                        Simple Column Chart
						                    </h3>
						                </div>
						            </div>
						            <div class="kt-portlet__body">
						                <div id="kt_amcharts_1" style="height: 500px; overflow: visible; text-align: left;"><div class="amcharts-main-div" style="position: relative;"><div class="amcharts-chart-div" style="overflow: hidden; position: relative; text-align: left; width: 990px; height: 500px; padding: 0px; cursor: default; touch-action: auto;"><svg version="1.1" style="position: absolute; width: 990px; height: 500px; top: -0.5px; left: 0px;"><desc>JavaScript chart by amCharts 3.21.15</desc><g><path cs="100,100" d="M0.5,0.5 L989.5,0.5 L989.5,499.5 L0.5,499.5 Z" fill="#FFFFFF" stroke="#000000" fill-opacity="0" stroke-width="1" stroke-opacity="0" class="amcharts-bg"></path><path cs="100,100" d="M0.5,0.5 L910.5,0.5 L910.5,449.5 L0.5,449.5 L0.5,0.5 Z" fill="#FFFFFF" stroke="#000000" fill-opacity="0" stroke-width="1" stroke-opacity="0" class="amcharts-plot-area" transform="translate(59,20)"></path></g><g transform="translate(59,20)" clip-path="url(#AmChartsEl-139)"><g visibility="hidden"></g></g><g></g><g></g><g></g><g><g transform="translate(59,20)" class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275"><g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(7,449)" aria-label=" USA 2,025"><path cs="100,100" d="M0.5,0.5 L0.5,-409.5 L56.5,-409.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(77,449)" aria-label=" China 1,882"><path cs="100,100" d="M0.5,0.5 L0.5,-377.5 L56.5,-377.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(147,449)" aria-label=" Japan 1,809"><path cs="100,100" d="M0.5,0.5 L0.5,-360.5 L56.5,-360.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(217,449)" aria-label=" Germany 1,322"><path cs="100,100" d="M0.5,0.5 L0.5,-251.5 L56.5,-251.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(287,449)" aria-label=" UK 1,122"><path cs="100,100" d="M0.5,0.5 L0.5,-206.5 L56.5,-206.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(357,449)" aria-label=" France 1,114"><path cs="100,100" d="M0.5,0.5 L0.5,-204.5 L56.5,-204.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(427,449)" aria-label=" India 984"><path cs="100,100" d="M0.5,0.5 L0.5,-175.5 L56.5,-175.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(497,449)" aria-label=" Spain 711"><path cs="100,100" d="M0.5,0.5 L0.5,-114.5 L56.5,-114.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(567,449)" aria-label=" Netherlands 665"><path cs="100,100" d="M0.5,0.5 L0.5,-103.5 L56.5,-103.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(637,449)" aria-label=" Russia 580"><path cs="100,100" d="M0.5,0.5 L0.5,-84.5 L56.5,-84.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(707,449)" aria-label=" South Korea 443"><path cs="100,100" d="M0.5,0.5 L0.5,-54.5 L56.5,-54.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(777,449)" aria-label=" Canada 441"><path cs="100,100" d="M0.5,0.5 L0.5,-53.5 L56.5,-53.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(847,449)" aria-label=" Brazil 395"><path cs="100,100" d="M0.5,0.5 L0.5,-43.5 L56.5,-43.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g></g></g></g><g></g><g><g class="amcharts-category-axis"><path cs="100,100" d="M0.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(59,469)" class="amcharts-axis-line"></path></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274"><path cs="100,100" d="M0.5,0.5 L0.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(59,20)" class="amcharts-axis-line" visibility="visible"></path></g></g><g><g transform="translate(59,20)" clip-path="url(#AmChartsEl-140)" style="pointer-events: none;"><path cs="100,100" d="M0.5,0.5 L0.5,0.5 L0.5,449.5" fill="none" stroke-width="1" stroke-opacity="0" stroke="#000000" class="amcharts-cursor-line amcharts-cursor-line-vertical" visibility="hidden" transform="translate(757,0)"></path><path cs="100,100" d="M0.5,0.5 L910.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke="#000000" class="amcharts-cursor-line amcharts-cursor-line-horizontal" visibility="hidden" transform="translate(0,441)"></path></g><clipPath id="AmChartsEl-140"><rect x="0" y="0" width="910" height="449" rx="0" ry="0" stroke-width="0"></rect></clipPath></g><g></g><g><g></g></g><g><g class="amcharts-category-axis" transform="translate(59,20)" visibility="visible"><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(35,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">USA</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(105,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">China</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(175,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Japan</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(245,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Germany</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(315,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">UK</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(385,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">France</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(455,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">India</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(525,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Spain</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(595,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Netherlands</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(665,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Russia</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(735,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">South Korea</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(805,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Canada</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(875,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Brazil</tspan></text></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274" transform="translate(59,20)" visibility="visible"><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,448)" class="amcharts-axis-label"><tspan y="6" x="0">200</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,403)" class="amcharts-axis-label"><tspan y="6" x="0">400</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,358)" class="amcharts-axis-label"><tspan y="6" x="0">600</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,313)" class="amcharts-axis-label"><tspan y="6" x="0">800</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,268)" class="amcharts-axis-label"><tspan y="6" x="0">1,000</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,224)" class="amcharts-axis-label"><tspan y="6" x="0">1,200</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,179)" class="amcharts-axis-label"><tspan y="6" x="0">1,400</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,134)" class="amcharts-axis-label"><tspan y="6" x="0">1,600</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,89)" class="amcharts-axis-label"><tspan y="6" x="0">1,800</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,44)" class="amcharts-axis-label"><tspan y="6" x="0">2,000</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,-1)" class="amcharts-axis-label">"""),
format.raw("""<tspan y="6" x="0">2,200</tspan></text></g></g><g transform="translate(59,20)"></g><g></g><g></g><g><g class="amcharts-category-axis" transform="translate(59,20)"><g><path cs="100,100" d="M0.5,0.5 L0.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M70.5,0.5 L70.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M140.5,0.5 L140.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M210.5,0.5 L210.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M280.5,0.5 L280.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M350.5,0.5 L350.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M420.5,0.5 L420.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M490.5,0.5 L490.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M560.5,0.5 L560.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M630.5,0.5 L630.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M700.5,0.5 L700.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M770.5,0.5 L770.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M840.5,0.5 L840.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M910.5,0.5 L910.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274" transform="translate(59,20)" visibility="visible"><g><path cs="100,100" d="M0.5,449.5 L6.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,449.5 L0.5,449.5 L910.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,404.5 L6.5,404.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,404.5 L0.5,404.5 L910.5,404.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,359.5 L6.5,359.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,359.5 L0.5,359.5 L910.5,359.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,314.5 L6.5,314.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,314.5 L0.5,314.5 L910.5,314.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,269.5 L6.5,269.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,269.5 L0.5,269.5 L910.5,269.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,225.5 L6.5,225.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,225.5 L0.5,225.5 L910.5,225.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,180.5 L6.5,180.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,180.5 L0.5,180.5 L910.5,180.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,135.5 L6.5,135.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,135.5 L0.5,135.5 L910.5,135.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,90.5 L6.5,90.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,90.5 L0.5,90.5 L910.5,90.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,45.5 L6.5,45.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,45.5 L0.5,45.5 L910.5,45.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,0.5 L6.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,0.5 L0.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g></g></g><g><g transform="translate(59,20)" class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275"></g></g><g></g><clipPath id="AmChartsEl-139"><rect x="-1" y="-1" width="912" height="451" rx="0" ry="0" stroke-width="0"></rect></clipPath></svg><a href="http://www.amcharts.com" title="JavaScript charts" style="position: absolute; text-decoration: none; color: rgb(0, 0, 0); font-family: Verdana; font-size: 11px; opacity: 0.7; display: block; left: 64px; top: 25px;">JS chart by amCharts</a></div></div></div>
						            </div>
						        </div>
	                    </div>
	                    <!-- end:Statistiche -->
	                    <div class="tab-pane" id="kt_tabs_1_4" role="tabpanel">
	                    	<div class="kt-container kt-container--fluid kt-grid__item kt-grid__item--fluid">
	               				<div class="row">
	               					<!-- Begin: left column-->
	               					<div class="col-xl-4">
               							<div class="kt-portlet kt-portlet--height-fluid">
											<div class="kt-portlet__head">
												<div class="kt-portlet__head-label">
													<h3 class="kt-portlet__head-title">
														Sections
													</h3>
												</div>
											</div>
											<div class="kt-portlet__body">
												<div class="tab-content">
									                <div class="kt-notification">
									                    <a href="#" class="kt-notification__item">
									                        <div class="kt-notification__item-icon">
										                        <i class="fas fa-book kt-font-success"></i>
									                        </div>
									                        <div class="kt-notification__item-details">
									                            <div class="kt-notification__item-title">
									                                Chapter 1: Differential Equations
									                            </div>
									                        </div>
									                    </a>
									                    <a href="#" class="kt-notification__item">
									                        <div class="kt-notification__item-icon">
										                        <i class="fas fa-book kt-font-success"></i>
									                        </div>
									                        <div class="kt-notification__item-details">
									                            <div class="kt-notification__item-title">
									                                Chapter 2: Sequences and Series of Functions
									                            </div>
									                        </div>
									                    </a>
									                    <a data-toggle="tab" href="#kt_widget11_tab3_content" class="kt-notification__item">
									                        <div class="kt-notification__item-icon">
										                         <i class="fas fa-book kt-font-success"></i>
									                        </div>
									                        <div class="kt-notification__item-details">
									                            <div class="kt-notification__item-title">
									                                Chapter 3: Functions of two variables
									                            </div>
									                        </div>
									                    </a>
									                    <a href="#" class="kt-notification__item">
									                        <div class="kt-notification__item-icon">
										                       <i class="fas fa-book kt-font-success"></i>
									                        </div>
									                        <div class="kt-notification__item-details">
									                            <div class="kt-notification__item-title">
									                                Chapter 4: Double Integrals
									                            </div>
									                        </div>
									                    </a>
									                </div>
												</div>
											</div>
										</div>	               					
	               					</div>
	               					<!-- End: left column-->
	               					<!-- Begin: right column-->
	               					<div class="col-xl-8">
	               						<div class="kt-portlet kt-portlet--tabs kt-portlet--height-fluid">
											<div class="kt-portlet__head">
												<div class="kt-portlet__head-label">
													<h3 class="kt-portlet__head-title">
														Activities
													</h3>
												</div>
											</div>
											<div class="kt-portlet__body">
												<!--Begin::Tab Content-->
												<div class="tab-content">
													
													<!--begin::tab 3 content-->
													<div class="tab-pane" id="kt_widget11_tab3_content">
														<!--begin::Widget 11--> 
														<div class="kt-widget11">
															<div class="table-responsive">					 
																<table class="table">
																	<thead>
																		<tr>
																			<td style="width:15%">Type</td>
																			<td style="width:70%">Activity</td>
																			<td style="width:15%">Actions</td>
																		</tr>
																	</thead>
																	<tbody>
																		<tr>
																			<td>
																				<div class="kt-widget4__pic kt-widget4__pic--icon">
																					<img src="assets/images/files/pdf.svg" alt="" style="height: 45px; width: 45px">
																				</div>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Functions of two variables</span>
																				<span class="kt-widget11__sub">Learn how to calculate domain, level curves and limits.</span>
																			</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='/loadContents?contentType=functions_sev_var'><i class="fas fa-book-reader"></i>Learn</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		<tr>
																			<td>
																				<div class="kt-widget4__pic kt-widget4__pic--icon">
																					<img src="assets/images/files/pdf.svg" alt="" style="height: 45px; width: 45px">
																				</div>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Critial Points</span>
																				<span class="kt-widget11__sub">Learn how to min, max, seal points of a given function.</span>
																			</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='/loadContents?contentType=critical_points'><i class="fas fa-book-reader"></i> Read</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		
																		<tr>
																			<td>
																				<div class="kt-widget4__pic kt-widget4__pic--icon">
																					<img src="assets/images/files/ar.svg" alt="" style="height: 45px; width: 45px">
																				</div>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Learn with AR</span>
																				<span class="kt-widget11__sub">Try to learn this topic using AR device.</span>
																			</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href="/loadContents?contentType=AR"><i class="fas fa-qrcode"></i>Learn</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																	</tbody>									     
																</table>
															</div>
															<!-- Added by Mario -->
															<div class="modal fade" id="kt_modal_6" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true" style="display: none;">
															    <div class="modal-dialog modal-dialog-centered" role="document">
															        <div class="modal-content">
															            <div class="modal-header">
															                <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
															                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
															                </button>
															            </div>
															            <div class="modal-body">
																			
															            </div>
															            <div class="modal-footer">
															                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
															                <button type="button" class="btn btn-primary">Save changes</button>
															            </div>
															        </div>
															    </div>
															</div>
															<!-- END -->
														</div>
														<!--end::Widget 11--> 						             
													</div>
												
													
												</div>
												<!--End::Tab Content-->
											</div>
										</div>
	               					
	               					</div>
	               					<!-- End: right column-->
	               				</div>
	               			</div>
	                    </div>
	                    <!-- begin:Assignment -->
	                    <div class="tab-pane" id="kt_tabs_1_5" role="tabpanel">
	               			<div class="kt-container kt-container--fluid kt-grid__item kt-grid__item--fluid">
	               				<div class="row">
	               					<!-- Begin: left column-->
	               					<div class="col-xl-4">
               							<div class="kt-portlet kt-portlet--height-fluid">
											<div class="kt-portlet__head">
												<div class="kt-portlet__head-label">
													<h3 class="kt-portlet__head-title">
														Sections
													</h3>
												</div>
											</div>
											<div class="kt-portlet__body">
												<div class="tab-content">
									                <div class="kt-notification">
									                    <a data-toggle="tab">
									                        <span class="kt-notification__item-icon">
										                        <svg class="kt-svg-icon kt-svg-icon--success" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
																    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
																        <mask id="mask-2" fill="white">
																            <use xlink:href="#path-1"/>
																        </mask>
																        <g id="bound"/>
																        <path d="M15.6274517,4.55882251 L14.4693753,6.2959371 C13.9280401,5.51296885 13.0239252,5 12,5 C10.3431458,5 9,6.34314575 9,8 L9,10 L14,10 L17,10 L18,10 C19.1045695,10 20,10.8954305 20,12 L20,18 C20,19.1045695 19.1045695,20 18,20 L6,20 C4.8954305,20 4,19.1045695 4,18 L4,12 C4,10.8954305 4.8954305,10 6,10 L7,10 L7,8 C7,5.23857625 9.23857625,3 12,3 C13.4280904,3 14.7163444,3.59871093 15.6274517,4.55882251 Z" id="Combined-Shape" fill="#000000"/>
																    </g>
																</svg>
									                        </span>
									                        <span class="kt-notification__item-details">
									                            <span class="kt-notification__item-title">
									                                Chapter 1: Differential Equations
									                            </span>
									                            <div class="kt-notification__item-time">
									                                <div class="progress">
																	  	<div class="progress-bar bg-succe"""),
format.raw("""ss" role="progressbar" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
																	</div>
									                            </div>
									                        </span>
									                    </a>
									                    <hr>
									                    <a data-toggle="tab">
									                        <span class="kt-notification__item-icon">
										                        <svg class="kt-svg-icon kt-svg-icon--success" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
																    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
																        <mask id="mask-2" fill="white">
																            <use xlink:href="#path-1"/>
																        </mask>
																        <g id="bound"/>
																        <path d="M15.6274517,4.55882251 L14.4693753,6.2959371 C13.9280401,5.51296885 13.0239252,5 12,5 C10.3431458,5 9,6.34314575 9,8 L9,10 L14,10 L17,10 L18,10 C19.1045695,10 20,10.8954305 20,12 L20,18 C20,19.1045695 19.1045695,20 18,20 L6,20 C4.8954305,20 4,19.1045695 4,18 L4,12 C4,10.8954305 4.8954305,10 6,10 L7,10 L7,8 C7,5.23857625 9.23857625,3 12,3 C13.4280904,3 14.7163444,3.59871093 15.6274517,4.55882251 Z" id="Combined-Shape" fill="#000000"/>
																    </g>
																</svg>
									                        </span>
									                        <span class="kt-notification__item-details">
									                            <span class="kt-notification__item-title">
									                                Chapter 2: Sequences and Series of Functions
									                            </span>
									                            <div class="kt-notification__item-time">
									                                <div class="progress">
																	  	<div class="progress-bar bg-success" role="progressbar" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
																	</div>
									                            </div>
									                        </span>
									                    </a>
									                    <hr>
									                    <a data-toggle="tab" href="#kt_widget11_tab1_content" id="chap3">
									                        <span class="kt-notification__item-icon">
										                         <svg class="kt-svg-icon kt-svg-icon--success" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
																    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
																        <mask id="mask-2" fill="white">
																            <use xlink:href="#path-1"/>
																        </mask>
																        <g id="bound"/>
																        <path d="M15.6274517,4.55882251 L14.4693753,6.2959371 C13.9280401,5.51296885 13.0239252,5 12,5 C10.3431458,5 9,6.34314575 9,8 L9,10 L14,10 L17,10 L18,10 C19.1045695,10 20,10.8954305 20,12 L20,18 C20,19.1045695 19.1045695,20 18,20 L6,20 C4.8954305,20 4,19.1045695 4,18 L4,12 C4,10.8954305 4.8954305,10 6,10 L7,10 L7,8 C7,5.23857625 9.23857625,3 12,3 C13.4280904,3 14.7163444,3.59871093 15.6274517,4.55882251 Z" id="Combined-Shape" fill="#000000"/>
																    </g>
																</svg>
									                        </span>
									                        <span class="kt-notification__item-details">
									                            <span class="kt-notification__item-title">
									                                Chapter 3: Functions of two variables
									                            </span>
									                            <div class="kt-notification__item-time">
									                                <div class="progress" id="chap3-progresses">
																	  	<div class="progress-bar bg-warning" role="progressbar" style="width: 0%;" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
																		0%
																	</div>
									                            </div>
									                        </span>
									                    </a>
									                    <hr>
									                    <a data-toggle="tab">
									                        <span class="kt-notification__item-icon">
										                       <svg class="kt-svg-icon kt-svg-icon--danger" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
															    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
															        <mask id="mask-2" fill="white">
															            <use xlink:href="#path-1"/>
															        </mask>
															        <g id="bound"/>
															        <path d="M7,10 L7,8 C7,5.23857625 9.23857625,3 12,3 C14.7614237,3 17,5.23857625 17,8 L17,10 L18,10 C19.1045695,10 20,10.8954305 20,12 L20,18 C20,19.1045695 19.1045695,20 18,20 L6,20 C4.8954305,20 4,19.1045695 4,18 L4,12 C4,10.8954305 4.8954305,10 6,10 L7,10 Z M12,5 C10.3431458,5 9,6.34314575 9,8 L9,10 L15,10 L15,8 C15,6.34314575 13.6568542,5 12,5 Z" id="Mask" fill="#000000"/>
															    </g>
															</svg>
									                        </span>
									                        <span class="kt-notification__item-details">
									                            <span class="kt-notification__item-title">
									                                Chapter 4: Double Integrals
									                            </span>
									                            <div class="kt-notification__item-time">
									                                <div class="progress">
																	  	<div class="progress-bar bg-warning" role="progressbar" style="width: 0%; text-align: center;" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
																		0%
																	</div>
									                            </div>
									                        </span>
									                    </a>
									                </div>
												</div>
											</div>
										</div>	               					
	               					</div>
	               					<!-- End: left column-->
	               					<!-- Begin: right column-->
	               					<div class="col-xl-8">
	               						<div class="kt-portlet kt-portlet--tabs kt-portlet--height-fluid">
											<div class="kt-portlet__head">
												<div class="kt-portlet__head-label">
													<h3 class="kt-portlet__head-title">
														Activities
													</h3>
												</div>
											</div>
											<div class="kt-portlet__body">
												<!--Begin::Tab Content-->
												<div class="tab-content">
													<!--begin::tab 1 content-->
													<div class="tab-pane" id="kt_widget11_tab1_content">
														<!--begin::Widget 11--> 
														<div class="kt-widget11">
															<div class="table-responsive">					 
																<table class="table">
																	<thead>
																		<tr>
																			<td style="width:15%">Status</td>
																			<td style="width:45%">Activity</td>
																			<td style="width:20%">Score</td>
																			<td style="width:20%">Actions</td>
																		</tr>
																	</thead>
																	<tbody>
																		<tr>
																			<td>
																				<span id="status-topic1" class="kt-badge kt-badge--inline kt-badge--info">Completed</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Delivery</span>
																				<span class="kt-widget11__sub">Quiz - Function of two variables</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='#'><i class="fas fa-question"></i> Do quiz!</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		<tr>
																			<td>
																				<span id="status-topic2" class="kt-badge kt-badge--inline kt-badge--info">Uncompleted</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Delivery</span>
																				<span class="kt-widget11__sub">Quiz - Critical Points</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='#'><i class="fas fa-question"></i> Do Quiz!</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		<tr>
																			<td>
																				<span id="status-quiz" class="kt-badge kt-badge--inline kt-badge--danger">Blocked</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Quiz</span>
																				<span class="kt-widget11__sub">Test your knowledges</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button id="quiz-btn" type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false' disabled>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='/loadContents?contentType=Quiz' ><i class="fas fa-question"></i> Do Quiz!</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		
																	</tbody>									     
																</table>
															</div>
															
														</div>
														<!--end::Widget 11--> 						             
													</div>
												</div>
												<!--End::Tab Content-->
											</div>
										</div>
	               					
	               					</div>
	               					<!-- End: right column-->
	               				</div>
	               			</div>
	                	</div>
	                	<!-- end:Assignment --> 
	                    <!-- begin:Membri -->
	                    <div class="tab-pane" id="kt_tabs_1_6" role="tabpanel">
	               			<div class="kt-container kt-container--fluid kt-grid__item kt-grid__item--fluid" id="students-list">
	               			</div>
	                	</div>
	                	<!-- end:Membri -->      
	            	<!-- 
	                <div class="kt-separator kt-separator--dashed"></div>
					-->
	                     
	            </div>
	        </div>
			
        </div>

	</div>	
	
	
	<script>
		
		$(document).ready(function()"""),format.raw/*652.31*/("""{"""),format.raw/*652.32*/("""
			"""),format.raw/*653.4*/("""//Update the completation perc. of the chapter
			var percentage= 0;
			var classColor= "";
			var topic1, topic2, quiz;
			topic1= $("#status-topic1").text();
			topic2= $("#status-topic2").text();
			quiz= $("#status-quiz").text();
			
			if(topic1 == "Uncompleted" && topic2 == "Completed" || topic1 == "Completed" && topic2 == "Uncompleted")"""),format.raw/*661.108*/("""{"""),format.raw/*661.109*/("""
				"""),format.raw/*662.5*/("""percentage = 35;
				classColor="bg-danger";
			"""),format.raw/*664.4*/("""}"""),format.raw/*664.5*/("""
			"""),format.raw/*665.4*/("""else if(topic1 == "Completed" && topic2 == "Completed")"""),format.raw/*665.59*/("""{"""),format.raw/*665.60*/("""
				"""),format.raw/*666.5*/("""percentage = 70;
				classColor="bg-warning";
				$("#status-quiz").html("Uncompleted");
				$("#quiz-btn").removeAttr("disabled");
				
				$("#status-quiz").removeClass("kt-badge--danger");
				$("#status-quiz").addClass("kt-badge--info");
				//DO A REQUEST CALL TO STORE THIS CHANGE INTO DB
				
			"""),format.raw/*675.4*/("""}"""),format.raw/*675.5*/("""else if(topic1 == "Completed" && topic2 == "Completed" && quiz == "Completed")"""),format.raw/*675.83*/("""{"""),format.raw/*675.84*/("""
				"""),format.raw/*676.5*/("""classColor="bg-success";
				percentage == 100;
			"""),format.raw/*678.4*/("""}"""),format.raw/*678.5*/("""
			
			"""),format.raw/*680.4*/("""$("#chap3-progresses").empty();
			
			$("#chap3-progresses").html(
				"<div class='progress-bar "+classColor+"' role='progressbar' style='width: "+percentage+"%;' aria-valuenow='"+percentage+"' aria-valuemin='0' aria-valuemax='100'>"+percentage+"%</div>"
			);
		"""),format.raw/*685.3*/("""}"""),format.raw/*685.4*/(""");
					
	</script>	
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
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/scoursedetailscontent.scala.html
                  HASH: ea5c581d52ea945d903aac9fec7c5ee116162d0c
                  MATRIX: 976->1|1097->27|1125->29|2896->1773|2909->1777|2942->1789|55382->54160|55412->54161|55445->54166|55828->54519|55859->54520|55893->54526|55971->54576|56000->54577|56033->54582|56117->54637|56147->54638|56181->54644|56521->54956|56550->54957|56657->55035|56687->55036|56721->55042|56802->55095|56831->55096|56869->55106|57167->55376|57196->55377
                  LINES: 28->1|33->1|34->2|66->34|66->34|66->34|686->652|686->652|687->653|695->661|695->661|696->662|698->664|698->664|699->665|699->665|699->665|700->666|709->675|709->675|709->675|709->675|710->676|712->678|712->678|714->680|719->685|719->685
                  -- GENERATED --
              */
          
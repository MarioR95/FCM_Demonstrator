
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

object coursedetailscontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" style="padding: 0;">
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
                            <i class="fas fa-bullhorn"></i> Annunci
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_3">
                            <i class="far fa-chart-bar"></i> Statistiche
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_4">
                            <i class="fas fa-book-open"></i> Didattica
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#">
                            <i class="fas fa-users"></i> Membri
                        </a>
                    </li>
                </ul>                    

                <div class="tab-content">
                    <div class="tab-pane active" id="kt_tabs_1_1" role="tabpanel">
                    <div class="kt-portlet kt-portlet--height-fluid">
						<div class="kt-portlet__head">
							<div class="kt-portlet__head-label">
								<h3 class="kt-portlet__head-title">
									Latest Updates
								</h3>
							</div>
							<div class="kt-portlet__head-toolbar">
								<a href="#" class="btn btn-label-brand btn-bold btn-sm dropdown-toggle" data-toggle="dropdown">
									Today
								</a>
								<div class="dropdown-menu dropdown-menu-fit dropdown-menu-md dropdown-menu-right">
									<!--begin::Nav-->
					<ul class="kt-nav">
					    <li class="kt-nav__head">
					        Export Options                                    
					        <i class="flaticon2-information" data-toggle="kt-tooltip" data-placement="right" title="" data-original-title="Click to learn more..."></i>
					    </li>
					    <li class="kt-nav__separator"></li>
					    <li class="kt-nav__item">
					        <a href="#" class="kt-nav__link">
					            <i class="kt-nav__link-icon flaticon2-drop"></i>
					            <span class="kt-nav__link-text">Activity</span>
					        </a>
					    </li>
					    <li class="kt-nav__item">
					        <a href="#" class="kt-nav__link">
					            <i class="kt-nav__link-icon flaticon2-calendar-8"></i>
					            <span class="kt-nav__link-text">FAQ</span>
					        </a>
					    </li>
					    <li class="kt-nav__item">
					        <a href="#" class="kt-nav__link">
					            <i class="kt-nav__link-icon flaticon2-link"></i>
					            <span class="kt-nav__link-text">Settings</span>
					        </a>
					    </li>
					    <li class="kt-nav__item">
					        <a href="#" class="kt-nav__link">
					            <i class="kt-nav__link-icon flaticon2-new-email"></i>
					            <span class="kt-nav__link-text">Support</span>
					            <span class="kt-nav__link-badge">
					                <span class="kt-badge kt-badge--success">5</span>
					            </span>
					        </a>
					    </li>
					    <li class="kt-nav__separator"></li>
					    <li class="kt-nav__foot">
					        <a class="btn btn-label-danger btn-bold btn-sm" href="#">Upgrade plan</a>                                    
					        <a class="btn btn-clean btn-bold btn-sm" href="#" data-toggle="kt-tooltip" data-placement="right" title="" data-original-title="Click to learn more...">Learn more</a>
					    </li>
					</ul>
					<!--end::Nav-->			</div>
							</div>
						</div>

					</div>
            
                    </div>
                    <div class="tab-pane" id="kt_tabs_1_2" role="tabpanel">
                        It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
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
					                <div id="kt_amcharts_1" style="height: 500px; overflow: visible; text-align: left;"><div class="amcharts-main-div" style="position: relative;"><div class="amcharts-chart-div" style="overflow: hidden; position: relative; text-align: left; width: 990px; height: 500px; padding: 0px; cursor: default; touch-action: auto;"><svg version="1.1" style="position: absolute; width: 990px; height: 500px; top: -0.5px; left: 0px;"><desc>JavaScript chart by amCharts 3.21.15</desc><g><path cs="100,100" d="M0.5,0.5 L989.5,0.5 L989.5,499.5 L0.5,499.5 Z" fill="#FFFFFF" stroke="#000000" fill-opacity="0" stroke-width="1" stroke-opacity="0" class="amcharts-bg"></path><path cs="100,100" d="M0.5,0.5 L910.5,0.5 L910.5,449.5 L0.5,449.5 L0.5,0.5 Z" fill="#FFFFFF" stroke="#000000" fill-opacity="0" stroke-width="1" stroke-opacity="0" class="amcharts-plot-area" transform="translate(59,20)"></path></g><g transform="translate(59,20)" clip-path="url(#AmChartsEl-139)"><g visibility="hidden"></g></g><g></g><g></g><g></g><g><g transform="translate(59,20)" class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275"><g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(7,449)" aria-label=" USA 2,025"><path cs="100,100" d="M0.5,0.5 L0.5,-409.5 L56.5,-409.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(77,449)" aria-label=" China 1,882"><path cs="100,100" d="M0.5,0.5 L0.5,-377.5 L56.5,-377.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(147,449)" aria-label=" Japan 1,809"><path cs="100,100" d="M0.5,0.5 L0.5,-360.5 L56.5,-360.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(217,449)" aria-label=" Germany 1,322"><path cs="100,100" d="M0.5,0.5 L0.5,-251.5 L56.5,-251.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(287,449)" aria-label=" UK 1,122"><path cs="100,100" d="M0.5,0.5 L0.5,-206.5 L56.5,-206.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(357,449)" aria-label=" France 1,114"><path cs="100,100" d="M0.5,0.5 L0.5,-204.5 L56.5,-204.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(427,449)" aria-label=" India 984"><path cs="100,100" d="M0.5,0.5 L0.5,-175.5 L56.5,-175.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(497,449)" aria-label=" Spain 711"><path cs="100,100" d="M0.5,0.5 L0.5,-114.5 L56.5,-114.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(567,449)" aria-label=" Netherlands 665"><path cs="100,100" d="M0.5,0.5 L0.5,-103.5 L56.5,-103.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(637,449)" aria-label=" Russia 580"><path cs="100,100" d="M0.5,0.5 L0.5,-84.5 L56.5,-84.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(707,449)" aria-label=" South Korea 443"><path cs="100,100" d="M0.5,0.5 L0.5,-54.5 L56.5,-54.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(777,449)" aria-label=" Canada 441"><path cs="100,100" d="M0.5,0.5 L0.5,-53.5 L56.5,-53.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g><g class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275" transform="translate(847,449)" aria-label=" Brazil 395"><path cs="100,100" d="M0.5,0.5 L0.5,-43.5 L56.5,-43.5 L56.5,0.5 L0.5,0.5 Z" fill="#67b7dc" stroke="#67b7dc" fill-opacity="0.8" stroke-width="1" stroke-opacity="0.2" class="amcharts-graph-column-front amcharts-graph-column-element"></path></g></g></g></g><g></g><g><g class="amcharts-category-axis"><path cs="100,100" d="M0.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(59,469)" class="amcharts-axis-line"></path></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274"><path cs="100,100" d="M0.5,0.5 L0.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(59,20)" class="amcharts-axis-line" visibility="visible"></path></g></g><g><g transform="translate(59,20)" clip-path="url(#AmChartsEl-140)" style="pointer-events: none;"><path cs="100,100" d="M0.5,0.5 L0.5,0.5 L0.5,449.5" fill="none" stroke-width="1" stroke-opacity="0" stroke="#000000" class="amcharts-cursor-line amcharts-cursor-line-vertical" visibility="hidden" transform="translate(757,0)"></path><path cs="100,100" d="M0.5,0.5 L910.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke="#000000" class="amcharts-cursor-line amcharts-cursor-line-horizontal" visibility="hidden" transform="translate(0,441)"></path></g><clipPath id="AmChartsEl-140"><rect x="0" y="0" width="910" height="449" rx="0" ry="0" stroke-width="0"></rect></clipPath></g><g></g><g><g></g></g><g><g class="amcharts-category-axis" transform="translate(59,20)" visibility="visible"><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(35,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">USA</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(105,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">China</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(175,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Japan</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(245,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Germany</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(315,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">UK</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(385,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">France</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(455,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">India</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(525,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Spain</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(595,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Netherlands</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(665,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Russia</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(735,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">South Korea</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(805,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Canada</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="middle" transform="translate(875,461.5)" class="amcharts-axis-label"><tspan y="6" x="0">Brazil</tspan></text></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274" transform="translate(59,20)" visibility="visible"><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,448)" class="amcharts-axis-label"><tspan y="6" x="0">200</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,403)" class="amcharts-axis-label"><tspan y="6" x="0">400</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,358)" class="amcharts-axis-label"><tspan y="6" x="0">600</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,313)" class="amcharts-axis-label"><tspan y="6" x="0">800</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,268)" class="amcharts-axis-label"><tspan y="6" x="0">1,000</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,224)" class="amcharts-axis-label"><tspan y="6" x="0">1,200</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,179)" class="amcharts-axis-label"><tspan y="6" x="0">1,400</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,134)" class="amcharts-axis-label"><tspan y="6" x="0">1,600</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" tran"""),
format.raw("""sform="translate(-12,89)" class="amcharts-axis-label"><tspan y="6" x="0">1,800</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,44)" class="amcharts-axis-label"><tspan y="6" x="0">2,000</tspan></text><text y="6" fill="#000000" font-family="Verdana" font-size="11px" opacity="1" text-anchor="end" transform="translate(-12,-1)" class="amcharts-axis-label"><tspan y="6" x="0">2,200</tspan></text></g></g><g transform="translate(59,20)"></g><g></g><g></g><g><g class="amcharts-category-axis" transform="translate(59,20)"><g><path cs="100,100" d="M0.5,0.5 L0.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M70.5,0.5 L70.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M140.5,0.5 L140.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M210.5,0.5 L210.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M280.5,0.5 L280.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M350.5,0.5 L350.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M420.5,0.5 L420.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M490.5,0.5 L490.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M560.5,0.5 L560.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M630.5,0.5 L630.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M700.5,0.5 L700.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M770.5,0.5 L770.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M840.5,0.5 L840.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g><g><path cs="100,100" d="M910.5,0.5 L910.5,20.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(0,449)" class="amcharts-axis-tick"></path></g></g><g class="amcharts-value-axis value-axis-valueAxisAuto0_1559302311274" transform="translate(59,20)" visibility="visible"><g><path cs="100,100" d="M0.5,449.5 L6.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,449.5 L0.5,449.5 L910.5,449.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,404.5 L6.5,404.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,404.5 L0.5,404.5 L910.5,404.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,359.5 L6.5,359.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,359.5 L0.5,359.5 L910.5,359.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,314.5 L6.5,314.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,314.5 L0.5,314.5 L910.5,314.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,269.5 L6.5,269.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,269.5 L0.5,269.5 L910.5,269.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,225.5 L6.5,225.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,225.5 L0.5,225.5 L910.5,225.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,180.5 L6.5,180.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,180.5 L0.5,180.5 L910.5,180.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,135.5 L6.5,135.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,135.5 L0.5,135.5 L910.5,135.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,90.5 L6.5,90.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,90.5 L0.5,90.5 L910.5,90.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,45.5 L6.5,45.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,45.5 L0.5,45.5 L910.5,45.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g><g><path cs="100,100" d="M0.5,0.5 L6.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.3" stroke="#000000" transform="translate(-6,0)" class="amcharts-axis-tick"></path><path cs="100,100" d="M0.5,0.5 L0.5,0.5 L910.5,0.5" fill="none" stroke-width="1" stroke-opacity="0.2" stroke="#FFFFFF" class="amcharts-axis-grid"></path></g></g></g><g><g transform="translate(59,20)" class="amcharts-graph-column amcharts-graph-graphAuto0_1559302311275"></g></g><g></g><clipPath id="AmChartsEl-139"><rect x="-1" y="-1" width="912" height="451" rx="0" ry="0" stroke-width="0"></rect></clipPath></svg><a href="http://www.amcharts.com" title="JavaScript charts" style="position: absolute; text-decoration: none; color: rgb(0, 0, 0); font-family: Verdana; font-size: 11px; opacity: 0.7; display: block; left: 64px; top: 25px;">JS chart by amCharts</a></div></div></div>
					            </div>
					        </div>
                    </div>
                    <!-- end:Statistiche -->
                    <div class="tab-pane" id="kt_tabs_1_4" role="tabpanel">
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and
                    </div>
                    <!-- begin:Membri -->
                    <div class="tab-pane" id="kt_tabs_1_5" role="tabpanel">
               			<div class="row">
							<div class="col-xl-12">
								<div class="kt-portlet">
									<div class="kt-portlet__body">
										<!--begin::Section-->
										<div class="kt-section">
											<div class="kt-section__content">
												<table class="table" style="text-align: center;">
												  	<thead class="thead-dark">
												    	<tr>
												      		<th>#</th>
												      		<th>Name</th>
												      		<th>Surname</th>
												      		<th>Registration Number</th>
												      		<th>Last Event</th>
												      		<th>Actions</th>
												    	</tr>
												  	</thead>
												  	<tbody>
												    	<tr>
													      	<th scope="row">1</th>
													      	<td>Jhon</td>
													      	<td>Stone</td>
													      	<td>@jhon</td>
													      	<td>@jhon</td>
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
												      		<td>Lisa</td>
												      		<td>Nilson</td>
												      		<td>@jhon</td>
												      		<td>@lisa</td>
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
												      		<td>Larry</td>
												      		<td>the Bird</td>
												      		<td>@jhon</td>
												      		<td>@twitter</td>
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
                	</div>
                	<!-- end:Membri -->      
            	<!-- 
                <div class="kt-separator kt-separator--dashed"></div>
				-->
                     
            </div>
        </div>

        </div>

	</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jun 25 09:55:38 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/coursedetailscontent.scala.html
                  HASH: e785a14fdd30544a65cc9b8180c25f3a6379b4cd
                  MATRIX: 1045->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
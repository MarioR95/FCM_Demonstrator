
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

object course_details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- begin: course and expire date -->
<div class="kt-subheader   kt-grid__item" id="kt_subheader">
    <div class="kt-subheader__main">
        
        <h3 class="kt-subheader__title">Algoritmi</h3>

        <span class="kt-subheader__separator kt-subheader__separator--v"></span>

        <span class="kt-subheader__desc">30/06/2019</span>
    </div>
</div>
<!-- end: course and expire date -->
<!-- begin:: Content -->
<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" style="padding: 0;">
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
                        <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_5">
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
						<div class="kt-portlet__body">
							<!--begin::widget 12-->
							<div class="kt-widget4">
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon-pie-chart-1 kt-font-info"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Metronic v6 has been arrived!
									</a> 		
									<span class="kt-widget4__number kt-font-info">+500</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon-safe-shield-protection  kt-font-success"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Metronic community meet-up 2019 in Rome.
									</a> 		
									<span class="kt-widget4__number kt-font-success">+1260</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon2-line-chart kt-font-danger"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Metronic Angular 7 version will be landing soon...
									</a> 		
									<span class="kt-widget4__number kt-font-danger">+1080</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon2-pie-chart-1 kt-font-primary"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										ale! Purchase Metronic at 70% off for limited time
									</a> 		
									<span class="kt-widget4__number kt-font-primary">70% Off!</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon2-rocket kt-font-brand"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Metronic VueJS version is in progress. Stay tuned!
									</a> 		
									<span class="kt-widget4__number kt-font-brand">+134</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon2-notification kt-font-warning"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Black Friday! Purchase Metronic at ever lowest 90% off for limited time
									</a> 		
									<span class="kt-widget4__number kt-font-warning">70% Off!</span>
								</div>
					
								<div class="kt-widget4__item">
									<span class="kt-widget4__icon">
										<i class="flaticon2-file kt-font-success"></i>
									</span>	
									<a href="#" class="kt-widget4__title kt-widget4__title--light">
										Metronic React version is in progress.
									</a> 		
									<span class="kt-widget4__number kt-font-success">+13%</span>
								</div>
							</div>
							<!--end::Widget 12-->
						</div>
					</div>
                    
                    
                    </div>
                    <div class="tab-pane" id="kt_tabs_1_2" role="tabpanel">
                        It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                    </div>
                    <!-- begin:Statistiche -->
                    <div class="tab-pane" id="kt_tabs_1_3" role="tabpanel">
                    	"""),_display_(/*187.23*/views/*187.28*/.html.course_details_stats()),format.raw/*187.56*/("""
                    """),format.raw/*188.21*/("""</div>
                    <!-- end:Statistiche -->
                    <div class="tab-pane" id="kt_tabs_1_4" role="tabpanel">
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and
                    </div>
                    <!-- begin:Membri -->
                    <div class="tab-pane" id="kt_tabs_1_5" role="tabpanel">
               			"""),_display_(/*195.20*/views/*195.25*/.html.course_details_members()),format.raw/*195.55*/("""
                	"""),format.raw/*196.18*/("""</div>
                	<!-- end:Membri -->      
            	<!-- 
                <div class="kt-separator kt-separator--dashed"></div>
				-->
                                    

                     
            </div>
        </div>

        </div>
<!-- end:: Content -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 03 09:56:05 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details.scala.html
                  HASH: 961a4117f6b63d867e28a26b67f71a4569bbd02c
                  MATRIX: 1039->0|9453->8386|9468->8391|9518->8419|9569->8441|10490->9334|10505->9339|10557->9369|10605->9388
                  LINES: 33->1|219->187|219->187|219->187|220->188|227->195|227->195|227->195|228->196
                  -- GENERATED --
              */
          
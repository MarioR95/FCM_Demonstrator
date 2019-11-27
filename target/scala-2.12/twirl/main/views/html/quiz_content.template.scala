
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

object quiz_content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="kt-container  kt-container--fluid  kt-grid__item kt-grid__item--fluid">
	<div class="kt-portlet">
		<div class="kt-portlet__body kt-portlet__body--fit">
			<div class="kt-grid kt-wizard-v3 kt-wizard-v3--white" id="kt_wizard_v3">
				<div class="kt-grid__item">
					<!--begin: Form Wizard Nav -->					
					<div class="kt-wizard-v3__nav">
						<!--doc: Remove "kt-wizard-v3__nav-items--clickable" class and also set 'clickableSteps: false' in the JS init to disable manually clicking step titles -->
						<div class="kt-wizard-v3__nav-items kt-wizard-v3__nav-items--clickable">
							<div class="kt-wizard-v3__nav-item" data-ktwizard-type="step" data-ktwizard-state="current">
								<div class="kt-wizard-v3__nav-body">
									<div class="kt-wizard-v3__nav-label">
										<span>1</span>
										Question
									</div>
									<div class="kt-wizard-v3__nav-bar"></div>
								</div>
							</div>
							<div class="kt-wizard-v3__nav-item" data-ktwizard-type="step" data-ktwizard-state="pending">
								<div class="kt-wizard-v3__nav-body">
									<div class="kt-wizard-v3__nav-label">
										<span>2</span>
										Question
									</div>
									<div class="kt-wizard-v3__nav-bar"></div>
								</div>
							</div>
							<div class="kt-wizard-v3__nav-item" data-ktwizard-type="step" data-ktwizard-state="pending">
								<div class="kt-wizard-v3__nav-body">
									<div class="kt-wizard-v3__nav-label">
										<span>3</span>
										Question
									</div>
									<div class="kt-wizard-v3__nav-bar"></div>
								</div>
							</div>
							<div class="kt-wizard-v3__nav-item" data-ktwizard-type="step" data-ktwizard-state="pending">
								<div class="kt-wizard-v3__nav-body">
									<div class="kt-wizard-v3__nav-label">
										<span>4</span>
										Question
									</div>
									<div class="kt-wizard-v3__nav-bar"></div>
								</div>
							</div>
							<div class="kt-wizard-v3__nav-item" data-ktwizard-type="step" data-ktwizard-state="pending">
								<div class="kt-wizard-v3__nav-body">
									<div class="kt-wizard-v3__nav-label">
										<span>5</span>
										Question
									</div>
									<div class="kt-wizard-v3__nav-bar"></div>
								</div>
							</div>
						</div>
					</div>
					<!--end: Form Wizard Nav -->
				</div>
				<div class="kt-grid__item kt-grid__item--fluid kt-wizard-v3__wrapper">
					<!--begin: Form Wizard Form-->
					  <form class="kt-form" id="kt_form"  style="width: 95%"> 
						<!--begin: Form Wizard Step 1-->
						<div class="kt-wizard-v3__content m-0 p-0" data-ktwizard-type="step-content" data-ktwizard-state="current">
							<div class="row">
							    <div class="col-8">
							        <div class="row-fluid" style="width: 90%">
						            	<!-- question -->
					            		<div class="kt-section" style="text-align: center;">
											<div class="kt-section__content kt-section__content--border kt-section__content--fit">
												<div class="kt-portlet__body" style="padding: 2%">
													<h5>The domain of a function like this \[h(x,y) = f(x)g(y)\] is:</h5>
												</div>
											</div>
										</div>							 						            						
							        </div>
							        <div class="row-fluid" style="width: 90%">
          									<div class="kt-portlet__body">
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content kt-section__content--border kt-section__content--fit">
													<!--begin: Grid Nav -->
													<div class="kt-grid-nav kt-grid-nav--skin-light">
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "1a" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">a. </span>
																<span class="kt-grid-nav__desc">The cartesian product between <i>f</i> and <i>g</i> domains</span>
															</a>
															<a href="javascript:void(0);"  id= "1b" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">b. </span>
																<span class="kt-grid-nav__desc">The union between <i>f</i> and <i>g</i> domains</span>
															</a>
														</div>
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "1c" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">c. </span>
																<span class="kt-grid-nav__desc">The intersection between <i>f</i> and <i>g</i> domains</span>
															</a>
															<a href="javascript:void(0);"  id= "1d" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">d. </span>
																<span class="kt-grid-nav__desc">The difference between <i>f</i> and <i>g</i> domains</span>
															</a>
														</div>
													</div>
													<!--end: Grid Nav -->
												</div>
											</div>
											<!--end::Section-->						
											</div>
								        </div>
								    </div>
						    	<div class="col-4">
							      	<div class="kt-section"  style="height: 98%">
										<div class="kt-section__content kt-section__content--border kt-section__content--fit" style="height: 90%">
											<div class="kt-portlet__body" style="padding: 2%">
												<div id="feedback_1" class="kt-wizard-v3__nav-label p-2"><h5>Feedback</h5><hr></div>
											</div>
										</div>
									</div>
							    </div>		   
							</div>		
						</div>
						<!--end: Form Wizard Step 1-->
	
						<!--begin: Form Wizard Step 2-->
						<div class="kt-wizard-v3__content m-0 p-0" data-ktwizard-type="step-content">
							<div class="row">
							    <div class="col-8">
							        <div class="row-fluid" style="width: 90%">
						            	<!-- question -->
					            		<div class="kt-section" style="text-align: center;">
											<div class="kt-section__content kt-section__content--border kt-section__content--fit">
												<div class="kt-portlet__body" style="padding: 2%">
													<h5>Level curves of this function \[f(x,y) = log⁡(x^2-y^2)\] are:</h5>
												</div>
											</div>
										</div>							 						            						
							        </div>
							        <div class="row-fluid" style="width: 90%">
          									<div class="kt-portlet__body">
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content kt-section__content--border kt-section__content--fit">
													<!--begin: Grid Nav -->
													<div class="kt-grid-nav kt-grid-nav--skin-light">
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "2a" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">a. </span>
																<span class="kt-grid-nav__desc">Hyperbolas</span>
															</a>
															<a href="javascript:void(0);"  id= "2b" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">b. </span>
																<span class="kt-grid-nav__desc">Parabolas</span>
															</a>
														</div>
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "2c" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">c. </span>
																<span class="kt-grid-nav__desc">Circumferences</span>
															</a>
															<a href="javascript:void(0);"  id= "2d" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">d. </span>
																<span class="kt-grid-nav__desc">Straight lines</span>
															</a>
														</div>
													</div>
													<!--end: Grid Nav -->
												</div>
											</div>
											<!--end::Section-->						
											</div>
								        </div>
								    </div>
						    	<div class="col-4">
							      	<div class="kt-section"  style="height: 98%">
										<div class="kt-section__content kt-section__content--border kt-section__content--fit" style="height: 90%">
											<div class="kt-portlet__body" style="padding: 2%">
												<div id="feedback_2" class="kt-wizard-v3__nav-label"><h4>Feedback</h4><hr></div>
											</div>
										</div>
									</div>
							    </div>		   
							</div>		
						</div>
						<!--end: Form Wizard Step 2-->
	
						<!--begin: Form Wizard Step 3-->
						<div class="kt-wizard-v3__content m-0 p-0" data-ktwizard-type="step-content">
							<div class="row">
							    <div class="col-8">
							        <div class="row-fluid" style="width: 90%">
						            	<!-- question -->
					            		<div class="kt-section" style="text-align: center;">
											<div class="kt-section__content kt-section__content--border kt-section__content--fit">
												<div class="kt-portlet__body" style="padding: 2%">
													<h5>Which plot correctly represents this function \[ """),format.raw/*211.67*/("""{"""),format.raw/*211.68*/("""x^2 \over 4"""),format.raw/*211.79*/("""}"""),format.raw/*211.80*/(""" """),format.raw/*211.81*/("""+ """),format.raw/*211.83*/("""{"""),format.raw/*211.84*/("""y^2 \over 4"""),format.raw/*211.95*/("""}"""),format.raw/*211.96*/(""" """),format.raw/*211.97*/("""+ """),format.raw/*211.99*/("""{"""),format.raw/*211.100*/("""z^2 \over 9"""),format.raw/*211.111*/("""}"""),format.raw/*211.112*/(""" """),format.raw/*211.113*/("""= 1 \] ?</h5>
												</div>
											</div>
										</div>							 						            						
							        </div>
							        <div class="row-fluid" style="width: 90%">
          									<div class="kt-portlet__body">
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content kt-section__content--border kt-section__content--fit">
													<!--begin: Grid Nav -->
													<div class="kt-grid-nav kt-grid-nav--skin-light">
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "3a" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">a. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/3a.png" width="250"></span>
															</a>
															<a href="javascript:void(0);"  id= "3b" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">b. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/3b.png" width="250"></span>
															</a>
														</div>
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "3c" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">c. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/3c.png" width="250"></span>
															</a>
															<a href="javascript:void(0);"  id= "3d" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">d. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/3d.png" width="250"></span>
															</a>
														</div>
													</div>
													<!--end: Grid Nav -->
												</div>
											</div>
											<!--end::Section-->						
											</div>
								        </div>
								    </div>
						    	<div class="col-4">
							      	<div class="kt-section"  style="height: 98%">
										<div class="kt-section__content kt-section__content--border kt-section__content--fit" style="height: 94%">
											<div class="kt-portlet__body" style="padding: 2%">
												<div id="feedback_3" class="kt-wizard-v3__nav-label"><h4>Feedback</h4><hr></div>
											</div>
										</div>
									</div>
							    </div>		   
							</div>		
						</div>
						<!--end: Form Wizard Step 3-->
	
						<!--begin: Form Wizard Step 4-->
						<div class="kt-wizard-v3__content m-0 p-0" data-ktwizard-type="step-content">
							<div class="row">
							    <div class="col-8">
							        <div class="row-fluid" style="width: 90%">
						            	<!-- question -->
					            		<div class="kt-section" style="text-align: center;">
											<div class="kt-section__content kt-section__content--border kt-section__content--fit">
												<div class="kt-portlet__body" style="padding: 2%">
													<h5>Which plot correctly represents level curves of this function \[ f(x,y) = e^"""),format.raw/*281.94*/("""{"""),format.raw/*281.95*/("""(x^2 + y^2)"""),format.raw/*281.106*/("""}"""),format.raw/*281.107*/(""" """),format.raw/*281.108*/("""\] ?</h5>
												</div>
											</div>
										</div>							 						            						
							        </div>
							        <div class="row-fluid" style="width: 90%">
          									<div class="kt-portlet__body">
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content kt-section__content--border kt-section__content--fit">
													<!--begin: Grid Nav -->
													<div class="kt-grid-nav kt-grid-nav--skin-light">
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "4a" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">a. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/4a.png"></span>
															</a>
															<a href="javascript:void(0);"  id= "4b" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">b. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/4b.png"></span>
															</a>
														</div>
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "4c" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">c. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/4c.png"></span>
															</a>
															<a href="javascript:void(0);"  id= "4d" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">d. </span>
																<span class="kt-grid-nav__desc"><img src="assets/contents/mathematical-analysis-II/quiz/4d.png"></span>
															</a>
														</div>
													</div>
													<!--end: Grid Nav -->
												</div>
											</div>
											<!--end::Section-->						
											</div>
								        </div>
								    </div>
						    	<div class="col-4">
							      	<div class="kt-section"  style="height: 98%">
										<div class="kt-section__content kt-section__content--border kt-section__content--fit" style="height: 94%">
											<div class="kt-portlet__body" style="padding: 2%">
												<div id="feedback_4" class="kt-wizard-v3__nav-label"><h4>Feedback</h4><hr></div>
											</div>
										</div>
									</div>
							    </div>		   
							</div>		
						</div>
						<!--end: Form Wizard Step 4-->
	
						<!--begin: Form Wizard Step 5-->
						<div class="kt-wizard-v3__content m-0 p-0" data-ktwizard-type="step-content">
														<div class="row">
							    <div class="col-8">
							        <div class="row-fluid" style="width: 90%">
						            	<!-- question -->
					            		<div class="kt-section" style="text-align: center;">
											<div class="kt-section__content kt-section__content--border kt-section__content--fit">
												<div class="kt-portlet__body" style="padding: 2%">
													<h5>This function \[f(x,y) = \sqrt"""),format.raw/*351.48*/("""{"""),format.raw/*351.49*/("""(x^2 + y^2 + 1)"""),format.raw/*351.64*/("""}"""),format.raw/*351.65*/("""\]  has: </h5>
												</div>
											</div>
										</div>							 						            						
							        </div>
							        <div class="row-fluid" style="width: 90%">
          									<div class="kt-portlet__body">
											<!--begin::Section-->
											<div class="kt-section">
												<div class="kt-section__content kt-section__content--border kt-section__content--fit">
													<!--begin: Grid Nav -->
													<div class="kt-grid-nav kt-grid-nav--skin-light">
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "5a" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">a. </span>
																<span class="kt-grid-nav__desc">Absolute minimum in A(0,0,0)</span>
															</a>
															<a href="javascript:void(0);"  id= "5b" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">b. </span>
																<span class="kt-grid-nav__desc">Absolute maximum in A(0,0,1)</span>
															</a>
														</div>
														<div class="kt-grid-nav__row">
															<a href="javascript:void(0);"  id= "5c" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">c. </span>
																<span class="kt-grid-nav__desc">Absolute minimum in A(0,0,1)</span>
															</a>
															<a href="javascript:void(0);"  id= "5d" class="kt-grid-nav__item">
																<span class="kt-grid-nav__icon">
																</span>
																<span class="kt-grid-nav__title" style="display: inline-block; float: left; padding-left: 2%">d. </span>
																<span class="kt-grid-nav__desc">Saddle point in A(0,0,0)</span>
															</a>
														</div>
													</div>
													<!--end: Grid Nav -->
												</div>
											</div>
											<!--end::Section-->						
											</div>
								        </div>
								    </div>
						    	<div class="col-4">
							      	<div class="kt-section"  style="height: 98%">
										<div class="kt-section__content kt-section__content--border kt-section__content--fit" style="height: 90%">
											<div class="kt-portlet__body" style="padding: 2%">
												<div id="feedback_5" class="kt-wizard-v3__nav-label"><h4>Feedback</h4><hr></div>
											</div>
										</div>
									</div>
							    </div>		   
							</div>		
						</div>
						<!--end: Form Wizard Step 5-->
	
						<!--begin: Form Actions -->
						<div class="kt-form__actions m-2">
							<button class="btn btn-secondary btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u" data-ktwizard-type="action-prev">
								Previous
							</button>
							<button class="btn btn-success btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u" data-ktwizard-type="action-submit">
								Submit
							</button> 
							<button class="btn btn-brand btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u" data-ktwizard-type="action-next">
								Next Step
							</button>
						</div>
						<!--end: Form Actions -->
					</form>
					<!--end: Form Wizard Form-->
				</div>
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
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/quiz_content.scala.html
                  HASH: d5f35b9467da18d4d955bd152436fe832701c7cd
                  MATRIX: 1037->0|11256->10190|11286->10191|11326->10202|11356->10203|11386->10204|11417->10206|11447->10207|11487->10218|11517->10219|11547->10220|11578->10222|11609->10223|11650->10234|11681->10235|11712->10236|15447->13942|15477->13943|15518->13954|15549->13955|15580->13956|19224->17571|19254->17572|19298->17587|19328->17588
                  LINES: 33->1|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|243->211|313->281|313->281|313->281|313->281|313->281|383->351|383->351|383->351|383->351
                  -- GENERATED --
              */
          
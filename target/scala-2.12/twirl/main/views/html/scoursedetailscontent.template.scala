
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
	                    	<!-- TODO -->
								
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
																						<a class='dropdown-item' href='/loadContents?contentType=pdf&topic=functions_sev_var'><i class="fas fa-book-reader"></i>Learn</a>
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
																						<a class='dropdown-item' href='/loadContents?contentType=pdf&topic=critical_points'><i class="fas fa-book-reader"></i> Read</a>
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
																						<a class='dropdown-item' href="/loadContents?contentType=ar&topic=chapter3"><i class="fas fa-qrcode"></i>Learn</a>
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
																	  	<div class="progress-bar bg-success" role="progressbar" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
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
				"""),
format.raw("""												    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
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
																				<span id="status-topic1" class="kt-badge kt-badge--inline kt-badge--success">Completed</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Assignment</span>
																				<span class="kt-widget11__sub">Quiz - Function of two variables</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='loadContents?contentType=assignment&topic=functions_sev_var'><i class="fas fa-question"></i> Do quiz!</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		<tr>
																			<td>
																				<span id="status-topic2" class="kt-badge kt-badge--inline kt-badge--success">Completed</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Assignment</span>
																				<span class="kt-widget11__sub">Quiz - Critical Points</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='loadContents?contentType=assignment&topic=critical_points'><i class="fas fa-question"></i> Do Quiz!</a>
																					</div>
																				</div>
																			</td>
																		</tr>
																		<tr>
																			<td>
																				<span id="status-quiz" class="kt-badge kt-badge--inline kt-badge--info">Uncompleted</span>
																			</td>
																			<td>
																				<span class="kt-widget11__title">Quiz</span>
																				<span class="kt-widget11__sub">Test your knowledges about this chapter</span>
																			</td>
																			<td>-</td>
																			<td>
																				<div class='dropdown dropright'>
																					<button id="quiz-btn" type='button' class='btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false' disabled>
																						<i class='flaticon-more-1'></i>
																					</button>
																					<div class='dropdown-menu dropdown-menu-left' x-placement='top-start' style='position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);'>
																						<a class='dropdown-item' href='/loadContents?contentType=quiz&topic=chapter3' ><i class="fas fa-question"></i> Do Quiz!</a>
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
		
		$(document).ready(function()"""),format.raw/*577.31*/("""{"""),format.raw/*577.32*/("""
			"""),format.raw/*578.4*/("""//Update the completation perc. of the chapter
			var percentage= 0;
			var classColor= "";
			var topic1, topic2, quiz;
			topic1= $("#status-topic1").text();
			topic2= $("#status-topic2").text();
			quiz= $("#status-quiz").text();
			
			
			if(topic1 == "Uncompleted" && topic2 == "Completed" || topic1 == "Completed" && topic2 == "Uncompleted")"""),format.raw/*587.108*/("""{"""),format.raw/*587.109*/("""
				"""),format.raw/*588.5*/("""percentage = 35;
				classColor="bg-danger";
			"""),format.raw/*590.4*/("""}"""),format.raw/*590.5*/("""
			"""),format.raw/*591.4*/("""else if(topic1 == "Completed" && topic2 == "Completed")"""),format.raw/*591.59*/("""{"""),format.raw/*591.60*/("""
				"""),format.raw/*592.5*/("""percentage = 70;
				classColor="bg-warning";
				$("#status-quiz").html("Uncompleted");
				$("#quiz-btn").removeAttr("disabled");
				
				$("#status-quiz").removeClass("kt-badge--danger");
				$("#status-quiz").addClass("kt-badge--info");
				//DO A REQUEST CALL TO STORE THIS CHANGE INTO DB
				
			"""),format.raw/*601.4*/("""}"""),format.raw/*601.5*/("""else if(topic1 == "Completed" && topic2 == "Completed" && quiz == "Completed")"""),format.raw/*601.83*/("""{"""),format.raw/*601.84*/("""
				"""),format.raw/*602.5*/("""classColor="bg-success";
				percentage == 100;
			"""),format.raw/*604.4*/("""}"""),format.raw/*604.5*/("""
			
			"""),format.raw/*606.4*/("""$("#chap3-progresses").empty();
			
			$("#chap3-progresses").html(
				"<div class='progress-bar "+classColor+"' role='progressbar' style='width: "+percentage+"%;' aria-valuenow='"+percentage+"' aria-valuemin='0' aria-valuemax='100'>"+percentage+"%</div>"
			);
		"""),format.raw/*611.3*/("""}"""),format.raw/*611.4*/(""");
					
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
                  DATE: Wed Dec 04 12:04:39 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/scoursedetailscontent.scala.html
                  HASH: 7b51c8febe7ebe91076d5534bc168130f2978fd6
                  MATRIX: 976->1|1097->27|1125->29|2896->1773|2909->1777|2942->1789|32811->31609|32841->31610|32874->31615|33262->31973|33293->31974|33327->31980|33405->32030|33434->32031|33467->32036|33551->32091|33581->32092|33615->32098|33955->32410|33984->32411|34091->32489|34121->32490|34155->32496|34236->32549|34265->32550|34303->32560|34601->32830|34630->32831
                  LINES: 28->1|33->1|34->2|66->34|66->34|66->34|610->577|610->577|611->578|620->587|620->587|621->588|623->590|623->590|624->591|624->591|624->591|625->592|634->601|634->601|634->601|634->601|635->602|637->604|637->604|639->606|644->611|644->611
                  -- GENERATED --
              */
          
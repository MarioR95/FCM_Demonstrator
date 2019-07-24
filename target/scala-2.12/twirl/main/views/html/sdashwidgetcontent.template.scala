
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

object sdashwidgetcontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<div class="kt-content kt-grid__item kt-grid__item--fluid"
	id="kt_content" style="padding: 0;">
	<div
		class="kt-container  kt-container--fluid  kt-grid__item kt-grid__item--fluid">
		<!--Begin::Section-->
		<div class="row">
			<div class="col-xl-12">
				<!--begin:: Widgets/Applications/User/Profile3-->
				<div class="kt-portlet kt-portlet--height-fluid">
					<div class="kt-portlet__body">
						<div class="kt-widget kt-widget--user-profile-3">
							<div class="kt-widget__top">
								<div class="kt-widget__media kt-hidden-">
									<img src="assets/images/users/100_1.jpg" alt="image">
								</div>
								<div
									class="kt-widget__pic kt-widget__pic--danger kt-font-danger kt-font-boldest kt-font-light kt-hidden">
									JM</div>
								<div class="kt-widget__content">
									<div class="kt-widget__head">
										<a href="#" class="kt-widget__username"> """),_display_(/*22.53*/user/*22.57*/.getName()),format.raw/*22.67*/("""
											"""),_display_(/*23.13*/user/*23.17*/.getSurname()),format.raw/*23.30*/(""" """),format.raw/*23.31*/("""<i class="flaticon2-correct"></i>
										</a>
									</div>

									<div class="kt-widget__subhead">
										<a href="#"><i class="flaticon2-new-email"></i>"""),_display_(/*28.59*/user/*28.63*/.getEmail()),format.raw/*28.74*/("""</a>
									</div>

									<div class="kt-widget__info">
										<div class="kt-widget__desc">
											I distinguish three main text objektive could be merely to
											inform people. <br> A second could be persuade
											people.You want people to bay objective
										</div>
										<div class="kt-widget__progress">
											<div class="kt-widget__text">Progress</div>
											<div class="progress" style="height: 5px; width: 100%;">
												<div class="progress-bar kt-bg-warning" role="progressbar"
													style="width: 33%;" aria-valuenow="10" aria-valuemin="0"
													aria-valuemax="100"></div>
											</div>
											<div class="kt-widget__stats">33%</div>
										</div>
									</div>
								</div>
							</div>
							<div class="kt-widget__bottom">
								<div class="kt-widget__item">
									<div class="kt-widget__icon">
										<i class="flaticon-edit-1"></i>
									</div>
									<div class="kt-widget__details">
										<span class="kt-widget__title">Courses</span> <span
											class="kt-widget__value">4</span>
									</div>
								</div>

								<div class="kt-widget__item">
									<div class="kt-widget__icon">
										<i class="flaticon-presentation-1"></i>
									</div>
									<div class="kt-widget__details">
										<span class="kt-widget__title">Lessons</span> <span
											class="kt-widget__value">33</span>
									</div>
								</div>

								<div class="kt-widget__item">
									<div class="kt-widget__icon">
										<i class="flaticon-questions-circular-button"></i>
									</div>
									<div class="kt-widget__details">
										<span class="kt-widget__title">Quiz</span> <span
											class="kt-widget__value">22</span>
									</div>
								</div>

								<div class="kt-widget__item">
									<div class="kt-widget__icon">
										<i class="flaticon-file-2"></i>
									</div>
									<div class="kt-widget__details">
										<span class="kt-widget__title">Tasks</span> <span
											class="kt-widget__value">18</span>
									</div>
								</div>

								<div class="kt-widget__item">
									<div class="kt-widget__icon">
										<i class="flaticon-chat-1"></i>
									</div>
									<div class="kt-widget__details">
										<span class="kt-widget__title">Comments</span> <span
											class="kt-widget__value">48</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--end:: Widgets/Applications/User/Profile3-->
			</div>
		</div>
		<!--End::Section-->

		<!--Begin::Section-->
		<div class="row">
			<div class="kt-portlet">
				<div class="kt-portlet__body  kt-portlet__body--fit">
					<div class="row row-no-padding row-col-separator-xl">
						<div class="col-xl-4">
							<!--begin:: Widgets/Daily Sales-->
							<div class="kt-portlet kt-portlet--height-fluid">
								<div class="kt-widget14">
									<div class="kt-widget14__header kt-margin-b-30">
										<h3 class="kt-widget14__title">Courses progress</h3>
									</div>
									<div class="kt-widget14__chart" style="height: 120px;">
									
										<canvas id="kt_courses_progress"
											style="display: block; width: 485px; height: 120px;"
											width="485" height="120" class="chartjs-render-monitor"></canvas>
									</div>
								</div>
							</div>
							<!--end:: Widgets/Daily Sales-->
						</div>
						<div class="col-xl-4">
							<!--begin:: Widgets/Profit Share-->
							<div class="kt-portlet kt-portlet--height-fluid">
								<div class="kt-widget14">
									<div class="kt-widget14__header">
										<h3 class="kt-widget14__title">Forum Activities</h3>
									</div>	 
									<div class="kt-widget14__content">	
										<div class="kt-widget14__chart"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
											<div class="kt-widget14__stat"></div>
											<canvas id="kt_forum_activities" style="height: 140px; width: 140px; display: block;" width="140" height="140" class="chartjs-render-monitor"></canvas>
										</div> 
										<div class="kt-widget14__legends">
											<div class="kt-widget14__legend">
												<span class="kt-widget14__bullet kt-bg-success"></span>
												<span class="kt-widget14__stats">55% Posts Replied</span>
											</div>
											<div class="kt-widget14__legend">
												<span class="kt-widget14__bullet kt-bg-danger"></span>
												<span class="kt-widget14__stats">17% Onw Posts Liked</span>
											</div>
											<div class="kt-widget14__legend">
												<span class="kt-widget14__bullet kt-bg-brand"></span>
												<span class="kt-widget14__stats">28% Own Posts Shared</span>
											</div>
										</div>			
									</div> 
								</div>
							</div>
							<!--end:: Widgets/Profit Share-->
						</div>
						<div class="col-xl-4">
							<!--begin:: Widgets/Revenue Change-->
							<div class="kt-portlet kt-portlet--height-fluid">
								<div class="kt-widget14">
									<div class="kt-widget14__header kt-margin-b-30">
										<h3 class="kt-widget14__title">Courses Average Score</h3>
									</div>
									<div class="kt-widget14__chart" style="height: 120px;">
									
										<canvas id="kt_courses_score"
											style="display: block; width: 485px; height: 120px;"
											width="485" height="120" class="chartjs-render-monitor"></canvas>
									</div>
								</div>
							</div>
							<!--end:: Widgets/Revenue Change-->
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--End::Section-->

		<!--Begin::Section-->
		<div class="row">
			<div class="col-xl-6">
				<!--begin:: Widgets/Download Files-->
				<div class="kt-portlet kt-portlet--height-fluid">
					<div class="kt-portlet__head">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">Download Files</h3>
						</div>
						<div class="kt-portlet__head-toolbar">
							<ul class="nav nav-tabs nav-tabs-bold nav-tabs-line nav-tabs-line-brand  nav-tabs-line-right nav-tabs-line-brand" role="tablist">
								<li class="nav-item dropdown">
			                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
			                          	Courses
			                        </a>
			                        <div class="dropdown-menu dropdown-menu-right" x-placement="bottom-end" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-91px, 59px, 0px);">
			                            <a class="dropdown-item disabled">Courses</a>
			                            <a class="dropdown-item" data-toggle="tab" href="#kt_portlet_tab_3_1">Algorithm</a>
			                            <a class="dropdown-item" data-toggle="tab" href="#kt_portlet_tab_3_2">Data Structures</a>
			                        </div>
			                    </li>
							</ul>
						</div>
					</div>
					<div class="kt-portlet__body">
							<div class="tab-content">
							<div class="tab-pane active" id="kt_portlet_tab_3_1">
								<div class="kt-widget4">
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">History of Algorithms</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Complexity and annotations
										</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Divide et impera</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/javascript.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Divide et impera exercise</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/zip.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Sort algorithms implementation</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
								</div>
							</div>
							<div class="tab-pane " id="kt_portlet_tab_3_2">
								<div class="kt-widget4">
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Introduction to data structures</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Data structure: List
										</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/javascript.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">List structure implementation</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/pdf.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Data structure: Queue</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
		
									<div class="kt-widget4__item">
										<div class="kt-widget4__pic kt-widget4__pic--icon">
											<img src="assets/images/files/javascript.svg" alt="">
										</div>
										<a href="#" class="kt-widget4__title">Queue structure implementation</a>
										<div class="kt-widget4__tools">
											<a href="#" class="btn btn-clean btn-icon btn-sm"> <i
												class="flaticon2-download-symbol-of-down-arrow-in-a-rectangle"></i>
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!--begin::k-widget4-->
						
						<!--end::Widget 9-->
					</div>
				</div>
				<!--end:: Widgets/Download Files-->
			</div>
			<div class="col-xl-6">
				<!--begin:: Widgets/User Progress -->
				<div class="kt-portlet kt-portlet--height-fluid">
					<div class="kt-portlet__head">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">User Progress</h3>
						</div>
						<div class="kt-portlet__head-toolbar">
							<ul class="nav nav-tabs nav-tabs-bold nav-tabs-line nav-tabs-line-brand  nav-tabs-line-right nav-tabs-line-brand" role="tablist">
								<li class="nav-item dropdown">
			                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
			                          	Courses
			                        </a>
			                        <div class="dropdown-menu dropdown-menu-right" x-placement="bottom-end" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-91px, 59px, 0px);">
			                            <a class="dropdown-item disabled">Courses</a>
			                            <a class="dropdown-item" data-toggle="tab" href="#kt_portlet_tab_3_3">Algorithm</a>
			                            <a class="dropdown-item" data-toggle="tab" href="#kt_portlet_tab_3_4">Data Structures</a>
			                        </div>
			                    </li>
							</ul>
						</div>
					</div>
					<div class="kt-portlet__body">
						<div class="tab-content">
							<div class="tab-pane active" id="kt_portlet_tab_3_3">
								<div class="kt-widget31">
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
										
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Quiz</a>
												<p class="kt-widget31__text">Complexity and annotations : Basic
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>100%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-success" role="progressbar"
														style="width: 100%" aria-valuenow="100" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>

									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Delivery</a>
												<p class="kt-widget31__text">Deliver the solution for the given problem
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>50%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-warning" role="progressbar"
														style="width: 50%" aria-valuenow="50" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Quiz</a>
												<p class="kt-widget31__text">Complexity and annotations: Advanded
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>0%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-light" role="progressbar"
														style="width: 0%" aria-valuenow="55" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Delivery</a>
												<p class="kt-widget31__text">Show in details the complexity analysis of<br>a studied algorithm
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>0%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-light" role="progressbar"
														style="width: 0%" aria-valuenow="55" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
								</div>
							</div>
							<div class="tab-pane" id="kt_portlet_tab_3_4">
								<div class="kt-widget31">
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
										
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Quiz</a>
												<p class="kt-widget31__text">Type of Data Structures
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>100%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-success" role="progressbar"
														style="width: 100%" aria-valuenow="100" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>

									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Delivery</a>
												<p class="kt-widget31__text">Build Data Structure: List
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>25%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-danger" role="progressbar"
														style="width: 25%" aria-valuenow="25" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Delivery</a>
												<p class="kt-widget31__text">Build Data Structure: Queue
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>0%</span>
												<"""),
format.raw("""/a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-light" role="progressbar"
														style="width: 0%" aria-valuenow="55" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
									<div class="kt-widget31__item">
										<div class="kt-widget31__content">
											<div class="kt-widget31__info">
												<a href="#" class="kt-widget31__username">Quiz</a>
												<p class="kt-widget31__text">List and Queue
												</p>
											</div>
										</div>

										<div class="kt-widget31__content">
											<div class="kt-widget31__progress">
												<a href="#" class="kt-widget31__stats"> <span>100%</span>
												</a>
												<div class="progress progress-sm">
													<div class="progress-bar bg-success" role="progressbar"
														style="width: 100%" aria-valuenow="100" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--end:: Widgets/User Progress -->
			</div>
		</div>
		<!--End::Section-->

		<!--Begin::Section-->
		<div class="row">
			<div class="col-xl-6">
				<!--begin:: Widgets/Last Updates-->
				<div class="kt-portlet kt-portlet--height-fluid">
					<div class="kt-portlet__head">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">Feedback</h3>
						</div>
					</div>
					<div class="kt-portlet__body">
						<!--begin::widget 12-->
						<div class="kt-widget4">
							<div class="kt-widget4__item">
								<span class="kt-widget4__icon">
									<i class="fas fa-rocket kt-font-success"></i>
								</span>
								<a href="#" class="kt-widget4__title kt-widget4__title--light">
									<span
									class="kt-widget4__number kt-font-dark">19/07/2019</span> Congratulations! You did a great job with the <i>Complexity and annotations : Basic</i> Quiz.
								</a>
								<div class="dropdown dropright">
									<button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
										<i class="flaticon-more-1"></i>
									</button>
									<div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
										<a class="dropdown-item" href="#"><i class="fas fa-search"></i> View</a>
									</div>
								</div>
							</div>
							<div class="kt-widget4__item">
								<span class="kt-widget4__icon">
									<i class="fas fa-thumbs-up kt-font-brand"></i>
								</span>
								<a href="#" class="kt-widget4__title kt-widget4__title--light">
									<span
									class="kt-widget4__number kt-font-dark">20/07/2019</span> Your work with the <i>C Programming</i> course is amazing, maybe you are interested to improve yourself with the new materials in your course page. 
								</a>
								<div class="dropdown dropright">
									<button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
										<i class="flaticon-more-1"></i>
									</button>
									<div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
										<a class="dropdown-item" href="#"><i class="fas fa-search"></i> View</a>
									</div>
								</div>
							</div>
							<div class="kt-widget4__item">
								<span class="kt-widget4__icon">
									<i class="fas fa-bell kt-font-warning"></i>
								</span>
								<a href="#" class="kt-widget4__title kt-widget4__title--light">
									<span class="kt-widget4__number kt-font-dark">22/07/2019</span> Your last quiz was not so good. Let's try to study again the section <i>Dynamic Programming</i> in your <i>Algorithm</i> course. 
								</a>
								<div class="dropdown dropright">
									<button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
										<i class="flaticon-more-1"></i>
									</button>
									<div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
										<a class="dropdown-item" href="#"><i class="fas fa-search"></i> View</a>
									</div>
								</div>
							</div>
							<div class="kt-widget4__item">
								<span class="kt-widget4__icon">
									<i class="fas fa-exclamation-triangle kt-font-danger"></i>
								</span>
								<a href="#" class="kt-widget4__title kt-widget4__title--light">
									<span
									class="kt-widget4__number kt-font-dark">24/07/2019</span> Somethings went wrong with your last quizzes. We suggest to contact your teacher via the chat. 
								</a>
								<div class="dropdown dropright">
									<button type="button" class="btn btn-hover-info btn-elevate-hover btn-icon btn-sm btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
										<i class="flaticon-more-1"></i>
									</button>
									<div class="dropdown-menu dropdown-menu-left" x-placement="top-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(-149px, 33px, 0px);">
										<a class="dropdown-item" href="#"><i class="fas fa-comments"></i> Chat</a>
									</div>
								</div>
							</div>
						</div>
						<!--end::Widget 12-->
					</div>
				</div>
				<!--end:: Widgets/Last Updates-->
			</div>
			<div class="col-xl-6">
				<!--begin:: Widgets/Notifications-->
				<div class="kt-portlet kt-portlet--height-fluid">
					<div class="kt-portlet__head">
						<div class="kt-portlet__head-label">
							<h3 class="kt-portlet__head-title">Notifications</h3>
						</div>
					</div>
					<div class="kt-portlet__body">
						<div class="tab-content">
								<div class="kt-notification">
									<a href="#" class="kt-notification__item">
										<div class="kt-notification__item-icon">
											<i class="fas fa-book-open kt-font-warning"></i>
										</div>
										<div class="kt-notification__item-details">
											<div class="kt-notification__item-title">New content in Algorithm course.</div>
											<div class="kt-notification__item-time">2 hrs ago</div>
										</div>
									</a> <a href="#" class="kt-notification__item">
										<div class="kt-notification__item-icon">
											<i class="fas fa-book-open kt-font-warning"></i>
										</div>
										<div class="kt-notification__item-details">
											<div class="kt-notification__item-title">There are new assignment available in Data Structure course.</div>
											<div class="kt-notification__item-time">3 hrs ago</div>
										</div>
									</a> <a href="#" class="kt-notification__item">
										<div class="kt-notification__item-icon">
											<i class="fas fa-users kt-font-success"></i>
										</div>
										<div class="kt-notification__item-details">
											<div class="kt-notification__item-title">4 people shared your post.</div>
											<div class="kt-notification__item-time">3 hrs ago</div>
										</div>
									</a> <a href="#" class="kt-notification__item">
										<div class="kt-notification__item-icon">
											<i class="fas fa-comment-alt kt-font-danger"></i>
										</div>
										<div class="kt-notification__item-details">
											<div class="kt-notification__item-title">Teacher sent you a message</div>
											<div class="kt-notification__item-time">5 hrs ago</div>
										</div>
									</a> 
								</div>
						
						</div>
					</div>
				</div>
				<!--end:: Widgets/Notifications-->
			</div>
		</div>
		<!--End::Section-->
	</div>
</div>

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
                  DATE: Wed Jul 24 15:16:54 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/sdashwidgetcontent.scala.html
                  HASH: 2c33affd2cb5ed9131e65e412cf911fed2c7d270
                  MATRIX: 973->1|1094->27|1122->29|2062->942|2075->946|2106->956|2147->970|2160->974|2194->987|2223->988|2421->1159|2434->1163|2466->1174
                  LINES: 28->1|33->1|34->2|54->22|54->22|54->22|55->23|55->23|55->23|55->23|60->28|60->28|60->28
                  -- GENERATED --
              */
          
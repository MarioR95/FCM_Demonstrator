
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

object tcoursedetailscontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                  <a class="nav-link" data-toggle="tab" href="#kt_tabs_1_5">
                      <i class="fas fa-users"></i> Membri
                  </a>
              </li>
          </ul>                    

          <div class="tab-content">
          	  <!-- begin: Info -->
              <div class="tab-pane active" id="kt_tabs_1_1" role="tabpanel">
				  	<table class="table table-sm table-head-bg-brand" style="width:30%">
						  	<tbody>
						    	<tr>
							      	<th scope="row"><span class="fa fa-graduation-cap" aria-hidden="true"></span></th>
							      	<td>ALGORITHMS DESIGN</td>
						    	</tr>
						    	<tr>
						      		<th scope="row"><span class="fa fa-star" aria-hidden="true"></span></th>
						      		<td>COMPUTER SCIENCE</td>
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
	           		Obiettivi del corso: 
					<ul>	
						<li>Fornire allo studente metodi e conoscenze atti al progetto di algoritmi efficienti</li>
						<li>Fornire strumenti per l'analisi delle risorse (spazio e tempo) utilizzate da algoritmi</li>
						<li>Fornire un catalogo dei piu' noti ed efficienti algoritmi per problemi computazionali di base (ordinamento, ricerca, ottimizzazione di risorse, etc.)</li>
					</ul>
               </div>
              <!-- end: Info -->
              <!-- begin: Annunci -->
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
              <!-- end: Annunci -->
              <!-- begin: Statistiche -->
			  <div class="tab-pane" id="kt_tabs_1_3" role="tabpanel">
			  	<!-- begin: ActivityPie -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width:30%; height:300px; padding:2%; margin:1% 0.5%; display: inline;float: left;">
					<div class="kt-widget14__header" style="padding:0px">
						<h4 class="kt-widget14__title">
							ACTIVITIES SPENT BY USERS           
						</h4>
					</div>	 
					<div class="kt-widget14__content">	
						<canvas id="kt-activity-chart" class="chartjs-render-monitor" style="width:270px; height:270px; margin: 0 auto;"></canvas>				
					</div>
				</div>		
				<!-- end: ActivityPie -->
				<!-- begin: InteractionChart -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width: 68%; padding: 2%; height:300px; margin:1% 0.5%; float: left;">
					<div class="kt-portlet__head kt-portlet__space-x">
						<div class="kt-widget14__header">
							<h4 class="kt-widget14__title">
								USER INTERACTIONS     
							</h4>
						</div>	 
						
							<a href="#" class="btn btn-label-success btn-sm btn-bold dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="height: 30px">
								WEEK
							</a>
							<div class="dropdown-menu dropdown-menu-fit dropdown-menu-right" x-placement="bottom-end" style="width: 230px; position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(362px, 46px, 0px);">
								<ul class="kt-nav">
								    <li class="kt-nav__item">
								        <a onclick="interaction_plot_1()" class="kt-nav__link">
								            <i class="kt-nav__link-icon flaticon2-line-chart"></i>
								            <span class="kt-nav__link-text">05 Apr 2019 - 11 Apr 2019</span>
								        </a>
								    </li>
								    <li class="kt-nav__item">
								        <a onclick="interaction_plot_2()" class="kt-nav__link">
								            <i class="kt-nav__link-icon flaticon2-line-chart"></i>
								            <span class="kt-nav__link-text">12 Apr 2019 - 18 Apr 2019</span>
								        </a>
								    </li>
								    <li class="kt-nav__item">
								        <a onclick="interaction_plot_3()" class="kt-nav__link">
								            <i class="kt-nav__link-icon flaticon2-line-chart"></i>
								            <span class="kt-nav__link-text">19 Apr 2019 - 25 Apr 2019</span>
								        </a>
								    </li>
								</ul>			
							</div>
					</div>
					<div class="kt-portlet__body kt-portlet__body--fluid" style="margin-top:7%;">
						<div class="kt-widget20">
							<div id="interaction-container" style="height:130px;"><div class="kt-widget20__chart chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
								<canvas id="kt_interactions_chart" width="485" height="162" class="chartjs-render-monitor" style="display: block; height: 200px; width: 500px; margin: 0 auto;"></canvas>
							</div>
						</div>			 
					</div>
				</div>
				<!-- end: InteractionChart --> 	
				<!-- begin: PartecipationProgress -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width: 99%; height:220px; clear:left; padding:2%; margin:0.5%;">
					<div class="kt-widget14__header">
						<h4 class="kt-widget14__title">
							LATEST WEEK PARTECIPATION          
						</h4>
					</div>
					<div class="kt-widget14__content" >	
					<div  style="width:20%; height: 25px; display: inline;float: left; margin: 2%">
						<p>RECENT RESOURCE VIEWES</p>
						<b>Multimedia</b>
					
						<div class="progress" style="height: 25px; margin-top: 15%;">
							<div class="progress-bar" role="progressbar" style="width: 50%; height: 25px; vertical-align: middle; " aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"><h6 style="margin:0">50%</h6></div>
						</div>
					</div>
					<div style="width:20%; height: 25px; display: inline;float: left; margin: 2%">
						<p>RECENT QUIZ ATTEMPT</p>
						<b>Quiz 3</b>
						<div class="progress" style="height: 25px; margin-top: 15%;">
							<div class="progress-bar" role="progressbar" style="width: 100%; height: 25px;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"><h6 style="margin:0">100%</h6></div>
						</div>
					</div>
					<div style="width:20%; height: 25px; display: inline;float: left; margin: 2%">
						<p>RECENT DISCUSSION VIEWS</p>
						<b>MergeSort implementation</b>						
						<div class="progress" style="height: 25px; margin-top: 15%;">
							<div class="progress-bar" role="progressbar" style="width: 34%; height: 25px;" aria-valuenow="34" aria-valuemin="0" aria-valuemax="100"><h6 style="margin:0">34%</h6></div>
						</div>
					</div>
					<div style="width:20%; height: 25px; display: inline;float: left; margin: 2%">
						<p>UPCOMING ASSIGNMENT</p>
						<b>Topic 4</b>
						<div class="progress" style="height: 25px; margin-top: 15%;">
							<div class="progress-bar" role="progressbar" style="width: 79%; height: 25px;" aria-valuenow="79" aria-valuemin="0" aria-valuemax="100"><h6 style="margin:0">79%</h6></div>
						</div>
					</div>
				</div>
				
				</div>
				<!-- end: PartecipationProgress -->
				<!-- begin: AssigmentSummaryTable -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width: 99%; clear:left; padding:2%; margin:1% 0.5% 0 0.5%;">
					<div class="kt-widget14__header">
						<h4 class="kt-widget14__title">
							ASSIGNMENTS SUMMARY          
						</h4>
					</div>
					<div class="kt-widget14__content">
						<table class="table table-striped- table-bordered table-hover table-checkable dataTable no-footer dtr-inline" id="kt_table_1" role="grid" >
							<thead>
							  	<tr role="row">
				                    <th class="sorting_desc" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 38.25px;" aria-sort="descending">Name</th>
				                    <th class="sorting" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 70.25px;" aria-label="Country: activate to sort column ascending">Create Date</th>
				                    <th class="sorting" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 88.25px;" aria-label="Ship City: activate to sort column ascending">Due Date</th>
				                    <th class="sorting" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 109.25px;" aria-label="Ship Address: activate to sort column ascending">Total Submission</th>
				                    <th class="sorting" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 88.25px;" aria-label="Company Agent: activate to sort column ascending">Unic Submission</th>
				                    <th class="sorting" tabindex="0" aria-controls="kt_table_1" rowspan="1" colspan="1" style="width: 41.25px;" aria-label="Ship Date: activate to sort column ascending">Score</th>                    
			                    </tr>
							</thead>
							<tbody>
								<tr role="row" class="odd">
  									<td class="sorting_1"><b>AD I Final</b></td>
  									<td>12 Apr 2019</td>
  									<td>18 Apr 2019</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 50%; height: 20px;" aria-valuenow="27" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">27</h6></div>
										</div>
									</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 30%; height: 20px;" aria-valuenow="18" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">18</h6></div>
										</div>
									</td>
  									<td>0</td>
							  	</tr>
							  	<tr role="row" class="odd">
  									<td class="sorting_1"><b>AD II Final</b></td>
  									<td>19 Apr 2019</td>
  									<td>25 Apr 2019</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 79%; height: 20px;" aria-valuenow="44" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">44</h6></div>
										</div>
									</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 60%; height: 20px;" aria-valuenow="31" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">31</h6></div>
										</div>
									</td>
  									<td>0</td>
							  	</tr>
							  	<tr role="row" class="odd">
  									<td class="sorting_1"><b>MG Impl.</b></td>
  									<td>26 Apr 2019</td>
  									<td>29 Apr 2019</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 19%; height: 20px;" aria-valuenow="10" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">10</h6></div>
										</div>
									</td>
  									<td>
  										<div class="progress" style="height: 20px;">
											<div class="progress-bar" role="progressbar" style="width: 100%; height: 20px;" aria-valuenow="60" aria-valuemin="0" aria-valuemax=""><h6 style="margin:0">60</h6></div>
										</div>
									</td>
  									<td>0</td>
							  	</tr>
						  	</tbody>
						</table>
						<div class="dataTables_paginate paging_simple_numbers" id="kt_table_1_paginate">
							<ul class="pagination">
								<li class="paginate_button page-item previous disabled" id="kt_table_1_previous">
									<a href="#" aria-controls="kt_table_1" data-dt-idx="0" tabindex="0" class="page-link">
										<i class="la la-angle-left"></i>
									</a>
								</li>
								<li class="paginate_button page-item active">
									<a aria-controls="kt_table_1" data-dt-idx="1" tabindex="0" class="page-link">1</a>
								</li>
								<li class="paginate_button page-item next" id="kt_table_1_next">
									<a aria-controls="kt_table_1" data-dt-idx="6" tabindex="0" class="page-link">
										<i class="la la-angle-right"></i>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<!-- end: AssigmentSummaryTable -->
				<!-- begin: ActivityIstogram -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width:59%; height:300px; padding:2%; margin:1% 0.5%; display: inline;float: left;">
					<div class="kt-widget14__header" style="padding:0px">
						<h4 class="kt-widget14__title">
							COURSE INTERACTIONS           
						</h4>
					</div>	 
					<div class="kt-widget14__content">	
						<div id="kt-courseinteractions-plot" style="width: 550px; height: 200px; margin: 0 auto;"></div>
					</div>
				</div>		
				<!-- end: ActivityIstogram -->
				<!-- begin: QuizScoreChart -->
				<div class="kt-portlet kt-portlet--fit kt-portlet--head-noborder kt-portlet--height-fluid-half" style="width: 39%; padding: 2%; height:300px; margin:1% 0.5%; float: left;">
					<div class="kt-portlet__head kt-portlet__space-x">
						<div class="kt-widget14__header">
							<h4 class="kt-widget14__title">
								QUIZ SCORES     
							</h4>
						</div>	 
					</div>
					<div class="kt-portlet__body kt-portlet__body--fluid" style="margin-top:7%;">
						<div class="kt-widget20">
							<div class="kt-widget20__chart" style="height:130px;"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
								<canvas id="kt_quiz_chart" width="485" height="162" class="chartjs-render-monitor" style="display: block; height: 200px; width: 500px; margin: 0 auto;"></canvas>
							</div>
						</div>			 
					</div>
				</div>
				<!-- end: QuizScoreChart --> 	
              </div>
              <!-- end: Statistiche -->
              <!-- begin: Didattica -->
              <div class="tab-pane" id="kt_tabs_1_4" role="tabpanel">
              	<ul>
              		<li>INTRODUZIONE ALLA ANALISI ASINTOTICA DEGLI ALGORITMI</li>
              		<li>LA TECNICA DI PROGETTO DI ALGORITMI DIVIDE ET IMPERA: MERGESORT, QUICKSORT</li>
              		<li>LA TECNICA DI PROGETTO DI ALGORITMI PROGRAMMAZIONE DINAMICA: CALCOLO DI NUMERI DI FIBONACCI, COMBINAZIONI; PROBLEMI DI OTTIMIZZAZIONE: SCHEDULING DI RISORSE, ZAINO INTERO, PROBLEMI SU STRINGHE, CAMMINI MINIMI SU GRAFI.</li>
              		<li>LA TECNICA DI PROGETTO DI ALGORITMI GREEDY E RELATIVI ESEMPI DI APPLICAZIONE: SCHEDULING DI INTERVALLI; SCHEDULING CON DEADLINE; COMPRESSIONE DATI E CODICI DI HUFFMAN.</li>
              		<li>CONNETTIVITA' E VISITA DI GRAFI; DAG E ORDINAMENTO TOPOLOGICO. CALCOLO DI CAMMINI MINIMI (ALGORITMO DI DIJKSTRA). CALCOLO DI ALBERI RICOPRENTI MINIMI (ALGORITMI DI PRIM E KRUSKAL).</li>
              		<li>CALCOLO DI FLUSSO SU GRAFI E LORO APPLICAZIONI</li>
              		<li>ALGORITMI INTELLIGENTI DI RICERCA ESAUSTIVA: BACKTRACKING E BRANCH - AND - BOUND.</li>	
              	</ul>
  
			  </div>
              <!-- end: Didattica -->
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
											  	<tbody id="tbody-members">
											    	
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
          </div>  
       </div>
    </div>		
</div>
	
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
                  DATE: Wed Jul 17 11:23:27 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/tcoursedetailscontent.scala.html
                  HASH: 96bbcbf17dde2878cc92061ccb3c82486a7d4d5b
                  MATRIX: 1046->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
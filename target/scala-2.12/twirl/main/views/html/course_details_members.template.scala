
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

object course_details_members extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="row">
	<div class="col-xl-12">
		<div class="kt-portlet">
			<div class="kt-portlet__body">
				<!--begin::Section-->
				<div class="kt-section">
					<div class="kt-section__content">
						<table class="table">
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
						      		<td>@jhon</td>
						    	</tr>
						    	<tr>
						      		<th scope="row">3</th>
						      		<td>Larry</td>
						      		<td>the Bird</td>
						      		<td>@jhon</td>
						      		<td>@twitter</td>
						      		<td>@jhon</td>
						    	</tr>
						  	</tbody>
						</table>
					</div>
				</div>
				<!--end::Section-->
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
                  DATE: Mon Jun 03 13:57:47 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/course_details_members.scala.html
                  HASH: 8f3375a50c776777715f5688ad7c1af92ee81e33
                  MATRIX: 1047->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
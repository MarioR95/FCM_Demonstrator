
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

object ar_learning_contents extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="row">
	<div class="col-lg-12">
		<div class="kt-portlet kt-portlet--height-fluid">
			<div class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<h5 class="kt-portlet__head-title">
						Quiz
					</h5>
				</div>
			</div>
			<div class="kt-portlet__body kt-portlet__body--fit">
				<!--begin: Datatable -->
				<div class="kt-datatable kt-datatable--default kt-datatable--brand kt-datatable--scroll kt-datatable--loaded" id="kt_datatable_latest_orders">
					<table class="kt-datatable__table" style="display: block; width: 90%; margin: auto;">
						<thead class="kt-datatable__head">
							<tr class="kt-datatable__row" style="left: 0px;">
								<th data-field="Object" data-autohide-disabled="false" class="kt-datatable__cell" style="width:50%;">
									<span>Object</span>
								</th>
								<th data-field="Status" class="kt-datatable__cell kt-datatable__cell--sort" style="text-align: center; width: 25%;">
									<span>Status</span>
								</th>
								<th data-field="Action" data-autohide-disabled="false" class="kt-datatable__cell" style="width:25%; text-align: center;">
									<span>Action</span>
								</th>
							</tr>
						</thead>
						<tbody class="kt-datatable__body ps">
							<tr data-row="0" class="kt-datatable__row" style="left: 0px">
								<td data-field="Object" data-autohide-disabled="false" class="kt-datatable__cell" style="width:50%;">
									<span>
											
											<div class="kt-user-card-v2__details">
												Test your knowledges about function of two variables.
											</div>					
									</span>
								</td>
								<td data-field="Status" class="kt-datatable__cell" style="width:25%; text-align: center;">
									<span>
										<span class="btn btn-bold btn-sm btn-font-sm  btn-label-success">Available</span>
									</span>
								</td>
								<td data-field="Action" class="kt-datatable__cell" style="width:25%; text-align: center">
									<span>
										<a class="kt-user-card-v2__name" href="javascript.void(0)" data-toggle="modal" data-target="#kt_modal_1_5">
											<img alt="photo" src="assets/images/files/qr-code.svg" width="35px" height="35px">
										</a>
									</span>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<!--end: Datatable -->
			</div>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="kt-portlet kt-portlet--height-fluid">
			<div class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<h5 class="kt-portlet__head-title">
						Contents
					</h5>
				</div>
			</div>
			<div class="kt-portlet__body kt-portlet__body--fit">
				<!--begin: Datatable -->
				<div class="kt-datatable kt-datatable--default kt-datatable--brand kt-datatable--scroll kt-datatable--loaded" id="kt_datatable_latest_orders">
					<table class="kt-datatable__table" style="display: block; width: 90%; margin: auto; text-align: center;">
						<thead class="kt-datatable__head">
							<tr class="kt-datatable__row" style="left: 0px;">
								<th data-field="Status" data-autohide-disabled="false" class="kt-datatable__cell" style="width:10%;">
									<span>Status</span>
								</th>
								<th data-field="Name" class="kt-datatable__cell kt-datatable__cell--sort" style="width: 30%;">
									<span>Name</span>
								</th>
								<th data-field="Function" class="kt-datatable__cell kt-datatable__cell--sort" style="width: 15%;">
									<span>Function</span>
								</th>
								<th data-field="Goal" data-autohide-disabled="false" class="kt-datatable__cell" style="width:25%;">
									<span>Goal</span>
								</th>
								<th data-field="Action" data-autohide-disabled="false" class="kt-datatable__cell" style="width:20%;">
									<span>Action</span>
								</th>
							</tr>
						</thead>
						<tbody class="kt-datatable__body ps">
							<tr data-row="0" class="kt-datatable__row" style="left: 0px">
								<td data-field="Status" class="kt-datatable__cell" style="width:10%;">
									<span>
										<span class="btn btn-bold btn-sm btn-font-sm  btn-label-success">Done</span>
									</span>
								</td>
								<td data-field="Name" data-autohide-disabled="false" class="kt-datatable__cell" style="width:30%;">
									<span>
										<div class="kt-user-card-v2__details">
											Elliptic Paraboloid
										</div>					
									</span>
								</td>
								<td data-field="Function" class="kt-datatable__cell" style="width:15%">
							 		<p>\[z = """),format.raw/*107.20*/("""{"""),format.raw/*107.21*/("""{"""),format.raw/*107.22*/("""x^2 \over a^2"""),format.raw/*107.35*/("""}"""),format.raw/*107.36*/(""" """),format.raw/*107.37*/("""+ """),format.raw/*107.39*/("""{"""),format.raw/*107.40*/("""y^2 \over b^2"""),format.raw/*107.53*/("""}"""),format.raw/*107.54*/("""}"""),format.raw/*107.55*/("""\]</p>
								</td>
								<td data-field="Goal" class="kt-datatable__cell" style="width:25%;">
									<span>
										Learn about <i>min</i>, <i>max</i> and <i>level curves</i> concepts.								
									</span>
								</td>
								<td data-field="Action" class="kt-datatable__cell" style="width:20%;">
									<span>
										<a class="kt-user-card-v2__name" href="javascript.void(0)" data-toggle="modal" data-target="#kt_modal_1_1">
											<img alt="photo" src="assets/images/files/qr-code.svg" width="35px" height="35px">
										</a>
									</span>
								</td>
							</tr>
							<tr data-row="1" class="kt-datatable__row" style="left: 0px">
								<td data-field="Status" class="kt-datatable__cell" style="width:10%;">
									<span>
										<span class="btn btn-bold btn-sm btn-font-sm  btn-label-success">Done</span>
									</span>
								</td>
								<td data-field="Name" data-autohide-disabled="false" class="kt-datatable__cell" style="width:30%;">
									<span>
										<div class="kt-user-card-v2__details">
											Hyperbolic Paraboloid
										</div>					
									</span>
								</td>
								<td data-field="Function" class="kt-datatable__cell" style="width:15%">
							 		<p>\[z = """),format.raw/*136.20*/("""{"""),format.raw/*136.21*/("""{"""),format.raw/*136.22*/("""x^2 \over a^2"""),format.raw/*136.35*/("""}"""),format.raw/*136.36*/(""" """),format.raw/*136.37*/("""- """),format.raw/*136.39*/("""{"""),format.raw/*136.40*/("""y^2 \over b^2"""),format.raw/*136.53*/("""}"""),format.raw/*136.54*/("""}"""),format.raw/*136.55*/("""\]</p>
								</td>
								<td data-field="Goal" class="kt-datatable__cell" style="width:25%;">
									<span>
										Learn how is made a <i>seal point</i>.								
									</span>
								</td>
								<td data-field="Action" class="kt-datatable__cell" style="width:20%;">
									<span>
										<a class="kt-user-card-v2__name" href="javascript.void(0)" data-toggle="modal" data-target="#kt_modal_1_2">
											<img alt="photo" src="assets/images/files/qr-code.svg" width="35px" height="35px">
										</a>
									</span>
								</td>
							</tr>
							<tr data-row="2" class="kt-datatable__row" style="left: 0px">
								<td data-field="Status" class="kt-datatable__cell" style="width:10%;">
									<span>
										<span class="btn btn-bold btn-sm btn-font-sm  btn-label-success">Done</span>
									</span>
								</td>
								<td data-field="Name" data-autohide-disabled="false" class="kt-datatable__cell" style="width:30%;">
									<span>
										<div class="kt-user-card-v2__details">
											Ellipsoid
										</div>					
									</span>
								</td>
								<td data-field="Function" class="kt-datatable__cell" style="width:15%">
							 		<p>\["""),format.raw/*165.16*/("""{"""),format.raw/*165.17*/("""{"""),format.raw/*165.18*/("""x^2 \over a^2"""),format.raw/*165.31*/("""}"""),format.raw/*165.32*/(""" """),format.raw/*165.33*/("""+ """),format.raw/*165.35*/("""{"""),format.raw/*165.36*/("""y^2 \over b^2"""),format.raw/*165.49*/("""}"""),format.raw/*165.50*/(""" """),format.raw/*165.51*/("""+ """),format.raw/*165.53*/("""{"""),format.raw/*165.54*/("""z^2 \over c^2"""),format.raw/*165.67*/("""}"""),format.raw/*165.68*/("""}"""),format.raw/*165.69*/(""" """),format.raw/*165.70*/("""= 1\]</p>
								</td>
								<td data-field="Goal" class="kt-datatable__cell" style="width:25%;">
									<span>
										Learn about <i>ellipsoid</i> and relationship between semi-axes.								
									</span>
								</td>
								<td data-field="Action" class="kt-datatable__cell" style="width:20%;">
									<span>
										<a class="kt-user-card-v2__name" href="javascript.void(0)" data-toggle="modal" data-target="#kt_modal_1_3">
											<img alt="photo" src="assets/images/files/qr-code.svg" width="35px" height="35px">
										</a>
									</span>
								</td>
							</tr>
							<tr data-row="2" class="kt-datatable__row" style="left: 0px">
								<td data-field="Status" class="kt-datatable__cell" style="width:10%;">
									<span>
										<span class="btn btn-bold btn-sm btn-font-sm  btn-label-success">Done</span>
									</span>
								</td>
								<td data-field="Name" data-autohide-disabled="false" class="kt-datatable__cell" style="width:30%;">
									<span>
										<div class="kt-user-card-v2__details">
											Product of Function
										</div>					
									</span>
								</td>
								<td data-field="Function" class="kt-datatable__cell" style="width:15%">
							 		<p>\["""),format.raw/*194.16*/("""{"""),format.raw/*194.17*/("""z = """),format.raw/*194.21*/("""{"""),format.raw/*194.22*/("""\ln x"""),format.raw/*194.27*/("""}"""),format.raw/*194.28*/("""\cdot"""),format.raw/*194.33*/("""{"""),format.raw/*194.34*/("""\sqrt """),format.raw/*194.40*/("""{"""),format.raw/*194.41*/("""xy"""),format.raw/*194.43*/("""}"""),format.raw/*194.44*/("""}"""),format.raw/*194.45*/("""}"""),format.raw/*194.46*/("""\]</p>
								</td>
								<td data-field="Goal" class="kt-datatable__cell" style="width:25%;">
									<span>
										Learn about the product of function properties. 								
									</span>
								</td>
								<td data-field="Action" class="kt-datatable__cell" style="width:20%;">
									<span>
										<a class="kt-user-card-v2__name" href="javascript.void(0)" data-toggle="modal" data-target="#kt_modal_1_4">
											<img alt="photo" src="assets/images/files/qr-code.svg" width="35px" height="35px">
										</a>
									</span>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<!--end: Datatable -->
			</div>
		</div>
	</div>
</div>


<div class="modal fade show" id="kt_modal_1_1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" style="display: hidden; padding-right: 16px;" aria-modal="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Elliptic Paraboloid</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body" style="text-align: center;">
				<img alt="qr-code" src="assets/images/qr/mathematical_analysisII/two_var_functions/elliptic_paraboloid.jpg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade show" id="kt_modal_1_2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" style="display: hidden; padding-right: 16px;" aria-modal="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Hyperbolic Paraboloid</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body" style="text-align: center;">
				<img alt="qr-code" src="assets/images/qr/mathematical_analysisII/two_var_functions/hyperbolic_paraboloid.jpg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade show" id="kt_modal_1_3" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" style="display: hidden; padding-right: 16px;" aria-modal="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ellipsoid</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body" style="text-align: center;">
				<img alt="qr-code" src="assets/images/qr/mathematical_analysisII/two_var_functions/ellipsoid.jpg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade show" id="kt_modal_1_4" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" style="display: hidden; padding-right: 16px;" aria-modal="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Product of Function</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body" style="text-align: center;">
				<img alt="qr-code" src="assets/images/qr/mathematical_analysisII/two_var_functions/assembled_function.jpeg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade show" id="kt_modal_1_5" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" style="display: hidden; padding-right: 16px;" aria-modal="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Quiz</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <div class="modal-body" style="text-align: center;">
				<img alt="qr-code" src="assets/images/qr/mathematical_analysisII/two_var_functions/quiz.jpg">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
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
                  DATE: Mon Dec 09 10:34:05 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/ar_learning_contents.scala.html
                  HASH: a6e2cfb2c55b213d5be08ab270cf4f49f191ad33
                  MATRIX: 1045->0|5682->4608|5712->4609|5742->4610|5784->4623|5814->4624|5844->4625|5875->4627|5905->4628|5947->4641|5977->4642|6007->4643|7303->5910|7333->5911|7363->5912|7405->5925|7435->5926|7465->5927|7496->5929|7526->5930|7568->5943|7598->5944|7628->5945|8878->7166|8908->7167|8938->7168|8980->7181|9010->7182|9040->7183|9071->7185|9101->7186|9143->7199|9173->7200|9203->7201|9234->7203|9264->7204|9306->7217|9336->7218|9366->7219|9396->7220|10685->8480|10715->8481|10748->8485|10778->8486|10812->8491|10842->8492|10876->8497|10906->8498|10941->8504|10971->8505|11002->8507|11032->8508|11062->8509|11092->8510
                  LINES: 33->1|139->107|139->107|139->107|139->107|139->107|139->107|139->107|139->107|139->107|139->107|139->107|168->136|168->136|168->136|168->136|168->136|168->136|168->136|168->136|168->136|168->136|168->136|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|197->165|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194|226->194
                  -- GENERATED --
              */
          
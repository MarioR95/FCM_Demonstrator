
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

object learning_content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contentName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<div class="row">
	<div class="col-lg-12">
		<div class="kt-portlet kt-portlet--height-fluid">
			<div class="kt-portlet__head">
				<div class="kt-portlet__head-label">
					<h5 class="kt-portlet__head-title" style="text-align: center;">
						"""),_display_(/*8.8*/contentName),format.raw/*8.19*/("""
					"""),format.raw/*9.6*/("""</h5>
				</div>
			</div>
			<div class="kt-portlet__body kt-portlet__body--fit">
				
			</div>
		</div>
	</div>
</div>

<script>
	var fileName;
	"""),_display_(/*21.3*/contentName/*21.14*/ match/*21.20*/ {/*22.3*/case "Functions of two variables" =>/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
			"""),format.raw/*23.4*/("""fileName="functions_sev_var";
		""")))}/*25.3*/case "Critical Points" =>/*25.28*/ {_display_(Seq[Any](format.raw/*25.30*/("""
			"""),format.raw/*26.4*/("""fileName="critical_points"
		""")))}/*28.3*/case _ =>/*28.12*/ {}}),format.raw/*29.3*/("""
	"""),format.raw/*30.2*/("""$('.kt-portlet__body').append(
		"	<embed src='assets/contents/mathematical-analysis-II/"+fileName+".pdf' width='90%' height='950px' style='margin:2% auto;' type='application/pdf'/>"
	);
</script>
"""))
      }
    }
  }

  def render(contentName:String): play.twirl.api.HtmlFormat.Appendable = apply(contentName)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (contentName) => apply(contentName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/learning_content.scala.html
                  HASH: 7eb059a3c6d37118b34123778e5653e8c7dc7b89
                  MATRIX: 959->1|1075->22|1103->24|1380->276|1411->287|1444->294|1631->455|1651->466|1666->472|1676->478|1721->514|1761->516|1793->521|1845->559|1879->584|1919->586|1951->591|2000->627|2018->636|2042->643|2072->646
                  LINES: 28->1|33->1|34->2|40->8|40->8|41->9|53->21|53->21|53->21|53->22|53->22|53->22|54->23|55->25|55->25|55->25|56->26|57->28|57->28|57->29|58->30
                  -- GENERATED --
              */
          
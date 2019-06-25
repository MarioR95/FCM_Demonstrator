
package views.html.partials

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

object _contentbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Content -->
<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >

	"""),_display_(/*5.3*/if(contentType == "courseDetails")/*5.37*/{_display_(Seq[Any](format.raw/*5.38*/("""
		"""),_display_(/*6.4*/views/*6.9*/.html.coursedetailscontent()),format.raw/*6.37*/("""
	""")))}),format.raw/*7.3*/("""
	
	"""),_display_(/*9.3*/views/*9.8*/.html.studentStats()),format.raw/*9.28*/("""
	
"""),format.raw/*11.1*/("""</div>
<!-- end:: Content -->"""))
      }
    }
  }

  def render(contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(contentType)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (contentType) => apply(contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jun 25 09:55:38 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/partials/_contentbase.scala.html
                  HASH: c57f653dfe18145a141dd528db9b87a266833937
                  MATRIX: 964->1|1080->22|1108->24|1241->132|1283->166|1321->167|1351->172|1363->177|1411->205|1444->209|1476->216|1488->221|1528->241|1560->246
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|43->11
                  -- GENERATED --
              */
          

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


	"""),_display_(/*6.3*/contentType/*6.14*/ match/*6.20*/{/*7.3*/case "courseDetails" =>/*7.26*/ {_display_(_display_(/*7.29*/views/*7.34*/.html.coursedetailscontent()))}/*8.3*/case "studentStats" =>/*8.25*/ {_display_(_display_(/*8.28*/views/*8.33*/.html.studentStats()))}/*9.3*/case _ =>/*9.12*/ {}}),format.raw/*10.3*/("""
	
	
"""),format.raw/*13.1*/("""</div>
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
                  DATE: Mon Jul 08 09:26:29 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_contentbase.scala.html
                  HASH: a8ca884edd95cac6f49a1691587a264a1d8a3010
                  MATRIX: 964->1|1080->22|1108->24|1243->134|1262->145|1276->151|1284->156|1315->179|1345->182|1358->187|1396->220|1426->242|1456->245|1469->250|1499->275|1516->284|1540->291|1575->299
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|38->7|38->7|38->7|38->7|38->8|38->8|38->8|38->8|38->9|38->9|38->10|41->13
                  -- GENERATED --
              */
          
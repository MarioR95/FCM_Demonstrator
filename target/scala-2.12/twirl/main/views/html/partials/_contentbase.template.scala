
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

object _contentbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.dto.UserDto,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Content -->
<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >

	"""),_display_(/*5.3*/contentType/*5.14*/ match/*5.20*/{/*6.3*/case "courseDetails" =>/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""
			"""),_display_(/*7.5*/{ if (user.getRole() ==  1)
				views.html.tcoursedetailscontent()
			else
				views.html.scoursedetailscontent()
	
			}),format.raw/*12.5*/("""
		""")))}/*14.3*/case "studentStats" =>/*14.25*/ {_display_(_display_(/*14.28*/views/*14.33*/.html.studentStats()))}/*15.3*/case _ =>/*15.12*/ {}}),format.raw/*16.3*/("""
	
"""),format.raw/*18.1*/("""</div>
<!-- end:: Content -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType)

  def f:((models.dto.UserDto,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType) => apply(user,contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 12 10:45:30 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_contentbase.scala.html
                  HASH: 4137915029006c6a73980284190fda7ff8e83540
                  MATRIX: 983->1|1125->48|1153->50|1286->158|1305->169|1319->175|1327->180|1358->203|1397->205|1428->211|1573->336|1596->345|1627->367|1658->370|1672->375|1703->400|1721->409|1745->416|1777->421
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|37->6|37->6|37->6|38->7|43->12|44->14|44->14|44->14|44->14|44->15|44->15|44->16|46->18
                  -- GENERATED --
              */
          
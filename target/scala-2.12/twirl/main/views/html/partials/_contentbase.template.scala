
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

	"""),_display_(/*5.3*/contentType/*5.14*/ match/*5.20*/{/*6.3*/case "dashboard" =>/*6.22*/ {_display_(_display_(/*6.25*/views/*6.30*/.html.sdashwidgetcontent(user)))}/*7.3*/case "courseDetails" =>/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
			"""),_display_(/*8.5*/{ if (user.getRole() ==  1)
				views.html.tcoursedetailscontent()
			else
				views.html.scoursedetailscontent(user)
	
			}),format.raw/*13.5*/("""
		""")))}/*15.3*/case "studentStats" =>/*15.25*/ {_display_(_display_(/*15.28*/views/*15.33*/.html.studentStats()))}/*16.3*/case _ =>/*16.12*/ {}}),format.raw/*17.3*/("""
	
"""),format.raw/*19.1*/("""</div>
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
                  DATE: Thu Jul 18 12:09:41 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_contentbase.scala.html
                  HASH: 5af17a5ed80082d75a2cd31d0fb54c834c954608
                  MATRIX: 983->1|1125->48|1153->50|1286->158|1305->169|1319->175|1327->180|1354->199|1384->202|1397->207|1437->242|1468->265|1507->267|1538->273|1687->402|1710->411|1741->433|1772->436|1786->441|1817->466|1835->475|1859->482|1891->487
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|37->6|37->6|37->6|37->6|37->7|37->7|37->7|38->8|43->13|44->15|44->15|44->15|44->15|44->16|44->16|44->17|46->19
                  -- GENERATED --
              */
          
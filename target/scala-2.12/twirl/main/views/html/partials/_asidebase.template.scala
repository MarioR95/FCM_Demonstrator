
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

object _asidebase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(role: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Aside -->
<button class="kt-aside-close " id="kt_aside_close_btn"><i class="la la-close"></i></button>
<div class="kt-aside kt-aside--fixed kt-grid__item kt-grid kt-grid--desktop kt-grid--hor-desktop" id="kt_aside">
    """),_display_(/*5.6*/views/*5.11*/.html.partials._asidebrand()),format.raw/*5.39*/("""
    """),_display_(/*6.6*/views/*6.11*/.html.partials._asidemenu(role)),format.raw/*6.42*/("""
"""),format.raw/*7.1*/("""</div>
<!-- end:: Aside -->"""))
      }
    }
  }

  def render(role:Integer): play.twirl.api.HtmlFormat.Appendable = apply(role)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (role) => apply(role)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 11 13:25:51 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_asidebase.scala.html
                  HASH: 7df1573c3013eaeb368bf322106005139712b80f
                  MATRIX: 963->1|1073->16|1101->18|1363->255|1376->260|1424->288|1456->295|1469->300|1520->331|1548->333
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7
                  -- GENERATED --
              */
          
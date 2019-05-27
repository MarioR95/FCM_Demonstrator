
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

object _topbarbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- begin:: Header Topbar -->
<div class="kt-header__topbar" style="position: absolute; right: 0">
    """),_display_(/*4.6*/views/*4.11*/.html.partials._topbarsearch()),format.raw/*4.41*/("""
    """),_display_(/*5.6*/views/*5.11*/.html.partials._topbarnotifications()),format.raw/*5.48*/("""
    """),_display_(/*6.6*/views/*6.11*/.html.partials._topbaruser()),format.raw/*6.39*/("""
"""),format.raw/*7.1*/("""</div>
<!-- end:: Header Topbar -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 27 14:32:28 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/partials/_topbarbase.scala.html
                  HASH: f171299af7d36158b766e4e40bea84521880e0d5
                  MATRIX: 956->1|1052->4|1182->109|1195->114|1245->144|1276->150|1289->155|1346->192|1377->198|1390->203|1438->231|1465->232
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7
                  -- GENERATED --
              */
          
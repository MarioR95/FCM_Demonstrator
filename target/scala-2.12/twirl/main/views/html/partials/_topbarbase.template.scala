
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

object _topbarbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- begin:: Header Topbar -->
<div class="kt-header__topbar" style="position: absolute; right: 0">
    """),_display_(/*4.6*/views/*4.11*/.html.partials._topbarsearch()),format.raw/*4.41*/("""
    """),_display_(/*5.6*/views/*5.11*/.html.partials._topbarnotifications()),format.raw/*5.48*/("""
    """),_display_(/*6.6*/views/*6.11*/.html.partials._topbaruser(username)),format.raw/*6.47*/("""
"""),format.raw/*7.1*/("""</div>
<!-- end:: Header Topbar -->"""))
      }
    }
  }

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 28 09:19:54 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/partials/_topbarbase.scala.html
                  HASH: f90aac8811d3f386228cc0d35edfe92574d42295
                  MATRIX: 963->1|1075->20|1205->125|1218->130|1268->160|1299->166|1312->171|1369->208|1400->214|1413->219|1469->255|1496->256
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7
                  -- GENERATED --
              */
          
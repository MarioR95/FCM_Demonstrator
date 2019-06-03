
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


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Header Topbar -->
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
                  DATE: Tue May 28 10:53:53 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_topbarbase.scala.html
                  HASH: 5c0c65ef79e744525e59420cbda10382e3a37fcc
                  MATRIX: 963->1|1076->19|1104->21|1236->128|1249->133|1299->163|1331->170|1344->175|1401->212|1433->219|1446->224|1502->260|1530->262
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7
                  -- GENERATED --
              */
          
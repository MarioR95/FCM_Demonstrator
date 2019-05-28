
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

object _headerbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- begin:: Header -->
<div id="kt_header" class="kt-header kt-grid__item kt-header--fixed " >
    """),_display_(/*4.6*/views/*4.11*/.html.partials._topbarbase(username)),format.raw/*4.47*/("""
"""),format.raw/*5.1*/("""</div>
<!-- end:: Header -->"""))
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
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/partials/_headerbase.scala.html
                  HASH: 5ccc1b367fb0d18e684e7e5b60ab0650510e5780
                  MATRIX: 963->1|1075->20|1201->121|1214->126|1270->162|1297->163
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          
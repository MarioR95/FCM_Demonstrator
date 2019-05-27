
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

object _layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- begin:: Page -->
"""),_display_(/*3.2*/views/*3.7*/.html.partials._headerbasemobile()),format.raw/*3.41*/("""
"""),format.raw/*4.1*/("""<div class="kt-grid kt-grid--hor kt-grid--root">
    <div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">
       """),_display_(/*6.9*/views/*6.14*/.html.partials._asidebase()),format.raw/*6.41*/("""
        """),format.raw/*7.9*/("""<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor kt-wrapper" id="kt_wrapper">
           """),_display_(/*8.13*/views/*8.18*/.html.partials._headerbase()),format.raw/*8.46*/("""
            """),format.raw/*9.13*/("""<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor">
				"""),_display_(/*10.6*/views/*10.11*/.html.partials._contentbase()),format.raw/*10.40*/("""
            """),format.raw/*11.13*/("""</div>
			"""),_display_(/*12.5*/views/*12.10*/.html.partials._footerbase()),format.raw/*12.38*/("""
        """),format.raw/*13.9*/("""</div>
    </div>
</div>
<!-- end:: Page -->
"""),_display_(/*17.2*/views/*17.7*/.html.partials._layoutscrolltop()),format.raw/*17.40*/("""
"""),_display_(/*18.2*/views/*18.7*/.html.partials._layouttoolbar()),format.raw/*18.38*/("""
"""),_display_(/*19.2*/views/*19.7*/.html.partials._layoutchat()))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 27 14:32:29 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/_layout.scala.html
                  HASH: 25ec83c660d6edaa0d86f8c0359aeec06aac76b7
                  MATRIX: 943->1|1039->4|1087->27|1099->32|1153->66|1180->67|1344->206|1357->211|1404->238|1439->247|1574->356|1587->361|1635->389|1675->402|1776->477|1790->482|1840->511|1881->524|1918->535|1932->540|1981->568|2017->577|2089->623|2102->628|2156->661|2184->663|2197->668|2249->699|2277->701|2290->706
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19
                  -- GENERATED --
              */
          

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

object _layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Page -->
"""),_display_(/*3.2*/views/*3.7*/.html.partials._headerbasemobile()),format.raw/*3.41*/("""
"""),format.raw/*4.1*/("""<div class="kt-grid kt-grid--hor kt-grid--root">
    <div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">
       """),_display_(/*6.9*/views/*6.14*/.html.partials._asidebase()),format.raw/*6.41*/("""
        """),format.raw/*7.9*/("""<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor kt-wrapper" id="kt_wrapper">
           """),_display_(/*8.13*/views/*8.18*/.html.partials._headerbase(username)),format.raw/*8.54*/("""
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

  def render(username:String): play.twirl.api.HtmlFormat.Appendable = apply(username)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (username) => apply(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 30 10:18:31 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/_layout.scala.html
                  HASH: a706fdb4275dc4cbcf9402d7f4e48b486943f98b
                  MATRIX: 950->1|1063->19|1091->21|1140->45|1152->50|1206->84|1234->86|1400->227|1413->232|1460->259|1496->269|1632->379|1645->384|1701->420|1742->434|1844->510|1858->515|1908->544|1950->558|1988->570|2002->575|2051->603|2088->613|2164->663|2177->668|2231->701|2260->704|2273->709|2325->740|2354->743|2367->748
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19
                  -- GENERATED --
              */
          
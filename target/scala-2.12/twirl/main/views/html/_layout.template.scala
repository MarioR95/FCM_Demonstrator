
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

object _layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.dto.UserDto,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Page -->
"""),_display_(/*3.2*/views/*3.7*/.html.partials._headerbasemobile()),format.raw/*3.41*/("""
"""),format.raw/*4.1*/("""<div class="kt-grid kt-grid--hor kt-grid--root">
    <div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--ver kt-page">
       """),_display_(/*6.9*/views/*6.14*/.html.partials._asidebase(user)),format.raw/*6.45*/("""
        """),format.raw/*7.9*/("""<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor kt-wrapper" id="kt_wrapper">
           """),_display_(/*8.13*/views/*8.18*/.html.partials._headerbase(user)),format.raw/*8.50*/("""
            """),format.raw/*9.13*/("""<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor">
            <!-- content -->
           """),_display_(/*11.13*/views/*11.18*/.html.partials._contentbase(user,contentType)),format.raw/*11.63*/("""
            """),format.raw/*12.13*/("""</div>
			"""),_display_(/*13.5*/views/*13.10*/.html.partials._footerbase()),format.raw/*13.38*/("""
        """),format.raw/*14.9*/("""</div>
    </div>
</div>
<!-- end:: Page -->
"""),_display_(/*18.2*/views/*18.7*/.html.partials._layoutscrolltop()),format.raw/*18.40*/("""
"""),_display_(/*19.2*/views/*19.7*/.html.partials._layouttoolbar()),format.raw/*19.38*/("""
"""),_display_(/*20.2*/views/*20.7*/.html.partials._layoutchat()))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType)

  def f:((models.dto.UserDto,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType) => apply(user,contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 27 12:26:17 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/_layout.scala.html
                  HASH: 36e9ecc7f4382b61002409072ff7f99da3f5b3da
                  MATRIX: 969->1|1111->48|1139->50|1188->74|1200->79|1254->113|1282->115|1448->256|1461->261|1512->292|1548->302|1684->412|1697->417|1749->449|1790->463|1930->576|1944->581|2010->626|2052->640|2090->652|2104->657|2153->685|2190->695|2266->745|2279->750|2333->783|2362->786|2375->791|2427->822|2456->825|2469->830
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20
                  -- GENERATED --
              */
          
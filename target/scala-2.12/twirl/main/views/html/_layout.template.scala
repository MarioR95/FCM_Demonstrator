
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


Seq[Any](format.raw/*2.1*/("""<!-- begin:: Page -->
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
                  DATE: Mon Jun 03 13:54:01 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/_layout.scala.html
                  HASH: 1c05a75fa8f1546c54c799f8badd0589c91c289d
                  MATRIX: 950->1|1062->20|1110->43|1122->48|1176->82|1203->83|1367->222|1380->227|1427->254|1462->263|1597->372|1610->377|1666->413|1706->426|1807->501|1821->506|1871->535|1912->548|1949->559|1963->564|2012->592|2048->601|2120->647|2133->652|2187->685|2215->687|2228->692|2280->723|2308->725|2321->730
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19
                  -- GENERATED --
              */
          
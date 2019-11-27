
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

object _topbarbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Header Topbar -->
<div class="kt-header__topbar" style="position: absolute; right: 0">
    """),_display_(/*4.6*/views/*4.11*/.html.partials._topbarsearch()),format.raw/*4.41*/("""
    """),_display_(/*5.6*/views/*5.11*/.html.partials._topbarnotifications(user)),format.raw/*5.52*/("""
    """),_display_(/*6.6*/views/*6.11*/.html.partials._topbaruser(user)),format.raw/*6.43*/("""
"""),format.raw/*7.1*/("""</div>
<!-- end:: Header Topbar -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 27 11:23:37 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_topbarbase.scala.html
                  HASH: 9a7ef55ec66cbaba29d9417bfe304de5761fdea0
                  MATRIX: 975->1|1096->27|1124->29|1256->136|1269->141|1319->171|1351->178|1364->183|1425->224|1457->231|1470->236|1522->268|1550->270
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7
                  -- GENERATED --
              */
          
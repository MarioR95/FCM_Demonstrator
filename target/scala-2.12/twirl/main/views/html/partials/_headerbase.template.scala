
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

object _headerbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Header -->
<div id="kt_header" class="kt-header kt-grid__item kt-header--fixed " >
    """),_display_(/*4.6*/views/*4.11*/.html.partials._topbarbase(user)),format.raw/*4.43*/("""
"""),format.raw/*5.1*/("""</div>
<!-- end:: Header -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 18 09:25:36 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/MoliereDashboard/app/views/partials/_headerbase.scala.html
                  HASH: ccfac01fabda48a48b3a96b3a9d0767f14334422
                  MATRIX: 975->1|1096->27|1124->29|1252->132|1265->137|1317->169|1345->171
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5
                  -- GENERATED --
              */
          
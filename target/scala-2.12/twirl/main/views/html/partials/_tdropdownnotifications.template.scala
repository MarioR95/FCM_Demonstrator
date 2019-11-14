
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

object _tdropdownnotifications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!--begin: Head -->
<div class="kt-head kt-head--skin-dark kt-head--fit-x kt-head--fit-b" style="background-image: url(assets/images/misc/bg-1.jpg)">
    <h3 class="kt-head__title">
        """),_display_(/*5.10*/user/*5.14*/.getName()),format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""</h3>
    <h6 style="text-align: center; color: #efefef">
    	You don't have messages
    </h6>
    <ul class="nav nav-tabs nav-tabs-line nav-tabs-bold nav-tabs-line-3x nav-tabs-line-success kt-notification-item-padding-x" role="tablist">
        <li class="nav-item"> <a class="nav-link active show" data-toggle="tab" href="#topbar_feedback" role="tab" aria-selected="true">Feedback</a> </li>
        <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#topbar_notification" role="tab" aria-selected="false">Notification</a> </li>
    </ul>
</div>
<!--end: Head -->
<div class="tab-content">
    <div class="tab-pane active show" id="topbar_feedback" role="tabpanel">
       
    </div>
</div>"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 08 10:18:52 CET 2019
                  SOURCE: C:/Users/Mario/Desktop/MoliereDashboard/app/views/partials/_tdropdownnotifications.scala.html
                  HASH: 9ebd090592d767e38ea36e28c791858f636ae534
                  MATRIX: 987->1|1108->27|1136->29|1356->223|1368->227|1398->237|1430->243
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6
                  -- GENERATED --
              */
          
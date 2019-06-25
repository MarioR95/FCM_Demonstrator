
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

object _dropdownuser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!--begin: Head -->
<div class="kt-user-card kt-user-card--skin-dark kt-notification-item-padding-x" style="background-image: url(assets/images/misc/bg-1.jpg)">
    <div class="kt-user-card__avatar">
        <img class="kt-hidden" alt="Pic" src="assets/images/users/300_25.jpg" />
        <!--use below badge element instead the user avatar to display username's first letter(remove kt-hidden class to display it) -->
        <span class="kt-badge kt-badge--lg kt-badge--rounded kt-badge--bold kt-font-success">"""),_display_(/*7.95*/user/*7.99*/.getName().charAt(0)),format.raw/*7.119*/("""</span> 
    </div>
    <div class="kt-user-card__name"> """),_display_(/*9.39*/user/*9.43*/.getName()),format.raw/*9.53*/(""" """),_display_(/*9.55*/user/*9.59*/.getSurname()),format.raw/*9.72*/(""" """),format.raw/*9.73*/("""</div>
    <div class="kt-user-card__badge"> <span class="btn btn-success btn-sm btn-bold btn-font-md">23 messages</span> </div>
</div>
<!--end: Head -->
<!--begin: Navigation -->
<div class="kt-notification">
    <a href="#" class="kt-notification__item">
        <div class="kt-notification__item-icon"> <i class="flaticon2-calendar-3 kt-font-success"></i> </div>
        <div class="kt-notification__item-details">
            <div class="kt-notification__item-title kt-font-bold"> My Profile </div>
            <div class="kt-notification__item-time"> Account settings and more </div>
        </div>
    </a>
    <a href="#" class="kt-notification__item">
        <div class="kt-notification__item-icon"> <i class="flaticon2-mail kt-font-warning"></i> </div>
        <div class="kt-notification__item-details">
            <div class="kt-notification__item-title kt-font-bold"> My Messages </div>
            <div class="kt-notification__item-time"> Inbox and tasks </div>
        </div>
    </a>
    <div class="kt-notification__custom kt-space-between"> 
    	<a href="/logout" class="btn btn-label btn-label-brand btn-sm btn-bold">Sign Out</a>
    </div>
</div>
<!--end: Navigation -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 24 09:38:30 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_dropdownuser.scala.html
                  HASH: 81215a9e05326e03a78ab34e021db8b567af6e66
                  MATRIX: 977->1|1098->27|1126->29|1669->546|1681->550|1722->570|1808->630|1820->634|1850->644|1878->646|1890->650|1923->663|1951->664
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9
                  -- GENERATED --
              */
          
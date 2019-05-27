
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

object _dropdownuser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!--begin: Head -->
<div class="kt-user-card kt-user-card--skin-dark kt-notification-item-padding-x" style="background-image: url(./assets/media/misc/bg-1.jpg)">
    <div class="kt-user-card__avatar">
        <img class="kt-hidden" alt="Pic" src="./assets/media/users/300_25.jpg" />
        <!--use below badge element instead the user avatar to display username's first letter(remove kt-hidden class to display it) -->
        <span class="kt-badge kt-badge--lg kt-badge--rounded kt-badge--bold kt-font-success">A</span> 
    </div>
    <div class="kt-user-card__name"> Alfonso Menichino </div>
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
    	<a href="?page=custom/user/login-v2" target="_blank" class="btn btn-label btn-label-brand btn-sm btn-bold">Sign Out</a>
    </div>
</div>
<!--end: Navigation -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 27 14:32:28 CEST 2019
                  SOURCE: C:/Users/Mario/Desktop/FCM_Demonstrator/app/views/partials/_dropdownuser.scala.html
                  HASH: cf76f01dac2765800464e305495124244b0b7051
                  MATRIX: 958->1|1054->4
                  LINES: 28->1|33->2
                  -- GENERATED --
              */
          
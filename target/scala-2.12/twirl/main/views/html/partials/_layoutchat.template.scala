
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

object _layoutchat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!--Begin:: Chat-->
<div class="modal fade- modal-sticky-bottom-right" id="kt_chat_modal" role="dialog" data-backdrop="false">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="kt-chat">
                <div class="kt-portlet kt-portlet--last">
                    <div class="kt-portlet__head">
                        <div class="kt-chat__head ">
                            <div class="kt-chat__left">
                                <div class="kt-chat__label">
                                    <a href="#" class="kt-chat__title">Jason Muller</a> 
                                    <span class="kt-chat__status"> <span class="kt-badge kt-badge--dot kt-badge--success"></span> Active </span>
                                </div>
                            </div>
                            <div class="kt-chat__right">
                                <div class="dropdown dropdown-inline">
                                    <button type="button" class="btn btn-clean btn-sm btn-icon btn-icon-md" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="flaticon-more-1"></i> </button>
                                    <div class="dropdown-menu dropdown-menu-fit dropdown-menu-right dropdown-menu-md">
                                        <!--begin::Nav-->
                                        <ul class="kt-nav">
                                            <li class="kt-nav__head"> Messaging <i class="flaticon2-information" data-toggle="kt-tooltip" data-placement="right" title="Click to learn more..."></i> </li>
                                            <li class="kt-nav__separator"></li>
                                            <li class="kt-nav__item">
                                                <a href="#" class="kt-nav__link"> <i class="kt-nav__link-icon flaticon2-group"></i> <span class="kt-nav__link-text">New Group</span> </a>
                                            </li>
                                            <li class="kt-nav__item">
                                                <a href="#" class="kt-nav__link">
                                                    <i class="kt-nav__link-icon flaticon2-open-text-book"></i> <span class="kt-nav__link-text">Contacts</span> 
                                                    <span class="kt-nav__link-badge"> <span class="kt-badge kt-badge--brand kt-badge--rounded-">5</span> </span>
                                                </a>
                                            </li>
                                            <li class="kt-nav__item">
                                                <a href="#" class="kt-nav__link"> <i class="kt-nav__link-icon flaticon2-bell-2"></i> <span class="kt-nav__link-text">Calls</span> </a>
                                            </li>
                                            <li class="kt-nav__item">
                                                <a href="#" class="kt-nav__link"> <i class="kt-nav__link-icon flaticon2-dashboard"></i> <span class="kt-nav__link-text">Settings</span> </a>
                                            </li>
                                            <li class="kt-nav__item">
                                                <a href="#" class="kt-nav__link"> <i class="kt-nav__link-icon flaticon2-protected"></i> <span class="kt-nav__link-text">Help</span> </a>
                                            </li>
                                            <li class="kt-nav__separator"></li>
                                            <li class="kt-nav__foot"> <a class="btn btn-label-brand btn-bold btn-sm" href="#">Upgrade plan</a> <a class="btn btn-clean btn-bold btn-sm" href="#" data-toggle="kt-tooltip" data-placement="right" title="Click to learn more...">Learn more</a> </li>
                                        </ul>
                                        <!--end::Nav-->
                                    </div>
                                </div>
                                <button type="button" class="btn btn-clean btn-sm btn-icon" data-dismiss="modal"> <i class="flaticon2-cross"></i> </button>
                            </div>
                        </div>
                    </div>
                    <div class="kt-portlet__body">
                        <div class="kt-scroll kt-scroll--pull" data-height="410" data-mobile-height="300">
                            <div class="kt-chat__messages kt-chat__messages kt-chat__messages--modal">
                                <div class="kt-chat__message kt-bg-light-success">
                                    <div class="kt-chat__user">
                                        <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                                            <img src="assets/images/users/100_12.jpg" alt="image">
                                        </span>
                                        <a href="#" class="kt-chat__username">
                                            Jason Muller
                                        </span>
                                    </a>
                                    <span class="kt-chat__datetime">2 Hours</span> 
                                </div>
                                <div class="kt-chat__text">
                                    How likely are you to recommend our company
                                    <br>
                                    to your friends and family? 
                                </div>
                            </div>
                            <div class="kt-chat__message kt-chat__message--right kt-bg-light-brand">
                                <div class="kt-chat__user">
                                    <span class="kt-chat__datetime">30 Seconds</span> 
                                    <a href="#" class="kt-chat__username">
                                        You
                                    </span>
                                </a>
                                <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                                    <img src="assets/images/users/300_21.jpg" alt="image">
                                </span>
                            </div>
                            <div class="kt-chat__text">
                                Hey there, we’re just writing to let you know that you’ve
                                <br>
                                been subscribed to a repository on GitHub. 
                            </div>
                        </div>
                        <div class="kt-chat__message kt-bg-light-success">
                            <div class="kt-chat__user">
                                <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                                    <img src="assets/images/users/100_12.jpg" alt="image">
                                </span>
                                <a href="#" class="kt-chat__username">
                                    Jason Muller
                                </span>
                            </a>
                            <span class="kt-chat__datetime">30 Seconds</span> 
                        </div>
                        <div class="kt-chat__text"> Ok, Understood! </div>
                    </div>
                    <div class="kt-chat__message kt-chat__message--right kt-bg-light-brand">
                        <div class="kt-chat__user">
                            <span class="kt-chat__datetime">Just Now</span> 
                            <a href="#" class="kt-chat__username">
                                You
                            </span>
                        </a>
                        <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                            <img src="assets/images/users/300_21.jpg" alt="image">
                        </span>
                    </div>
                    <div class="kt-chat__text"> You’ll receive notifications for all issues, pull requests! </div>
                </div>
                <div class="kt-chat__message kt-bg-light-success">
                    <div class="kt-chat__user">
                        <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                            <img src="assets/images/users/100_12.jpg" alt="image">
                        </span>
                        <a href="#" class="kt-chat__username">
                            Jason Muller
                        </span>
                    </a>
                    <span class="kt-chat__datetime">2 Hours</span> 
                </div>
                <div class="kt-chat__text">
                    You were automatically <b class="kt-font-brand">subscribed</b> 
                    <br>
                    because you’ve been given access to the repository 
                </div>
            </div>
            <div class="kt-chat__message kt-chat__message--right kt-bg-light-brand">
                <div class="kt-chat__user">
                    <span class="kt-chat__datetime">30 Seconds</span> 
                    <a href="#" class="kt-chat__username">
                        You
                    </span>
                </a>
                <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                    <img src="assets/images/users/300_21.jpg" alt="image">
                </span>
            </div>
            <div class="kt-chat__text">
                You can unwatch this repository immediately 
                <br>
                by clicking here: <a href="#" class="kt-font-bold kt-link"></a> 
            </div>
        </div>
        <div class="kt-chat__message kt-bg-light-success">
            <div class="kt-chat__user">
                <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
                    <img src="assets/images/users/100_12.jpg" alt="image">
                </span>
                <a href="#" class="kt-chat__username">
                    Jason Muller
                </span>
            </a>
            <span class="kt-chat__datetime">30 Seconds</span> 
        </div>
        <div class="kt-chat__text">
            Discover what students who viewed Learn 
            <br>
            Figma - UI/UX Design Essential Training also viewed 
        </div>
    </div>
    <div class="kt-chat__message kt-chat__message--right kt-bg-light-brand">
        <div class="kt-chat__user">
            <span class="kt-chat__datetime">Just Now</span> 
            <a href="#" class="kt-chat__username">
                You
            </span>
        </a>
        <span class="kt-userpic kt-userpic--circle kt-userpic--sm">
            <img src="assets/images/users/300_21.jpg" alt="image">
        </span>
    </div>
    <div class="kt-chat__text"> Most purchased Business courses during this sale! </div>
</div>
</div>
</div>
</div>
<div class="kt-portlet__foot">
<div class="kt-chat__input">
<div class="kt-chat__editor">
<textarea placeholder="Type here..." style="height: 50px"></textarea>
</div>
<div class="kt-chat__toolbar">
<div class="kt_chat__tools">
    <a href="#"><i class="flaticon2-link"></i></a>
    <a href="#"><i class="flaticon2-photograph"></i></a>
    <a href="#"><i class="flaticon2-photo-camera"></i></a>
</div>
<div class="kt_chat__actions">
    <button type="button" class="btn btn-brand btn-md btn-font-sm btn-upper btn-bold kt-chat__reply">reply</button>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<!--ENd:: Chat-->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 04 12:04:39 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_layoutchat.scala.html
                  HASH: 2ac9e310199b516f35f3c757d8bfa52e2f987d10
                  MATRIX: 956->1|1052->3|1080->5
                  LINES: 28->1|33->1|34->2
                  -- GENERATED --
              */
          
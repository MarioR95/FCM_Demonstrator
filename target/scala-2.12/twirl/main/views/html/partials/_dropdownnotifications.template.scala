
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

object _dropdownnotifications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!--begin: Head -->
<div class="kt-head kt-head--skin-dark kt-head--fit-x kt-head--fit-b" style="background-image: url(assets/images/misc/bg-1.jpg)">
    <h3 class="kt-head__title">
        User Notifications &nbsp; <span class="btn btn-success btn-sm btn-bold btn-font-md">23 new</span> 
    </h3>
    <ul class="nav nav-tabs nav-tabs-line nav-tabs-bold nav-tabs-line-3x nav-tabs-line-success kt-notification-item-padding-x" role="tablist">
        <li class="nav-item"> <a class="nav-link active show" data-toggle="tab" href="#topbar_notifications_notifications" role="tab" aria-selected="true">Alerts</a> </li>
        <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#topbar_notifications_events" role="tab" aria-selected="false">Events</a> </li>
        <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#topbar_notifications_logs" role="tab" aria-selected="false">Logs</a> </li>
    </ul>
</div>
<!--end: Head -->
<div class="tab-content">
    <div class="tab-pane active show" id="topbar_notifications_notifications" role="tabpanel">
        <div class="kt-notification kt-margin-t-10 kt-margin-b-10 kt-scroll" data-scroll="true" data-height="300" data-mobile-height="200">
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-line-chart kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New order has been received </div>
                    <div class="kt-notification__item-time"> 2 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-box-1 kt-font-brand"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer is registered </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-chart2 kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Application has been approved </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-image-file kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New file has been uploaded </div>
                    <div class="kt-notification__item-time"> 5 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-bar-chart kt-font-info"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New user feedback received </div>
                    <div class="kt-notification__item-time"> 8 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-pie-chart-2 kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> System reboot has been successfully completed </div>
                    <div class="kt-notification__item-time"> 12 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-favourite kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New order has been placed </div>
                    <div class="kt-notification__item-time"> 15 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item kt-notification__item--read">
                <div class="kt-notification__item-icon"> <i class="flaticon2-safe kt-font-primary"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Company meeting canceled </div>
                    <div class="kt-notification__item-time"> 19 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-psd kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New report has been received </div>
                    <div class="kt-notification__item-time"> 23 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon-download-1 kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Finance report has been generated </div>
                    <div class="kt-notification__item-time"> 25 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon-security kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer comment recieved </div>
                    <div class="kt-notification__item-time"> 2 days ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-pie-chart kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer is registered </div>
                    <div class="kt-notification__item-time"> 3 days ago </div>
                </div>
            </a>
        </div>
    </div>
    <div class="tab-pane" id="topbar_notifications_events" role="tabpanel">
        <div class="kt-notification kt-margin-t-10 kt-margin-b-10 kt-scroll" data-scroll="true" data-height="300" data-mobile-height="200">
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-psd kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New report has been received </div>
                    <div class="kt-notification__item-time"> 23 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon-download-1 kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Finance report has been generated </div>
                    <div class="kt-notification__item-time"> 25 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-line-chart kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New order has been received </div>
                    <div class="kt-notification__item-time"> 2 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-box-1 kt-font-brand"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer is registered </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-chart2 kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Application has been approved </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-image-file kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New file has been uploaded </div>
                    <div class="kt-notification__item-time"> 5 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-bar-chart kt-font-info"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New user feedback received </div>
                    <div class="kt-notification__item-time"> 8 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-pie-chart-2 kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> System reboot has been successfully completed </div>
                    <div class="kt-notification__item-time"> 12 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-favourite kt-font-brand"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New order has been placed </div>
                    <div class="kt-notification__item-time"> 15 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item kt-notification__item--read">
                <div class="kt-notification__item-icon"> <i class="flaticon2-safe kt-font-primary"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Company meeting canceled </div>
                    <div class="kt-notification__item-time"> 19 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-psd kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New report has been received </div>
                    <div class="kt-notification__item-time"> 23 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon-download-1 kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Finance report has been generated </div>
                    <div class="kt-notification__item-time"> 25 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon-security kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer comment recieved </div>
                    <div class="kt-notification__item-time"> 2 days ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="flaticon2-pie-chart kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New customer is registered </div>
                    <div class="kt-notification__item-time"> 3 days ago </div>
                </div>
            </a>
        </div>
    </div>
    <div class="tab-pane" id="topbar_notifications_logs" role="tabpanel">
        <div class="kt-grid kt-grid--ver" style="min-height: 200px;">
            <div class="kt-grid kt-grid--hor kt-grid__item kt-grid__item--fluid kt-grid__item--middle">
                <div class="kt-grid__item kt-grid__item--middle kt-align-center">
                    All caught up! 
                    <br>
                    No new notifications. 
                </div>
            </div>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 28 10:53:53 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_dropdownnotifications.scala.html
                  HASH: 411e7aa632af2b74ad21c5bb67c43adba03abe14
                  MATRIX: 967->1|1063->3|1091->5
                  LINES: 28->1|33->1|34->2
                  -- GENERATED --
              */
          
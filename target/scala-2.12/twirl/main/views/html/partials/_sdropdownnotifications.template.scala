
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

object _sdropdownnotifications extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

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
    	You have 1 news to read
    </h6>
    <ul class="nav nav-tabs nav-tabs-line nav-tabs-bold nav-tabs-line-3x nav-tabs-line-success kt-notification-item-padding-x" role="tablist">
        <li class="nav-item"> <a class="nav-link active show" data-toggle="tab" href="#topbar_feedback" role="tab" aria-selected="true">Feedback</a> </li>
        <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#topbar_notification" role="tab" aria-selected="false">Notification</a> </li>
    </ul>
</div>
<!--end: Head -->
<div class="tab-content">
    <div class="tab-pane active show" id="topbar_feedback" role="tabpanel">
        <div class="kt-notification kt-margin-t-10 kt-margin-b-10 kt-scroll" data-scroll="true" data-height="300" data-mobile-height="200">
            <a href="/loadContents?contentType=AR" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-glasses kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title">It seems that you have many problem with <i>Two Variables Functions</i> topic. Try to wear the AR device (or any device that support AR) and open MathARSupport app to learn more.</div>
                    <div class="kt-notification__item-time"> 14/11/2019 </div>
				</div>	
			</a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-rocket kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Congratulations! You did a great job with the <i>Complexity and annotations : Basic</i> Quiz. </div>
                    <div class="kt-notification__item-time"> 19/10/2019 </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-thumbs-up kt-font-brand"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Your work with the <i>C Programming</i> course is amazing, maybe you are interested to improve yourself with the new materials in your course page. </div>
                    <div class="kt-notification__item-time"> 20/07/2019 </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-bell kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Your last quiz was not so good. Let's try to study again the section <i>Dynamic Programming</i> in your <i>Algorithm</i> course. </div>
                    <div class="kt-notification__item-time"> 22/07/2019 </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-exclamation-triangle kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Somethings went wrong with your last quizzes. We suggest to contact your teacher via the chat. </div>
                    <div class="kt-notification__item-time"> 24/07/2019 </div>
                </div>
            </a>
        </div>
    </div>
    <div class="tab-pane" id="topbar_notification" role="tabpanel">
        <div class="kt-notification kt-margin-t-10 kt-margin-b-10 kt-scroll" data-scroll="true" data-height="300" data-mobile-height="200">
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-book-open kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> New content in Algorithm course. </div>
                    <div class="kt-notification__item-time"> 2 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-book-open kt-font-warning"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> There are new assignment available in Data Structure course. </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-users kt-font-success"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> 4 people shared your post. </div>
                    <div class="kt-notification__item-time"> 3 hrs ago </div>
                </div>
            </a>
            <a href="#" class="kt-notification__item">
                <div class="kt-notification__item-icon"> <i class="fas fa-comment-alt kt-font-danger"></i> </div>
                <div class="kt-notification__item-details">
                    <div class="kt-notification__item-title"> Teacher sent you a message </div>
                    <div class="kt-notification__item-time"> 5 hrs ago </div>
                </div>
            </a>           
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 04 12:04:39 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_sdropdownnotifications.scala.html
                  HASH: d8a4be01faf7233876dc272ac2a983e1451ab77c
                  MATRIX: 987->1|1108->27|1136->29|1356->223|1368->227|1398->237|1430->243
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6
                  -- GENERATED --
              */
          
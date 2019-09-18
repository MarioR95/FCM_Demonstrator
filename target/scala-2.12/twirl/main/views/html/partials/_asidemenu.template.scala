
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

object _asidemenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.dto.UserDto,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Aside Menu -->
<div class="kt-aside-menu-wrapper kt-grid__item kt-grid__item--fluid" id="kt_aside_menu_wrapper">
   <div id="kt_aside_menu" class="kt-aside-menu " data-ktmenu-vertical="1" data-ktmenu-scroll="1" data-ktmenu-dropdown-timeout="500">
      <ul class="kt-menu__nav ">
         <li class="kt-menu__item kt-menu__item--active" aria-haspopup="true">
            <a href="/dashboard?username="""),_display_(/*7.43*/user/*7.47*/.getEmail()),format.raw/*7.58*/("""" class="kt-menu__link ">
               <span class="kt-menu__link-icon">
                  <svg
                     xmlns="http://www.w3.org/2000/svg"
                     xmlns:xlink="http://www.w3.org/1999/xlink" width="24px"
                     height="24px" viewBox="0 0 24 24" version="1.1"
                     class="kt-svg-icon">
                     <g stroke="none" stroke-width="1" fill="none"
                        fill-rule="evenodd">
                        <polygon id="Bound"
                           points="0 0 24 0 24 24 0 24" />
                        <path
                           d="M12.9336061,16.072447 L19.36,10.9564761 L19.5181585,10.8312381 C20.1676248,10.3169571 20.2772143,9.3735535 19.7629333,8.72408713 C19.6917232,8.63415859 19.6104327,8.55269514 19.5206557,8.48129411 L12.9336854,3.24257445 C12.3871201,2.80788259 11.6128799,2.80788259 11.0663146,3.24257445 L4.47482784,8.48488609 C3.82645598,9.00054628 3.71887192,9.94418071 4.23453211,10.5925526 C4.30500305,10.6811601 4.38527899,10.7615046 4.47382636,10.8320511 L4.63,10.9564761 L11.0659024,16.0730648 C11.6126744,16.5077525 12.3871218,16.5074963 12.9336061,16.072447 Z"
                           id="Shape" fill="#000000" fill-rule="nonzero" />
                        <path
                           d="M11.0563554,18.6706981 L5.33593024,14.122919 C4.94553994,13.8125559 4.37746707,13.8774308 4.06710397,14.2678211 C4.06471678,14.2708238 4.06234874,14.2738418 4.06,14.2768747 L4.06,14.2768747 C3.75257288,14.6738539 3.82516916,15.244888 4.22214834,15.5523151 C4.22358765,15.5534297 4.2250303,15.55454 4.22647627,15.555646 L11.0872776,20.8031356 C11.6250734,21.2144692 12.371757,21.2145375 12.909628,20.8033023 L19.7677785,15.559828 C20.1693192,15.2528257 20.2459576,14.6784381 19.9389553,14.2768974 C19.9376429,14.2751809 19.9363245,14.2734691 19.935,14.2717619 L19.935,14.2717619 C19.6266937,13.8743807 19.0546209,13.8021712 18.6572397,14.1104775 C18.654352,14.112718 18.6514778,14.1149757 18.6486172,14.1172508 L12.9235044,18.6705218 C12.377022,19.1051477 11.6029199,19.1052208 11.0563554,18.6706981 Z"
                           id="Path" fill="#000000" opacity="0.3" />
                     </g>
                  </svg>
               </span>
               <span class="kt-menu__link-text">Dashboard</span>
            </a>
         </li>
         <hr/>
         """),_display_(/*31.11*/user/*31.15*/.getRole()/*31.25*/ match/*31.31*/{/*32.4*/case 0 =>/*32.13*/ {_display_(_display_(/*32.16*/views/*32.21*/.html.partials._sasidemenu()))}/*33.4*/case 1 =>/*33.13*/ {_display_(_display_(/*33.16*/views/*33.21*/.html.partials._tasidemenu()))}}),format.raw/*34.4*/("""
         
      """),format.raw/*36.7*/("""</ul>
   </div>
</div>
<!-- end:: Aside Menu -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.dto.UserDto) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Sep 18 11:38:59 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_asidemenu.scala.html
                  HASH: 241e3dfcf49c2f4bc75ef7003895d821bd207702
                  MATRIX: 974->1|1095->27|1123->29|1568->448|1580->452|1611->463|4034->2859|4047->2863|4066->2873|4081->2879|4090->2885|4108->2894|4139->2897|4153->2902|4192->2936|4210->2945|4241->2948|4255->2953|4307->2987|4353->3006
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|63->31|63->31|63->31|63->31|63->32|63->32|63->32|63->32|63->33|63->33|63->33|63->33|63->34|65->36
                  -- GENERATED --
              */
          
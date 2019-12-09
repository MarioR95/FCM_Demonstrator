
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

object _sasidemenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
            <a href="javascript:;" class="kt-menu__link kt-menu__toggle">
               <span class="kt-menu__link-icon">
                  <svg
                     xmlns="http://www.w3.org/2000/svg"
                     xmlns:xlink="http://www.w3.org/1999/xlink" width="24px"
                     height="24px" viewBox="0 0 24 24" version="1.1"
                     class="kt-svg-icon">
                     <g stroke="none" stroke-width="1"
                        fill="none" fill-rule="evenodd">
                        <rect id="bound" x="0" y="0"
                           width="24" height="24" />
                        <rect id="Rectangle-7"
                           fill="#000000" x="4" y="4" width="7" height="7" rx="1.5" />
                        <path
                           d="M5.5,13 L9.5,13 C10.3284271,13 11,13.6715729 11,14.5 L11,18.5 C11,19.3284271 10.3284271,20 9.5,20 L5.5,20 C4.67157288,20 4,19.3284271 4,18.5 L4,14.5 C4,13.6715729 4.67157288,13 5.5,13 Z M14.5,4 L18.5,4 C19.3284271,4 20,4.67157288 20,5.5 L20,9.5 C20,10.3284271 19.3284271,11 18.5,11 L14.5,11 C13.6715729,11 13,10.3284271 13,9.5 L13,5.5 C13,4.67157288 13.6715729,4 14.5,4 Z M14.5,13 L18.5,13 C19.3284271,13 20,13.6715729 20,14.5 L20,18.5 C20,19.3284271 19.3284271,20 18.5,20 L14.5,20 C13.6715729,20 13,19.3284271 13,18.5 L13,14.5 C13,13.6715729 13.6715729,13 14.5,13 Z"
                           id="Combined-Shape" fill="#000000" opacity="0.3" />
                     </g>
                  </svg>
               </span>
               <span class="kt-menu__link-text">Active Courses</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
            </a>
            <div class="kt-menu__submenu ">
               <span class="kt-menu__arrow"></span>
               <ul class="kt-menu__subnav">
                  <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
                     <a href="/course?courseId=HarvardX/CB22x/2013_Spring" id="mathII" class="kt-menu__link kt-menu__toggle"> <i class="kt-menu__link-bullet kt-menu__link-bullet--line"><span></span></i>
                     <span class="kt-menu__link-text">Mathematical Analysis II</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
                     </a>
                  </li>
                  <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
                     <a href="javascript:;" id="algo" class="kt-menu__link kt-menu__toggle"> <i class="kt-menu__link-bullet kt-menu__link-bullet--line"><span></span></i>
                     <span class="kt-menu__link-text">Algororithms</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
                     </a>
                  </li>
                  <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
                     <a href="javascript:;" class="kt-menu__link kt-menu__toggle"> <i class="kt-menu__link-bullet kt-menu__link-bullet--line"><span></span></i>
                     <span class="kt-menu__link-text">Data Structures</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
                     </a>
                  </li>
               </ul>
            </div>
         </li>  
         <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
            <a href="javascript:;" class="kt-menu__link kt-menu__toggle">
               <span class="kt-menu__link-icon">
               	<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
   					 <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
      				 	<rect id="bound" x="0" y="0" width="24" height="24"></rect>
      				    <rect id="Rectangle-7" fill="#000000" opacity="0.3" x="4" y="5" width="16" height="6" rx="1.5"></rect>
        				<rect id="Rectangle-7-Copy" fill="#000000" x="4" y="13" width="16" height="6" rx="1.5"></rect>
    				</g>
				</svg>
               </span>
               <span class="kt-menu__link-text">Forum</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
            </a>
         </li>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 09 10:34:05 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_sasidemenu.scala.html
                  HASH: ec6f47c319eaa342179b9bd5fb4af868638a36a3
                  MATRIX: 1045->0
                  LINES: 33->1
                  -- GENERATED --
              */
          

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

object _tasidemenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
               <span class="kt-menu__link-text">Courses</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
            </a>
            <div class="kt-menu__submenu ">
               <span class="kt-menu__arrow"></span>
               <ul class="kt-menu__subnav">
                  <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
                     <a href="/course?courseId=HarvardX/CB22x/2013_Spring" id="algo" class="kt-menu__link kt-menu__toggle"> <i class="kt-menu__link-bullet kt-menu__link-bullet--line"><span></span></i>
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
                  <svg
                     xmlns="http://www.w3.org/2000/svg"
                     xmlns:xlink="http://www.w3.org/1999/xlink" width="24px"
                     height="24px" viewBox="0 0 24 24" version="1.1"
                     class="kt-svg-icon">
                     <g stroke="none" stroke-width="1"
                        fill="none" fill-rule="evenodd">
                        <polygon id="Bound"
                           points="0 0 24 0 24 24 0 24" />
                        <path
                           d="M18.5,8 C17.1192881,8 16,6.88071187 16,5.5 C16,4.11928813 17.1192881,3 18.5,3 C19.8807119,3 21,4.11928813 21,5.5 C21,6.88071187 19.8807119,8 18.5,8 Z M18.5,21 C17.1192881,21 16,19.8807119 16,18.5 C16,17.1192881 17.1192881,16 18.5,16 C19.8807119,16 21,17.1192881 21,18.5 C21,19.8807119 19.8807119,21 18.5,21 Z M5.5,21 C4.11928813,21 3,19.8807119 3,18.5 C3,17.1192881 4.11928813,16 5.5,16 C6.88071187,16 8,17.1192881 8,18.5 C8,19.8807119 6.88071187,21 5.5,21 Z"
                           id="Combined-Shape" fill="#000000" opacity="0.3" />
                        <path
                           d="M5.5,8 C4.11928813,8 3,6.88071187 3,5.5 C3,4.11928813 4.11928813,3 5.5,3 C6.88071187,3 8,4.11928813 8,5.5 C8,6.88071187 6.88071187,8 5.5,8 Z M11,4 L13,4 C13.5522847,4 14,4.44771525 14,5 C14,5.55228475 13.5522847,6 13,6 L11,6 C10.4477153,6 10,5.55228475 10,5 C10,4.44771525 10.4477153,4 11,4 Z M11,18 L13,18 C13.5522847,18 14,18.4477153 14,19 C14,19.5522847 13.5522847,20 13,20 L11,20 C10.4477153,20 10,19.5522847 10,19 C10,18.4477153 10.4477153,18 11,18 Z M5,10 C5.55228475,10 6,10.4477153 6,11 L6,13 C6,13.5522847 5.55228475,14 5,14 C4.44771525,14 4,13.5522847 4,13 L4,11 C4,10.4477153 4.44771525,10 5,10 Z M19,10 C19.5522847,10 20,10.4477153 20,11 L20,13 C20,13.5522847 19.5522847,14 19,14 C18.4477153,14 18,13.5522847 18,13 L18,11 C18,10.4477153 18.4477153,10 19,10 Z"
                           id="Combined-Shape" fill="#000000" />
                     </g>
                  </svg>
               </span>
               <span class="kt-menu__link-text">Calendar</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
            </a>
         </li>
         <li class="kt-menu__item kt-menu__item--submenu" aria-haspopup="true" data-ktmenu-submenu-toggle="hover">
            <a href="javascript:;" class="kt-menu__link kt-menu__toggle">
               <span class="kt-menu__link-icon">
                  <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" class="kt-svg-icon">
                     <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                        <rect id="bound" x="0" y="0" width="24" height="24"></rect>
                        <path d="M3.5,21 L20.5,21 C21.3284271,21 22,20.3284271 22,19.5 L22,8.5 C22,7.67157288 21.3284271,7 20.5,7 L10,7 L7.43933983,4.43933983 C7.15803526,4.15803526 6.77650439,4 6.37867966,4 L3.5,4 C2.67157288,4 2,4.67157288 2,5.5 L2,19.5 C2,20.3284271 2.67157288,21 3.5,21 Z" id="Combined-Shape" fill="#000000" opacity="0.3"></path>
                        <polygon id="Path" fill="#000000" opacity="0.3" points="4 19 10 11 16 19"></polygon>
                        <polygon id="Path-Copy" fill="#000000" points="11 19 15 14 19 19"></polygon>
                        <path d="M18,12 C18.8284271,12 19.5,11.3284271 19.5,10.5 C19.5,9.67157288 18.8284271,9 18,9 C17.1715729,9 16.5,9.67157288 16.5,10.5 C16.5,11.3284271 17.1715729,12 18,12 Z" id="Path" fill="#000000" opacity="0.3"></path>
                     </g>
                  </svg>
               </span>
               <span class="kt-menu__link-text">Private Files</span><i class="kt-menu__ver-arrow la la-angle-right"></i>
            </a>
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
                  DATE: Thu Jul 11 13:25:02 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/partials/_tasidemenu.scala.html
                  HASH: ee2e95658fa5f3efc26f11160d4aab68f1432fa2
                  MATRIX: 1045->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
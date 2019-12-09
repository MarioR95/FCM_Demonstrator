
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

object _contentbase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.dto.UserDto,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.dto.UserDto, contentType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*2.1*/("""<!-- begin:: Content -->
<div class="kt-content kt-grid__item kt-grid__item--fluid" id="kt_content" >

	"""),_display_(/*5.3*/contentType/*5.14*/ match/*5.20*/{/*6.3*/case "dashWidget" =>/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
			"""),_display_(/*7.5*/views/*7.10*/.html.tdashwidgetcontent()),format.raw/*7.36*/("""
		""")))}/*9.3*/case "dashboard" =>/*9.22*/ {_display_(Seq[Any](format.raw/*9.24*/("""
			"""),_display_(/*10.5*/views/*10.10*/.html.sdashwidgetcontent(user)),format.raw/*10.40*/("""
		""")))}/*12.3*/case "courseDetails" =>/*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
			"""),_display_(/*13.5*/{ if (user.getRole() ==  1)
				views.html.tcoursedetailscontent()
			else
				views.html.scoursedetailscontent(user)
			}),format.raw/*17.5*/("""
		""")))}/*19.3*/case "studentStats" =>/*19.25*/ {_display_(Seq[Any](format.raw/*19.27*/("""
			"""),_display_(/*20.5*/views/*20.10*/.html.studentStats()),format.raw/*20.30*/("""
		""")))}/*22.3*/case "functions_sev_var_pdf" =>/*22.34*/ {_display_(Seq[Any](format.raw/*22.36*/("""
			"""),_display_(/*23.5*/views/*23.10*/.html.learning_content("Functions of two variables")),format.raw/*23.62*/("""
		""")))}/*25.3*/case "critical_points_pdf" =>/*25.32*/ {_display_(Seq[Any](format.raw/*25.34*/("""
			"""),_display_(/*26.5*/views/*26.10*/.html.learning_content("Critical Points")),format.raw/*26.51*/("""
		""")))}/*28.3*/case "functions_sev_var_assignment" =>/*28.41*/ {_display_(Seq[Any](format.raw/*28.43*/("""
			"""),_display_(/*29.5*/views/*29.10*/.html.quiz_content()),format.raw/*29.30*/("""
		""")))}/*31.3*/case "critical_points_assignment" =>/*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/("""
			"""),_display_(/*32.5*/views/*32.10*/.html.quiz_content()),format.raw/*32.30*/("""
		""")))}/*34.3*/case "ar" =>/*34.15*/ {_display_(Seq[Any](format.raw/*34.17*/("""
			"""),_display_(/*35.5*/views/*35.10*/.html.ar_learning_contents()),format.raw/*35.38*/("""
		""")))}/*37.3*/case "quiz" =>/*37.17*/ {_display_(Seq[Any](format.raw/*37.19*/("""
			"""),_display_(/*38.5*/views/*38.10*/.html.quiz_content()),format.raw/*38.30*/("""
		""")))}/*40.3*/case _ =>/*40.12*/ {}}),format.raw/*41.3*/("""
	
"""),format.raw/*43.1*/("""</div>
<!-- end:: Content -->"""))
      }
    }
  }

  def render(user:models.dto.UserDto,contentType:String): play.twirl.api.HtmlFormat.Appendable = apply(user,contentType)

  def f:((models.dto.UserDto,String) => play.twirl.api.HtmlFormat.Appendable) = (user,contentType) => apply(user,contentType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 04 12:04:39 CET 2019
                  SOURCE: C:/Users/Arufonso/Desktop/MoliereDashboard/app/views/partials/_contentbase.scala.html
                  HASH: 5362084af58dc897280834879ab84aa7fe526f85
                  MATRIX: 983->1|1125->48|1153->50|1286->158|1305->169|1319->175|1327->180|1355->200|1394->202|1425->208|1438->213|1484->239|1506->248|1533->267|1572->269|1604->275|1618->280|1669->310|1692->319|1724->342|1764->344|1796->350|1942->476|1965->485|1996->507|2036->509|2068->515|2082->520|2123->540|2146->550|2186->581|2226->583|2258->589|2272->594|2345->646|2368->655|2406->684|2446->686|2478->692|2492->697|2554->738|2577->748|2624->786|2664->788|2696->794|2710->799|2751->819|2774->828|2819->864|2859->866|2891->872|2905->877|2946->897|2969->907|2990->919|3030->921|3062->927|3076->932|3125->960|3148->969|3171->983|3211->985|3243->991|3257->996|3298->1016|3321->1025|3339->1034|3363->1041|3395->1046
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|37->6|37->6|37->6|38->7|38->7|38->7|39->9|39->9|39->9|40->10|40->10|40->10|41->12|41->12|41->12|42->13|46->17|47->19|47->19|47->19|48->20|48->20|48->20|49->22|49->22|49->22|50->23|50->23|50->23|51->25|51->25|51->25|52->26|52->26|52->26|53->28|53->28|53->28|54->29|54->29|54->29|55->31|55->31|55->31|56->32|56->32|56->32|57->34|57->34|57->34|58->35|58->35|58->35|59->37|59->37|59->37|60->38|60->38|60->38|61->40|61->40|61->41|63->43
                  -- GENERATED --
              */
          
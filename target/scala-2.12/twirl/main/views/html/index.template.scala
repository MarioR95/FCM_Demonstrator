
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">

	<!-- begin::Head -->
	<head>

		<!--begin::Base Path (base relative path for assets of this page) -->
		<base href="../../../../">

		<!--end::Base Path -->
		<meta charset="utf-8" />
		<title>MOLIERE | Login Page</title>
		<meta name="description" content="Login page example">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		<!--begin::Fonts -->
		<script src="https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js"></script>
		<script>
			WebFont.load("""),format.raw/*19.17*/("""{"""),format.raw/*19.18*/("""
				"""),format.raw/*20.5*/("""google: """),format.raw/*20.13*/("""{"""),format.raw/*20.14*/("""
					"""),format.raw/*21.6*/(""""families": ["Poppins:300,400,500,600,700", "Roboto:300,400,500,600,700"]
				"""),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""",
				active: function() """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
					"""),format.raw/*24.6*/("""sessionStorage.fonts = true;
				"""),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""
			"""),format.raw/*26.4*/("""}"""),format.raw/*26.5*/(""");
		</script>

		<!--end::Fonts -->

		<!--begin::Page Custom Styles(used by this page) -->
		<link href="assets/stylesheets/pages/general/login/login-2.css" rel="stylesheet" type="text/css" />

		<!--end::Page Custom Styles -->

		<!--begin::Global Theme Styles(used by all pages) -->
		<link href="assets/vendors/global/vendors.bundle.css" rel="stylesheet" type="text/css" />
		<link href="assets/stylesheets/style.bundle.css" rel="stylesheet" type="text/css" />

		<!--end::Global Theme Styles -->

		<!--begin::Layout Skins(used by all pages) -->
		<link href="assets/stylesheets/skins/header/base/light.css" rel="stylesheet" type="text/css" />
		<link href="assets/stylesheets/skins/header/menu/light.css" rel="stylesheet" type="text/css" />
		<link href="assets/stylesheets/skins/brand/dark.css" rel="stylesheet" type="text/css" />
		<link href="assets/stylesheets/skins/aside/dark.css" rel="stylesheet" type="text/css" />

		<!--end::Layout Skins -->
		<link rel="shortcut icon" href="assets/images/logos/favicon.ico" />
	</head>

	<!-- end::Head -->

	<!-- begin::Body -->
	<body class="kt-quick-panel--right kt-demo-panel--right kt-offcanvas-panel--right kt-header--fixed kt-header-mobile--fixed kt-subheader--fixed kt-subheader--enabled kt-subheader--solid kt-aside--enabled kt-aside--fixed kt-page--loading">

		<!-- begin:: Page -->
		<div class="kt-grid kt-grid--ver kt-grid--root">
			<div class="kt-grid kt-grid--hor kt-grid--root kt-login kt-login--v2 kt-login--signin" id="kt_login">
				<div class="kt-grid__item kt-grid__item--fluid kt-grid kt-grid--hor" style="background-image: url(assets/images/bg/bg-1-1.jpg);">
					<div class="kt-grid__item kt-grid__item--fluid kt-login__wrapper">
						<div class="kt-login__container">
							<div class="kt-login__logo">
								<a href="#">
									<img src="assets/images/logos/logo-mini-2-md.png">
								</a>
							</div>
							<div class="kt-login__signin">
								<div class="kt-login__head">
									<h3 class="kt-login__title">Sign In</h3>
								</div>
								<form class="kt-form" action="">
									<div class="input-group">
										<input id="email" class="form-control" type="text" placeholder="Email" name="email" autocomplete="off" style="color: #ffffff;">
									</div>
									<div class="input-group">
										<input id="password" class="form-control" type="password" placeholder="Password" name="password" style="color: #ffffff;" >
									</div>
									<div class="row kt-login__extra">
										<div class="col">
											<label class="kt-checkbox">
												<input type="checkbox" name="remember"> Remember me
												<span></span>
											</label>
										</div>
										<div class="col kt-align-right">
											<a href="javascript:;" id="kt_login_forgot" class="kt-link kt-login__link">Forget Password ?</a>
										</div>
									</div>
									<div class="kt-login__actions">
										<button id="kt_login_signin_submit" class="btn btn-pill kt-login__btn-primary">Sign In</button>
									</div>
								</form>
							</div>
							<div class="kt-login__signup">
								<div class="kt-login__head">
									<h3 class="kt-login__title">Sign Up</h3>
									<div class="kt-login__desc">Enter your details to create your account:</div>
								</div>
								<form class="kt-login__form kt-form" action="">
									<div class="input-group">
										<input class="form-control" type="text" placeholder="Fullname" name="fullname">
									</div>
									<div class="input-group">
										<input class="form-control" type="text" placeholder="Email" name="email" autocomplete="off">
									</div>
									<div class="input-group">
										<input class="form-control" type="password" placeholder="Password" name="password">
									</div>
									<div class="input-group">
										<input class="form-control" type="password" placeholder="Confirm Password" name="rpassword">
									</div>
									<div class="row kt-login__extra">
										<div class="col kt-align-left">
											<label class="kt-checkbox">
												<input type="checkbox" name="agree">I Agree the <a href="#" class="kt-link kt-login__link kt-font-bold">terms and conditions</a>.
												<span></span>
											</label>
											<span class="form-text text-muted"></span>
										</div>
									</div>
									<div class="kt-login__actions">
										<button id="kt_login_signup_submit" class="btn btn-pill kt-login__btn-primary">Sign Up</button>&nbsp;&nbsp;
										<button id="kt_login_signup_cancel" class="btn btn-pill kt-login__btn-secondary">Cancel</button>
									</div>
								</form>
							</div>
							<div class="kt-login__forgot">
								<div class="kt-login__head">
									<h3 class="kt-login__title">Forgotten Password ?</h3>
									<div class="kt-login__desc">Enter your email to reset your password:</div>
								</div>
								<form class="kt-form" action="">
									<div class="input-group">
										<input class="form-control" type="text" placeholder="Email" name="email" id="kt_email" autocomplete="off">
									</div>
									<div class="kt-login__actions">
										<button id="kt_login_forgot_submit" class="btn btn-pill kt-login__btn-primary">Request</button>&nbsp;&nbsp;
										<button id="kt_login_forgot_cancel" class="btn btn-pill kt-login__btn-secondary">Cancel</button>
									</div>
								</form>
							</div>
							<div class="kt-login__account">
								<span class="kt-login__account-msg" style="color:#585858">
									Don't have an account yet ?
								</span>&nbsp;&nbsp;
								<a href="javascript:;" id="kt_login_signup" class="kt-link kt-link--light kt-login__account-link">Sign Up</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- end:: Page -->

		<!-- begin::Global Config(global config for global JS sciprts) -->
		<script>
			var KTAppOptions = """),format.raw/*159.23*/("""{"""),format.raw/*159.24*/("""
				"""),format.raw/*160.5*/(""""colors": """),format.raw/*160.15*/("""{"""),format.raw/*160.16*/("""
					"""),format.raw/*161.6*/(""""state": """),format.raw/*161.15*/("""{"""),format.raw/*161.16*/("""
						"""),format.raw/*162.7*/(""""brand": "#5d78ff",
						"dark": "#282a3c",
						"light": "#ffffff",
						"primary": "#5867dd",
						"success": "#34bfa3",
						"info": "#36a3f7",
						"warning": "#ffb822",
						"danger": "#fd3995"
					"""),format.raw/*170.6*/("""}"""),format.raw/*170.7*/(""",
					"base": """),format.raw/*171.14*/("""{"""),format.raw/*171.15*/("""
						"""),format.raw/*172.7*/(""""label": ["#c5cbe3", "#a1a8c3", "#3d4465", "#3e4466"],
						"shape": ["#f0f3ff", "#d9dffa", "#afb4d4", "#646c9a"]
					"""),format.raw/*174.6*/("""}"""),format.raw/*174.7*/("""
				"""),format.raw/*175.5*/("""}"""),format.raw/*175.6*/("""
			"""),format.raw/*176.4*/("""}"""),format.raw/*176.5*/(""";
		</script>

		<!-- end::Global Config -->

		<!--begin::Global Theme Bundle(used by all pages) -->
		<script src="assets/vendors/global/vendors.bundle.js" type="text/javascript"></script>
		<script src="assets/javascripts/scripts.bundle.js" type="text/javascript"></script>

		<!--end::Global Theme Bundle -->

		<!--begin::Page Scripts(used by this page) -->
		<script src="assets/javascripts/pages/login/login-general.js" type="text/javascript"></script>

		<!--end::Page Scripts -->
	</body>

	<!-- end::Body -->
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 29 09:44:00 CEST 2019
                  SOURCE: C:/Users/Arufonso/Desktop/FCM_Demonstrator/app/views/index.scala.html
                  HASH: 9eacb500a2a1860fe9631a78ba002acb59bc6828
                  MATRIX: 1030->0|1620->562|1649->563|1682->569|1718->577|1747->578|1781->585|1887->664|1915->665|1969->691|1998->692|2032->699|2093->733|2121->734|2153->739|2181->740|8232->6762|8262->6763|8296->6769|8335->6779|8365->6780|8400->6787|8438->6796|8468->6797|8504->6805|8751->7024|8780->7025|8825->7041|8855->7042|8891->7050|9041->7172|9070->7173|9104->7179|9133->7180|9166->7185|9195->7186
                  LINES: 33->1|51->19|51->19|52->20|52->20|52->20|53->21|54->22|54->22|55->23|55->23|56->24|57->25|57->25|58->26|58->26|191->159|191->159|192->160|192->160|192->160|193->161|193->161|193->161|194->162|202->170|202->170|203->171|203->171|204->172|206->174|206->174|207->175|207->175|208->176|208->176
                  -- GENERATED --
              */
          
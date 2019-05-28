// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mario/Desktop/FCM_Demonstrator/conf/routes
// @DATE:Tue May 28 09:24:06 CEST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

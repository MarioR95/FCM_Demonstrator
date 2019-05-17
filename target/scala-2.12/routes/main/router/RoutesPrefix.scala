// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mario/Desktop/git/FCM_Demonstrator/conf/routes
// @DATE:Fri May 17 13:18:35 CEST 2019


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

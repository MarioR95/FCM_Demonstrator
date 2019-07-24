// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/FCM_Demonstrator/conf/routes
// @DATE:Wed Jul 17 11:23:26 CEST 2019


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

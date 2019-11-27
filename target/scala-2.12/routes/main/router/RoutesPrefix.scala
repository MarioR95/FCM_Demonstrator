// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Arufonso/Desktop/MoliereDashboard/conf/routes
// @DATE:Wed Nov 27 11:23:37 CET 2019


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

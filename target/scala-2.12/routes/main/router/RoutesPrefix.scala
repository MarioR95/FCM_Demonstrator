// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mario/Desktop/MoliereDashboard/conf/routes
// @DATE:Tue Nov 12 13:11:46 CET 2019


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

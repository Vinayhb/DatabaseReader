// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:a1155fa4086fe573d6d8a587d97c70f68ca31662
// @DATE:Sun Mar 08 12:56:39 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:22
def updateRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:12
def getDataFromCassandra(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getDataFromCassandra")
}
                        

// @LINE:16
def addRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:19
def deleteRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:22
def updateRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:12
def getDataFromCassandra : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getDataFromCassandra",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getDataFromCassandra"})
      }
   """
)
                        

// @LINE:16
def addRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:19
def deleteRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:22
def updateRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]), "PUT", """update a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:12
def getDataFromCassandra(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getDataFromCassandra(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getDataFromCassandra", Seq(), "POST", """Read Cassandra Database""", _prefix + """getDataFromCassandra""")
)
                      

// @LINE:16
def addRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]), "POST", """Insert a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:19
def deleteRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]), "DELETE", """Delete a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    
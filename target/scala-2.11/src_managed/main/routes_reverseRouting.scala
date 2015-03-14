// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:a398c0b84bd4b5a470c93e10c5a34cb180092ec3
// @DATE:Sat Mar 14 16:26:57 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
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
                          

// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:6
class ReverseApplication {


// @LINE:32
def getRows(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:20
def connectToCassandra(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "connectToCassandra")
}
                        

// @LINE:24
def getKeyspaces(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getKeyspaces")
}
                        

// @LINE:56
def AlterColumn(keyspace_name:String, table_name:String, column_name:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column/" + implicitly[PathBindable[String]].unbind("column_name", dynamicString(column_name)))
}
                        

// @LINE:41
def updateRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:29
def deleteKeyspace(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteKeyspace")
}
                        

// @LINE:44
def createTable(keyspace_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/")
}
                        

// @LINE:13
def getDataFromCassandra(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "getDataFromCassandra")
}
                        

// @LINE:35
def addRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:38
def deleteRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:25
// @LINE:21
// @LINE:17
def checkPreFlight(): Call = {
   () match {
// @LINE:17
case ()  =>
  import ReverseRouteContext.empty
  Call("OPTIONS", _prefix + { _defaultPrefix } + "createKeyspace")
                                         
   }
}
                                                

// @LINE:59
def deleteColumn(keyspace_name:String, table_name:String, column_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column/" + implicitly[PathBindable[String]].unbind("column_name", dynamicString(column_name)))
}
                        

// @LINE:53
def addColumn(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:47
def describeTable(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)))
}
                        

// @LINE:16
def createKeyspace(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createKeyspace")
}
                        

// @LINE:50
def deleteTable(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)))
}
                        

}
                          
}
                  


// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
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
              

// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:6
class ReverseApplication {


// @LINE:32
def getRows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRows",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:20
def connectToCassandra : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.connectToCassandra",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "connectToCassandra"})
      }
   """
)
                        

// @LINE:24
def getKeyspaces : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getKeyspaces",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getKeyspaces"})
      }
   """
)
                        

// @LINE:56
def AlterColumn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.AlterColumn",
   """
      function(keyspace_name,table_name,column_name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/column/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("column_name", encodeURIComponent(column_name))})
      }
   """
)
                        

// @LINE:41
def updateRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:29
def deleteKeyspace : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteKeyspace",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteKeyspace"})
      }
   """
)
                        

// @LINE:44
def createTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createTable",
   """
      function(keyspace_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/"})
      }
   """
)
                        

// @LINE:13
def getDataFromCassandra : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getDataFromCassandra",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getDataFromCassandra"})
      }
   """
)
                        

// @LINE:35
def addRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:38
def deleteRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:25
// @LINE:21
// @LINE:17
def checkPreFlight : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkPreFlight",
   """
      function() {
      if (true) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + "createKeyspace"})
      }
      if (true) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + "connectToCassandra"})
      }
      if (true) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + "getKeyspaces"})
      }
      }
   """
)
                        

// @LINE:59
def deleteColumn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteColumn",
   """
      function(keyspace_name,table_name,column_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/column/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("column_name", encodeURIComponent(column_name))})
      }
   """
)
                        

// @LINE:53
def addColumn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addColumn",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/column"})
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
                        

// @LINE:47
def describeTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.describeTable",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name))})
      }
   """
)
                        

// @LINE:16
def createKeyspace : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createKeyspace",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createKeyspace"})
      }
   """
)
                        

// @LINE:50
def deleteTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTable",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name))})
      }
   """
)
                        

}
              
}
        


// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
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
                          

// @LINE:59
// @LINE:56
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:6
class ReverseApplication {


// @LINE:32
def getRows(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRows(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRows", Seq(classOf[String], classOf[String]), "GET", """Read Cassandra Database""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:20
def connectToCassandra(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.connectToCassandra(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "connectToCassandra", Seq(), "POST", """Connect to Cassandra""", _prefix + """connectToCassandra""")
)
                      

// @LINE:24
def getKeyspaces(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getKeyspaces(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getKeyspaces", Seq(), "POST", """Describe Keyspaces""", _prefix + """getKeyspaces""")
)
                      

// @LINE:56
def AlterColumn(keyspace_name:String, table_name:String, column_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.AlterColumn(keyspace_name, table_name, column_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "AlterColumn", Seq(classOf[String], classOf[String], classOf[String]), "PUT", """Modify a column """, _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""")
)
                      

// @LINE:41
def updateRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]), "PUT", """update a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:29
def deleteKeyspace(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteKeyspace(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteKeyspace", Seq(), "POST", """Delete Keyspace""", _prefix + """deleteKeyspace""")
)
                      

// @LINE:44
def createTable(keyspace_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTable(keyspace_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTable", Seq(classOf[String]), "POST", """Create a table""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/""")
)
                      

// @LINE:13
def getDataFromCassandra(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getDataFromCassandra(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getDataFromCassandra", Seq(), "POST", """Read From Cassandra""", _prefix + """getDataFromCassandra""")
)
                      

// @LINE:35
def addRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]), "POST", """Insert a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:38
def deleteRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]), "DELETE", """Delete a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:17
def checkPreFlight(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkPreFlight(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checkPreFlight", Seq(), "OPTIONS", """""", _prefix + """createKeyspace""")
)
                      

// @LINE:59
def deleteColumn(keyspace_name:String, table_name:String, column_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteColumn(keyspace_name, table_name, column_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteColumn", Seq(classOf[String], classOf[String], classOf[String]), "DELETE", """Delete a column""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""")
)
                      

// @LINE:53
def addColumn(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addColumn(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addColumn", Seq(classOf[String], classOf[String]), "POST", """Create a column""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:47
def describeTable(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.describeTable(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "describeTable", Seq(classOf[String], classOf[String]), "GET", """Get table metadata""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""")
)
                      

// @LINE:16
def createKeyspace(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createKeyspace(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createKeyspace", Seq(), "POST", """Create New Keyspace""", _prefix + """createKeyspace""")
)
                      

// @LINE:50
def deleteTable(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTable(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTable", Seq(classOf[String], classOf[String]), "DELETE", """Drop a table""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""")
)
                      

}
                          
}
        
    
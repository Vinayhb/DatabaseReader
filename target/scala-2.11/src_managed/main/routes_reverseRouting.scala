// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:4b16db957c9de3a96c46b17c065dd79fda1deb08
// @DATE:Sun Mar 08 21:41:34 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
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
                          

// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def getRows(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:36
def AlterColumn(keyspace_name:String, table_name:String, column_name:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column/" + implicitly[PathBindable[String]].unbind("column_name", dynamicString(column_name)))
}
                        

// @LINE:21
def updateRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:24
def createTable(keyspace_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/")
}
                        

// @LINE:15
def addRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:18
def deleteRow(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/row")
}
                        

// @LINE:39
def deleteColumn(keyspace_name:String, table_name:String, column_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column/" + implicitly[PathBindable[String]].unbind("column_name", dynamicString(column_name)))
}
                        

// @LINE:33
def addColumn(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)) + "/column")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:27
def describeTable(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)))
}
                        

// @LINE:30
def deleteTable(keyspace_name:String, table_name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "keyspace/" + implicitly[PathBindable[String]].unbind("keyspace_name", dynamicString(keyspace_name)) + "/table/" + implicitly[PathBindable[String]].unbind("table_name", dynamicString(table_name)))
}
                        

}
                          
}
                  


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
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
              

// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def getRows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRows",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:36
def AlterColumn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.AlterColumn",
   """
      function(keyspace_name,table_name,column_name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/column/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("column_name", encodeURIComponent(column_name))})
      }
   """
)
                        

// @LINE:21
def updateRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:24
def createTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createTable",
   """
      function(keyspace_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/"})
      }
   """
)
                        

// @LINE:15
def addRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:18
def deleteRow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteRow",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/row"})
      }
   """
)
                        

// @LINE:39
def deleteColumn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteColumn",
   """
      function(keyspace_name,table_name,column_name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name)) + "/column/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("column_name", encodeURIComponent(column_name))})
      }
   """
)
                        

// @LINE:33
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
                        

// @LINE:27
def describeTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.describeTable",
   """
      function(keyspace_name,table_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keyspace/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyspace_name", encodeURIComponent(keyspace_name)) + "/table/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table_name", encodeURIComponent(table_name))})
      }
   """
)
                        

// @LINE:30
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
        


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
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
                          

// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {


// @LINE:12
def getRows(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRows(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRows", Seq(classOf[String], classOf[String]), "GET", """Read Cassandra Database""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:36
def AlterColumn(keyspace_name:String, table_name:String, column_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.AlterColumn(keyspace_name, table_name, column_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "AlterColumn", Seq(classOf[String], classOf[String], classOf[String]), "PUT", """Modify a column """, _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""")
)
                      

// @LINE:21
def updateRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]), "PUT", """update a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:24
def createTable(keyspace_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTable(keyspace_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTable", Seq(classOf[String]), "POST", """Create a table""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/""")
)
                      

// @LINE:15
def addRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]), "POST", """Insert a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:18
def deleteRow(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteRow(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]), "DELETE", """Delete a row""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""")
)
                      

// @LINE:39
def deleteColumn(keyspace_name:String, table_name:String, column_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteColumn(keyspace_name, table_name, column_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteColumn", Seq(classOf[String], classOf[String], classOf[String]), "DELETE", """Delete a column""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""")
)
                      

// @LINE:33
def addColumn(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addColumn(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addColumn", Seq(classOf[String], classOf[String]), "POST", """Create a column""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:27
def describeTable(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.describeTable(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "describeTable", Seq(classOf[String], classOf[String]), "GET", """Get table metadata""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""")
)
                      

// @LINE:30
def deleteTable(keyspace_name:String, table_name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTable(keyspace_name, table_name), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTable", Seq(classOf[String], classOf[String]), "DELETE", """Drop a table""", _prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""")
)
                      

}
                          
}
        
    
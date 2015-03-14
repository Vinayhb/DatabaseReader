// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:a398c0b84bd4b5a470c93e10c5a34cb180092ec3
// @DATE:Sat Mar 14 16:26:57 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:13
private[this] lazy val controllers_Application_getDataFromCassandra2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getDataFromCassandra"))))
private[this] lazy val controllers_Application_getDataFromCassandra2_invoker = createInvoker(
controllers.Application.getDataFromCassandra(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getDataFromCassandra", Nil,"POST", """Read From Cassandra""", Routes.prefix + """getDataFromCassandra"""))
        

// @LINE:16
private[this] lazy val controllers_Application_createKeyspace3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createKeyspace"))))
private[this] lazy val controllers_Application_createKeyspace3_invoker = createInvoker(
controllers.Application.createKeyspace(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createKeyspace", Nil,"POST", """Create New Keyspace""", Routes.prefix + """createKeyspace"""))
        

// @LINE:17
private[this] lazy val controllers_Application_checkPreFlight4_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createKeyspace"))))
private[this] lazy val controllers_Application_checkPreFlight4_invoker = createInvoker(
controllers.Application.checkPreFlight(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checkPreFlight", Nil,"OPTIONS", """""", Routes.prefix + """createKeyspace"""))
        

// @LINE:20
private[this] lazy val controllers_Application_connectToCassandra5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("connectToCassandra"))))
private[this] lazy val controllers_Application_connectToCassandra5_invoker = createInvoker(
controllers.Application.connectToCassandra(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "connectToCassandra", Nil,"POST", """Connect to Cassandra""", Routes.prefix + """connectToCassandra"""))
        

// @LINE:21
private[this] lazy val controllers_Application_checkPreFlight6_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("connectToCassandra"))))
private[this] lazy val controllers_Application_checkPreFlight6_invoker = createInvoker(
controllers.Application.checkPreFlight(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checkPreFlight", Nil,"OPTIONS", """""", Routes.prefix + """connectToCassandra"""))
        

// @LINE:24
private[this] lazy val controllers_Application_getKeyspaces7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getKeyspaces"))))
private[this] lazy val controllers_Application_getKeyspaces7_invoker = createInvoker(
controllers.Application.getKeyspaces(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getKeyspaces", Nil,"POST", """Describe Keyspaces""", Routes.prefix + """getKeyspaces"""))
        

// @LINE:25
private[this] lazy val controllers_Application_checkPreFlight8_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getKeyspaces"))))
private[this] lazy val controllers_Application_checkPreFlight8_invoker = createInvoker(
controllers.Application.checkPreFlight(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "checkPreFlight", Nil,"OPTIONS", """""", Routes.prefix + """getKeyspaces"""))
        

// @LINE:29
private[this] lazy val controllers_Application_deleteKeyspace9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteKeyspace"))))
private[this] lazy val controllers_Application_deleteKeyspace9_invoker = createInvoker(
controllers.Application.deleteKeyspace(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteKeyspace", Nil,"POST", """Delete Keyspace""", Routes.prefix + """deleteKeyspace"""))
        

// @LINE:32
private[this] lazy val controllers_Application_getRows10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_getRows10_invoker = createInvoker(
controllers.Application.getRows(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRows", Seq(classOf[String], classOf[String]),"GET", """Read Cassandra Database""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:35
private[this] lazy val controllers_Application_addRow11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_addRow11_invoker = createInvoker(
controllers.Application.addRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]),"POST", """Insert a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:38
private[this] lazy val controllers_Application_deleteRow12_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_deleteRow12_invoker = createInvoker(
controllers.Application.deleteRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]),"DELETE", """Delete a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:41
private[this] lazy val controllers_Application_updateRow13_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_updateRow13_invoker = createInvoker(
controllers.Application.updateRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]),"PUT", """update a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:44
private[this] lazy val controllers_Application_createTable14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"))))
private[this] lazy val controllers_Application_createTable14_invoker = createInvoker(
controllers.Application.createTable(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTable", Seq(classOf[String]),"POST", """Create a table""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/"""))
        

// @LINE:47
private[this] lazy val controllers_Application_describeTable15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_describeTable15_invoker = createInvoker(
controllers.Application.describeTable(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "describeTable", Seq(classOf[String], classOf[String]),"GET", """Get table metadata""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_Application_deleteTable16_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteTable16_invoker = createInvoker(
controllers.Application.deleteTable(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTable", Seq(classOf[String], classOf[String]),"DELETE", """Drop a table""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_Application_addColumn17_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column"))))
private[this] lazy val controllers_Application_addColumn17_invoker = createInvoker(
controllers.Application.addColumn(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addColumn", Seq(classOf[String], classOf[String]),"POST", """Create a column""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column"""))
        

// @LINE:56
private[this] lazy val controllers_Application_AlterColumn18_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column/"),DynamicPart("column_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_AlterColumn18_invoker = createInvoker(
controllers.Application.AlterColumn(fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "AlterColumn", Seq(classOf[String], classOf[String], classOf[String]),"PUT", """Modify a column """, Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_Application_deleteColumn19_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column/"),DynamicPart("column_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteColumn19_invoker = createInvoker(
controllers.Application.deleteColumn(fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteColumn", Seq(classOf[String], classOf[String], classOf[String]),"DELETE", """Delete a column""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getDataFromCassandra""","""controllers.Application.getDataFromCassandra()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createKeyspace""","""controllers.Application.createKeyspace()"""),("""OPTIONS""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createKeyspace""","""controllers.Application.checkPreFlight()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connectToCassandra""","""controllers.Application.connectToCassandra()"""),("""OPTIONS""", prefix + (if(prefix.endsWith("/")) "" else "/") + """connectToCassandra""","""controllers.Application.checkPreFlight()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getKeyspaces""","""controllers.Application.getKeyspaces()"""),("""OPTIONS""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getKeyspaces""","""controllers.Application.checkPreFlight()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteKeyspace""","""controllers.Application.deleteKeyspace()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.getRows(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.addRow(keyspace_name:String, table_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.deleteRow(keyspace_name:String, table_name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.updateRow(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/""","""controllers.Application.createTable(keyspace_name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""","""controllers.Application.describeTable(keyspace_name:String, table_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""","""controllers.Application.deleteTable(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column""","""controllers.Application.addColumn(keyspace_name:String, table_name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""","""controllers.Application.AlterColumn(keyspace_name:String, table_name:String, column_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""","""controllers.Application.deleteColumn(keyspace_name:String, table_name:String, column_name:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:13
case controllers_Application_getDataFromCassandra2_route(params) => {
   call { 
        controllers_Application_getDataFromCassandra2_invoker.call(controllers.Application.getDataFromCassandra())
   }
}
        

// @LINE:16
case controllers_Application_createKeyspace3_route(params) => {
   call { 
        controllers_Application_createKeyspace3_invoker.call(controllers.Application.createKeyspace())
   }
}
        

// @LINE:17
case controllers_Application_checkPreFlight4_route(params) => {
   call { 
        controllers_Application_checkPreFlight4_invoker.call(controllers.Application.checkPreFlight())
   }
}
        

// @LINE:20
case controllers_Application_connectToCassandra5_route(params) => {
   call { 
        controllers_Application_connectToCassandra5_invoker.call(controllers.Application.connectToCassandra())
   }
}
        

// @LINE:21
case controllers_Application_checkPreFlight6_route(params) => {
   call { 
        controllers_Application_checkPreFlight6_invoker.call(controllers.Application.checkPreFlight())
   }
}
        

// @LINE:24
case controllers_Application_getKeyspaces7_route(params) => {
   call { 
        controllers_Application_getKeyspaces7_invoker.call(controllers.Application.getKeyspaces())
   }
}
        

// @LINE:25
case controllers_Application_checkPreFlight8_route(params) => {
   call { 
        controllers_Application_checkPreFlight8_invoker.call(controllers.Application.checkPreFlight())
   }
}
        

// @LINE:29
case controllers_Application_deleteKeyspace9_route(params) => {
   call { 
        controllers_Application_deleteKeyspace9_invoker.call(controllers.Application.deleteKeyspace())
   }
}
        

// @LINE:32
case controllers_Application_getRows10_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_getRows10_invoker.call(controllers.Application.getRows(keyspace_name, table_name))
   }
}
        

// @LINE:35
case controllers_Application_addRow11_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_addRow11_invoker.call(controllers.Application.addRow(keyspace_name, table_name))
   }
}
        

// @LINE:38
case controllers_Application_deleteRow12_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_deleteRow12_invoker.call(controllers.Application.deleteRow(keyspace_name, table_name))
   }
}
        

// @LINE:41
case controllers_Application_updateRow13_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_updateRow13_invoker.call(controllers.Application.updateRow(keyspace_name, table_name))
   }
}
        

// @LINE:44
case controllers_Application_createTable14_route(params) => {
   call(params.fromPath[String]("keyspace_name", None)) { (keyspace_name) =>
        controllers_Application_createTable14_invoker.call(controllers.Application.createTable(keyspace_name))
   }
}
        

// @LINE:47
case controllers_Application_describeTable15_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_describeTable15_invoker.call(controllers.Application.describeTable(keyspace_name, table_name))
   }
}
        

// @LINE:50
case controllers_Application_deleteTable16_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_deleteTable16_invoker.call(controllers.Application.deleteTable(keyspace_name, table_name))
   }
}
        

// @LINE:53
case controllers_Application_addColumn17_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_addColumn17_invoker.call(controllers.Application.addColumn(keyspace_name, table_name))
   }
}
        

// @LINE:56
case controllers_Application_AlterColumn18_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None), params.fromPath[String]("column_name", None)) { (keyspace_name, table_name, column_name) =>
        controllers_Application_AlterColumn18_invoker.call(controllers.Application.AlterColumn(keyspace_name, table_name, column_name))
   }
}
        

// @LINE:59
case controllers_Application_deleteColumn19_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None), params.fromPath[String]("column_name", None)) { (keyspace_name, table_name, column_name) =>
        controllers_Application_deleteColumn19_invoker.call(controllers.Application.deleteColumn(keyspace_name, table_name, column_name))
   }
}
        
}

}
     
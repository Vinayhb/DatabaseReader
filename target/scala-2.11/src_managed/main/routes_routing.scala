// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:4b16db957c9de3a96c46b17c065dd79fda1deb08
// @DATE:Sun Mar 08 21:41:34 CET 2015


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
        

// @LINE:12
private[this] lazy val controllers_Application_getRows2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_getRows2_invoker = createInvoker(
controllers.Application.getRows(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRows", Seq(classOf[String], classOf[String]),"GET", """Read Cassandra Database""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:15
private[this] lazy val controllers_Application_addRow3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_addRow3_invoker = createInvoker(
controllers.Application.addRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]),"POST", """Insert a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteRow4_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_deleteRow4_invoker = createInvoker(
controllers.Application.deleteRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]),"DELETE", """Delete a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:21
private[this] lazy val controllers_Application_updateRow5_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_updateRow5_invoker = createInvoker(
controllers.Application.updateRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]),"PUT", """update a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:24
private[this] lazy val controllers_Application_createTable6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"))))
private[this] lazy val controllers_Application_createTable6_invoker = createInvoker(
controllers.Application.createTable(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createTable", Seq(classOf[String]),"POST", """Create a table""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/"""))
        

// @LINE:27
private[this] lazy val controllers_Application_describeTable7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_describeTable7_invoker = createInvoker(
controllers.Application.describeTable(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "describeTable", Seq(classOf[String], classOf[String]),"GET", """Get table metadata""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_Application_deleteTable8_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteTable8_invoker = createInvoker(
controllers.Application.deleteTable(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteTable", Seq(classOf[String], classOf[String]),"DELETE", """Drop a table""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_Application_addColumn9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column"))))
private[this] lazy val controllers_Application_addColumn9_invoker = createInvoker(
controllers.Application.addColumn(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addColumn", Seq(classOf[String], classOf[String]),"POST", """Create a column""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column"""))
        

// @LINE:36
private[this] lazy val controllers_Application_AlterColumn10_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column/"),DynamicPart("column_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_AlterColumn10_invoker = createInvoker(
controllers.Application.AlterColumn(fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "AlterColumn", Seq(classOf[String], classOf[String], classOf[String]),"PUT", """Modify a column """, Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>"""))
        

// @LINE:39
private[this] lazy val controllers_Application_deleteColumn11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/column/"),DynamicPart("column_name", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteColumn11_invoker = createInvoker(
controllers.Application.deleteColumn(fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteColumn", Seq(classOf[String], classOf[String], classOf[String]),"DELETE", """Delete a column""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.getRows(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.addRow(keyspace_name:String, table_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.deleteRow(keyspace_name:String, table_name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.updateRow(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/""","""controllers.Application.createTable(keyspace_name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""","""controllers.Application.describeTable(keyspace_name:String, table_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>""","""controllers.Application.deleteTable(keyspace_name:String, table_name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column""","""controllers.Application.addColumn(keyspace_name:String, table_name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""","""controllers.Application.AlterColumn(keyspace_name:String, table_name:String, column_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/column/$column_name<[^/]+>""","""controllers.Application.deleteColumn(keyspace_name:String, table_name:String, column_name:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:12
case controllers_Application_getRows2_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_getRows2_invoker.call(controllers.Application.getRows(keyspace_name, table_name))
   }
}
        

// @LINE:15
case controllers_Application_addRow3_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_addRow3_invoker.call(controllers.Application.addRow(keyspace_name, table_name))
   }
}
        

// @LINE:18
case controllers_Application_deleteRow4_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_deleteRow4_invoker.call(controllers.Application.deleteRow(keyspace_name, table_name))
   }
}
        

// @LINE:21
case controllers_Application_updateRow5_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_updateRow5_invoker.call(controllers.Application.updateRow(keyspace_name, table_name))
   }
}
        

// @LINE:24
case controllers_Application_createTable6_route(params) => {
   call(params.fromPath[String]("keyspace_name", None)) { (keyspace_name) =>
        controllers_Application_createTable6_invoker.call(controllers.Application.createTable(keyspace_name))
   }
}
        

// @LINE:27
case controllers_Application_describeTable7_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_describeTable7_invoker.call(controllers.Application.describeTable(keyspace_name, table_name))
   }
}
        

// @LINE:30
case controllers_Application_deleteTable8_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_deleteTable8_invoker.call(controllers.Application.deleteTable(keyspace_name, table_name))
   }
}
        

// @LINE:33
case controllers_Application_addColumn9_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_addColumn9_invoker.call(controllers.Application.addColumn(keyspace_name, table_name))
   }
}
        

// @LINE:36
case controllers_Application_AlterColumn10_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None), params.fromPath[String]("column_name", None)) { (keyspace_name, table_name, column_name) =>
        controllers_Application_AlterColumn10_invoker.call(controllers.Application.AlterColumn(keyspace_name, table_name, column_name))
   }
}
        

// @LINE:39
case controllers_Application_deleteColumn11_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None), params.fromPath[String]("column_name", None)) { (keyspace_name, table_name, column_name) =>
        controllers_Application_deleteColumn11_invoker.call(controllers.Application.deleteColumn(keyspace_name, table_name, column_name))
   }
}
        
}

}
     
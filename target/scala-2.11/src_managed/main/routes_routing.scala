// @SOURCE:/media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/conf/routes
// @HASH:a1155fa4086fe573d6d8a587d97c70f68ca31662
// @DATE:Sun Mar 08 12:56:39 CET 2015


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
private[this] lazy val controllers_Application_getDataFromCassandra2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getDataFromCassandra"))))
private[this] lazy val controllers_Application_getDataFromCassandra2_invoker = createInvoker(
controllers.Application.getDataFromCassandra(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getDataFromCassandra", Nil,"POST", """Read Cassandra Database""", Routes.prefix + """getDataFromCassandra"""))
        

// @LINE:16
private[this] lazy val controllers_Application_addRow3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_addRow3_invoker = createInvoker(
controllers.Application.addRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRow", Seq(classOf[String], classOf[String]),"POST", """Insert a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:19
private[this] lazy val controllers_Application_deleteRow4_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_deleteRow4_invoker = createInvoker(
controllers.Application.deleteRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteRow", Seq(classOf[String], classOf[String]),"DELETE", """Delete a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        

// @LINE:22
private[this] lazy val controllers_Application_updateRow5_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("keyspace/"),DynamicPart("keyspace_name", """[^/]+""",true),StaticPart("/table/"),DynamicPart("table_name", """[^/]+""",true),StaticPart("/row"))))
private[this] lazy val controllers_Application_updateRow5_invoker = createInvoker(
controllers.Application.updateRow(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateRow", Seq(classOf[String], classOf[String]),"PUT", """update a row""", Routes.prefix + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getDataFromCassandra""","""controllers.Application.getDataFromCassandra()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.addRow(keyspace_name:String, table_name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.deleteRow(keyspace_name:String, table_name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """keyspace/$keyspace_name<[^/]+>/table/$table_name<[^/]+>/row""","""controllers.Application.updateRow(keyspace_name:String, table_name:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_getDataFromCassandra2_route(params) => {
   call { 
        controllers_Application_getDataFromCassandra2_invoker.call(controllers.Application.getDataFromCassandra())
   }
}
        

// @LINE:16
case controllers_Application_addRow3_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_addRow3_invoker.call(controllers.Application.addRow(keyspace_name, table_name))
   }
}
        

// @LINE:19
case controllers_Application_deleteRow4_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_deleteRow4_invoker.call(controllers.Application.deleteRow(keyspace_name, table_name))
   }
}
        

// @LINE:22
case controllers_Application_updateRow5_route(params) => {
   call(params.fromPath[String]("keyspace_name", None), params.fromPath[String]("table_name", None)) { (keyspace_name, table_name) =>
        controllers_Application_updateRow5_invoker.call(controllers.Application.updateRow(keyspace_name, table_name))
   }
}
        
}

}
     
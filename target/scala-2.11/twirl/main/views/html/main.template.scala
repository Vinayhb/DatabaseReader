
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html ng-app="myApp">
  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
    <script src=""""),_display_(/*8.19*/routes/*8.25*/.Assets.at("javascripts/main.js")),format.raw/*8.58*/(""""></script>	
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
<script type="text/javascript" src="http://jqueryui.com/latest/ui/ui.tabs.js"></script>
<link rel="stylesheet" type="text/css" href=""""),_display_(/*12.47*/routes/*12.53*/.Assets.at("stylesheets/styleTab.css")),format.raw/*12.91*/("""">
  </head>
  <body>



<div class="ui-tabs">
	<ul class="ui-tabs-nav">
		<li><a href="#tabs-1">Tab One</a></li>
		<li><a href="#tabs-2">CQL</a></li>
		<li><a href="#tabs-3">Tab Three</a></li>
	</ul>
	<div id="tabs-1" class="ui-tabs-panel">
		    <div ng-controller="MyController">
"""),format.raw/*26.1*/("""{"""),format.raw/*26.2*/("""{"""),format.raw/*26.3*/("""person.name"""),format.raw/*26.14*/("""}"""),format.raw/*26.15*/("""}"""),format.raw/*26.16*/("""
"""),format.raw/*27.1*/("""<form ng-submit="connectToDB()">
    <button type="submit">Connect</button><br>
</form>
<form ng-submit="sendPost()">
    <button type="submit">Get Keyspaces</button><br>
</form>

<form ng-submit="createSchema()">
    <input ng-model="scehmaName">
    <button type="submit">createSchema</button><br>
</form>
    </div>
	</div>
	<div id="tabs-2" class="ui-tabs-panel">
		<form>
		Enter Query:<br>
		<input type="text" name="query">
		<br>
		<button type="submit">Submit Query</button>
		</form>
	</div>
	<div id="tabs-3" class="ui-tabs-panel">
		<p>Content three.</p>
	</div>
</div>
  </body>
</html>

<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*56.30*/("""{"""),format.raw/*56.31*/("""
		"""),format.raw/*57.3*/("""$(".ui-tabs").tabs();
	"""),format.raw/*58.2*/("""}"""),format.raw/*58.3*/(""");
</script>

<!-- 
<html>
    <head>
        <title>"""),_display_(/*64.17*/title),format.raw/*64.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*65.54*/routes/*65.60*/.Assets.at("stylesheets/main.css")),format.raw/*65.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*66.59*/routes/*66.65*/.Assets.at("images/favicon.png")),format.raw/*66.97*/("""">
        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.at("javascripts/hello.js")),format.raw/*67.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*70.10*/content),format.raw/*70.17*/("""
    """),format.raw/*71.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 14 19:01:40 CET 2015
                  SOURCE: /media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/app/views/main.scala.html
                  HASH: cd581f60c9d5952fa3c1ff33ab9592e71a20ca28
                  MATRIX: 727->1|845->31|873->33|1062->196|1076->202|1129->235|1531->610|1546->616|1605->654|1915->937|1943->938|1971->939|2010->950|2039->951|2068->952|2096->953|2786->1615|2815->1616|2845->1619|2895->1642|2923->1643|3004->1697|3030->1702|3119->1764|3134->1770|3189->1804|3277->1865|3292->1871|3345->1903|3397->1928|3412->1934|3467->1968|3561->2035|3589->2042|3621->2047
                  LINES: 26->1|29->1|31->3|36->8|36->8|36->8|40->12|40->12|40->12|54->26|54->26|54->26|54->26|54->26|54->26|55->27|84->56|84->56|85->57|86->58|86->58|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|98->70|98->70|99->71
                  -- GENERATED --
              */
          
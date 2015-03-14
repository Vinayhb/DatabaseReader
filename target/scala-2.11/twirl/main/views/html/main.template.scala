
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

<html ng-app="DBReader">
  <head>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
    <script src=""""),_display_(/*8.19*/routes/*8.25*/.Assets.at("javascripts/main.js")),format.raw/*8.58*/("""" type="text/javascript"></script>	
  </head>
  <body>
    <div ng-controller="MyController">
"""),format.raw/*12.1*/("""{"""),format.raw/*12.2*/("""{"""),format.raw/*12.3*/("""person.name"""),format.raw/*12.14*/("""}"""),format.raw/*12.15*/("""}"""),format.raw/*12.16*/("""
"""),format.raw/*13.1*/("""<form ng-submit="sendPost()">
    <input ng-model="name"/>
    <button type="submit">Send</button>
</form>
    </div>
  </body>
</html>

<!-- 
<html>
    <head>
        <title>"""),_display_(/*24.17*/title),format.raw/*24.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.at("stylesheets/main.css")),format.raw/*25.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.at("images/favicon.png")),format.raw/*26.97*/("""">
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.at("javascripts/hello.js")),format.raw/*27.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*30.10*/content),format.raw/*30.17*/("""
    """),format.raw/*31.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 14 11:41:32 CET 2015
                  SOURCE: /media/shree/D/chowta/classes/1/web2.0/shreeProject/webServerProject/app/views/main.scala.html
                  HASH: 3bdb7cec4a33a02a62076418bc10c28af3181104
                  MATRIX: 727->1|845->31|873->33|1065->199|1079->205|1132->238|1253->332|1281->333|1309->334|1348->345|1377->346|1406->347|1434->348|1638->525|1664->530|1753->592|1768->598|1823->632|1911->693|1926->699|1979->731|2031->756|2046->762|2101->796|2195->863|2223->870|2255->875
                  LINES: 26->1|29->1|31->3|36->8|36->8|36->8|40->12|40->12|40->12|40->12|40->12|40->12|41->13|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|58->30|58->30|59->31
                  -- GENERATED --
              */
          
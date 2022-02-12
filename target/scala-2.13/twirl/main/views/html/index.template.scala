
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import controllers.Post
/*2.2*/import java.time.format.DateTimeFormatter

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[Post],Form[PostRequest],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(posts: Seq[Post], form: Form[PostRequest])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.74*/("""
"""),format.raw/*5.1*/("""<!--<!DOCTYPE html>-->
<html lang="ja">
<head>
  <title>Scala Text Textboard</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" href="/assets/textboard.css">
</head>
<body>
<div class="container">
  <h1>"""),_display_(/*14.8*/Messages("textboard.title")),format.raw/*14.35*/("""</h1>
  """),_display_(/*15.4*/for(error <- form.errors) yield /*15.29*/{_display_(Seq[Any](format.raw/*15.30*/("""
  """),format.raw/*16.3*/("""<p class="text-danger" id="error">"""),_display_(/*16.38*/Messages(error.message)),format.raw/*16.61*/("""</p>
  """)))}),format.raw/*17.4*/("""
  """),format.raw/*18.3*/("""<form method="POST" action="/" class="form-inline">
    <input type="text" class="form-control" id="post" name="post">
    <button type="submit" class="btn btn-default">"""),_display_(/*20.52*/Messages("textboard.send")),format.raw/*20.78*/("""</button>
  </form>
  <table class="table">
    <thead>
    <tr><th>"""),_display_(/*24.14*/Messages("textboard.dateTime")),format.raw/*24.44*/("""</th><th>"""),_display_(/*24.54*/Messages("textboard.message")),format.raw/*24.83*/("""</th></tr>
    </thead>
    <tbody>
    """),_display_(/*27.6*/for(post <- posts.reverse) yield /*27.32*/{_display_(Seq[Any](format.raw/*27.33*/("""
    """),format.raw/*28.5*/("""<tr>
      <td class="post-date">"""),_display_(/*29.30*/{
        val formatter = DateTimeFormatter.ofPattern(Messages("textboard.dateFormat"), messages.lang.toLocale)
        post.date.format(formatter)
        }),format.raw/*32.10*/("""</td>
      <td class="post-body">"""),_display_(/*33.30*/post/*33.34*/.body),format.raw/*33.39*/("""</td>
    </tr>
    """)))}),format.raw/*35.6*/("""
    """),format.raw/*36.5*/("""</tbody>
  </table>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(posts:Seq[Post],form:Form[PostRequest],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(posts,form)(messages)

  def f:((Seq[Post],Form[PostRequest]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (posts,form) => (messages) => apply(posts,form)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: f42172ee15e10767dca4cca97a16297d3178ed2d
                  MATRIX: 432->1|463->27|839->73|1006->145|1034->147|1466->553|1514->580|1550->590|1591->615|1630->616|1661->620|1723->655|1767->678|1806->687|1837->691|2036->863|2083->889|2183->962|2234->992|2271->1002|2321->1031|2391->1075|2433->1101|2472->1102|2505->1108|2567->1143|2748->1303|2811->1339|2824->1343|2850->1348|2903->1371|2936->1377
                  LINES: 17->1|18->2|23->4|28->4|29->5|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|42->18|44->20|44->20|48->24|48->24|48->24|48->24|51->27|51->27|51->27|52->28|53->29|56->32|57->33|57->33|57->33|59->35|60->36
                  -- GENERATED --
              */
          
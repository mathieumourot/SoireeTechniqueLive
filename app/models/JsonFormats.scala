package models

import reactivemongo.play.json._
import play.api.libs.json._

object JsonFormats {

  implicit val todoFormat = Json.format[Todo]

}

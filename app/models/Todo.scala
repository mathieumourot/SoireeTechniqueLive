package models

import reactivemongo.bson.BSONObjectID

case class Todo(_id : Option[BSONObjectID], title: String, done: Option[Boolean])

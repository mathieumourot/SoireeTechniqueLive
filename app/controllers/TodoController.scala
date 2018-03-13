package controllers

import javax.inject.Inject

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import reactivemongo.bson.BSONObjectID
import repositories.TodoRepository
import models.JsonFormats._
import models.Todo

import scala.concurrent.{ExecutionContext, Future}

class TodoController @Inject()(implicit ec: ExecutionContext, cc: ControllerComponents, todoRepo: TodoRepository) extends AbstractController(cc){

  def findAll = Action.async {
    Future.successful(NotImplemented)
  }

  def findOne(id : BSONObjectID) = Action.async {
    Future.successful(NotImplemented)
  }

  def create = Action.async {
    Future.successful(NotImplemented)
  }

  def update(id : BSONObjectID) = Action.async {
    Future.successful(NotImplemented)
  }

  def delete(id : BSONObjectID) = Action.async {
    Future.successful(NotImplemented)
  }

}

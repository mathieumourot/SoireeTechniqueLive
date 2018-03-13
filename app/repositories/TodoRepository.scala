package repositories

import javax.inject.Inject

import models.Todo
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{BSONDocument, BSONObjectID}

import scala.concurrent.{ExecutionContext, Future}

class TodoRepository @Inject()(implicit ec: ExecutionContext, reactiveMongoApi: ReactiveMongoApi){
  def todoCollection = reactiveMongoApi.database.map( _.collection("todo"))

  def findAll : Future[Seq[Todo]] = ???

  def findOne(id: BSONObjectID):Future[Option[Todo]] = ???

  def create(todo : Todo): Future[WriteResult] = ???

  def update(id: BSONObjectID, todo: Todo) = ???

  def delete(id: BSONObjectID): Future[Option[Todo]] = ???

}

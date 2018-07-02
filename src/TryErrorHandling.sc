import scala.util.{Try, Success, Failure}

val outcome = Try(10 / 0)
outcome.isSuccess
outcome.isFailure

outcome match {
  case Success(value) => println("computation was ok")
  case Failure(e) => println("computation failed," + e.getMessage)
}
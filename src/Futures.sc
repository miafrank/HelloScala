import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val fut = Future{ Thread.sleep(10000); 21 + 21}

fut.isCompleted

new java.util.Date()
new java.util.Date()

fut.isCompleted
fut.value

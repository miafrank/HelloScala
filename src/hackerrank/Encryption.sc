import scala.math._

val input = "haveaniceday"

def encryption(in: String): Unit = {
  val L  = in.length.toDouble
  val row = sqrt(L).floor.toInt
  val col = sqrt(L).ceil.toInt

  in.grouped(row).toArray




}
val splitString = input.grouped(3).toArray.map(_.toCharArray)






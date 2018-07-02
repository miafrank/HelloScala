def toInts(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }
}

val arguments = List("10", "eight", "5", "four", "8", "20", "one")

arguments.map(toInts(_))
arguments.flatMap(toInts(_))
arguments.flatMap(toInts(_)).sum
arguments.map(toInts(_)).flatten.sum


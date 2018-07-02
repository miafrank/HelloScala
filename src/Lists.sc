val weekDays = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: Nil

val weekendDays = List("Sat", "Sun")

val days = weekDays ::: weekendDays

val daysAgain = List(weekDays, weekendDays).flatten

val dayIndices = List(1,2,3,4,5,6,7)
dayIndices zip dayIndices

weekDays.head
weekDays.tail
weekDays.last
weekDays.size
weekDays.reverse
weekDays(1)
weekDays.contains("Mon")

for (c <- weekDays) println(c)

days forall (_ != "monday")

days endsWith weekendDays
days startsWith weekDays

val numbers = List(1,2,3,4)
numbers.head
numbers.tail
numbers.init
numbers.last

numbers :+ 5
val add = 5
numbers :+ add

0 +: numbers
0 +: numbers :+ 5
numbers

numbers ++ List(5,6,7)
List(-1,0) ++ numbers
numbers

numbers.drop(1)
numbers.dropRight(1)
numbers.dropWhile(_ <3)
numbers





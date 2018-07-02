//For Loop as statement
val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

for(day <- daysOfWeekList)
{
  day match {
    case "Mon" => println("Manic Monday")
    case otherDay => println(otherDay)
  }
}

//For loop as Expression
val x = for(day <- daysOfWeekList) yield
  {
    day match {
      case "Mon" => "Manic Monday"
      case otherDay => otherDay
    }
  }

//Dreaded while loop in Scala
var a = 0

while(a < daysOfWeekList.size) {
  println(daysOfWeekList(a))
  a+=1
}
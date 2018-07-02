//Pattern Matching
val dayOfWeek = "Monday"
val typeOfDay = dayOfWeek match{
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
}

//or operator
val dayOfWeek2 = "Saturday"
val typeOfDay2 = dayOfWeek2 match{
  case "Monday" => "Manic Monday"
  case "Sunday"|"Saturday" => "Lazy weekend"
  case "Tuesday"|"Wednesday"|"Thursday"|"Friday" => "Other working day"
}

//pattern guard
val typeOfDay3 = dayOfWeek2 match{
  case "Monday" => "Manic Monday"
  case "Tuesday"|"Wednesday"|"Thursday"|"Friday" => "Other working day"
  case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday"
  case someOtherDay if someOtherDay == "Saturday" => "Sizzling Saturday"
}

//catch all with value binding
val dayOfWeek4 = "Friday"
val typeOfDay4 = dayOfWeek4 match{
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case someOtherDay => {
    println(s"Some other day - neither Sunday nor Monday, its $someOtherDay")
    someOtherDay
  }
}

//catch all with wildcard
val dayOfWeek5 = "Friday"
val typeOfDay5 = dayOfWeek5 match{
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case _ => {
    println(s"Some other day - neither Sunday nor Monday, its $dayOfWeek5")
    dayOfWeek5
  }
}

val radius3:Any = 10
val typeOfRadius = radius3 match{
  case radius3:Int => "Integer"
  case radius3:String => "String"
  case radius3:Double => "DOuble"
  case _ => "Any"
}

val numbers = List(1, 2, 3)
//Lot of code and looks ugly with if else
if (numbers.nonEmpty && numbers.size >=2) println(numbers(1)) else println("found nothing")

val number = 99

number match {
  case 0 => "zero"
  case 5 => "five"
  case 9 => "nine"
  case _ => "nothing match"
}

case class Book(title: String, yearPublished: Integer, author: String, isbn: String)

val HP1 = Book("Harry Potter 1", 2016, "JKRowling", "12345")
val HP2 = Book("Harry Potter 2", 2017, "JKRowling", "12346")
val HP3 = Book("Harry Potter 3", 2018, "JKRowling", "123457")

HP1 match {
  case Book(title, yearPublished, author, isbn) => println("Cool")
  case _ => println("Not cool")
}

HP2 match {
  case Book(_, _, author, _) => author
  case _ => "None"
}

numbers match {
  case List(_, second, _*) => second
  case _ => "not found"
}



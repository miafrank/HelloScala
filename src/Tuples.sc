val personInfo = ("Nora", "Harris", 26, "F")

val genderPair = "Nora" -> "F"

personInfo.productIterator.foreach{i => println("Value = " + i)}

val (firstName, lastName, age, gender) = personInfo

personInfo._1
personInfo._2
personInfo._3
personInfo._4

def printPersonGender(name:String, gender:String) = println(s"Name:$name M/F:$gender")

(printPersonGender _).tupled(genderPair)

personInfo.productArity


val sampleGrades = Array(73,67,38,33)

def samGrades(grades: Array[Int]) : Array[Int] = {

//  def roundUpBoolean(grade: Int, round: Int) : Boolean = {
//    val gradeDouble = grade.toDouble
//    val roundDouble = round.toDouble
//
//    val roundedGrade = (((gradeDouble/roundDouble)*roundDouble)+roundDouble)
//
//    roundedGrade - grade < 3
//  }

  def roundUp(grade: Int, round:Int) : Int = {
    val gradeDouble = grade.toDouble
    val roundDouble = round.toDouble

    val roundedGrade = (((gradeDouble/roundDouble)*roundDouble)+roundDouble)

    if (roundedGrade-gradeDouble < 3)
      roundedGrade.toInt
    else
      gradeDouble.toInt
  }

  val newGrades = for (g <- grades) yield {
    g match {
      case x if x<38 => g
      case _ => roundUp(g, 5)
    }
  }
  newGrades
}

samGrades(sampleGrades)

def roundUp(g: Int, r:Int) = {
  val gD = g.toDouble
  val rD = r.toDouble

  val roundedGrade = (((gD/rD)*rD)+rD)

  roundedGrade
}

roundUp(38,10)

val gg = 38.0
val rr = 5.0

val rounded = (((gg/rr)*rr)+rr)










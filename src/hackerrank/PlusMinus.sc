val sampleArray: Array[Int] = Array(-4,3,-9,0,4,1)


def answer(array: Array[Int], choice: String) : Double = {
  val arrayDoubles: Array[Double] = array.map(_.toDouble)
  val arraySize = arrayDoubles.length

  val chosenArray = {
    choice match {
      case "pos" => arrayDoubles.filter(_>0)
      case "neg" => arrayDoubles.filter(_<0)
      case "zero" => arrayDoubles.filter(_==0)
    }
  }
  chosenArray.length/arraySize
}

answer(sampleArray, "pos")
answer(sampleArray,"neg")
answer(sampleArray,"zero")








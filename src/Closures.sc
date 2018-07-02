def getAreaClosure = {
  val PI = 3.14159
  val getArea = (radius:Double) => {
    PI * radius * radius
  }:Double
  getArea
}

val PI = 3.1
val r = 10

val areaCalculator:(Double)=>Double = getAreaClosure

areaCalculator(r)

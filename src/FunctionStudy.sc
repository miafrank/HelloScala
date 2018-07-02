//function
val getArea = (radius:Double) =>
  {
  val PI = 3.14
  PI * radius * radius
}:Double

//method
def getArea2 (radius:Double):Double = {
  val PI = 3.14
  PI * radius * radius
}

getArea(10)
getArea2(10)

//Converting methods to functions
val PI = 3.14
val r = 10

def getCircleArea(r:Double):Double = PI * r * r

val calcCircleArea: (Double) => Double = getCircleArea()




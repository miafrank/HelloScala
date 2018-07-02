val PI = 3.14
val r = 10

def getCircleArea(r:Double):Double = PI * r * r

//val calcCircleArea: (Double) => Double = getCircleArea

val calcCircleArea = getCircleArea _

calcCircleArea(13)





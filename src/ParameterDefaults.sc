def getCircleStats(PI:Double = 3.14, r:Double) = {
  def getCircleArea(r:Double) = PI * r * r
  def getCircleCircumference(r:Double) = 2 * PI * r
  (getCircleArea(r), getCircleCircumference(r))
}

getCircleStats(r=10)
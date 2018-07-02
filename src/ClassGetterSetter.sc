class Point {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue
    else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue
    else printWarning
  }

  private def printWarning = println("WARNING: Out of Bounds")
}

val point1 = new Point
point1.x
point1.x = 99
point1.x
point1.y
point1.y = 101

class Point2(val x: Int, val y: Int)
val point2 = new Point2(1 , 2)
point2.x

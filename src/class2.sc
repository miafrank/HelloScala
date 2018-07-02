class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x, $y)"
}

val point1 = new Point(2, 3)
point1.x
println(point1)
point1.move(3, 0)
point1.x
println(point1)

class Point2(var x: Int = 0, var y: Int = 0)
val origin = new Point2
val point2 = new Point2(1)
val point3 = new Point2(y=3)
origin.x
point2.x
point3.x
point3.y




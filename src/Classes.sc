class Greeter(prefix: String, suffix: String) {
  def greet(name: String): String =
    s"$prefix$name$suffix"

  def extra(name: String): String =
    s"Awesome $name"

}

val greeter = new Greeter("Hello, ", "!")
greeter.greet("Nora")

greeter.greet(greeter.extra("Nora"))
greeter.extra("Nora")
greeter.greet(greeter.extra("job"))

case class Point(x: Int, y: Int)
val point = Point(1, 2)
val anotherPoint = Point(1,2)
val yetAnotherPoint = Point(2,2)

if (point == anotherPoint) {
  s"$point and $anotherPoint are the same."
} else {
  s"$point and $anotherPoint are different."
}

if (point == yetAnotherPoint) {
  s"$point and $yetAnotherPoint are the same."
} else {
  s"$point and $yetAnotherPoint are different."
}


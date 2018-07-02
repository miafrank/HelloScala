import scala.annotation.tailrec

def ternary(x:Boolean): Int =
x match {
  case true => 1
  case false => 2
}

ternary(true)
ternary(false)

def fib(x:Int):Int = {
  @tailrec
  def fibHelper(x:Int, prev:Int=0, next:Int=1): Int =
    x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x-1, next, (next+prev))
    }
  fibHelper(x)
}

fib(3)

List("abcd", "efgh").map(_.toUpperCase())
List("abcd", "efgh").flatMap(_.toUpperCase())


trait Greeter{def greet(name: String): Unit = println("Hello, " + name + "!")}

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val test = new CustomizableGreeter("Ms.", "The Coolest")
test

val x = "Nora"
val y = s"Hello ${x}"

val func = (x:Int) => {x * -1}
func(4)


var x = 5
val y = 5
val z: Double = 6

def f(x: Int) = { x*x }
def fx(x: Any) = println(x)
f(x)
fx(x)

val a = 1 + 1

var b = 2
println(b)
b = 3
println(b)

val c: Double = 2

(x: Int) => x + 1

val addOne = (d: Double) => d + 1
addOne(4)


val add = (e: Int, f: Int) => e + f
add(4,5)

val getTheAnswer = () => 42
getTheAnswer()

def methodAdd(parameter: Int, parameter2: Int): Int = parameter + parameter2
methodAdd(4,5)

def addThenMultiply(g: Int, h: Int)(multiplier: Int): Int = (g + h)*multiplier
addThenMultiply(4,5)(1)

def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")

def getSquareString(input: Double): String = {
  val square = input * input
  square.toString
}

getSquareString(3)



























def square(x: Int) = x * x

square(2)

1+2

print("Hello, World!")

//these doesn't return anything - Unit = Void
def printAny(x: Any) = println(x)
def printAnyVal(y: AnyVal) = println(y)
def printAnyRef(z: AnyRef) = println(z)

//now create some values
val someVal = 5
val someRef = List(3,5)

//invoke the above functions using values to see how AnyRef and AnyVal descend from Any
printAny(someVal)
printAny(someRef)
printAnyVal(someVal)
printAnyRef(someRef)

//String interpolation
val name = "Nora"
val greeting = "Hello"
s"$greeting $name I hope you're having a great day1"
s"${greeting*2} $name, I hope you're having a great day!"

val newString = s"$greeting $name"

//Immutable data, can not define same value more than once
val PI = 3.14159

//Mutable, can change value but not the type
var radius = 10
radius = 12

//Expression block with Outer and Inner scope
val area = {
  val PI = 3.1
  println(s"Inside scope 1, PI = $PI");
  {
    val PI = 3.14
    println(s"Inside scope 2, PI = $PI")
    PI * radius * radius
  }
  PI * radius * radius
}
//If you comment out last line of expression block, it will use
//the inner scope value of PI

//If/Else
val numer: Double = 22
val denom: Double = 7

val newPI = if(denom != 0) {numer/denom} else {None}

//Example of nothing return value
val numer2: Double = 22
val denom2: Double = 0

val newPI2 = if(denom2 != 0) {numer2/denom2}








def sayHelloTo(name:String):String = {
  println(s"Hello $name")
  println(s"Yet again, hello $name")
  name
}

def addGreeting(x:String):String = {
  println("Adding greeting")
  s"Respected Dear $x"
}

def sayHelloToByName(name: => String):String = {
  println(s"Hello $name")
  println(s"Yet again, hello $name")
  name
}

//Submit literal parameter
sayHelloTo("Nora")
sayHelloToByName("Nora")

sayHelloTo(addGreeting("Nora"))
sayHelloToByName(addGreeting("Nora"))


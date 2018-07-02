import scala.collection.mutable.ArrayBuffer

trait Greeter {
  def greet(name: String):Unit
}

trait Greeter2 {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends Greeter2

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("Nora")

val customizableGreeter = new CustomizableGreeter("How are you, ", "?")
customizableGreeter.greet("Nora")

trait HairColor

trait Iterator[A]{
  def hasNext: Boolean
  def next(): A
}

class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    }else 0
  }
}

val iterator = new IntIterator(10)
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()

trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

val dog = new Dog("Jack")
val dog1 = new Dog("Marley")

val animals = ArrayBuffer.empty[Pet]
animals.append(dog)
animals.append(dog1)
animals.foreach(pet => println(pet.name))

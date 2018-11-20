package demo
trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

trait Phones[A]{
  def likePhone(x : A) : Boolean
}

//Traits are a bit like an interface but can have a default implementation (they dont have to)
trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}
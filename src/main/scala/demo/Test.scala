package demo

object Test {
  def main(args: Array[String]): Unit = {
    println("Hello World!!")
    Beginner.BeginnerMain() // GOTO HERE FIRST
    return
    //Make a Function
    val multiplyTen = (x: Int) => x * 10
    val a :Int = multiplyTen(5)
    println(a)

    //Make a Method
    def addTogether(x: Int, y: Int): Int = x + y
    println(addTogether(4,5))

    //Make a multi-parameter Method
    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3))

    //Make object of the person class
    val geoff = new Person("Geoff", "Barnes")
    println(geoff.getName)


    //Case Classes can be compared to one another.
    case class Point(x: Int, y: Int)
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(point + " and " + anotherPoint + " are the same.")
    } else {
      println(point + " and " + anotherPoint + " are different.")
    }

    //Tuples have similarities to Case Classes
    val ingredient = ("Sugar" , 25):Tuple2[String, Int]
    println(ingredient._1) // Sugar
    println(ingredient._2) // 25
    val (name, quantity) = ingredient
    println(name) // Sugar
  //MORE TUPLES
    val IngredientList = List(("Sugar",250),("Eggs",6),("Milk",100))
    for((x,y) <- IngredientList){
      println("Need: " + y + " Lots of " + x)
    }

    //Use my object defined below
    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2

    val newValet = new Valet
    newValet.greet("Craig")

    val counter = new IntIterator(25)
    while (counter.hasNext){
      println(counter.next())
    }

    //Example of map function which is a "higher-order" function
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)
    for (a <- salaries){
      println(a)
    }

    val t = new Tester()
    println(t.likePhone("07800711223"))

  }
}

//Objects are single instances of their own definitions.
// You can think of them as singletons of their own classes.
object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}


//here my valet class implements the greeter trait, but overrides the greet method.
class Valet extends Greeter {
  override def greet(name: String): Unit = println("My Overridden greeting is: Hello, " + name)
}


class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

class Tester() extends Phones[String] {
  override def likePhone(x: String): Boolean = x.substring(0,2) == "07"
}
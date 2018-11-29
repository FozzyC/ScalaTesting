package demo

object Beginner{


  val d = Nil
  val c = 3 :: d
  val b = 2 :: c
  val a = 1 :: b

  println(a.tail)
  println(b.tail)
  println(c.tail)

/*
  def summation(x: Int, y: Int ⇒ Int) = y(x)

  var incrementer = 3
  def closure = (x: Int) ⇒ x + incrementer

  val result = summation(10, closure)
  println("Result: " + result)

  incrementer = 4
  val result2 = summation(10, closure)
println("Result2: " + result2)

  val a = List(1, 3, 5, 7)
  println(a.reduceLeft(_ + _)) //adds from left to right to return single number (16)

*/
  def BeginnerMain(): Unit ={
    val idList : List[Int] = List(1,10,20,40,60,80,12,24,48,2,1,3,45,50,55)
    idList.foreach(f => println(f))

val x = new Words("Leaves","eaves")
    println(x.funnel())
    val y = new Words("Leaves","Xves")
    println(y.funnel())

  }
  case class Words(word1:String, word2: String) {
    def funnel(): Boolean = {
    if(word1.length < word2.length)
    {
      return word2.contains(word1)
    }
     else if (word2.length < word1.length)
        {
          return word1.contains(word2)
        }
      return false
    }
  }
}

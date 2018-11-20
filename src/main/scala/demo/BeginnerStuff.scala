package demo

object Beginner{
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

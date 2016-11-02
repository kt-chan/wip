package week3

object Hello {

  def main(args: Array[String]) {
    val t1 = new NonEmpty(3)
    val t2 = t1 incl 4
    val t3 = t2 incl 2
    val t4 = t1 union t2
    
    println(t1)
    println(t2)
    println(t3)
    println(t4)
  }

}
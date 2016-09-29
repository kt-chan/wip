package week3

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t1 = new NonEmpty(3)                        //> t1  : week3.NonEmpty = {.<-3->.}
  val t2 = t1 incl 4                              //> t2  : week3.IntSet = {.<-3->{.<-4->.}}
  val t3 = t2 incl 2                              //> t3  : week3.IntSet = {{.<-2->.}<-3->{.<-4->.}}
  val t4 = t1 union t2                            //> t4  : week3.IntSet = {.<-3->{.<-4->.}}
}
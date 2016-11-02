package week3

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(27); 
  val t1 = new NonEmpty(3);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(21); 
  val t2 = t1 incl 4;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(21); 
  val t3 = t2 incl 2;System.out.println("""t3  : week3.IntSet = """ + $show(t3 ));$skip(23); 
  val t4 = t1 union t2;System.out.println("""t4  : week3.IntSet = """ + $show(t4 ))}
}

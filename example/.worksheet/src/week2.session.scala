package week2

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet for week2");$skip(112); 
  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
  product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(46); 
  
  def fact(n: Int) = product(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(10); val res$1 = 
  fact(5);System.out.println("""res1: Int = """ + $show(res$1))}
  
}

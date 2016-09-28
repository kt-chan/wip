package week3


object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(29); 
  val x = new Rational(1, 2);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(2, 3);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(11); val res$0 = 
  x.add(y);System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(11); val res$1 = 
  x.sub(y);System.out.println("""res1: week3.Rational = """ + $show(res$1));$skip(11); val res$2 = 
  y.add(y);System.out.println("""res2: week3.Rational = """ + $show(res$2))}
}

class Rational(x: Int, y: Int) {
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def add(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def neg = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = {
    numer + "/" + denom
  }
}

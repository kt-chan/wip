package week3

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational(1, 2)                      //> x  : week3.Rational = 1/2
  val y = new Rational(2, 3)                      //> y  : week3.Rational = 2/3
  x.add(y)                                        //> res0: week3.Rational = 7/6
  x.sub(y)                                        //> res1: week3.Rational = 1/-6
  y.add(y)                                        //> res2: week3.Rational = 4/3

  val z = new Rational(1, 1)                      //> z  : week3.Rational = 1/1
  val z2 = new Rational(1)                        //> z2  : week3.Rational = 1/1
}

class Rational(x: Int, y: Int) {

  def this(x: Int) = this(x, 1)

  require(y != 0, "denominator must be none zero")
  assert(y > 0, "denominator should be larger than zero")
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
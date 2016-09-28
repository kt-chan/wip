package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(100)                                       //> res1: Double = 10.000052895642693
  sqrt(1e-60)                                     //> res2: Double = 1.0000000031080745E-30
  sqrt(1e60)                                      //> res3: Double = 1.0000000031080746E30
}
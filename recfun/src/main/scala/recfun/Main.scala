package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    if (c == 0 || c == r) 1
    else (pascal(c - 1, r - 1) + pascal(c, r - 1))

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    @tailrec
    def inner(chars: List[Char], count: Int): Boolean = {

      if (chars.isEmpty) count == 0
      else {
        if (count < 0) false;
        else {
          val x: Char = chars.head;
          val t: List[Char] = chars.tail;
          if (x.equals('(')) inner(t, count + 1)
          else if (x.equals(')')) inner(t, count - 1)
          else inner(t, count);
        }
      }
    }
    inner(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def innerCount(money: Int, coins: List[Int], cnt: Int): Int =
      if (money < 0) cnt //Not a change, keep cnt
      else if (coins.isEmpty) {
        if (money == 0) cnt + 1 else cnt // plus cnt if find a change
      } else {
        innerCount(money, coins.tail, cnt) + innerCount(money - coins.head, coins, cnt)
      }
    innerCount(money, coins, 0)
  }
}

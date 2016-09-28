import example.Lists

object Main extends App {
  try { println(Lists.max(List())) } catch { case e: java.util.NoSuchElementException => e.printStackTrace() }
  try { println(Lists.sum(List())) } catch { case e: java.util.NoSuchElementException => e.printStackTrace() }
  println(Lists.max(List(1, 3, 2)))
  println(Lists.max(List(-1, 0, 2)))
  println(Lists.max(List(21, -3, 0)))
  println(Lists.sum(List(3, -3, 0)))
  println(Lists.sum(List(1, 2, 3)))
}
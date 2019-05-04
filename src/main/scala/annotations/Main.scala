package annotations

import scala.annotation.tailrec

object Main {
  @deprecated("deprecation message", "release # which deprecates method")
  def hello = "hola"
  def factorial(x: Int): Int = {

    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
    }
    factorialHelper(x, 1)
  }
  class Point(val x: Double = 0, val y: Double = 0)
  def main(args: Array[String]): Unit = {
    println(hello)
    println(factorial(3))
    val point = new Point(1)
  }
}

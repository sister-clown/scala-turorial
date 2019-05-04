package name.parameteers

object Main {
  def main(args: Array[String]): Unit = {
    def whileLoop(condition: => Boolean)(body: => Unit): Unit =
      if (condition) {
        println(body)
        body
        whileLoop(condition)(body)
      }

    var i = 2

    whileLoop (i > 0) {
      println(i)
      i -= 1
    }
  }
}

package named

object Main {
  def main(args: Array[String]): Unit = {
    def printName(first: String, last: String): Unit = {
      println(first + " " + last)
    }
    printName("Smith", last = "john")
  }
}

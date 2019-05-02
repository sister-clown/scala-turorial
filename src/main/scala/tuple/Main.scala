package tuple

object Main {
  def main(args: Array[String]): Unit = {
    def tuple = ("elphelt", 3)
    println(tuple)
    println(tuple._1)
    println(tuple._2)
    var (name, age) = tuple
    println(name)
    println(age)
    val planets =
      List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
        ("Mars", 227.9), ("Jupiter", 778.3))

    planets.foreach{
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a * b)
    }
  }
}

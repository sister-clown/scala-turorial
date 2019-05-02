package classes

object main {
  def main(args: Array[String]): Unit = {
    val point1 = new Point
    point1.x = 99
    point1.y = 101
    point1.x_=(3)
    point1.setY(3)
    println(point1.getX)
    println(point1.x)
  }
}

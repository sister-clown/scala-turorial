object Method extends App {
  def add(x: Int, y: Int): Int = x + y
  def addThenMultiply(x: Int, y: Int)(z: Int)(multiplier: Int): Int = (x + y + z) * multiplier
  def name: String = System.getProperty("user.name")
  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }

  println(add(2, 1))
  println(addThenMultiply(1, 2)(2)(3))
  println(name)
  println(getSquareString(3))
}

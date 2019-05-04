package operators

object Main {
  def main(args: Array[String]): Unit = {
    case class Vec(val x: Double, val y: Double) {
      def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
    }

    val vector1 = Vec(1.0, 1.0)
    val vector2 = Vec(2.0, 2.0)

    val vector3 = vector1 + vector2
    println(vector3.x)  // 3.0
    println(vector3.y)  // 3.0
  }
}

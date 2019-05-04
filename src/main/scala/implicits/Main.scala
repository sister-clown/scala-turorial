package implicits
import scala.language.implicitConversions
object Main {
  implicit def list2ordered[A](x: List[A]): Ordered[List[A]] =
    new Ordered[List[A]] {
      //replace with a more useful implementation
      def compare(that: List[A]): Int = 1
    }
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3) <= List(1, 2,3))
  }
}

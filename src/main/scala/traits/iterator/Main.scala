package traits.iterator

object Main {
  def main(args: Array[String]): Unit = {
    def test = new DefaultTrait('X', 'Y', 'Z')
    println(test.getClass)
    println(test.getA)
    println(test.age)
    println(test.name)
    test.pX = 3

  }
}

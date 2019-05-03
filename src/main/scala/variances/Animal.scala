package variances

abstract class Animal {
  def name: String
}

class Cat(val name: String) extends Animal {
}

case class MikeCat(override val name: String) extends Cat(name) {
}

case class Dog(name: String) extends Animal
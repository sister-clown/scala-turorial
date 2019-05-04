package variances

class Animal {
  def name: String = ""
}

class Cat(override val name: String) extends Animal {
}

case class MikeCat(override val name: String) extends Cat(name) {
}

case class Dog(override val name: String) extends Animal
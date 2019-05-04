package upper.types.bounds

abstract class Animal {
  def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class Lion extends Animal {
  override def name: String = "Lion"
}

class PetContainer[A <: Pet](p: A) { // [A <: Pet] = [A extends Pet] ?
  def pet: A = p
}
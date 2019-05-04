package lower.types.bounds



object Main {
  class Animal
  class Person extends Animal
  class Student extends Person
  class Container[-T] {
    def foo[U <: T](x: U): U = x
  }
  def main(args: Array[String]): Unit = {


  }
}

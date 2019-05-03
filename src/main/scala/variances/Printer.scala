package variances

abstract class Printer[-A] {
    def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}

class DogPrinter extends Printer[Dog] {
  def print(dog: Dog): Unit =
    println("The animal's name is: " + dog.name)
}

class MikeCatPrinter extends Printer[MikeCat] {
  def print(cat: MikeCat): Unit =
    println("The mikecat's name is: " + cat.name)
}
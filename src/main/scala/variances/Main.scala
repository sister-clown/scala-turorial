package variances

object Main {
  def main(args: Array[String]): Unit = {
    val list1: List[Animal] = List(new Cat("cat"), MikeCat("mike cat"), Dog("dog"))
    val list2: List[Cat] = List(new Cat("cat"), MikeCat("mike cat"))
    def printAnimalNames(animals: List[Animal]): Unit = {
      animals.foreach { animal =>
        println(animal.name)
      }
    }
    printAnimalNames(list1)
    printAnimalNames(list2)

    val myCat: MikeCat = MikeCat("Boots")


    def printMyCat(printer: Printer[MikeCat]): Unit = {
      printer.print(myCat)
    }

    val catPrinter: Printer[Cat] = new CatPrinter
    val animalPrinter: Printer[Animal] = new AnimalPrinter
    val dogPrinter: Printer[Dog] = new DogPrinter
    val mikeCatPrinter: Printer[MikeCat] = new MikeCatPrinter

    printMyCat(catPrinter)
    printMyCat(animalPrinter)
    printMyCat(mikeCatPrinter)
  }
}

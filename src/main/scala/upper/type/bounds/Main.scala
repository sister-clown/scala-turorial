package upper.`type`.bounds

object Main {
  def main(args: Array[String]): Unit = {
    val dogContainer = new PetContainer[Dog](new Dog)
    val catContainer = new PetContainer[Cat](new Cat)
    // this would not compile
    val lionContainer = new PetContainer[Lion](new Lion)
  }
}

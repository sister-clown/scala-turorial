package traits.greeter

object Main {
  def main(args: Array[String]): Unit = {
    val name: String = "sister_clown"
    val defaultGreeter = new DefaultGreeter
    val customizableGreeter = new CustomizableGreeter("prefix", "postfix")
    defaultGreeter.greet(name)
    customizableGreeter.greet(name)

  }
}

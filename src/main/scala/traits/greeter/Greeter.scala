package traits.greeter

trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

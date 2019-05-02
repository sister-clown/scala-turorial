package caseclasses

object Main {
  def main(args: Array[String]): Unit = {
    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
    println(message1.sender)
    println(message1)
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3
    println(messagesAreTheSame)
  }
}

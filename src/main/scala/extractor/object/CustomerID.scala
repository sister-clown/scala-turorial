import scala.util.Random

object CustomerID {
  def apply(namee: String) = s"$namee--${Random.nextLong}"
  def unapply(customerID: String): Option[String] = {
    println(customerID)
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}
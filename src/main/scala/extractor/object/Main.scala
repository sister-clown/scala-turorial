import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    val customer1ID = CustomerID("Sukyoung")
    val customer2ID = CustomerID("Nico")
    val CustomerID(name1) = customer2ID
    val CustomerID(name2) = customer2ID
    val name3 = CustomerID.unapply(customer2ID).get
    println(name1)  // prints Nico
    println(name2)  // prints Nico
    println(name3)  // prints Nico
    println(CustomerID.unapply("-asdfasdfasdf"))
    val CustomerID(name4) = "--asdfasdfasdf"
    val CustomerID(name5) = "-asdfasdfasdf"
    customer1ID match {
      case CustomerID(name) => println(name)  // prints Sukyoung
      case _ => println("Could not extract a CustomerID")
    }
  }
}
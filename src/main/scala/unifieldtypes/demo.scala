package unifieldtypes

object demo {
  val list: List[Any] = List(
    "a String",
    732,
    'c',
    true,
    () => "an anonymous function returning a string"
  )
  def main(args: Array[String]): Unit = {
    list.foreach(element => println(element))
  }
}

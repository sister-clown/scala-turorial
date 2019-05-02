object Function extends App {
  val addOne = (x: Int) => x + 1
  val add = (x: Int, y: Int) => x + y
  val noParameters = () => 42
  println(addOne(2))
  println(add(addOne(2), 2))
  println(noParameters())
}

object Values extends App {
  val x = 1 + 1
  println("x = " + x)
  // explicitly state the type
  val i: Int = 1 + 1

  var xVar = 1 + 1
  xVar = 3 // This compiles because "x" is declared with the "var" keyword.
  println("xVar = " + xVar * xVar) // 9

  var iVar: Int = 3

}

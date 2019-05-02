package multiple.parameter.list

object Main {
  def main(args: Array[String]): Unit = {
    val parameterList = new ParameterList(3)
    println(parameterList.singleParameterFunctionArg(3)(_ + _ + 2 )(3))
    val curry = parameterList.singleParameterFunctionArg(3) _
    println(curry)
    val curry2 = curry(_ + _ + 2 )
    println(curry2)
    println(curry2(3))
   // println(parameterList.singleParameterFunctionArg((x: Int, y: Int) => x + y)

  }
}

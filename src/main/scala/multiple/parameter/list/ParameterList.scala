package multiple.parameter.list

class ParameterList(val magnification: Int) {
  def multiplication1(x: Int, y: Int): Int = {
    x * y
  }

  def multiplication2(x: Int)(y: Int): Int = {
    x * y
  }

  def singleParameterFunctionArg(x: Int)(op: (Int, Int) => Int)(y: Int): Int = {
    op(x, 3) * 3 + y
  }
}

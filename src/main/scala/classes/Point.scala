package classes

class Point {
  private var _x = 0
  private var _y: Int = 0
  private val bound = 100

  def x: Int = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning()
  }

  def y: Int = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning()
  }

  def setY(newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning()
  }

  def getX: Int = {
    _x
  }
  def printWarning(): Unit = println("WARNING: Out of bounds")
}
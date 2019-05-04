package compound

class Main {
  def main(args: Array[String]): Unit = {

  }

  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone()
    obj.reset
    cloned
  }
}

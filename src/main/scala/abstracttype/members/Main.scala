package abstracttype.members

object Main {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2, elem1 + elem2)
    }

  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7, 8)
    println(buf)
    println("length = " + buf.length)
    println("content = " + buf.element)
  }
}

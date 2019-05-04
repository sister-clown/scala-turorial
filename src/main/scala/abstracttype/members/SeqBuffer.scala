package abstracttype.members

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length: Int = {
    println("lentgh = " + element)
    element.length
  }

}
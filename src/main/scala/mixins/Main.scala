package mixins

object Main {
  abstract class A {
    def message: String
  }
  trait B extends A {
    def message: String = "I'm an instance of class B"
  }
  trait C extends A {
    def message: String = "I'm an instance of class C"
  }

  trait D extends A {
    def message: String = "I'm an instance of class D"
  }

  class E extends B with C with D {
    override def message: String = {
      super[D].message
      super[C].message
      super[B].message
    }
  }


  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next(): T
  }

  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next() = {
      val ch = s charAt i
      i += 1
      ch
    }
  }

  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while (hasNext) f(next())
  }

  def main(args: Array[String]): Unit = {
    val e = new E
    println(e.message)  // I'm an instance of class B
    //println(d.loudMessage)

    class RichStringIter extends StringIterator("Scala") with RichIterator
    val richStringIter = new RichStringIter
    richStringIter foreach println
  }
}

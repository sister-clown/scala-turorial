package inference

object Main {
  def fac(n: Int): Int = if (n == 0) 1 else n * fac(n - 1)
}

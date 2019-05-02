package traits.iterator

class DefaultTrait(val name: Char, val age: Int, _x: Char) extends SampleTrait[Char] {
  private var _pX = 0
  /*
   * コンストラクタの引数で受け取ったx, y, zも自動でフィールドが作られているようだ
   * val or varをつけるとpublic,つけないとprivateになるらしい
   * コンストラクタで明示的にvarをつけない限り自動でvalがつく？　xはvalがツイってるっぽいね
   * つまりxは
   * private val x
   * となる？
   * つまりprivateでvarな変数はコンストラクタで受け取った値で初期化できない？
   * →　できるけど初期化に使った値がフィールドに残ってびみょいな
   */

  override def getA: Char = _x

  def pX: Int = _pX
  def pX_= (newPx: Int): Unit = {
    _pX = newPx
  }

  def x: Int = _x


}

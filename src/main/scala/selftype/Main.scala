package selftype

object Main {
  trait User {
    def username: String
    def test(): String = "test"
  }

  trait Tweeter {
    this: User =>  // reassign this
    def tweet(tweetText: String) = println(s"$username: $tweetText")
  }

  class VerifiedTweeter(val username_ : String) extends Tweeter with User {  // We mixin User because Tweeter required it
    def username = s"real $username_ " + test()
  }

  def main(args: Array[String]): Unit = {
    val realBeyoncé = new VerifiedTweeter("Beyoncé")
    realBeyoncé.tweet("Just spilled my glass of lemonade")
  }
}

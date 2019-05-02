package higher.order.functions

object Main {
  def main(args: Array[String]): Unit = {
    def seq = Seq(1.0, 2.0, 3.0)
    def w = WeeklyWeatherForecast(seq)
    println(w)
    println(w.forecastInFahrenheit(2))
  }
}

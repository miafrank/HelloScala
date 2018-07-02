val salaries = Seq(20000, 70000, 40000)
val doubleSalary = (x: Int) => x * 2
val newSalaries = salaries.map(doubleSalary)

val newSalariesAnon = salaries.map(x => x * 2)
val newSalariesWild = salaries.map(_ * 2)

case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
  private def converCtoF(temp: Double) = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(converCtoF)
}

val weeklytemps = Seq(10.0, 10.0, 25.0, 9.0, 7.0)
val tesWWF = new WeeklyWeatherForecast(weeklytemps)
tesWWF.forecastInFahrenheit





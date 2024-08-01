import scala.io.Source
// Task 1. Find states with highest GDP contribution
// Task2. Find average GDP per capita
// Task3. Total GDP
object task4{
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Downloads\\StatewiseGDP.csv"

    val source = Source.fromFile(filePath)


    val lines = source.getLines().drop(1)
    var maxGDP = 0
    var stateWithMaxGDP = ""
    var totalGDP = 0
    var totalIncome = 0
    var count = 0
    lines.foreach { line =>
      val cols = line.split(",")
      val state = cols(0)
      val gdp = cols(1).toInt
      val perCapitaIncome = cols(2).toInt

      if (gdp > maxGDP) {
        maxGDP = gdp
        stateWithMaxGDP = state
      }

      totalGDP += gdp
      totalIncome += perCapitaIncome
      count += 1
    }

    val averageGDP = totalIncome / count

    source.close()
    println(s"State with highest GDP contribution: $stateWithMaxGDP")
    println(s"Average GDP per capita: $averageGDP")
    println(s"Total GDP: $totalGDP")
  }
}

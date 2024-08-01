object Loops_and_functions{
  def main(args: Array[String]): Unit ={
    var j = 1
    while {
      println(j)
      j += 1
      j <= 5
    }do()


    // for loop with range and step size

    for (i <- 1 to 10 by 2) { // increment by 2
      println(i)
    }

    // Iterating over a collection

    val fruits = List("Apple","Orange","Mango","Grapes","Watermelon")

    for (fruit <- fruits){
      println(fruit)
    }

    // complex condition

    import scala.io.StdIn

    println("Enter the Temperature:")
    val temperature = StdIn.readInt()
    println("Enter the Humidity:")
    val humidity = StdIn.readInt()

    val weatherDesc = if (temperature > 30 & humidity > 60) {
      "Hot and Humid"
    } else if (temperature >= 40 & humidity < 60){"Hot"}
    else if (humidity > 70 & temperature < 25){"Humid"}
    else{
      "Pleasant"
    }
    println(weatherDesc)

  }
}

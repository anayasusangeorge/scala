object ControlStatement{
  def main(args:Array[String]): Unit = {


    //EXAMPLE1 if-else

    import scala.io.StdIn // **** it give to input value from user

//    val x1 = 10
    println("Enter a Number: ")
    // Ask user to input and typecast it in to a integer datatype
    val x1 = StdIn.readLine().toInt  // Default the datatype is string
      if (x1 > 0){
      println("Value is Positive")

    }
    else if(x1<0){
      println("Value is Negative")
    }
    else{
      println("Value is Zero")
    }


    // Example2 : using if-else as an expression
    println("Enter a Number: ")
    val x2 = StdIn.readLine().toInt
    val output = if (x2 % 2 == 0) "Even" else "Odd"
    println(output)

    // Example3. While loop using Scala

    var i = 1
    //
    while (i <= 5){
      println(s"Value of i is: $i")
      i += 1
    }

    // Example4  For loop in scala

   val  list_1 = List("Kerala","UST1001",22,"CSE",78.99)
    for (value <- list_1){
      println(value)
    }

    //Example5    Generate a collection of even numbers

    val numbers = (1 to 50).toList
    val even=for {
                    num <- numbers
                    if num % 2 == 0
                  } yield num  //yield is a keyword in scala to Generate a new collection from an existing one
    println(even)


    // Example7 Generate a collection of Prime Numbers between  2-100
    val numbers1 = (2 to 100).toList
    val prime= for{
      num <- 2 to 100
      if (2 until num).forall(x => num % x != 0) // filter condition ** 'until' will go to that value but 'to' go  tolast number
    }yield num
    println("Prime Numbers: "+prime.mkString(", "))
    



  }
}

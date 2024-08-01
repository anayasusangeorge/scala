object Functions{
  def main(args: Array[String]) : Unit={

    // Functions in scala programming

    def add(a:Int,b:Int) :Int = {
      a + b
    }

    // anonymous functions like lambda

    val summation = (a: Int, b:Int) => a+b
    println(summation(5,6))

    // problem1: Find the maximum element in a list

    def maxelement(lst:List[Int]) : Int= {
      lst.max
    }
    val num = List(1,3,5,7,9)
    println(maxelement(num))

    // Problem 2 . Factorial of a number

    def factorial(num :Int): Int={
      if (num == 0) 1
      else num * factorial(num - 1)
    }

    println(factorial(8))


    


  }
}

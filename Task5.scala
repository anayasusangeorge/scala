// Lower income, higher income, 10% total salary is > then higher income and < then it is lower income

object Task5{
  def main(args:Array[String]): Unit={

    val empdeatils = List(("Anu",200000),("Fathima",150000),("Theertha",300000),("Angel",230000),("Farsha",310000),
      ("Jesna",350000),("Varsha",400000))

    var tsalary = 0
    for(sdetails <- empdeatils){
      val salary = sdetails._2
      tsalary += salary
    }
    val per = tsalary*0.1
    println(s"Average Percentage: $per")
    val(higher,lower) = empdeatils.partition(_._2 > per)
    println(s"Higher Salary: $higher")
    println(s"Lower Salary: $lower")

  }
}

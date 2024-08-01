// Task 1 : Processing and Filtering data
// sample record = (product name, unit price, discount, quantity)
// 1. Filter out Products that have price > $ 50
// 2. Calculate Total Cost of each product
// 3. print the name of product that has exceeded total cost greater than $300



object list_1 {
  def main(args: Array[String]): Unit = {

    val Prodlist = List(
      ("Mango", 150, 0.4, 6),
      ("Orange", 70, 0.6, 5),
      ("Apple", 300, 0.3, 9),
      ("Banana", 100, 0.14, 2),
      ("Stawberry", 400, 0.4, 3),
      ("Guva", 90, 0.15, 6)
    )

    println("Items with price greater than 50:")
    for (product <- Prodlist) {
      val (name, price, _, _) = product
      if (price > 50) {
        println(s"Item: $name, price: $price")
      }
    }

    println("Total cost of each product:")
    val exceed = new scala.collection.mutable.ListBuffer[String]()
    for (product <- Prodlist) {
      val (name, price, discount, quantity) = product
      val totalCost = price * quantity * (1 - discount)
      println(s"Total cost of $name: $totalCost")
      if (totalCost > 300) {
        exceed += name
      }
    }

    println("Items with total cost greater than $300:")
    for (name <- exceed) {
      println(name)
    }
  }
}


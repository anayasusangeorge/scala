object bank_deposit {
  def banking_menu(): Unit = {
    var continue = true
    var Balance = 1500
    while (continue)
      println("Banking Menu")
      println("1.Check Balance")
      println("2.Withdraw Amount")
      println("3.Deposit")
      println("4.Exit")
      println("Enter any option = ")
      import scala.io.StdIn
      val option = StdIn.readInt()
      if (option == 1) {
        println(s"Your Account Balance = $Balance")

      } else if (option == 2) {
        println("Enter the amount to Withdraw = ")
        val withdraw = StdIn.readInt()
        if (withdraw > 0) {
          if (Balance < withdraw) {
            println("Insufficient Amount")
          }
          else {
            Balance -= withdraw
            println(s"Remaining Bank Balance after withdrawel = $Balance")
          }
        } else {
          println("Please Enter a valid amount")
        }

      } else if (option == 3) {
        println("Enter the amount to deposit = ")
        val deposit = StdIn.readInt()
        if (deposit < 0) {
          println("Please enter a valid amount")
        } else {
          Balance += deposit
          println(s"Bank Balance after Deposited = $Balance")
        }

      } else if (option == 4) {
        continue = false
      } else {
        println("Invalid Option")
      }
  }
  def main(args: Array[String]): Unit = {

    banking_menu()
  }
}

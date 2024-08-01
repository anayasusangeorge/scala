class Account(val accnum : String,var bal: Double) {
  def deposit(amount: Double): Unit = {
    if (amount>0){
      bal += amount
    }
  }
  def withdraw(amount:Double):Unit={
    if (amount > 0 && amount <= bal){
      bal -= amount
      println(s"Withdraw $amount, new balance: $bal")
    }
    else{
      println("Insuffucient Balance")

    }
  }
  def getbalnce: Double = bal

}

object BankingApp{
  def main(args:Array[String]): Unit ={

    // create an instances of account

    val acc1 = new Account("UST12345",50000.0)
    val acc2 = new Account("UST12346",8000.0)

    println(s"Account Number:${acc1.accnum},Initial Balance: ${acc1.bal}")
    acc1.deposit(1600)
    acc1.withdraw(4000)
    println(s"Final Balance: ${acc1.getbalnce}")
  }
}
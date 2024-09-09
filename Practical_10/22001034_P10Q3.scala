// 22001034 - Practical 10 - Question 3 - Account Transfer

object AccountTransfer extends App {
  class Account(initialBalance: Double) {
    private var balance: Double = initialBalance
    def deposit(amount: Double): Unit = balance += amount
    def withdraw(amount: Double): Unit = balance -= amount
    def transfer(amount: Double, toAccount: Account) = {
      withdraw(amount)
      toAccount.deposit(amount)
    }
    def getBalance: Double = balance
  }

  // Test
  val account1 = new Account(1000)
  val account2 = new Account(500)
  val transferAmount = 200
  
  println(s"Initial balances:\n Account1 = ${account1.getBalance}\n Account2 = ${account2.getBalance}")
  println(s"Transferring $transferAmount from Account1 to Account2")
  account1.transfer(transferAmount, account2)
  println(s"After transfer:\n Account1 = ${account1.getBalance}\n Account2 = ${account2.getBalance}")
}
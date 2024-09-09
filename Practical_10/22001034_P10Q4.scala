// 22001034 - Practical 10 - Question 4 - Bank functions

object BankFunctions extends App {
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

  class Bank(accounts: List[Account]) {
    def negativeAccounts: List[Account] = accounts.filter(_.getBalance < 0)
    def totalBalance: Double = accounts.map(_.getBalance).sum
    def applyInterest(): Unit = {
      accounts.foreach { account =>
        if (account.getBalance > 0) {
          account.deposit(account.getBalance * 0.05)
        } else {
          account.withdraw(account.getBalance * 0.1)
        }
      }
    }
  }

  // Test
  val accounts = List(
    new Account(1000),
    new Account(-500),
    new Account(200),
    new Account(-100)
  )
  
  val bank = new Bank(accounts)
  println(s"Initial balances: ${accounts.map(_.getBalance)}")
  println(s"Negative accounts: ${bank.negativeAccounts.map(_.getBalance)}")
  println(s"Total balance: ${bank.totalBalance}")
  bank.applyInterest()
  println(s"After applying interest: ${accounts.map(_.getBalance)}")
}
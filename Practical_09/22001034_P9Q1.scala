//22001034 - Practical 09 - Question 1 - Interest

object InterestCalculator extends App {
    // Calculate interest based on deposit amount
    def interest: Double => Double = deposit => deposit match {
        case x if x <= 20000 => x * 0.02
        case x if x <= 200000 => x * 0.04
        case x if x <= 2000000 => x * 0.035
        case x => x * 0.065
    }

    // Test
    println(s"Interest for Rs. 15000: ${interest(15000)}")
    println(s"Interest for Rs. 150000: ${interest(150000)}")
    println(s"Interest for Rs. 1500000: ${interest(1500000)}")
    println(s"Interest for Rs. 2500000: ${interest(2500000)}")
}
// 22001034 - Practical 04 - Question 2 - Number Checker

object NumberChecker extends App {
    // Function to check if a number is positive/negative/zero and even/odd
    def CheckNumber(number: Int): Unit = number match {
        case x if (x <= 0 && x % 2 == 0) => println("Negative/Zero is input\nEven number is given")
        case x if x <= 0 => println("Negative/Zero is input\nOdd number is given")
        case x if x % 2 == 0 => println("Even number is given")
        case default => println("Odd number is given")
    }

    println("Enter a number:")
    val input = scala.io.StdIn.readInt()
    CheckNumber(input)
}


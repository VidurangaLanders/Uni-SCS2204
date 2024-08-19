// 22001034 - Practical 09 - Question 2 - Number Checker

object NumberChecker extends App {
    // check if a number is positive/negative/zero and even/odd
    def checkNumber: Int => String = num => {
        num match {
            case x if (x <= 0 && x % 2 == 0) => "Negative/Zero is input\nEven number is given"
            case x if x <= 0 => "Negative/Zero is input\nOdd number is given"
            case x if x % 2 == 0 => "Even number is given"
            case default => "Odd number is given"
        }
    }

    //Get input
    println("Enter a number:")
    val input = scala.io.StdIn.readInt()

    // Print output
    println(checkNumber(input))
}


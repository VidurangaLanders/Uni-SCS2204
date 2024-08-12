// 22001034 - Practical 08 - Question 2 - Input interpreter

import scala.io.StdIn

object NumberInterpreter extends App {
    // Get input
    println("Enter a number: ")
    val number = StdIn.readInt() 

    // Interpret the number
    val categorize: Int => String = num => num match {
        case num if num % 15 == 0 => "Multiple of Both Three and Five"
        case num if num % 3 == 0 => "Multiple of Three"
        case num if num % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
    }

    // Test
    println(categorize(number))
}
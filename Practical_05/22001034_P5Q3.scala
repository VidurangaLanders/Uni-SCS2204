// 22001034 - Practical 05 - Question 3 - Fibonacci series

import scala.io.StdIn

object Fibonacci extends App{
    // Fibonacci series using multiple recursion
    def fibonacci(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)
    }

    // Function to print the Fibonacci series
    def printFibonacci(n: Int): Any = {
        if (n > 0) {
            printFibonacci(n-1)
        }
        // Format print for series like output
        print(fibonacci(n) + ", ")
    }

    // Function to get input
    def getInput(): Int = {
        println("Enter the number of terms (n):")
        val n = StdIn.readInt()
        println("The Fibonacci series upto n:")
        n
    }

    // Get the input and print the Fibonacci series
    printFibonacci(getInput())
}
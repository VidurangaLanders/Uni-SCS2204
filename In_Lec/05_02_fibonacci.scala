// Fibonacci series using multiple recursion

object Fibonacci extends App{
    def fibonacci(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)
    }

    def printFibonacci(n: Int): Any = {
        if (n > 0) {
            printFibonacci(n-1)
        }
        println(fibonacci(n))
    }

    printFibonacci(10)
}

// Output

// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
// 55
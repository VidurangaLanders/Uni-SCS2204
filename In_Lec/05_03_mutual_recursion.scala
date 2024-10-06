//Indirect recursion with even or odd
object EvenOdd extends App{
    def isEven(n: Int): Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n: Int): Boolean = !(isEven(n))

    // println(isEven(10))
    // println(isOdd(5))

    //Indirect recursion with even or odd - demo with println
    def isEvenPrint(n: Int): Boolean = n match {
        case 0 => true
        case _ => {
            println(s"Even: $n")
            isOddPrint(n-1)
        }
    }

    def isOddPrint(n: Int): Boolean = {
        println(s"Odd: $n")
        !(isEvenPrint(n))
    }

    println(isEvenPrint(3))
    println(isEvenPrint(4))
    println(isOddPrint(3))
    println(isOddPrint(4))
}

// Output

// Even: 3
// Odd: 2
// Even: 2
// Odd: 1
// Even: 1
// Odd: 0
// false

// Even: 4
// Odd: 3
// Even: 3
// Odd: 2
// Even: 2
// Odd: 1
// Even: 1
// Odd: 0
// true

// Odd: 3
// Even: 3
// Odd: 2
// Even: 2
// Odd: 1
// Even: 1
// Odd: 0
// true

// Odd: 4
// Even: 4
// Odd: 3
// Even: 3
// Odd: 2
// Even: 2
// Odd: 1
// Even: 1
// Odd: 0
// false
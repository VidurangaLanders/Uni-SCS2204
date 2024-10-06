// Print the numbers from 1 to 100. For multiples of 3 print "Fizz", for multiples of 5 print "Buzz", and for multiples of 3 and 5 print "FizzBuzz"

object fizbuz extends App {
    def checkFizzBuzz(x:Int): Any = x match {
        case x if x % 3 == 0 && x % 5 == 0 => "FizzBuzz"
        case x if x % 3 == 0 => "Fizz"
        case x if x % 5 == 0 => "Buzz"
        case _ => x
    }

    def FizzBuzz(n:Int, m:Int): Any = {
        println(checkFizzBuzz(n))
        if (n < m) {
            FizzBuzz(n+1, m)
        }
    }

    FizzBuzz(1, 15)
}
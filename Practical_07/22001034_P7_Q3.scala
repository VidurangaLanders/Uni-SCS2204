// 22001034 - Practical 07 - Question 3 - Lambda Prime Number Filter

object prime extends App {

    // This is an enhanced version of prime search that reduces the number of iterations
    def filterPrime(list: List[Int]): List[Int] = {    
        list.filter(n => {
            if (n <= 1) false               // 1 is not a prime
            else if (n <= 3) true               // 2 and 3 are prime
            else if (n % 2 == 0 || n % 3 == 0) false        // multiples of 2 and 3 are not prime
            else {
                var i = 5               // check for prime numbers from 5
                var isPrime = true      // assume n is a prime
                while (i * i <= n && isPrime) {        // check for prime numbers until square root of n
                    if (n % i == 0 || n % (i + 2) == 0){        // if n is divisible by i or i+2, then n is not a prime
                        isPrime = false
                    }
                    i += 6
                }
                isPrime
            }
        })
    }

    // Test
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(input)
    println(primeNumbers)
}
object prime extends App{
    def gcd(a: Int, b: Int): Int = b match {
        case 0 => a
        case x if x>a => gcd(x, a)
        case x => 
            println(s"$a = $b * ${a/b} + ${a%b}")
            gcd(x, a%x)
    }

    def prime(p: Int, n: Int = 2): Boolean = n match {
        case x if x==p => true
        case x if gcd(p, x)>1 => false
        case x => prime(p, x+1)
    }

    println(prime(5))
}

// Output

// 5 = 2 * 2 + 1
// 2 = 1 * 2 + 0
// 5 = 3 * 1 + 2
// 3 = 2 * 1 + 1
// 2 = 1 * 2 + 0
// 5 = 4 * 1 + 1
// 4 = 1 * 4 + 0
// true
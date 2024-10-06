object GCD extends App{
    def gcd(a: Int, b: Int): Int = b match {
        case 0 => a
        case x if x>a => gcd(x, a)
        case x => 
            println(s"$a = $b * ${a/b} + ${a%b}")
            gcd(x, a%x)
    }
    println(gcd(15, 35))
}

// Output
// 15 = 35 * 0 + 15
// 35 = 15 * 2 + 5
// 15 = 5 * 3 + 0
// 5
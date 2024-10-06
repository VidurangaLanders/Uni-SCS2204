object prime extends App{
    def gcd(a: Int, b: Int): Int = b match {
        case 0 => a
        case x if x>a => gcd(x, a)
        case x => gcd(x, a%x)
    }

    def prime(n: Int, i: Int = 2): Boolean = i match {
        case x if x==n => true
        case x if gcd(n, x)>1 => false
        case x => prime(n, x+1)
    }

    def primeSeq(n: Int): Unit = {
        if (prime(n)) println(n)
        if (n>0) primeSeq(n-1)
    }

    primeSeq(1000)
}
class Rational(x: Int, y: Int) {

    // Pre conditions
    require (y > 0, "denominator must be positive")

    // Assertions
    // assert(x >= 0, "numerator must be non-negative")

    // Auxiliary constructor
    def this(x: Int) = this(x, 1)

    // Private functions
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    
    // Private variables
    private val g = gcd(x, y)
    // Public variables
    def numer = x / g
    def denom = y / g

    // Computer only once
    // val numer = x / gcd(x, y)
    // val denom = y / gcd(x, y)

    // Public functions
    def add(r: Rational): Rational = 
        new Rational(
            numer * r.denom + r.numer * denom,
            denom * r.denom
        )
    
    def mul (r: Rational): Rational = 
        new Rational(
            numer * r.numer,
            denom * r.denom
        )

    def neg = new Rational(-numer, denom)

    def less(that: Rational) = numer * that.denom < that.numer * denom

    // Self reference
    def max(that: Rational) = if (less(that)) that else this

    // Overriding
    override def toString = numer + "/" + denom
}

val r = new Rational(1, 2)
r.numer
r.denom

val x = new Rational(3, 4)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
x.add(y).mul(z)



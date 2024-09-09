// 22001034 - Practical 10 - Question 1 - Negative number

object RationalNumber extends App {
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    def neg = new Rational(-numer, denom)
    override def toString = s"$numer/$denom"
  }

  // Test
  val x = new Rational(1, 2)
  println(s"x = $x")
  println(s"x.neg = ${x.neg}")
}
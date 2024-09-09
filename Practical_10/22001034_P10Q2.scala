// 22001034 - Practical 10 - Question 2 - Rational subtraction

object RationalSubtraction extends App {
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    def neg = new Rational(-numer, denom)
    def sub(r: Rational) = {
      new Rational(
        numer * r.denom - r.numer * denom,
        denom * r.denom
      )
    }
    override def toString = s"$numer/$denom"
  }

  // Test
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)
  
  val result = x.sub(y).sub(z)
  println(s"x = $x")
  println(s"y = $y")
  println(s"z = $z")
  println(s"x - y - z = $result")
}
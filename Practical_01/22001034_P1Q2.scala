// 22001034 - Practical 01 - Question 2 - C to F convertion

object Q2{
    def interMult(deg: Double): Double = deg * 1.8000

    def CtoF(deg: Double): Double = interMult(deg) + 32.00

    def main(args: Array[String]): Unit = {
        val deg_C = 35
        val deg_F = CtoF(deg_C)
        println(f"Temperature of $deg_C C in Farenheit is $deg_F%.4f")
    }
}
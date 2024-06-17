// 22001034 - Practical 01 - Question 1 - Disk Area

object Q1{
    def square(r: Double): Double = r * r

    def diskArea(r: Double): Double = java.lang.Math.PI * square(r)

    def main(args: Array[String]): Unit = {
        val r = 5
        val area = diskArea(r)
        println(f"Disk Area with radius $r is $area%.2f")
    }
}

// 22001034 - Practical 01 - Question 3 - Sphere Volume

object Q3{
    def square(r: Double): Double = r * r

    def cube(r: Double): Double = square(r) * r

    def sphereVolume(r: Double): Double = 4* java.lang.Math.PI * cube(r) / 3

    def main(args: Array[String]): Unit = {
        val r = 5
        val volume = sphereVolume(r)
        println(f"Sphere Volume with radius $r is $volume%.2f")
    }
}
// 22001034 - Practical 01 - Question 5 - Running with Tempo

object Q5{
    def easyPace(dis: Int): Int = dis * 8

    def tempo(dis: Int): Int = dis * 7

    def totalRuntime(dis1: Int, dis2: Int, dis3: Int): Int = easyPace(dis1) + tempo(dis2) + easyPace(dis3)

    def main(args: Array[String]): Unit = {
        val distance_1 = 2
        val distance_2 = 3
        val distance_3 = 2
        val time = totalRuntime(distance_1, distance_2, distance_3)
        println(f"Total running time is $time mins.")
    }
}
// 22001034 - Practical 03 - Question 3 - Arithmetic mean

object Q3 extends App{
    // Function to round a float to two decimal places
    def roundToTwoDecimals(value: Float): Float = {
        val rounded = (value * 100).round.toFloat / 100
        rounded
    }

    // Function to calculate the arithmetic mean
    def calculateMean(num1: Int, num2: Int): Float = {
        val sum = num1 + num2
        roundToTwoDecimals(sum.toFloat / 2)
    }

    // Test the function
    val mean = calculateMean(8, 3)
    println(mean) // 5.5
}
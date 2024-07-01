// 22001034 - Practical 03 - Question 4 - Sum Even Numbers

object Q3 extends App{
    // Function to check if a number is even
    def isEven(num: Int): Boolean = num % 2 == 0

    // Function to sum even numbers in a list
    def sumEvenNumbers(numbers: List[Int]): Int = {
        // Recursive function to loop
        def loop(remaining: List[Int], sum: Int): Int = {
            // Base case
            if (remaining.isEmpty) sum
            // If the head is even, add it to the sum
            else if (isEven(remaining.head)) loop(remaining.tail, sum + remaining.head)
            // Else skip
            else loop(remaining.tail, sum)
        }
        // Loop with the input list and sum = 0
        loop(numbers, 0)
    }
    
    // Test the function
    val sum = sumEvenNumbers(List(1, 2, 3, 4, 5, 6))
    println(sum) // 12
}
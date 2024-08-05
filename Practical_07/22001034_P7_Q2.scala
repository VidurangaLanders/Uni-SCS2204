// 22001034 - Practical 07 - Question 2 - Lambda Calculate Square

object calSq extends App {
    def calculateSquare(list: List[Int]): List[Int] = {
        list.map(x => x * x)        // map each element in the list to its square
    }

    // Test
    val input = List(1, 2, 3, 4, 5)
    val squareNumbers = calculateSquare(input)
    println(squareNumbers)
}
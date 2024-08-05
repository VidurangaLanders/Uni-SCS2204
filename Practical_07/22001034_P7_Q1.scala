// 22001034 - Practical 07 - Question 1 - Lambda Even Number Filter

object filter extends App {
    def filterEvenNumbers(list: List[Int]): List[Int] = {
        list.filter(x => x % 2 == 0)            // filter even numbers from the list
    } 

    // Test
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(input)
    println(evenNumbers)
}
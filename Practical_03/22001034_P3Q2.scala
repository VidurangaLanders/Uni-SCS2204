// 22001034 - Practical 03 - Question 2 - String Filtering

object Q2 extends App{
    // Function to check if a string is longer than 5 char
    def isLongString(str: String): Boolean = str.length > 5

    // Function to filter long strings from a list
    def filterLongStrings(strings: List[String]): List[String] = {
        // Recursive function to loop
        def loop(remaining: List[String], result: List[String]): List[String] = {
            // Base case
            if (remaining.isEmpty) result
            // If the head is a long string, add it to the result
            else if (isLongString(remaining.head)) loop(remaining.tail, result :+ remaining.head) 
            // Else skip
            else loop(remaining.tail, result)
        }
        // Loop with the input list and result = Nil
        loop(strings, Nil)
    }

    // Test the function
    val filtered = filterLongStrings(List("apple", "banana", "kiwi", "watermelon", "pear"))
    println(filtered) // List(banana, watermelon)
}
// 22001034 - Practical 03 - Question 1 - String Reversal (Recursion)

object Q1 extends App{
    // Function to reverse a string using recursion
    def reverseString(str: String): String = {
        // Base case
        if (str.isEmpty) str
        // Recursive case
        else reverseString(str.tail) + str.head
    }

    // Test the function
    val reversed = reverseString("Hello, world!")
    println(reversed) // "!dlrow ,olleH"
}
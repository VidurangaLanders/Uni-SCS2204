// REPL commands

// Fahrenheit to Celsius
val f = 100               // f: Int = 100
(f - 32) * 5/9            // res1: Int = 37


// Volume of a sphere
val r = 3.0                         // r: Double = 3.0
4.0/3.0 * math.Pi * r * r * r       // res1: Double = 113.09733552923255

// define values
// numeric
val a: Int = 5              // a: Int = 5
val b: Double = 5.0         // b: Double = 5.0
val c: Float = 5.0f         
val d: Long = 5L           
val e: Short = 5            
val f: Byte = 5             
// non-numeric
val x: Char = 'a'                   // x: Char = a
val y: String = "Hello, World!"     // y: String = Hello, World!
val z: Boolean = true               // z: Boolean = true

// define variables
var x: Int = 5              // x: Int = 5
var y: Double = 5.0         // y: Double = 5.0

// expressions
val a = 5                   // a: Int = 5
val b = 3                   // b: Int = 3
val c = a + b               // c: Int = 8

// expression blocks
val amount = { val x = 5 * 20; x + 10 }     // amount: Int = 110

// if-else
val x = 10                          // x: Int = 10 
val y = 20                          // y: Int = 20
val max = if (x > y) x else y       // max: Int = 20

// relational operators
val x = 10              // x: Int = 10
val y = 20              // y: Int = 20
val z = 10              // z: Int = 10
x == y                  // res1: Boolean = false
x != y                  // res2: Boolean = true
x > y                   // res3: Boolean = false
x < y                   // res4: Boolean = true
x >= z                  // res5: Boolean = true
x <= z                  // res6: Boolean = true

// logical operators
val x = true            // x: Boolean = true
val y = false           // y: Boolean = false
x && y                  // res1: Boolean = false
x || y                  // res2: Boolean = true
!x                      // res3: Boolean = false

// printf
val name = "John"
val age = 25
printf("Name: %s, Age: %d", name, age)      // Name: John, Age: 25
// format specifiers
// %c - character
// %d - integer
// %e - exponential floating-point number
// %f - floating-point number
// %s - string
printf("%10s", "Hello")                 //      Hello
printf("%-10s", "Hello")                // Hello
printf("%010d", 25)                     // 0000000025
printf("%-10d", 25)                     // 25
printf("%010.5f", 3.14)                 // 00003.14000
printf("%-10.5f", 3.14)                 // 3.14000

// reading from terminal
// import scala.io.StdIn._
val name = readLine("Your name: ")      // Your name: John
println(name)                           // John
val age = readInt()                     // 25
println(age)     


// strings
val str = "Hello, World!"              // str: String = Hello, World!
str.length                             // res1: Int = 13
str.toLowerCase                        // res2: String = hello, world!
str.toUpperCase                        // res3: String = HELLO, WORLD!
str.reverse                            // res4: String = !dlroW ,olleH
str.take(5)                            // res5: String = Hello
str.drop(7)                            // res6: String = World!
str.concat(" Welcome!")                // res7: String = Hello, World! Welcome!
str.substring(7, 12)                   // res8: String = World
str.replace("Hello", "Hi")             // res9: String = Hi, World!
str.split(",")                         // res10: Array[String] = Array(Hello,  World!)
str.trim                              // res11: String = Hello, World!
str.charAt(7)                         // res12: Char = W
str.indexOf("World")                  // res13: Int = 7
str.contains("World")                 // res14: Boolean = true
str.startsWith("Hello")               // res15: Boolean = true
str.endsWith("World!")                // res16: Boolean = true
str.matches("Hello, World!")          // res17: Boolean = true




// 22001034 - Practical 02 - Question 2 - Java to Scala Conversion

object Q2{
    def main(args: Array[String]): Unit = {
        // Type declaration is not required, but added for completeness
        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Float = 4.3f

        //All the given expressions gives errors        
        
        //a) println(--b * a + c * d--)
        println("a) --b * a + c * d-- = ")
        b -= 1
        println(b * a + c * d)
        d -= 1

        //b) println(a++)
        println("b) a++ = ")
        println(a)
        a += 1

        //c) println(-2 * (g - k) + c)
        // 'g' is not defined - replaced it with 8 (maybe a typing error)
        println("c) -2 * (g - k) + c = ")
        println(-2 * (8 - k) + c)

        //d) println(c = c++)
        println("d) c = c++ = ")
        println(c)
        c += 1

        //e) println(c = ++c * a++)
        println("e) c = ++c * a++ = ")
        c += 1
        println(c * a)
        a += 1
    }
}
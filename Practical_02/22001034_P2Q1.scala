// 22001034 - Practical 02 - Question 1 - Expression Evaluation

object Q1{
    def main(args: Array[String]): Unit = {
        var k, i, j = 2
        var m, n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'
        //a) k + 12 * m
        println("a) k + 12 * m = ")
        println(k + 12 * m)
        
        //b) m / j
        println("b) m / j = ")
        println(m / j)
        
        //c) n % j
        println("c) n % j = ")
        println(n % j)
        
        //d) m / j * j
        println("d) m / j * j = ")
        println(m / j * j)
        
        //e) c + 2
        println("e) f + 10 * 5 + g = ")
        println(f + 10 * 5 + g)
        
        //f) ++i * n
        //doesn't work, ++ operator doesn't work in scala
        // f alternative way 
        println("f) ++i * n = ")
        i += 1   
        println(i * n)
    }
}
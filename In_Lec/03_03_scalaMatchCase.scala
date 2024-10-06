object OBNew3{
    def maximum(a: Int, b: Int): Int = {
        a>=b match {
            case true => a
            case false => b
        }
    }

    def passFail(score: Int): String = {
        score>=50 match {
            case true => "Pass"
            case false => "Fail"
        }
    }

    def iseven(num: Int): String = {
        num%2==0 match {
            case true => "Even"
            case false => "Odd"
        }
    }

    def main(args: Array[String]) = {
        var a = scala.io.StdIn.readInt()
        var b = scala.io.StdIn.readInt()
        println("Max: " + maximum(a, b))

        var marks = scala.io.StdIn.readInt()
        println("Pass/Fail: " + passFail(marks))
        
        var num = scala.io.StdIn.readInt()
        println("Even/Odd: " + iseven(num))
    }
}

// Output
// 5
// 10
// Max: 10

// 60
// Pass/Fail: Pass

// 7
// Even/Odd: Odd
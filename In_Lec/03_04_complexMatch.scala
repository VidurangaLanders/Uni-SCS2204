//Match case complex problems
object OBNew4{
    def leapYear(year: Int): String = {
        year match {
            case x if x % 400 == 0 => "Leap Year"
            case x if x % 100 == 0 => "Not Leap Year"
            case x if x % 4 == 0 => "Leap Year"
            case _ => "Not Leap Year"
        }
    }

    def leapYear2(year: Int): String = {
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) match{
            case true => "Leap Year"
            case false => "Not Leap Year"
        }
    }

    def signFunc(num: Int): Int = {
        num match {
            case x if x > 0 => 1
            case x if x < 0 => -1
            case _ => 0
        }
    }

    def main(args: Array[String]) = {
        var year = scala.io.StdIn.readInt()
        println("Leap Year: " + leapYear(year))

        var num = scala.io.StdIn.readInt()
        println("Sign: " + signFunc(num))
    }
}

// Output
// 2020
// Leap Year: Leap Year

// 5
// Sign: 1
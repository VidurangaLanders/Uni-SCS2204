object OBNew5{
    def grade(score: Int): String = {
        score match {
            case x if x>=75 => "A"
            case x if x>=65 => "B"
            case x if x>=50 => "C"
            case _ => "F"
        }
    }

    def main(args: Array[String]) = {
        var marks = scala.io.StdIn.readInt()
        println("Grade: " + grade(marks))
    }
}
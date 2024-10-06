// Student record

object studentRecord extends App{

    // Grade
    def grade(mark: Int): String = {
        mark match {
            case m if m >= 85 => "A"
            case m if m >= 75 => "B"
            case m if m >= 65 => "C"
            case m if m >= 50 => "D"
            case _ => "F"
        }
    }

    // Get the student details
    def getStudent(): (String, Int, String) = {
        val name = scala.io.StdIn.readLine("Enter the name: ")
        println("Enter the mark: ")
        val mark = scala.io.StdIn.readInt()
        (name, mark, grade(mark))
    }

    // Display the student details
    def printRecord(r: (String, Int, String)): Unit = {
        printf("Name: %s\n", r._1)
        printf("Mark: %d\n", r._2)
        printf("Grade: %s\n", r._3)
    }

    // Main
    val student = getStudent()
    printRecord(student)
}
// 22001034 - Practical 06 - Question 2 - Student Management

import scala.io.StdIn
import scala.util.{Try, Success, Failure}

object StudentManagement extends App{
    
  //Student record type
  type StudentRecord = (String, Int, Int, Double, Char)

  //Validate input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    (name, marks, totalMarks) match {
      case (_, _, _) if name.trim.isEmpty => 
        (false, Some("Name cannot be empty"))
      case (_, m, t) if m < 0 || t < 0 => 
        (false, Some("Marks and total marks must be non-negative"))
      case (_, m, t) if m > t => 
        (false, Some("Marks cannot exceed total marks"))
      case _ => 
        (true, None) 
    }
  }

  //Calculate grades
  def calculateGrade(percentage: Double): Char = percentage match {
    case p if p >= 90 => 'A'
    case p if p >= 75 => 'B'
    case p if p >= 50 => 'C'
    case _ => 'D'
  }

  //Get student info
  def getStudentInfo(): StudentRecord = {
    print("Enter student name: ")
    val name = StdIn.readLine()
    print("Enter marks: ")
    val marks = StdIn.readInt()
    print("Enter total possible marks: ")
    val totalMarks = StdIn.readInt()

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

    if (isValid) {
      val percentage = (marks.toDouble / totalMarks) * 100
      (name, marks, totalMarks, percentage, calculateGrade(percentage))
    } else {
      throw new IllegalArgumentException(errorMessage.get) // Throw exception for retry
    }
  }

  //Print student record
  def printStudentRecord(record: StudentRecord): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println("\nStudent Record:")
    println(s"Name: $name")
    println(s"Marks: $marks/$totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  //Get student info with retry
  def getStudentInfoWithRetry(): StudentRecord = {
    Try(getStudentInfo()) match {
    case Success(record) => record
    case Failure(exception: IllegalArgumentException) => // Only catch IllegalArgumentExceptions here
      println(exception.getMessage) // Print the specific error message
      getStudentInfoWithRetry()
    case Failure(exception) =>       // Catch all other exceptions
      println("An error occurred. Please try again.")
      getStudentInfoWithRetry()
    }
  }

  // Test
  val studentRecord = getStudentInfoWithRetry()
  printStudentRecord(studentRecord)
}
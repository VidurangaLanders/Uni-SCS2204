// Tuples and methods

object OBNew extends App{
    // Create a tuple
    var student = ("John", 21, 90.5)
    println(student._1)
    println(student._2)
    println(student._3)

    // Declare a tuple
    var student1: (String, Int, Double) = ("John", 21, 90.5)
    val student2 = Tuple3("John", 21, 90.5)

}
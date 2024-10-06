// Maps and methods

object OBNew extends App{

    // Create a map
    var marks = Map("Maths" -> 45, "Science" -> 67, "English" -> 23, "History" -> 89, "Geography" -> 90)
    println(marks("Maths"))
    println(marks.size)

    // Declare a map
    var marks1: Map[String, Int] = Map()

    // Basic operations on maps
    println(marks.keys)     // Set(English, History, Maths, Geography, Science)
    println(marks.values)   // Iterable(23, 89, 45, 90, 67)
    println(marks.isEmpty)  // false
    println(marks.contains("Science")) // true
    println(marks("Science")) // 67
    println(marks ++ Map("Hindi" -> 100, "Sanskrit" -> 51)) // HashMap(English -> 23, History -> 89, Maths -> 45, Geography -> 90, Hindi -> 100, Sanskrit -> 51, Science -> 67)
    println(marks - "Maths") // HashMap(English -> 23, History -> 89, Geography -> 90, Science -> 67)
    println(marks.size) // 5
    println(marks.keys.size) // 5
    println(marks.values.size) // 5

}
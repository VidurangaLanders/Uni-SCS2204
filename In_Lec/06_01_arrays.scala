// Array methods

object OBNew extends App{
    // Create an array
    var marks = Array(45, 67, 23, 89, 90)
    println(marks(0))
    println(marks.length)

    // Declare an array
    var marks1: Array[Int] = new Array[Int](5)

    // Assign values
    marks1(0) = 45

    // Append
    marks = marks :+ 100
    marks = marks ++ Array(50, 51)
    println(marks.mkString(", "))

    // Prepend
    marks = 100 +: marks
    marks = Array(50, 51) ++ marks
    println(marks.mkString(", "))

    // Print
    def printArray(arr: Array[Int]): Unit = if(!arr.isEmpty) {
        print(arr.head + " ")
        printArray(arr.tail)
    }

    // Array methods
    println(marks.sum)      // 716
    println(marks.max)      // 100
    println(marks.min)      // 23
    println(marks.sorted.mkString(", ")) // 23, 45, 50, 50, 51, 51, 67, 89, 90, 100, 100
    println(marks.reverse.mkString(", ")) // 51, 50, 100, 90, 89, 23, 67, 45, 100, 51, 50
    println(marks.mkString(", ")) // 50, 51, 100, 90, 89, 23, 67, 45, 100, 51, 50
    println(marks.distinct.mkString(", ")) // 50, 51, 100, 90, 89, 23, 67, 45
    println(marks.slice(2, 5).mkString(", ")) // 100, 90, 89
    println(marks.take(3).mkString(", ")) // 50, 51, 100
    println(marks.drop(3).mkString(", ")) // 90, 89, 23, 67, 45, 100, 51, 50
    println(marks.takeRight(3).mkString(", ")) // 100, 51, 50
    println(marks.dropRight(3).mkString(", ")) // 50, 51, 100, 90, 89, 23, 67, 45
}

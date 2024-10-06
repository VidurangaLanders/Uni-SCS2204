// Lists and methods

object OBNew extends App{
    // Create a list
    var marks = List(45, 67, 23, 89, 90)
    println(marks(0))
    println(marks.length)

    // Declare a list
    var marks1: List[Int] = List()

    // Basic operations on lists
    println(marks.head)     // 45
    println(marks.tail)     // List(67, 23, 89, 90)
    println(marks.last)     // 90
    println(marks.isEmpty)  // false
    println(marks.reverse)  // List(90, 89, 23, 67, 45)
    println(marks.sum)      // 314
    println(marks.max)      // 90
    println(marks.min)      // 23
    println(marks.sorted)   // List(23, 45, 67, 89, 90)
    println(marks.contains(67)) // true
    println(marks.concat(List(100, 101))) // List(45, 67, 23, 89, 90, 100, 101)
    
    // Not in List[Int] - Only available for immutable lists
    // println(marks1.fill(3)(100)) // List(100, 100, 100)
    // println(marks3.tabulate(3)(n => n * n)) // List(0, 1, 4)

}
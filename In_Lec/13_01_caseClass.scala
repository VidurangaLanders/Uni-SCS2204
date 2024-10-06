// Case Classes

// Defining a case class
case class Point(a: Int, b: Int) {
    def x: Int = a
    def y: Int = b
}

// Creating objects
val p1 = Point(1, 2)
val p2 = Point(4, 5)

// Print toString
println(p1)    // Point(1,2)
// Equality
println(p1==p2)    // false
// Copy method
val p3 = p1.copy()  // Point(1,2)
val p4 = p1.copy(b=3)   // Point(1,3)

val p5 = Point(1,0)
val pType=(p:Point)=>p match {
 case Point(0,0)=> "Point Origin"
 case Point(x,0)=> "Point on x axis"
 case Point(0,y)=> "Point on y axis"
 case Point(x,y)=> if(x>y) "X>Y" else "X<Y"
}
println(pType(p5))


/////////////////////////
// Clock Time with case classes
val print=(time:ClockTime)=> time match {
    case ClockTime(18,30) => println("Sunset")
    case ClockTime(6,0) => println("Sunrise")
    case ClockTime(10,_) => println("Ten")
    case _ => println(time)
}

val t1=ClockTime(18,30)
print(t1)


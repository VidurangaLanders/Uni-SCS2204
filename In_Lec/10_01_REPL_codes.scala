// Iterator
val it = Iterator("a", "number", "of", "words")

while (it.hasNext){
    println(it.next())
}

// Map
val xs = List(1,2,3)
xs.map(x => x * 2)          // List(2, 4, 6)

val l = List(1,2,3)
val x=(x:Int)=>x*2
val doubles=(l:List[Int])=>l.map(_*2)

doubles(l)          // List(2, 4, 6)

// Filter
val l1 = List(1, 2, 3)
val f4=(x:Int)=>x%2==0
val l2 = l1.filter(f4)      // List(2)

// Reduce
// Sum
val l = List(5,2,9,4)
l.reduce((x, y) => x + y)       // 20

// Max Min
val l = List(2, 5, 3, 6, 4, 7)
l.reduce((x, y) => x max y)     // 7
l.reduce((x,y)=>x min y)        // 2

// Passing functions
val ints = List(1,2,3,4)
val isEven = (i: Int) => i % 2 == 0
val double = (i: Int) => i * 2
ints.filter(isEven)             // List(2, 4)
ints.map(double)                // List(2, 4, 6, 8)

// Fold
val l = List(5,2,9,4)
l.fold(0)((x, y) => x + y)      // 20


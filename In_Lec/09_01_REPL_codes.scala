// Anonymous Functions

val greater = (a: Int, b: Int) => if (a > b) a else b

val evenOrOdd = (a:Int) => a % 2 match {
    case 0 => println("Even")
    case _ => println("Odd")
}

// Say hello callback

val sayHello = (callBack: () => Unit) => callBack()

val helloCasun = () => println("Hello, Kasun")
val helloUCSC = () => println("Hello, UCSC")

sayHello(helloKasun)    // Hello, Kasun
sayHello(helloUCSC)     // Hello, UCSC


// Two parameters as input

val add = (x: Int, y: Int) => x + y
val mul = (x: Int, y: Int) => x * y

val f = (op: (Int, Int) => Int, x: Int, y: Int) => op(x, y)

f(add, 3, 4)        // 7
f(mul, 3, 4)        // 12

// More examples
val ePrint = (f: (Int, Int) => Int, x: Int, y: Int) => {
    val r = f(x, y)
    print(r)
}

val mul = (x: Int, y: Int) => x * y
val sum = (x: Int, y: Int) => x + y

ePrint(sum, 12, 23)     // 35
ePrint (mul, 12, 23)    // 276


// Examples
// Take sum of the integers a to b
def sumInt(a: Int,b: Int): Int= if (a>b) 0 else a+sumInt(a+1,b)
sumInt(1,5)     // 15

def sum(f: Int=>Int,a: Int,b: Int):Int = if (a>b) 0 else f(a)+sum(f,a+1,b)
sum((x: Int)=>x,1,5)    // 15

val sumF:(Int=>Int,Int,Int)=>Int=(f,a,b)=>if(a>b) 0 else f(a)+sumF(f,a+1,b)
sumF((x: Int)=>x,1,5)   // 15


// Sum of the cubes of all integers from 1 to b
def cube(x: Int):Int=x*x*x
def sumCubes(a: Int,b: Int):Int= if (a>b) 0 else cube(a)+sumCubes(a+1,b)

val cube=(x: Int)=>x*x*x
val cube: Int=>Int=x=>x*x*x
val square=(x: Int)=>x*x
val square:Int=>Int=x=>x*x
sum(cube,1,5)                   // 225
sum(square,1,5)                 // 55

// Taking multiple functions
val sum=(x: Int,y: Int)=>x+y
val mul=(x: Int,y: Int)=>x*y
val cal=(f1: (Int,Int)=>Int, f2: (Int,Int)=>Int, x: Int,y: Int) => (f1(x,y),f2(x,y))
cal(sum,mul,23,45)              // (68,1035)

// Currying
val add = (x: Int, y: Int) =>> x + y
add(3, 4)

val add = (x: Int) => (y: Int) => x + y
add(3)(4)


// Currying product price
def finalPrice(vat: Double,
    serviceCharge: Double,
    productPrice: Double): Double = 
        productPrice + productPrice*serviceCharge/100 + productPrice*vat/100
finalPrice(10,10,20)        // 22.0

// Curried function
val finalPrice=(productPrice:Double)=>
    (vat:Double)=>(serviceCharge:Double)=>
        productPrice + productPrice*serviceCharge/100 + 
        productPrice*vat/100
finalPrice(1000)(10)(8)
val vatApplied=finalPrice(1000)         // (Double)=>(Double)=>Double  = Lambda$1532
val serviceApplied=vatApplied(10)       // (Double)=>Double = Lambda$1533
val price=serviceApplied(8)             // Double = 1080.0


// Functions with named arguments
object Test {
    def main(args: Array[String]) {
        printInt(b=5, a=7);
    }
    def printInt( a:Int, b:Int ) = {
        println("Value of a : " + a );
        println("Value of b : " + b );
    }
}

// Functions with variable arguments
def addNumbers(x:Int*)={
    var total=0;
    for(i<-x) total+=i
    total
}

// Functions Call-by-name
object Test {
    def main(args: Array[String]) {
        delayed(time());
    }
    def time() = {
        println("Getting time in nano seconds")
        System.nanoTime
    }
    def delayed( t: => Long ) = {
        println("In delayed method")
        println("Param: " + t)
    }
}

// Default Parameter Values
def add(x:Int=2,y:Int=3)=x+y

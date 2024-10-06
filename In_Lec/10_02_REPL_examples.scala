// Generate Prime numbers
// Generate numbers from 2 to sqrt(n):
val isPrime=(n:Int)=>(2 to Math.sqrt(n).toInt)
// Filters the numbers n%_
val isPrime=(n:Int)=>(2 to Math.sqrt(n).toInt).filter(n%_==0)
// If this Vector is empty, given number is prime
val isPrime=(n:Int)=>(2 to Math.sqrt(n).toInt).filter(n%_==0).size==0

///////////////////
// Generate Random Numbers
// Generate a random number less than X:
val r1= (x:Int)=>scala.util.Random.nextInt(x)
// Generate a List of random numbers
val l1=List.fill(10)(r1(1000))

///////////////////
// Stat functions
// Calculate the total:
val sum=(l:List[Int])=>l.reduce((x,y)=>x+y)
// Calculate the total and average:
val stat:(List[Int])=>(Int,Double)=(l:List[Int])=>(sum(l),sum(l).toDouble/l.size)
//Generate List of tuples:
val t=(l:List[Int])=>l.map((x)=>(x,1))
//Add each elements:
val fx=(l:List[Int])=>l.map((x)=>(x,1)).reduce((x,y)=>(x._1+y._1,x._2+y._2))
//Calculate the total and average:
val stat=(x:Tuple2[Int,Int])=>(x._1,x._1/x._2.toDouble)

///////////////////
// Calculate the Word Count
val wc = (s:String)=>
    scala.io.Source.fromFile(s).getLines.
    flatMap(line=>line.split(" ")).
    map(x=>(x,1)).
    reduce((x,y) => ("",x._2 + y._2))

// Calculate the Letter Count
//Calculate the letters in a string
val fc=(x:Char,s:String)=>(x,s.count(_==x))
// Reading a file into single string:
val source = scala.io.Source.fromFile("sample.txt").getLines.mkString
// Braking into distinct characters and count it
source.distinct.toCharArray.map(fc(_,source))

// Calculate the letters in a string
val lc = (s:String)=>
    scala.io.Source.fromFile(s).
    getLines.mkString.distinct.
    toCharArray.
    map(x=>(x,source.count(_==x)))

///////////////////
// Counting the words
// Reading a file into a single string:
val source = scala.io.Source.fromFile("sample.txt").getLines.mkString
// Braking into distinct word and covert it to lower case:
val fx= (text: String) => text.split(" ").map(_.toLowerCase)
// Filtering a given word
val fy= (s:Array[String],p: String) => s.filter(x=>x==p)
// Calculating the array size
val fc= (s:Array[String],p: String) => s.filter(x=>x==p).size

// Counting the words
val count= (text: String,s:String) =>
    text.split(" ").map(_.toLowerCase).
    filter(x=>x==s).size

///////////////////
// Counting words in a string
val count= (text: String) => 
    text.split(" 
    ").map(_.toLowerCase).groupBy(iden
    tity).mapValues(_.size).toMap


///////////////////
// Caeser Cipher
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

// The cipher function
val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
        s.map(algo(_,key,a))
val ct=cipher(E,s,5,alphabet)
val pt=cipher(D,ct,5,alphabet)

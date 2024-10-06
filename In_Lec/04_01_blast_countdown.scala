object blast extends App{
    //Tail recursion
    def blastTail(n: Int): Unit = {
        println(n)
        if (n<=1) println("Blast Off!!")
        else blastTail(n-1)
    }
    // Head recursion
    def blastHead(n: Int): Unit = {
        if (n>1) blastHead(n-1)
        else println("Blast Off!!")
        println(n)
    }
    blastHead(3)
    blastTail(3)
}

// Output
// 1
// Blast Off!!
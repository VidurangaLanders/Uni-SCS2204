object sequence extends App{
    def sequence(m: Int, n: Int): Int = {
        if (m==n) println(n)
        else {
            println(m)
            sequence(m+1, n)
        }
    }
}
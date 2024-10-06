object power extends App{
    def power(n: Int, p: Int): Int = p match {
        case 0 => 1
        case x => n * power(n, x-1)
    }
    println(power(2, 4))
}
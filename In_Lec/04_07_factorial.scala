object factorial extends App{
    def factorial(n: Int): Int = n match {
        case 0 => 1
        case x => x * factorial(x-1)
    }
}
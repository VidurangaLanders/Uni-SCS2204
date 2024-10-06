object pattern extends App{
    def line(i: Int): Unit = {
        print(i)
        if (i>1) {
            line(i-1)
        }
    }

    def triangle(i: Int): Unit = {
        if (i>1) triangle(i-1)
        line(i)
        println()
    }

    triangle(5)
}
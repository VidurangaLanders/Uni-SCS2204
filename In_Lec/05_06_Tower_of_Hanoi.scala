//Tower of Hanoi
object TowerOfHanoi extends App{
    def hanoi(n: Int, from: Char, to: Char, aux: Char): Unit = {
        if (n == 1) {
            println(s"Move disk 1 from $from to $to")
        } else {
            hanoi(n-1, from, aux, to)
            println(s"Move disk $n from $from to $to")
            hanoi(n-1, aux, to, from)
        }
    }

    hanoi(3, 'A', 'C', 'B')
}

// Output

// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// Move disk 3 from A to C
// Move disk 1 from B to A
// Move disk 2 from B to C
// Move disk 1 from A to C
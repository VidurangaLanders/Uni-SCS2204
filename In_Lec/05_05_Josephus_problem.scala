//Josephus Problem
//n people stand in a circle.Every k, k th personis eliminated until only one remains.
// Find the position of the last person remaining.
object JosephusProblem extends App{
    def josephus(n: Int, k: Int): Int = {
        if (n == 1) {
            0
        } else {
            (josephus(n-1, k) + k) % n
        }
    }

    println(josephus(13, 3) + 1)
}

// Output

// 13
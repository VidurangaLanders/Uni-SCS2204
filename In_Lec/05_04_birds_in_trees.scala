// There are two trees ambu and Rabutan in a garden
// Birds of a jambu tree say that if one bird from a Rabutan tree comes to the Jambu tree, then the Jambu tree's population will be double that of the Rabutan tree.
// Birds of a Rabutan tree say that if one bird from a Jambu tree comes to the Rabutan tree, then the Rabutan tree's population will be equal to that of the Jambu tree.
// How many birds in each tree?

object BirdsInTrees extends App{
    def jambuTree(x: Int, y: Int): (Int, Int) = {
        val x = 2 * y - 3
        checkWithRabutanTree(x, y)
    }

    def checkWithRabutanTree(x: Int, y: Int): (Int, Int) = y match {
        case n if (x == n+ 2) => (x, y)
        case _ => jambuTree(x, y+1)
    }

    def findBirds() = jambuTree(1, 1)

    println(findBirds())
    
}
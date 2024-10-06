object OBNew6{
    def interest(deposit: Int): Double = {
        deposit match {
            case x if x>100000 => deposit*0.08
            case x if x>10000 => deposit*0.07
            case x if x>1000 => deposit*0.06
            case x if x>0 => deposit*0.05
            case _ => deposit*0
        }
    }

    def balance(deposit: Int): Double = {
        deposit + interest(deposit)
    }

    def main(args: Array[String])={
        var deposit = scala.io.StdIn.readInt()
        println("Interest: " + interest(deposit))
        println("Balance: " + balance(deposit))
    }
}
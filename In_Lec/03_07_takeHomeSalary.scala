object OBNew7{
    def grossPay(hours: Int): Int = {
        hours * 500
    }

    def tax(salary: Int): Double = {
        salary match {
            case x if x>100000 => salary * 0.20
            case x if x>50000 => salary * 0.10
            case _ => 0
        }
    }

    def netPay(hours: Int): Double = {
        grossPay(hours) - tax(grossPay(hours)).toInt
    }

    def main(args: Array[String])={
        var hours = scala.io.StdIn.readInt()
        println("Gross Pay: " + grossPay(hours))
        println("Tax: " + tax(grossPay(hours)))
        println("Net Pay: " + netPay(hours))
    }
}
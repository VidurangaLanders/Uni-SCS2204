// 22001034 - Practical 02 - Question 3 - Take Home Salary Calculation

object Q3{
    def normalPay(hours: Int): Int = hours * 250

    def otPay(hours: Int): Int = hours * 85

    def grossPay(normal_hours: Int, ot_hours: Int): Int = {
        normalPay(normal_hours) + otPay(ot_hours)
    }

    def tax(salary: Int): Double = salary * 0.12

    def netPay(normal_hours: Int, ot_hours: Int): Double = {
        grossPay(normal_hours, ot_hours) - tax(grossPay(normal_hours, ot_hours))
    }

    def main(args: Array[String]): Unit = {
        val normal_hours = 40
        val ot_hours = 30
        println("Normal Pay: " + normalPay(normal_hours))
        println("OT Pay: " + otPay(ot_hours))
        println("Gross Pay: " + grossPay(normal_hours, ot_hours))
        println("Tax: " + tax(grossPay(normal_hours, ot_hours)))
        println("Take Home Salary: " + netPay(normal_hours, ot_hours))
    }
}
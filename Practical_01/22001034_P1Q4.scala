// 22001034 - Practical 01 - Question 4 - Book Sale

object Q4{
    def bookPrice(num: Int): Double = num * 24.95

    def discount(num: Int, dis_rate: Double): Double = bookPrice(num) * dis_rate / 100

    def discountedPrice(num: Int, dis_rate: Double): Double = bookPrice(num) - discount(num, dis_rate)
    
    def shipping(num: Int): Double = if(num > 50) 3 + 0.75 * (num - 50) else 3

    def total(num: Int, dis_rate: Double) = shipping(num) + discountedPrice(num, dis_rate)
    
    def main(args: Array[String]): Unit = {
        val number_of_books = 60
        val discount_rate = 40
        val wholesale_cost = total(number_of_books, discount_rate)
        println(f"Total wholesale cost for $number_of_books is $wholesale_cost%.2f")
    }
}
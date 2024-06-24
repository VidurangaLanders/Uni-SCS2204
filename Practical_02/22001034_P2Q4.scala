// 22001034 - Practical 02 - Question 4 - Ticket Price Calculation

object Q4{
    
    def attendees(ticket_price: Int): Int = 120 + (15-ticket_price)/5*20
    
    def revenue(ticket_price: Int): Int = attendees(ticket_price) * ticket_price
    
    def cost(ticket_price: Int): Int = 500 + 3 * attendees(ticket_price)
    
    def profit(ticket_price: Int): Int = revenue(ticket_price) - cost(ticket_price)
    
    def main(args: Array[String]): Unit = {
        var best_price = 0
        var best_profit = 0
        for(ticket_price <- 10 to 50 by 5){
            println("Ticket Price: " + ticket_price + "\t Revenue: " + revenue(ticket_price) + "\t Cost: " + cost(ticket_price) + "\t Profit: " + profit(ticket_price))
            if(profit(ticket_price) > best_profit){
                best_profit = profit(ticket_price)
                best_price = ticket_price
            }
        }
        println("Best Price: " + best_price + "\t Best Profit: " + best_profit)

        // Commented are individual calculations as shown in lecture
        // val ticket_price = 15
        // println("Revenue: " + revenue(ticket_price))
        // println("Cost: " + cost(ticket_price))
        // println("Profit: " + profit(ticket_price))
    }
}
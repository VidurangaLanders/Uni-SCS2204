object OBNew{
    
    def attendees(ticket_price: Int): Int = 120 + (15-ticket_price)/5*20
    
    def revenue(ticket_price: Int): Int = attendees(ticket_price) * ticket_price
    
    def cost(ticket_price: Int): Int = 500 + 3 * attendees(ticket_price)
    
    def profit(ticket_price: Int): Int = revenue(ticket_price) - cost(ticket_price)
    
    def main(args: Array[String]) = {
        val ticket_price = 15
        println("Revenue: " + revenue(ticket_price))
        println("Cost: " + cost(ticket_price))
        println("Profit: " + profit(ticket_price))
    }
}

// Output
// Revenue: 1800
// Cost: 860
// Profit: 940
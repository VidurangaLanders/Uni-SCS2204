// 22001034 - Practical 04 - Question 1 - Inventory Management

object InventoryManager {
    // Function to display the current inventory
    def displayInventory(): Unit = {
        println("\nCurrent Inventory:")
        for (i <- itemNames.indices) {
            println(s"- ${itemNames(i)}: ${itemQuantities(i)}")
        }
        println()
    }

    // Function to restock an item
    def restockItem(itemName: String, quantity: Int): Unit = {
        val index = itemNames.indexOf(itemName)
        if (index != -1) {
            itemQuantities(index) += quantity
            println(s"$itemName restocked by $quantity. New quantity: ${itemQuantities(index)}")
        } else {
            println(s"Item '$itemName' not found in inventory.")
        }
    }

    // Function to sell an item
    def sellItem(itemName: String, quantity: Int): Unit = {
        val index = itemNames.indexOf(itemName)
        if (index != -1) {
            if (itemQuantities(index) >= quantity) {
                itemQuantities(index) -= quantity
                println(s"$itemName sold: $quantity. Remaining quantity: ${itemQuantities(index)}")
            } else {
                println(s"Not enough $itemName in stock. Available: ${itemQuantities(index)}")
            }
        } else {
            println(s"Item '$itemName' not found in inventory.")
        }
    }

    // Sample data
    val itemNames = Array("Shirt", "Pants", "Shoes", "Hat")
    val itemQuantities = Array(50, 30, 20, 15)

    // Main method
    def main(args: Array[String]): Unit = {
        displayInventory()
        restockItem("Shoes", 10)
        sellItem("Shirt", 25)
        sellItem("Socks", 5)
        displayInventory()
    }
    }

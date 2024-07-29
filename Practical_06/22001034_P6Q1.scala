// 22001034 - Practical 06 - Question 1 - Inventory System

object InventorySystem extends App {
    
  // Define the inventory maps
  val inventory1 = Map(
    101 -> ("Ball", 10, 150.0),
    102 -> ("Bat", 5, 20000.0),
    103 -> ("Glove", 8, 2500.0)
  )

  val inventory2 = Map(
    102 -> ("Bat", 3, 22000.0),
    104 -> ("Helmet", 7, 10000.0)
  )

  // Retrieve all product names from inventory1
  def getAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }

  // Calculate total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map(product => product._2 * product._3).sum
  }

  // Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }

  // Merge inventory1 and inventory2
  def mergeInventories(inv1: Map[Int, (String, Int, Double)], inv2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    (inv1.keySet ++ inv2.keySet).map { key =>
      key -> {
        (inv1.get(key), inv2.get(key)) match {
          case (Some((name1, qty1, price1)), Some((_, qty2, price2))) =>
            (name1, qty1 + qty2, price1.max(price2))
          case (Some(product), None) => product
          case (None, Some(product)) => product
          case _ => throw new IllegalStateException("Error!")
        }
      }
    }.toMap
  }

  // Check if a product with a specific ID exists and print its details
  def printProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println("\nProduct Information:")
        println(s"Product ID: $productId")
        println(s"Name: $name")
        println(s"Quantity: $quantity")
        println(s"Price: $price")
      case None =>
        println(s"Product with ID $productId not found.")
    }
  }

  // Test
  println("All product names: " + getAllProductNames(inventory1))
  println("Total value of inventory: " + calculateTotalValue(inventory1))
  println("Is inventory empty? " + isInventoryEmpty(inventory1))
  println("Merged inventory: \n" + mergeInventories(inventory1, inventory2))
  printProductDetails(inventory1, 102)
}
// 22001034 - Practical 05 - Question 1 - Inventory Management

import scala.io.StdIn

object InventoryManagement extends App{

    // Function to get product list from user
    def getProductList(): List[String] = {
        var productList = List[String]()
        var input = ""
        
        while (input != "done") {
            print("Enter product (or 'done' to end): ")
            input = StdIn.readLine()
            if (input != "done") productList = productList :+ input
        }

        productList
    }

    // Function to print product list
    def printProductList(productList: List[String]): Unit = {
        productList.zipWithIndex.foreach { case (product, index) =>
        println(s"${index + 1}. $product")
        }
    }

    // Function to get total products
    def getTotalProducts(productList: List[String]): Int = productList.length


    // Main program
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal Products: ${getTotalProducts(productList)}")
}

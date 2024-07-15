// 22001034 - Practical 05 - Question 02 - Library Management

import scala.io.StdIn

object LibraryManagement extends App {

    // Case class Book definition
    case class Book(title: String, author: String, isbn: String)

    // Function to add a book
    def addBook(): Unit = {
        println("Enter book title: ")
        val title = StdIn.readLine()
        println("Enter book author: ")
        val author = StdIn.readLine()
        println("Enter book ISBN: ")
        val isbn = StdIn.readLine()
        library += Book(title, author, isbn)
        println(s"Added: ${title} by ${author}")
    }

    // Function to remove by ISBN
    def removeBook(): Unit = {
        println("Enter ISBN to remove: ")
        val isbn = StdIn.readLine()
        if (isBookInLibrary(isbn)) {
            library = library.filterNot(_.isbn == isbn)
            println(s"Removed book with ISBN: $isbn")
        } else {
            println("Book not found.")
        }
    }

    // Function to search by ISBN
    def isBookInLibrary(isbn: String): Boolean = {
        library.exists(_.isbn == isbn)
    }

    // Function to display library collection
    def displayLibrary(): Unit = {
        println("\nLibrary Collection:")
        library.foreach(book => println(s"- ${book.title} by ${book.author} (ISBN: ${book.isbn})"))
    }

    // Function to Search by Title
    def searchByTitle(): Unit = {
        println("Enter title to search: ")
        val title = StdIn.readLine()
        library.find(_.title.toLowerCase == title.toLowerCase) match {
            case Some(book) => println(s"Found: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
            case None => println(s"Book titled '$title' not found.")
        }
    }

    // Function to Display Books by Author
    def displayByAuthor(): Unit = {
        println("Enter author to search: ")
        val author = StdIn.readLine()
        val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
        if (booksByAuthor.nonEmpty) {
            println(s"\nBooks by $author:")
            booksByAuthor.foreach(book => println(s"- ${book.title} (ISBN: ${book.isbn})"))
        } else {
            println(s"No books found by $author.")
        }
    }

    // Initial Book Collection
    var library: Set[Book] = Set(
        Book("Sherlock Holmes", "Arthur C. Doyle", "9998887774"),
        Book("Iliad", "Hormer", "9998887773"),
        Book("Odessi", "Hormer", "9998887772"),
    )

    // Main program
    println("\nLibrary Management System")
    
    // Loop to display menu
    var continue = true
    while (continue) {
        println("\n1. Add Book\n2. Remove Book\n3. Search by Title\n4. Display Books by Author\n5. Display Library\n6. Exit")
        print("Enter your choice: ")
        val choice = StdIn.readInt()
        choice match {
            case 1 => addBook()
            case 2 => removeBook()
            case 3 => searchByTitle()
            case 4 => displayByAuthor()
            case 5 => displayLibrary()
            case 6 => continue = false
            case _ => println("Invalid choice")
        }
    }
}
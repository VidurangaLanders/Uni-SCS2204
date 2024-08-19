//22001034 - Practical 09 - Question 3 - String Formatter

object StringFormatter extends App{
    // Convert a string to uppercase
    def toUpper: String => String = _.toUpperCase
    // Convert a string to lowercase
    def toLower: String => String = _.toLowerCase

    // Format names
    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames(names(0))(toUpper)) // Output: BENNY
    println(formatNames(names(1))(x => toUpper(x.take(2)) + toLower(x.drop(2)))) // Output: NIroshan
    println(formatNames(names(2))(toLower)) // Output: saman
    println(formatNames(names(3))(x => toUpper(x.take(1)) + toLower(x.drop(1).dropRight(1)) + toUpper(x.takeRight(1)))) // Output: KumarA
    
}

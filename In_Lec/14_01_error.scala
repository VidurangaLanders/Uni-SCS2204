// Error checking

// Option
def makeInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: Exception => None
  }
}

val a = makeInt("1")    // Some(1)
val b = makeInt("a")    // None

// Either
def makeInt(s: String): Either[String, Int] = {
  try {
    Right(s.toInt)
  } catch {
    case e: Exception => Left("Error")
  }
}

val a = makeInt("1")    // Right(1)
val b = makeInt("a")    // Left("Error")

// Try
import scala.util.{Try, Success, Failure}

def makeInt(s: String): Try[Int] = Try(s.toInt)

val a = makeInt("1")    // Success(1)
val b = makeInt("a")    // Failure(java.lang.NumberFormatException)
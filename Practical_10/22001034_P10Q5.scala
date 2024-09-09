// 22001034 - Practical 10 - Question 5 - Count letter occurrences

object CountLetterOccurrences extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(words)
  println(s"Total count of letter occurrences: $totalCount")
}
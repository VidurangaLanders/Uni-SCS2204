// 22001034 - Practical 08 - Question 1 - Caesar cipher

object CaesarCipher extends App {

  // Encryption Function
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Decryption Function
  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  // Cipher Function
  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }


  // Test
  val text = "This is a Caesar Cipher!"
  val shift = 13    // ROT13 shift    

  val encrypted = cipher(text, shift, encrypt)
  println(s"Encrypted: $encrypted")

  val decrypted = cipher(encrypted, shift, decrypt)
  println(s"Decrypted: $decrypted")

}

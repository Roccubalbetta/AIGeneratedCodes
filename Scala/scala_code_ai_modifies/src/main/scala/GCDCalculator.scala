object GCDCalculator {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }

  def lcmChatGPT(a: Int, b: Int): Int = {
    (a * b) / gcd(a, b)
  }

  def lcmLlama(a: Int, b: Int): Int = {
    (a * b) / gcd(a, b)
  }

  def lcmCC(a: Int, b: Int): Int = (a * b) / gcd(a, b)// parentesi mancante aggiunta dallo sviluppatore

  def main(args: Array[String]): Unit = {
    try {
      print("Enter the first number: ")
      val num1 = scala.io.StdIn.readInt()
      print("Enter the second number: ")
      val num2 = scala.io.StdIn.readInt()

      val result = gcd(num1, num2)
      println(s"The greatest common divisor (GCD) of $num1 and $num2 is $result")

      //codice modificato
      val lcmGPTResult = lcmChatGPT(num1, num2)
      val lcmLlamaResult = lcmLlama(num1, num2)
      val lcmCCResult = lcmCC(num1, num2)

      println(s"The least common multiple (LCM) of $num1 and $num2 is $lcmGPTResult")
      println(s"The least common multiple (LCM) of $num1 and $num2 is $lcmLlamaResult")
      println(s"The least common multiple (LCM) of $num1 and $num2 is $lcmCCResult")
    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter valid integers.")
    }
  }
}

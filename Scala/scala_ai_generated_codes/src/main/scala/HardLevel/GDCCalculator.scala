package HardLevel
object GDCCalculator {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }

  // manca la parentesi finale
  // def lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b
  def lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)

  def main(args: Array[String]): Unit = {
    try {
      print("Enter the first number: ")
      val num1 = scala.io.StdIn.readInt()
      print("Enter the second number: ")
      val num2 = scala.io.StdIn.readInt()

      val gcdResult = gcd(num1, num2)
      val lcmResult = lcm(num1, num2)


      println(s"The greatest common divisor (GCD) of $num1 and $num2 is $gcdResult")
      println(s"The least common multiple (LCM) of $num1 and $num2 is $lcmResult")

    } catch {
      case _: NumberFormatException =>
        println("Invalid input. Please enter valid integers.")
    }
  }
}


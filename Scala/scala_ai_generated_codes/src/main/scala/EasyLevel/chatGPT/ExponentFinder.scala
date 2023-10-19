package EasyLevel.chatGPT

object ExponentFinder {

  def findMissingExponent(a: Double, b: Double): Option[Double] = {
    if (a == 0 && b == 0) {
      // Indeterminate case: 0^0 is undefined
      None
    } else if (a == 0) {
      // Special case: 0^x is 0 for any x != 0
      if (b == 0) Some(0) else None
    } else if (b == 1) {
      // Special case: a^0 is 1 for any a
      Some(0)
    } else if (b == 0) {
      // Special case: a^x is 0 when a != 0 and x < 0
      None
    } else {
      // Calculate the missing exponent using logarithms
      val result = math.log(b) / math.log(a)
      if (result.isWhole) {
        Some(result.toInt)
      } else {
        None
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val a = 2.0
    val b = 8.0
    val missingExponent = findMissingExponent(a, b)

    missingExponent match {
      case Some(x) => println(s"$a^$x = $b")
      case None    => println("No integer exponent found.")
    }
  }
}

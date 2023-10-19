package EasyLevel

object ExponentFinder {
  def findExponent(a: Double, b: Double): Option[Double] = {
    if (a == 0 && b == 0) {
      None // Indeterminate form, both base and exponent are 0
    } else if (a == 0) {
      Some(0) // Anything raised to the power of 0 is 1
    } else if (b == 0) {
      Some(Double.PositiveInfinity) // 0 raised to any positive number is Infinity
    } else {
      Some(math.log(b) / math.log(a))
    }
  }

  def main(args: Array[String]): Unit = {
    val a = 2.0
    val b = 8.0
    findExponent(a, b) match {
      case Some(x) =>
        println(s"The missing exponent for $a^x = $b is $x")
      case None =>
        println("The result is indeterminate as both base and exponent are 0.")
    }
  }
}


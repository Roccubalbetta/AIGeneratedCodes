package EasyLevel.LlaMa

object ExponentFinder {
  def findExponent(a: Double, b: Double): Double = {
    math.log(b) / math.log(a)
  }

  def main(args: Array[String]): Unit = {
    val a = 2
    val b = 8
    val x = findExponent(a, b)
    println(s"The missing exponent for $a^x = $b is $x")
  }
}

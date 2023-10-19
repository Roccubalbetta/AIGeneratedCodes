package MediumLevel.LlaMa

object PrimorialCalculator {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until n).exists(x => n % x == 0)
  }

  def primorial(n: Int): BigInt = {
    var result = BigInt(1)
    var count = 0
    var i = 2
    while (count < n) {
      if (isPrime(i)) {
        result *= i
        count += 1
      }
      i += 1
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val n = 3
    val prim = primorial(n)
    println(s"The primorial of $n is $prim")
  }
}

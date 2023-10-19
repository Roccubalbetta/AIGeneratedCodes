package MediumLevel.chatGPT

object PrimorialCalculator {
  // Function to check if a number is prime
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else if (num % 2 == 0) false
    else {
      var i = 3
      while (i * i <= num) {
        if (num % i == 0) return false
        i += 2
      }
      true
    }
  }

  // Function to calculate the Primorial
  def calculatePrimorial(n: Int): Long = {
    var primorial: Long = 1
    var primeCount = 0
    var num = 2

    while (primeCount < n) {
      if (isPrime(num)) {
        primorial *= num
        primeCount += 1
      }
      num += 1
    }

    primorial
  }

  def main(args: Array[String]): Unit = {
    val n = 3 // You can change n to any positive integer
    val primorial = calculatePrimorial(n)
    println(s"The Primorial of $n is $primorial")
  }
}

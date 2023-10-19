package MediumLevel.LlaMa

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class PrimorialCalculatorSpec extends AnyFlatSpec with Matchers {
  "primorial" should "return 1 for n = 0" in {
    PrimorialCalculator.primorial(0) should be(BigInt(1))
  }

  it should "return the correct value for n = 1" in {
    PrimorialCalculator.primorial(1) should be(BigInt(2))
  }

  it should "return the correct value for n = 2" in {
    PrimorialCalculator.primorial(2) should be(BigInt(6))
  }

  it should "return the correct value for n = 3" in {
    PrimorialCalculator.primorial(3) should be(BigInt(30))
  }

  it should "return the correct value for n = 4" in {
    PrimorialCalculator.primorial(4) should be(BigInt(210))
  }
}


/*SBAGLIATA
class PrimorialCalculatorSpec extends AnyFlatSpec with Matchers {
  "isPrime" should "return false for n <= 1" in {
    PrimorialCalculator.isPrime(0) should be(false)
    PrimorialCalculator.isPrime(1) should be(false)
  }

  it should "return true for n = 2" in {
    PrimorialCalculator.isPrime(2) should be(true)
  }

  it should "return false for non-prime numbers" in {
    PrimorialCalculator.isPrime(4) should be(false)
    PrimorialCalculator.isPrime(9) should be(false)
    PrimorialCalculator.isPrime(15) should be(false)
  }

  it should "return true for prime numbers" in {
    PrimorialCalculator.isPrime(3) should be(true)
    PrimorialCalculator.isPrime(5) should be(true)
    PrimorialCalculator.isPrime(7) should be(true)
  }

  "primorial" should "return 1 for n = 0" in {
    PrimorialCalculator.primorial(0) should be(BigInt(1))
  }

  it should "return the correct value for n > 0" in {
    PrimorialCalculator.primorial(1) should be(BigInt(2))
    PrimorialCalculator.primorial(2) should be(BigInt(6))
    PrimorialCalculator.primorial(3) should be(BigInt(30))
    PrimorialCalculator.primorial(4) should be(BigInt(210))
  }
}*/

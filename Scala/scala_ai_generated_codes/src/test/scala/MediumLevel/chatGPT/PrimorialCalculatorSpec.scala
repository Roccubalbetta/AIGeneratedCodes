package MediumLevel.chatGPT

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimorialCalculatorSpec extends AnyFlatSpec with Matchers {

  "calculatePrimorial" should "return 1 for n = 0" in {
    val result = PrimorialCalculator.calculatePrimorial(0)
    result shouldEqual 1
  }

  it should "return 1 for n = 1" in {
    val result = PrimorialCalculator.calculatePrimorial(1)
    result shouldEqual 2
  }

  it should "return 6 for n = 2" in {
    val result = PrimorialCalculator.calculatePrimorial(2)
    result shouldEqual 6
  }

  it should "return 30 for n = 3" in {
    val result = PrimorialCalculator.calculatePrimorial(3)
    result shouldEqual 30
  }

  it should "return 9699690 for n = 8" in {
    val result = PrimorialCalculator.calculatePrimorial(8)
    result shouldEqual 9699690
  }
}


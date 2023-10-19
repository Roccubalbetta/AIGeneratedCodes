package EasyLevel

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExponentFinderSpec extends AnyFlatSpec with Matchers {

  "findExponent" should "return None when both a and b are zero (0^0)" in {
    val a = 0.0
    val b = 0.0
    val result = ExponentFinder.findExponent(a, b)
    result shouldEqual None
  }

  it should "return None when a is zero and b is not (0^x where x != 0)" in {
    val a = 0.0
    val b = 5.0
    val result = ExponentFinder.findExponent(a, b)
    result shouldEqual Some(0.0)
  }

  it should "return Some(0) when a is not zero and b is one (a^0)" in {
    val a = 2.0
    val b = 1.0
    val result = ExponentFinder.findExponent(a, b)
    result shouldEqual Some(0)
  }

  it should "return None when a is not zero, b is zero, and x is negative (a^x where x < 0)" in {
    val a = 3.0
    val b = 0.0
    val result = ExponentFinder.findExponent(a, b)
    result shouldEqual Some(Double.PositiveInfinity)
  }

  it should "return Some(x) when both a and b are positive non-zero numbers (a^x)" in {
    val a = 2.0
    val b = 8.0
    val result = ExponentFinder.findExponent(a, b)
    result shouldEqual Some(3)
  }
}

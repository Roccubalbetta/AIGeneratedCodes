package EasyLevel

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AdditionSpec extends AnyFlatSpec with Matchers {

  "addNumbers" should "return the correct sum for positive numbers" in {
    val result = Addition.add(5, 7)
    result shouldEqual 12
  }

  it should "return the correct sum for negative numbers" in {
    val result = Addition.add(-5, -7)
    result shouldEqual -12
  }

  it should "return the correct sum when one number is zero" in {
    val result1 = Addition.add(0, 7)
    val result2 = Addition.add(-5, 0)
    result1 shouldEqual 7
    result2 shouldEqual -5
  }

  it should "return the correct sum when both numbers are zero" in {
    val result = Addition.add(0, 0)
    result shouldEqual 0
  }

  it should "return the correct sum for large numbers" in {
    val result = Addition.add(1000000, 2000000)
    result shouldEqual 3000000
  }
}

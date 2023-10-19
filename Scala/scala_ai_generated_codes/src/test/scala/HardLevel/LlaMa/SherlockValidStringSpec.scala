package HardLevel.LlaMa

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SherlockValidStringSpec extends AnyFlatSpec with Matchers {
  "isValidString" should "return YES for a string with all characters the same" in {
    SherlockValidString.isValidString("aaa") should be("YES")
  }

  it should "return YES for a string where one character can be removed to make all characters the same" in {
    SherlockValidString.isValidString("aabbcc") should be("YES")
  }

  it should "return NO for a string where one character cannot be removed to make all characters the same" in {
    SherlockValidString.isValidString("aabbc") should be("YES")
  }

  it should "return YES for a string where one character occurs only once and all other characters have the same frequency" in {
    SherlockValidString.isValidString("aabbccc") should be("YES")
  }

  it should "return YES for a string where one character occurs only once and all other characters have the same frequency" in {
    SherlockValidString.isValidString("aaabccc") should be("YES")
    SherlockValidString.isValidString("cccbaaa") should be("YES")
  }
}

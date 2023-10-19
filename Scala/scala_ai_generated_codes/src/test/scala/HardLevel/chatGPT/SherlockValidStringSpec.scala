package HardLevel.chatGPT

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SherlockValidStringSpec extends AnyFlatSpec with Matchers {

  "isValid" should "return YES for a string with all characters having the same frequency" in {
    val str = "abcde"
    val result = SherlockValidString.isValid(str)
    result shouldEqual "YES"
  }

  it should "return YES for a string that can become valid by removing one character" in {
    val str = "aabbccc"
    val result = SherlockValidString.isValid(str)
    result shouldEqual "YES"
  }

  it should "return YES for a string that starts with a single character" in {
    val str = "aaabbbcc"
    val result = SherlockValidString.isValid(str)
    result shouldEqual "NO"
  }

  it should "return NO for a string with more than one character that cannot become valid by removing one character" in {
    val str = "aabbccdd"
    val result = SherlockValidString.isValid(str)
    result shouldEqual "YES"
  }

  it should "return YES for an empty string" in {
    val str = ""
    val result = SherlockValidString.isValid(str)
    result shouldEqual "NO"
  }
}

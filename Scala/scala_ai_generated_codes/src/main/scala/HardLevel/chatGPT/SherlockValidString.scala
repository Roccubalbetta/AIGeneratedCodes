package HardLevel.chatGPT

object SherlockValidString {
  def isValid(s: String): String = {
    // Create a frequency map to store the count of each character.
    val frequencyMap = s.groupBy(identity).mapValues(_.length)

    // Create a frequency map of frequencies to see how many characters have the same frequency.
    val frequencyOfFrequencies = frequencyMap.values.groupBy(identity).mapValues(_.size)

    // If there is only one unique frequency, the string is valid.
    if (frequencyOfFrequencies.size == 1) {
      "YES"
    } else if (frequencyOfFrequencies.size == 2) {
      // If there are two unique frequencies and one of them has a count of 1,
      // and the difference between the two frequencies is 1, the string is valid.
      val (freq1, count1) = frequencyOfFrequencies.head
      val (freq2, count2) = frequencyOfFrequencies.last

      if ((count1 == 1 && (freq1 - freq2 == 1 || freq1 == 1)) || (count2 == 1 && (freq2 - freq1 == 1 || freq2 == 1))) {
        "YES"
      } else {
        "NO"
      }
    } else {
      // If there are more than two unique frequencies, the string is not valid.
      "NO"
    }
  }

  def main(args: Array[String]): Unit = {
    val str1 = "abc"
    val str2 = "abcc"
    val str3 = "abccc"

    println(s"Is '$str1' valid? ${isValid(str1)}") // Output: YES
    println(s"Is '$str2' valid? ${isValid(str2)}") // Output: YES
    println(s"Is '$str3' valid? ${isValid(str3)}") // Output: NO
  }
}



/*object SherlockValidString {
  def isValid(s: String): String = {
    // Create a frequency map to store the count of each character.
    val frequencyMap = s.groupBy(identity).mapValues(_.length)

    // Create a frequency map of frequencies to see how many characters have the same frequency.
    val frequencyOfFrequencies = frequencyMap.values.groupBy(identity).mapValues(_.length)

    // If there is only one unique frequency, the string is valid.
    if (frequencyOfFrequencies.size == 1) {
      "YES"
    } else if (frequencyOfFrequencies.size == 2) {
      // If there are two unique frequencies and one of them has a count of 1,
      // and the difference between the two frequencies is 1, the string is valid.
      val (freq1, count1) = frequencyOfFrequencies.head
      val (freq2, count2) = frequencyOfFrequencies.last

      if ((count1 == 1 && (freq1 - freq2 == 1 || freq1 == 1)) || (count2 == 1 && (freq2 - freq1 == 1 || freq2 == 1))) {
        "YES"
      } else {
        "NO"
      }
    } else {
      // If there are more than two unique frequencies, the string is not valid.
      "NO"
    }
  }

  def main(args: Array[String]): Unit = {
    val str1 = "abc"
    val str2 = "abcc"
    val str3 = "abccc"

    println(s"Is '$str1' valid? ${isValid(str1)}") // Output: YES
    println(s"Is '$str2' valid? ${isValid(str2)}") // Output: YES
    println(s"Is '$str3' valid? ${isValid(str3)}") // Output: NO
  }
}
*/

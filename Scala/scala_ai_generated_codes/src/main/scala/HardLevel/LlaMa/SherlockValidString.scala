package HardLevel.LlaMa

object SherlockValidString {
  def isValidString(str: String): String = {
    val charFreqMap = str.groupBy(identity).mapValues(_.length)
    val freqMap = charFreqMap.groupBy(_._2).mapValues(_.size)
    if (freqMap.size == 1) "YES"
    else if (freqMap.size == 2) {
      val (k1, v1) :: (k2, v2) :: Nil = freqMap.toList
      if ((v1 == 1 && k1 == 1) || (v2 == 1 && k2 == 1)) "YES"
      else if ((k1 - k2).abs == 1 && (v1 == 1 || v2 == 1)) "YES"
      else "NO"
    }
    else "NO"
  }

  def main(args: Array[String]): Unit = {
    val str1 = "abc"
    val str2 = "abcc"
    val str3 = "abccc"

    println(s"Is '$str1' valid? ${isValidString(str1)}") // Output: YES
    println(s"Is '$str2' valid? ${isValidString(str2)}") // Output: YES
    println(s"Is '$str3' valid? ${isValidString(str3)}") // Output: NO
  }
}

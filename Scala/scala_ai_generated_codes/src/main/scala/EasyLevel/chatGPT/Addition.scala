package EasyLevel.chatGPT

object Addition {
  def addNumbers(num1: Int, num2: Int): Int = {
    val sum = num1 + num2
    sum
  }

  def main(args: Array[String]): Unit = {
    val number1 = 5
    val number2 = 7
    val result = addNumbers(number1, number2)
    println(s"The sum of $number1 and $number2 is: $result")
  }
}


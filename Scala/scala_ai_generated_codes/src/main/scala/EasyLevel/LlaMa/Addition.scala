package EasyLevel.LlaMa

object Addition {
  def add(x: Int, y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    val x = 5
    val y = 7
    val sum = add(x, y)
    println(s"The sum of $x and $y is $sum")
  }
}

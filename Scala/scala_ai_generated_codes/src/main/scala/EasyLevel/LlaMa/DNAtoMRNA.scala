package EasyLevel.LlaMa

object DNAtoMRNA {
  def transcribe(dna: String): String = {
    dna.replaceAll("T", "U")
  }

  def main(args: Array[String]): Unit = {
    val dna = "ATCG"
    val mrna = DNAtoMRNA.transcribe(dna)
    println(s"The mRNA strand for $dna is $mrna")
  }
}

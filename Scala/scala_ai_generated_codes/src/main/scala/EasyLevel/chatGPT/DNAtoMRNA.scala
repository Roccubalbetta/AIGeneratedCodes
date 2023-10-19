package EasyLevel.chatGPT

object DNAtoMRNA {
  def transcribe(dnaStrand: String): String = {
    val transcriptionMap = Map('A' -> 'U', 'T' -> 'A', 'G' -> 'C', 'C' -> 'G')

    val mRNA = dnaStrand.map {
      case base if transcriptionMap.contains(base) => transcriptionMap(base)
      case _ => throw new IllegalArgumentException("Invalid DNA base")
    }

    mRNA.mkString
  }

  def main(args: Array[String]): Unit = {
    val dnaStrand = "ATGC"
    val mRNA = transcribe(dnaStrand)
    println(s"DNA: $dnaStrand")
    println(s"mRNA: $mRNA")
  }
}

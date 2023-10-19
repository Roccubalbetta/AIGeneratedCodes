package EasyLevel.chatGPT

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import DNAtoMRNA.transcribe

class DNAtoMRNASpec extends AnyFlatSpec with Matchers {

  "transcribe" should "return the correct mRNA sequence for a valid DNA strand" in {
    val dnaStrand = "ATGC"
    val result = transcribe(dnaStrand)
    result shouldEqual "UACG"
  }

  it should "handle a DNA strand with lowercase letters" in {
    val dnaStrand = "atgc"
    val result = transcribe(dnaStrand)
    result shouldEqual "uacg"
    /*Versione correta
    val exception = intercept[IllegalArgumentException] {
      transcribe(dnaStrand)
    }
    exception.getMessage shouldEqual "Invalid DNA base"
  */
  }

  it should "return an empty string for an empty DNA strand" in {
    val dnaStrand = ""
    val result = transcribe(dnaStrand)
    result shouldEqual ""
  }

  it should "handle invalid DNA bases gracefully" in {
    val dnaStrand = "ATGX"
    val exception = intercept[IllegalArgumentException] {
      transcribe(dnaStrand)
    }
    exception.getMessage shouldEqual "Invalid DNA base"
  }

  it should "handle a DNA strand with non-standard bases" in {
    val dnaStrand = "ATGCTN"
    val exception = intercept[IllegalArgumentException] {
      transcribe(dnaStrand)
    }
    exception.getMessage shouldEqual "Invalid DNA base"
  }
}


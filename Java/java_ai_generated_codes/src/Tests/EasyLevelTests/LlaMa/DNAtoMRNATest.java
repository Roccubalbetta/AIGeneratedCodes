package Tests.EasyLevelTests.LlaMa;

import EasyLevel.LlaMa.DNAtoMRNA;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DNAtoMRNATest {

    @Test
    public void testTranscribe() {
        String rna = DNAtoMRNA.transcribe("ATCG");
        assertEquals("AUCG", rna);
    }

    @Test
    public void testTranscribeLowerCase() {
        String rna = DNAtoMRNA.transcribe("atcg");
        assertEquals("aucg", rna);
    }

    @Test
    public void testTranscribeMixedCase() {
        String rna = DNAtoMRNA.transcribe("aTcG");
        assertEquals("aUCG", rna);
    }

    @Test
    public void testTranscribeNoT() {
        // non dovrebbe passare
        String rna = DNAtoMRNA.transcribe("ACCG");
        assertEquals("ACCG", rna);
    }

    @Test
    public void testTranscribeEmptyString() {
        String rna = DNAtoMRNA.transcribe("");
        assertEquals("", rna);
    }
}
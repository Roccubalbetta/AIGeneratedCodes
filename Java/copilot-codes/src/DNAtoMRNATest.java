import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNAtoMRNATest {

    @Test
    public void testTranscribe() {
        String rna = DNAtoMRNA.transcribe("ATCG");
        assertEquals("UAGC", rna);
    }

    @Test
    public void testTranscribeLowerCase() {
        assertThrows(IllegalArgumentException.class, () -> {
            DNAtoMRNA.transcribe("atcg");
        });
    }

    @Test
    public void testTranscribeInvalidBase() {
        assertThrows(IllegalArgumentException.class, () -> {
            DNAtoMRNA.transcribe("ATGX");
        });
    }

    // test fornito da Copilot
    @Test
    public void testTranscribeEmptyString() {
        String rna = DNAtoMRNA.transcribe("");
        assertEquals("", rna);
    }

}
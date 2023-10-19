package Tests.EasyLevelTests.chatGPT;

import EasyLevel.chatGPT.DNAtoMRNA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DNAtoMRNATest {

    @Test
    public void testTranscribeValidInput() {
        String dnaStrand = "ATGC";
        String expectedMRNA = "UACG";
        String result = DNAtoMRNA.transcribeToMRNA(dnaStrand);
        assertEquals(expectedMRNA, result);
    }

    @Test
    public void testTranscribeEmptyInput() {
        String dnaStrand = "";
        String expectedMRNA = "";
        String result = DNAtoMRNA.transcribeToMRNA(dnaStrand);
        assertEquals(expectedMRNA, result);
    }

    @Test
    public void testTranscribeUpperCaseInput() {
        String dnaStrand = "AGCT";
        String expectedMRNA = "UCGA";
        String result = DNAtoMRNA.transcribeToMRNA(dnaStrand);
        assertEquals(expectedMRNA, result);
    }

    @Test
    public void testTranscribeMixedCaseInput() {
        String dnaStrand = "AtGcT"; // Una base DNA non valida ('t' invece di 'T')
        assertThrows(IllegalArgumentException.class, () -> DNAtoMRNA.transcribeToMRNA(dnaStrand));
    }

    @Test
    public void testTranscribeInvalidBase() {
        String dnaStrand = "ATGX"; // 'X' è una base DNA non valida
        assertThrows(IllegalArgumentException.class, () -> DNAtoMRNA.transcribeToMRNA(dnaStrand));
    }
}
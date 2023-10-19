package Tests.MediumLevelTests.LlaMa;

import MediumLevel.LlaMa.PrimorialCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimorialCalculatorTest {
// il codice commentato è quello proposto da Llama
    @Test
    public void testPrimorialOfZero() {
        //long result = Primorial.primorial(0);
        long result = PrimorialCalculator.primorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testPrimorialOfOne() {
        //long result = Primorial.primorial(1);
        long result = PrimorialCalculator.primorial(1);
        assertEquals(2, result);
    }

    @Test
    public void testPrimorialOfTwo() {
        //long result = Primorial.primorial(2);
        long result = PrimorialCalculator.primorial(2);
        assertEquals(6, result);
    }

    @Test
    public void testPrimorialOfTen() {
        //long result = Primorial.primorial(10);
        long result = PrimorialCalculator.primorial(10);
        assertEquals(6469693230L, result);
    }

    @Test
    public void testPrimorialOfNegativeNumber() {
        // non vi è nessun controllo sul valore iniziale di n
        try {
            //long result = Primorial.primorial(-1);
            long result = PrimorialCalculator.primorial(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}
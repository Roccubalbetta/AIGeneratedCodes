package Tests.MediumLevelTests.chatGPT;

import static org.junit.jupiter.api.Assertions.*;

import MediumLevel.chatGPT.PrimorialCalculator;
import org.junit.jupiter.api.Test;

public class PrimorialCalculatorTest {

    @Test
    public void testCalculatePrimorialForN1() {
        long primorial = PrimorialCalculator.calculatePrimorial(1);
        assertEquals(2, primorial);
    }

    @Test
    public void testCalculatePrimorialForN3() {
        long primorial = PrimorialCalculator.calculatePrimorial(3);
        assertEquals(30, primorial);
    }

    @Test
    public void testCalculatePrimorialForN0() {
        long primorial = PrimorialCalculator.calculatePrimorial(0);
        assertEquals(1, primorial);
    }

    @Test
    public void testCalculatePrimorialForNegativeN() {
        long primorial = PrimorialCalculator.calculatePrimorial(-5);
        assertEquals(1, primorial);
    }

    @Test
    public void testIsPrimeForPrimeNumber() {
        assertTrue(PrimorialCalculator.isPrime(7));
    }

    @Test
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(PrimorialCalculator.isPrime(4));
    }
}
package Tests.EasyLevelTests.chatGPT;

import EasyLevel.chatGPT.LogarithmEquationSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogarithmEquationSolverTest {
    @Test
    public void testValidInput() {
        double a = 2.0;
        double b = 8.0;
        double expectedExponent = 3.0;
        double result = LogarithmEquationSolver.findExponent(a, b);
        assertEquals(expectedExponent, result, 0.0001); // Use delta for floating-point comparisons
    }

    @Test
    public void testZeroBase() {
        double a = 0.0;
        double b = 5.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.findExponent(a, b));
    }

    @Test
    public void testZeroResult() {
        double a = 3.0;
        double b = 0.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.findExponent(a, b));
    }

    @Test
    public void testNegativeBase() {
        double a = -2.0;
        double b = 8.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.findExponent(a, b));
    }

    @Test
    public void testNegativeResult() {
        double a = 3.0;
        double b = -27.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.findExponent(a, b));
    }
}
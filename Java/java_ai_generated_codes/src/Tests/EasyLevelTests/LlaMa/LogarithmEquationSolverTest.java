package Tests.EasyLevelTests.LlaMa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import EasyLevel.LlaMa.LogarithmEquationSolver;

public class LogarithmEquationSolverTest {

    @Test
    public void testSolvePositiveNumbers() {
        double x = LogarithmEquationSolver.solve(2, 8);
        assertEquals(3.0, x, 0.0001);
    }

    @Test
    public void testSolveNegativeNumbers() {
        double x = LogarithmEquationSolver.solve(-2, 8);
        assertEquals(3.0, x, 0.0001);
    }

    @Test
    public void testSolveZero() {
        // al posto di NaN dovrebbe esserci -Infinity
        double x = LogarithmEquationSolver.solve(2, 0);
        assertEquals(Double.NaN, x, 0.0001);
    }

    @Test
    public void testSolveOne() {
        double x = LogarithmEquationSolver.solve(2, 1);
        assertEquals(0.0, x, 0.0001);
    }

    @Test
    public void testSolveFraction() {
        double x = LogarithmEquationSolver.solve(2, 0.25);
        assertEquals(-2.0, x, 0.0001);
    }
}
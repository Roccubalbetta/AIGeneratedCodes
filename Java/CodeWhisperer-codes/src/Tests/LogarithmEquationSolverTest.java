package Tests;

import EasyLevel.LogarithmEquationSolver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogarithmEquationSolverTest {

    @Test
    public void testValidInput() {
        double a = 2.0;
        double b = 8.0;
        double expectedExponent = 3.0;
        double result = LogarithmEquationSolver.logarithmEquationSolver(a, b);
        assertEquals(expectedExponent, result, 0.0001); // Use delta for floating-point comparisons
    }

    @Test
    public void testZeroBase() {
        double a = 0.0;
        double b = 5.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.logarithmEquationSolver(a, b));
    }

    @Test
    public void testZeroResult() {
        double a = 3.0;
        double b = 0.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.logarithmEquationSolver(a, b));
    }

    @Test
    public void testNegativeBase() {
        double a = -2.0;
        double b = 8.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.logarithmEquationSolver(a, b));
    }

    @Test
    public void testNegativeResult() {
        double a = 3.0;
        double b = -27.0;
        assertThrows(IllegalArgumentException.class, () -> LogarithmEquationSolver.logarithmEquationSolver(a, b));
    }

}

/* primi test generati che non esplorano i casi limite e sbagliano il nome della funzione
* @Test
void testLogarithmEquationSolver () {
LogarithmEquationSolver solver = new
LogarithmEquationSolver () ;
assertEquals ( solver . solve (1 , 2) ,
0.6931471805599453) ;
assertEquals ( solver . solve (2 , 3) ,
1.0986122886681098) ;
assertEquals ( solver . solve (3 , 4) ,
1.3862943611198906) ;
assertEquals ( solver . solve (4 , 5) ,
1.6094379124341003) ;
}
@Test
void testLogarithmEquationSolver2 () {
LogarithmEquationSolver solver = new
LogarithmEquationSolver () ;
assertEquals ( solver . solve (1 , 2) ,
0.6931471805599453) ;
assertEquals ( solver . solve (2 , 3) ,
1.0986122886681098) ;
assertEquals ( solver . solve (3 , 4) ,
1.3862943611198906) ;
assertEquals ( solver . solve (4 , 5) ,
1.6094379124341003) ;
*/
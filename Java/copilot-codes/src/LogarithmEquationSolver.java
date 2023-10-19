public class LogarithmEquationSolver {
    public static double solve(double a, double b) {
        if (a <= 0 || b <= 0)
            return Double.NaN;
        return Math.log(b) / Math.log(a);
    }
}

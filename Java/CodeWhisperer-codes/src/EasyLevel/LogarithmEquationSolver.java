package EasyLevel;

public class LogarithmEquationSolver {
    public static double logarithmEquationSolver(double x, double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base cannot be less than or equal to 0");
        }
        if (x <= 0) {
            throw new IllegalArgumentException("X cannot be less than or equal to 0");
        }
        return Math.log(base) / Math.log(x);
    }

    public static void main(String[] args) {
        double x = 2;
        double base = 10;
        System.out.println("The logarithm of " + x + " in base " + base + " is " + logarithmEquationSolver(x, base));
    }
}

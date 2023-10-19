package EasyLevel.chatGPT;

public class LogarithmEquationSolver {
    // This method finds the missing exponent x such that a^x = b.
    public static double findExponent(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both 'a' and 'b' must be positive numbers.");
        }
        return Math.log(b) / Math.log(a);
    }

    public static void main(String[] args) {
        // Example usage of findExponent method
        double a = 2.0;  // Base
        double b = 8.0;  // Result of a^x
        double exponent = findExponent(a, b);
        System.out.println("Exponent (x) such that " + a + "^x = " + b + ": " + exponent);
    }
}

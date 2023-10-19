package MediumLevel.LlaMa;

public class PrimorialCalculator {
    public static long primorial(int n) {
        int count = 0;
        long result = 1;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                result *= i;
                count++;
            }
            i++;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

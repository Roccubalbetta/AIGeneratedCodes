package MediumLevel.chatGPT;

import java.util.ArrayList;
import java.util.List;

public class PrimorialCalculator {
    public static void main(String[] args) {
        int n = 3; // Change this value to calculate the Primorial for a different 'n'.
        long primorial = calculatePrimorial(n);
        System.out.println("Primorial(" + n + ") = " + primorial);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long calculatePrimorial(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2; // Start with the first prime number

        while (primeNumbers.size() < n) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }

        long primorial = 1;
        for (int prime : primeNumbers) {
            primorial *= prime;
        }

        return primorial;
    }
}
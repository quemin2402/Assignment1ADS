package functions;

import java.util.Scanner;

/**
 * Contains methods for calculating binomial coefficient.
 */
public class Task9 {

    /**
     * Calculates the binomial coefficient.
     * <p>
     * The binomial coefficient, also known as the combination or "n choose k", represents
     * the number of ways to choose 'k' elements out of a set of 'n' elements without regard
     * to the order of the elements. This implementation uses a direct recursive approach
     * based on the formula: C(n, k) = C(n - 1, k - 1) + C(n - 1, k).
     * <p>
     * Exponential time complexity - O(2^n).
     *
     * @param sc The scanner object for reading 'n' and 'k' values from the console.
     */
    public static void calculateBinomialCoefficient(Scanner sc) {
        System.out.println("Enter a number for 'n' terms in binomial:");
        int n = sc.nextInt();
        System.out.println("Enter a number for 'k' terms in binomial:");
        int k = sc.nextInt();
        System.out.println("Binomial coefficient is " + calculationsBinomial(n, k));
        System.out.println("Time complexity: O(2^n)");
    }

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    private static Integer calculationsBinomial(int n, int k) {
        if (k == 0 || k == n) // Base cases
            return 1;
        return calculationsBinomial(n - 1, k - 1) + calculationsBinomial(n - 1, k); // Recursion
    }
}

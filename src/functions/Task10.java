package functions;

import java.util.Scanner;

/**
 * Contains methods for finding the greatest common divisor of two numbers.
 */
public class Task10 {

    /**
     * Calculates Greatest Common Divisor (GCD).
     * <p>
     * The method reads two integers from the user and uses Euclid's algorithm
     * to find their GCD. The algorithm employs a recursive approach, where the GCD of two numbers
     * is the same as the GCD of the smaller number and the remainder of the larger number divided
     * by the smaller number, ultimately reaching a base case where the remainder is zero.
     * <p>
     * Time complexity: O(log n), where n is the smaller of the two input numbers.
     * This logarithmic complexity arises from the property of Euclid's algorithm,
     * where the size of the problem reduces significantly with each step.
     *
     * @param sc The scanner object for reading the user's input.
     */
    public static void findGCD(Scanner sc) {
        System.out.println("Enter the first number 'a': ");
        int a = sc.nextInt();
        System.out.println("Enter the second number 'b': ");
        int b = sc.nextInt();

        int gcd = gcdRecursive(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("Time complexity: O(log n)");
    }

    /**
     * Recursively calculates the Greatest Common Divisor (GCD) of two numbers using Euclid's algorithm.
     * <p>
     * The recursive process swaps the numbers so that the larger number becomes the divisor
     * for the remainder operation, and the smaller number becomes the new dividend. The process
     * repeats until the remainder is zero, at which point the non-zero divisor is the GCD.
     *
     * @param a The first number.
     * @param b The second number, which acts as the divisor in the first recursion.
     * @return The GCD of the two numbers.
     */
    private static int gcdRecursive(int a, int b) {
        if (b == 0) // Base case
            return a;
        return gcdRecursive(b, a % b); // Recursive call swapping the numbers and using the remainder
    }
}

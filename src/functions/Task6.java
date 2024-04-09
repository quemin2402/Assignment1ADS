package functions;

import java.util.Scanner;

/**
 * Contains methods to calculate the power of a number.
 */
public class Task6 {

    /**
     * Calculates the power.
     * <p>
     * This method asks the user to input a base number and an exponent.
     * Then, it calculates the power using a recursive approach, which multiplies
     * the base number by itself exponent times.
     * <p>
     * Time complexity: O(n), where n is the exponent. The method recursively calls
     * itself n times, leading to n multiplications to calculate the power.
     *
     * @param sc The scanner object to read the user's input.
     */
    public static void calculatePower(Scanner sc) {
        System.out.println("Enter a base number: ");
        int a = sc.nextInt();
        System.out.println("Enter an exponent for the base: ");
        int n = sc.nextInt();
        System.out.println(a + " to the power " + n + " is " + calculationsPower(a, n));
        System.out.println("Time complexity: O(n)");
    }

    /**
     * Recursively calculates the power of a number.
     * <p>
     * Given a base number a and an exponent n, this method returns a raised to the power of n.
     * The base case is when n is 0, where a^0 is 1. For n > 0, it performs a multiplication
     * of a with the result of a raised to the power of n - 1.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    private static Integer calculationsPower(int a, int n) {
        if (n == 0) { // Base case
            return 1;
        }
        return a * calculationsPower(a, n - 1); // Recursion
    }
}

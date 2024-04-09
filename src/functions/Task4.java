package functions;

import java.util.Scanner;

/**
 * Contains methods to calculate factorial of a number.
 */
public class Task4 {

    /**
     * Reads an integer from the user and prints its factorial.
     * <p>
     * This method asks the user to enter a non-negative integer and computes its factorial using a recursive method.
     * Factorial is defined only for non-negative integers.
     * If a negative number is entered, an error message is displayed.
     * <p>
     * Time complexity: O(n), where n is the number input by the user.
     * Each recursive call to calculate factorial reduces the problem size by 1, leading to n calls
     *
     * @param sc The scanner object to read the user's input.
     */
    public static void calculateFactorial(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // Validates the number
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial: " + calculationsFactorial(n));
            System.out.println("Time complexity: O(n)");
        }
    }

    /**
     * Recursively calculates the factorial of a given number.
     * <p>
     * This method employs a recursive approach to calculate the factorial of a number.
     * The base case is 0! = 1.
     * For all other values of n, the method calls itself with n - 1 and multiplies the result with n.
     *
     * @param n The number to calculate the factorial of.
     * @return The factorial of the number.
     */
    private static Integer calculationsFactorial(int n) {
        if (n == 0) // Base case
            return 1;
        else
            return n * calculationsFactorial(n - 1); // Recursion
    }
}

package functions;

import java.util.Scanner;

/**
 * Contains methods to calculate Fibonacci numbers.
 */
public class Task5 {

    /**
     * Prints the corresponding Fibonacci number.
     * <p>
     * This method reads an integer from the user and uses a recursive method to calculate
     * the Fibonacci number at that position in the sequence.
     * <p>
     * The time complexity is O(2^n).
     *
     * @param sc The scanner object for reading the user input.
     */
    public static void fibonacciSequence(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " element of Fibonacci sequence is " + calculationsFibonacci(n));
        System.out.println("Time complexity: O(2^n)");
    }

    /**
     * Recursively calculates the Fibonacci number at the specified position.
     * <p>
     * This recursive method calculates the nth Fibonacci number.
     * It has a base case for the 0th and 1st positions, returning 0 and 1, respectively.
     * For all other positions, it sums the two preceding Fibonacci numbers, hence, has an exponential time complexity.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The Fibonacci number at the given position.
     */
    private static Integer calculationsFibonacci(int n) {
        if (n == 0) // Base case 1
            return 0;
        else if (n == 1) // Base case 2
            return 1;
        return calculationsFibonacci(n - 1) + calculationsFibonacci(n - 2); // Recursion
    }
}

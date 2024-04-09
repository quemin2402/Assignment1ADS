package functions;

import java.util.Scanner;

/**
 * Contains method to check if a number is prime.
 */
public class Task3 {

    /**
     * Checks and prints whether a number is prime.
     * <p>
     * The method requires user's input.
     * A number is considered prime if it is greater than 1 and has no positive divisors other than 1 and itself.
     * The check is performed by attempting to divide the number by all integers from 2 to the square root of the number.
     * If any division results in a whole number, the number is not prime.
     * <p>
     * Time complexity: O(sqrt(n)), where n is the number to be checked. This is because the check only needs
     * to go up to the square root of n, reducing the number of iterations needed.
     *
     * @param sc The scanner object for reading the number from the console.
     */
    public static void checkPrime(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true; // Assume the number is prime until proven otherwise

        // 0, 1 and negative numbers are neither prime nor composite
        if (n < 2) {
            System.out.println("Neither prime nor composite!!!");
            isPrime = false;
        } else {
            // Checks for divisibility from 2 up to the square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                // If n is divisible by any number other than 1 and itself, it is not prime
                if (n % i == 0) {
                    System.out.println("Composite");
                    isPrime = false; // Sets the flag to false as n is not prime
                    break; // Exits the loop as we have found a divisor
                }
            }
        }

        // If the flag remains true, n is prime
        if (isPrime) {
            System.out.println("Prime");
        }

        System.out.println("Time complexity: O(sqrt(n))");
    }
}

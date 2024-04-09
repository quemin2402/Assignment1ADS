package functions;

import java.util.Scanner;

/**
 * Contains methods for reversing an array.
 */
public class Task7 {

    /**
     * Prints an array in reverse order.
     * <p>
     * This method demonstrates a recursive approach to reversing an array without
     * actually storing it. It asks the user for the total number of elements,
     * then recursively reads and prints each element in reverse order.
     * This is achieved by making a recursive call before printing each element,
     * ensuring that the last entered element is printed first and the first element last.
     * <p>
     * Time complexity: O(n), where n is the number of elements.
     * Each element results in one recursive call, leading to a linear time complexity.
     *
     * @param sc The scanner object for reading the array elements from the console.
     */
    public static void reverseArray(Scanner sc) {
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        reversingArray(sc, n);
        System.out.println();
        System.out.println("Time complexity: O(n)");
    }

    /**
     * Recursively reads and prints array elements in reverse order.
     * <p>
     * This helper method is called by {@link #reverseArray(Scanner)} for the actual
     * recursive logic. It reads one element from the scanner, makes a recursive call to read the next,
     * and prints the current element as the recursion unwinds.
     *
     * @param sc The scanner object for reading an element.
     * @param n  The number of elements remaining to read and print.
     */
    private static void reversingArray(Scanner sc, int n) {
        if (n == 0) // Base case
            return;

        int element = sc.nextInt(); // Reads the next element
        reversingArray(sc, n - 1);
        System.out.print(element + " "); // Prints the current element as the recursion unwinds
    }
}

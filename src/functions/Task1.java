package functions;

import java.util.Scanner;

/**
 * Contains method for finding minimum from an array.
 */
public class Task1 {

    /**
     * Finds the minimum element in an array of integers entered by the user.
     * <p>
     * This method asks the user to enter the total number of elements followed by each element of the array.
     * Then, it iterates through the entire array to find the smallest element.
     * <p>
     * Time complexity: O(n), where n is the number of elements in the array. As the algorithm needs to inspect
     * each element once to determine the minimum value, it results in a linear relationship between the number of elements
     * and the number of operations performed.
     *
     * @param sc The scanner object for reading input from the console.
     */
    public static void findMinimum(Scanner sc) {
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Validates the number of elements
        if (n <= 0) {
            System.out.println("Invalid number of elements!");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        int min = Integer.MAX_VALUE; // Starts with the first possible value - maximum

        // Reads each element from the user and finds the minimum
        for (int i = 0; i < n; i++) {
            int currentElement = sc.nextInt();
            if (currentElement < min)
                min = currentElement; // Updates min if the current element is smaller
        }

        // Outputs the minimum
        System.out.println("Minimum: " + min);
        System.out.println("Time complexity: O(n)");
    }
}

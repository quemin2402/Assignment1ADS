package functions;

import java.util.Scanner;

/**
 * Contains method for calculating an average of an array.
 */
public class Task2 {

    /**
     * Calculates the average of a set of numbers entered by the user (total number of elements, elements themselves).
     * <p>
     * The method sums all elements and divides by the number of elements to find the average.
     * <p>
     * Time complexity: O(n), where n is the number of elements. Each element is read once and added to the sum,
     * thus the operations increase linearly with the number of elements.
     *
     * @param sc The scanner object for reading the array elements from the console.
     */
    public static void calculateAverage(Scanner sc) {
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Validates the number of elements
        if (n <= 0) {
            System.out.println("The number of elements must be more than zero");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        double sumOfElements = 0;

        // Reads the elements and calculates their sum
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sumOfElements += array[i];
        }

        // Outputs the average value
        System.out.println("Average: " + sumOfElements / n);
        System.out.println("Time complexity: O(n)");
    }
}

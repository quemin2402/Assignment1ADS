package functions;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void findMinimum(Scanner sc) {
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of elements!");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        int min = array[0];
        for (int i = 0; i < n; i++) {
            int currentElement = sc.nextInt();
            if (currentElement < min) {
                min = currentElement;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Time complexity: O(n)");
    }
}

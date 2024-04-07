package functions;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void findMinimum(Scanner sc) {
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int min = array[0];

        System.out.println("Minimum: " + min);
    }
}

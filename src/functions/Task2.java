package functions;

import java.util.Scanner;

public class Task2 {
    public static void calculateAverage(Scanner sc) {
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        float sumOfElements = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sumOfElements += array[i];
        }

        System.out.println("Average: " + sumOfElements / n);
    }
}

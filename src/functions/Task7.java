package functions;

import java.util.Scanner;

public class Task7 {
    public static void reverseArray(Scanner sc) {
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        reversingArray(sc, n);
        System.out.println();
        System.out.println("Time complexity: O(n)");
    }
    private static void reversingArray(Scanner sc, int n) {
        if (n == 0)
            return;
        int element = sc.nextInt();
        reversingArray(sc, n - 1);
        System.out.print(element + " ");
    }
}

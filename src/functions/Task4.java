package functions;

import java.util.Scanner;

public class Task4 {
    public static void calculateFactorial(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial: " + calculationsFactorial(n));
            System.out.println("Time complexity: O(n)");
        }
    }

    private static Integer calculationsFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculationsFactorial(n - 1);
    }
}

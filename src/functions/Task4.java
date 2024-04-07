package functions;

import java.util.Scanner;

public class Task4 {
    public static void calculateFactorial(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + calculationsFactorial(n));
    }

    private static Integer calculationsFactorial(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return n * calculationsFactorial(n - 1);
    }
}

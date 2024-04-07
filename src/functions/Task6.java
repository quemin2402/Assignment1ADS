package functions;

import java.util.Scanner;

public class Task6 {
    public static void calculatePower(Scanner sc) {
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a power for the number: ");
        int n = sc.nextInt();
        System.out.println(a + " to the power " + n + " is " + calculationsPower(a, n));
    }

    private static Integer calculationsPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * calculationsPower(a, n - 1);
    }
}

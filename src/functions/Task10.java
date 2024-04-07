package functions;

import java.util.Scanner;

public class Task10 {
    public static void findGCD(Scanner sc) {
        System.out.println("Enter the first number 'a': ");
        int a = sc.nextInt();
        System.out.println("Enter the second number 'b': ");
        int b = sc.nextInt();

        int gcd = gcdRecursive(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }

    private static Integer gcdRecursive(int a, int b) {
        if (b == 0)
            return a;
        return gcdRecursive(b, a % b);
    }
}

package functions;

import java.util.Scanner;

public class Task3 {
    public static void checkPrime(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n < 2)
            System.out.println("Neither prime nor composite!!!");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");
    }
}

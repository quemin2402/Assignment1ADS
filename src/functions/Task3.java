package functions;

import java.util.Scanner;

public class Task3 {
    public static void checkPrime(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            System.out.println("Neither prime nor composite!!!");
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("Composite");
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        }

        System.out.println("Time complexity: O(sqrt(n))");
    }
}

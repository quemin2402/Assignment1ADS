package functions;

import java.util.Scanner;

public class Task5 {
    public static void fibonacciSequence(Scanner sc) {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " element of Fibonacci sequence is a" + calculationsFibonacci(n));
    }

    private static Integer calculationsFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return calculationsFibonacci(n - 1) + calculationsFibonacci(n - 2);
    }
}

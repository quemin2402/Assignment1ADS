package functions;

import java.util.Scanner;

public class Task9 {
    public static void calculateBinomialCoefficient(Scanner sc) {
        System.out.println("Enter a number for 'n' terms in binomial:");
        int n = sc.nextInt();
        System.out.println("Enter a number for 'k' terms in binomial:");
        int k = sc.nextInt();
        System.out.println("Binomial coefficient" + calculationsBinomial(n, k));
    }

    private static Integer calculationsBinomial(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return calculationsBinomial(n - 1, k - 1) + calculationsBinomial(n - 1, k);
    }
}

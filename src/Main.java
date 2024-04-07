import java.util.Scanner;

import static functions.Task1.findMinimum;
import static functions.Task2.calculateAverage;
import static functions.Task3.checkPrime;
import static functions.Task4.calculateFactorial;
import static functions.Task5.fibonacciSequence;
import static functions.Task6.calculatePower;
import static functions.Task7.reverseArray;
import static functions.Task8.checkDigitsInString;
import static functions.Task9.calculateBinomialCoefficient;
import static functions.Task10.findGCD;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect an option (1-10) to execute a task, or any other key to exit:");
            System.out.println("1. Find Minimum\n2. Calculate Average\n3. Check Prime\n4. Calculate Factorial\n" +
                    "5. Fibonacci Sequence\n6. Power Calculation\n7. Reverse Array\n" +
                    "8. Check Digits in String\n9. Calculate Binomial Coefficient\n10. Find GCD\n");

            int choiceOfTheUser = sc.nextInt();
            switch (choiceOfTheUser) {
                case 1 -> findMinimum(sc);
                case 2 -> calculateAverage(sc);
                case 3 -> checkPrime(sc);
                case 4 -> calculateFactorial(sc);
                case 5 -> fibonacciSequence(sc);
                case 6 -> calculatePower(sc);
                case 7 -> reverseArray(sc);
                case 8 -> checkDigitsInString(sc);
                case 9 -> calculateBinomialCoefficient(sc);
                case 10 -> findGCD(sc);
                default -> { return; }
            }
        }
    }
}

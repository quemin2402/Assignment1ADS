import functions.*;
import helpers.Task;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect an option (1-10) to execute a task, or any other key to exit:");
            System.out.println("1. Find Minimum\n2. Calculate Average\n3. Check Prime\n4. Calculate Factorial\n" +
                    "5. Fibonacci Sequence\n6. Power Calculation\n7. Reverse Array\n" +
                    "8. Check Digits in String\n9. Calculate Binomial Coefficient\n10. Find GCD\n");

            int choiceOfTheUser = sc.nextInt();

            Task taskToExecute;
            switch (choiceOfTheUser) {
                case 1 -> taskToExecute = Task1::findMinimum;
                case 2 -> taskToExecute = Task2::calculateAverage;
                case 3 -> taskToExecute = Task3::checkPrime;
                case 4 -> taskToExecute = Task4::calculateFactorial;
                case 5 -> taskToExecute = Task5::fibonacciSequence;
                case 6 -> taskToExecute = Task6::calculatePower;
                case 7 -> taskToExecute = Task7::reverseArray;
                case 8 -> taskToExecute = Task8::checkDigitsInString;
                case 9 -> taskToExecute = Task9::calculateBinomialCoefficient;
                case 10 -> taskToExecute = Task10::findGCD;
                default -> {
                    System.out.println("Invalid option. Exiting...");
                    return;
                }
            }
            measureAndExecuteTask(taskToExecute);
        }
    }

    private static void measureAndExecuteTask(Task task) {
        long startTime = System.nanoTime();
        task.execute(sc);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1e9;
        System.out.println("Task runtime: " + duration + " seconds");
    }
}

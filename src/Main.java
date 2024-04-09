import functions.*;
import helpers.Task;

import java.util.Scanner;
/**
 * The Main class that serves as the entry point to execute various mathematical tasks.
 * It provides a 'console-based' interface for user interaction.
 */
public class Main {
    // Scanner instance for reading input from the console
    public static Scanner sc = new Scanner(System.in);
    /**
     * Main method that provides a selection menu for various tasks.
     * Each task is represented by a static method within the functions package.
     * The user's choice is processed, and the corresponding task is executed.
     *
     * @param args Command-line arguments for the application
     */
    public static void main(String[] args) {
        // Continuously runs the application until the user chooses to exit
        while (true) {
            System.out.println("\nSelect an option (1-10) to execute a task, or any other key to exit:");
            System.out.println("1. Find minimum\n2. Calculate average\n3. Check if a number is prime\n4. Calculate factorial\n" +
                    "5. Fibonacci sequence element\n6. Power calculation\n7. Reverse array\n" +
                    "8. Check digits in string\n9. Calculate binomial coefficient\n10. Find GCD of two numbers\n");
            // Reads user's choice
            int choiceOfTheUser = sc.nextInt();

            // Executes the chosen task
            Task taskToExecute;
            switch (choiceOfTheUser) {
                // Maps each choice to a corresponding task and executes it
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

    /**
     * Measures the execution time of a task and prints the result.
     * @param task The task to be executed, represented by a Task functional interface.
     */
    private static void measureAndExecuteTask(Task task) {
        long startTime = System.nanoTime();
        task.execute(sc); // Executes the task provided by the user's selection
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1e9;
        System.out.println("Task runtime: " + duration + " seconds");
    }
}

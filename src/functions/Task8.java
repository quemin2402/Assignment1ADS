package functions;

import java.util.Scanner;

/**
 * Contains methods for string validation (checking if it consists of digits).
 */
public class Task8 {

    /**
     * Checks if string consists only from digits.
     * <p>
     * This method reads a string input from the user and utilizes a recursive helper method
     * to determine whether the string is composed exclusively of digit characters.
     * The result is printed to the console as either "Yes" or "No".
     * <p>
     * Time complexity: O(n), where n is the length of the string.
     * The method inspects each character of the string exactly once.
     *
     * @param sc The scanner object for reading the user's input.
     */
    public static void checkDigitsInString(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter a string. Does it include only digits?");
        String s = sc.nextLine();
        System.out.println(checkDigits(s, 0) ? "Yes" : "No");
        System.out.println("Time complexity: O(n)");
    }

    /**
     * Recursively checks if a given string consistency.
     * <p>
     * This helper method checks each character of the string starting from the index provided
     * to see if it is a digit. The method calls itself recursively, incrementing the index
     * with each call, until the entire string has been checked or a non-digit character is found.
     *
     * @param s The string to check.
     * @param i The current index being checked.
     * @return true if the substring starting at index i consists only of digits; false otherwise.
     */
    private static boolean checkDigits(String s, int i) {
        if (i == s.length())
            return true; // Base case

        char currentSymbol = s.charAt(i); // Get the current character to check
        if (!Character.isDigit(currentSymbol)) { // Check if current character is not a digit
            return false; // Found a non-digit character
        }
        return checkDigits(s, i + 1); // Recurse for the next character
    }
}

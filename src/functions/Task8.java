package functions;

import java.util.Scanner;

public class Task8 {
    public static void checkDigitsInString(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter a string. Does it include only digits?");
        String s = sc.nextLine();
        System.out.println(checkDigits(s, 0) ? "Yes" : "No");
        System.out.println("Time complexity: O(n)");
    }

    private static boolean checkDigits(String s, int i) {
        if (i == s.length())
            return true;
        char currentSymbol = s.charAt(i);
        if (!Character.isDigit(currentSymbol)) {
            return false;
        }
        return checkDigits(s, i + 1);
    }
}

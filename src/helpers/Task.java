package helpers;

import java.util.Scanner;

/**
 * Functional interface representing a single task that can be executed.
 * This is used within the main application to abstract the execution logic of a task which requires user input.
 */
public interface Task {
    /**
     * Executes the task using the provided Scanner for user input.
     * The specific behavior of this method is defined by the implementing class.
     *
     * @param sc The Scanner instance to be used for this task, allowing user input.
     */
    void execute(Scanner sc);
}

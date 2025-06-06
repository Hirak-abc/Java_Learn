import java.util.Scanner; // Importing Scanner class to take input from user

public class whileLoop {
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number to start countdown:");

        int number = scanner.nextInt(); // Read an integer from the user

        // Explanation:
        // The while loop is used when we don't know how many times the loop should run,
        // and we want it to continue running as long as a condition is true.
        // In this case, we want to count down from the given number to 1.

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a number greater than zero.");
        } else {
            System.out.println("Starting countdown:");

            // while loop continues as long as number > 0
            while (number > 0) {
                System.out.println(number); // Print the current number
                number--; // Decrease number by 1
            }

            System.out.println("Countdown finished!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

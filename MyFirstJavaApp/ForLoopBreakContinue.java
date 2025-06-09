// Importing Scanner class for user input
import java.util.Scanner;

public class ForLoopBreakContinue {

    public static void main(String[] args) {
        
        // Creating Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Taking a number input from the user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("\n--- Printing numbers from 1 to " + n + " ---");
        // Example using 'continue' to skip printing the number 5
        for (int i = 1; i <= n; i++) {
            if (i == 5) {
                // Skip the number 5 and continue with the next iteration
                System.out.println("Skipping 5 using continue");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n--- Printing even numbers up to " + n + ", but stop if number exceeds 20 ---");
        // Example using 'break' to stop the loop if the number exceeds 20
        for (int i = 2; i <= n; i += 2) {
            if (i > 20) {
                // If number exceeds 20, exit the loop completely
                System.out.println("Number exceeded 20. Breaking the loop.");
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n--- Countdown from " + n + ", skipping odd numbers using continue ---");
        // Using 'continue' again to skip odd numbers
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                // If the number is odd, skip the current iteration
                continue;
            }
            System.out.println(i);  // Only even numbers will be printed
        }

        // Closing the scanner
        scanner.close();
    }
}

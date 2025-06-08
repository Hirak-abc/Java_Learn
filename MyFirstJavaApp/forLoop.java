// Importing the Scanner class for user input
import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of times the loop should run
        System.out.print("Enter a number to print natural numbers up to: ");
        int n = scanner.nextInt();  // Reading an integer input

        // Using a for loop to print natural numbers from 1 to n
        System.out.println("\nNatural numbers from 1 to " + n + ":");
        
        // Syntax: for(initialization; condition; update)
        for (int i = 1; i <= n; i++) {
            // The loop starts at i = 1 and runs until i is less than or equal to n
            System.out.println(i);  // Print the current value of i
        }

        // Another example: printing even numbers from 2 to n
        System.out.println("\nEven numbers from 2 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            // i is increased by 2 each time to get the next even number
            System.out.println(i);
        }

        // Example 3: Looping backward from n to 1
        System.out.println("\nCounting backward from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            // i starts from n and decreases by 1 each time
            System.out.println(i);
        }

        // Closing the scanner object
        scanner.close();
    }
}


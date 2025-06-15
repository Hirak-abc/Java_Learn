// Importing Random class to generate random numbers
import java.util.Random;
// Importing Scanner class to take user input
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to simulate dice rolls
        Random random = new Random();

        System.out.println("🎲 Welcome to the Dice Roller!");

        // Infinite loop to allow multiple rolls
        while (true) {
            System.out.print("\nPress Enter to roll the dice (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye 👋");
                break; // Exit the loop and end the program
            }

            // Generate two random numbers between 1 and 6 (inclusive)
            int die1 = random.nextInt(6) + 1; // First dice
            int die2 = random.nextInt(6) + 1; // Second dice

            // Print the result of the dice roll
            System.out.println("You rolled:");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + (die1 + die2));
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

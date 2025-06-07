import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        int guess; // Variable to store user's guess
        int attempts = 0; // Counter to track number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until the user guesses the correct number
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // Take input

            attempts++; // Increase attempt count

            // Check the guess against the target number
            if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                // If guess is correct
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
                break; // Exit the loop
            }
        }

        // Close the scanner to free system resources
        scanner.close();
    }
}

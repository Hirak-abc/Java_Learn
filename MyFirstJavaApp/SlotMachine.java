import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    // Array of symbols for the slot machine
    static String[] symbols = {"🍒", "🍋", "🔔", "⭐", "🍇"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int balance = 100; // Starting balance

        System.out.println("🎰 Welcome to the Slot Machine Game! 🎰");
        System.out.println("You start with a balance of ₹100");

        while (playAgain && balance >= 10) {
            System.out.println("\nPress Enter to spin the machine (₹10 per spin)...");
            scanner.nextLine();
            balance -= 10;

            // Spin the slots
            int slot1 = random.nextInt(symbols.length);
            int slot2 = random.nextInt(symbols.length);
            int slot3 = random.nextInt(symbols.length);

            // Display the result
            System.out.println("--------------------");
            System.out.println("| " + symbols[slot1] + " | " + symbols[slot2] + " | " + symbols[slot3] + " |");
            System.out.println("--------------------");

            // Determine the result
            if (slot1 == slot2 && slot2 == slot3) {
                System.out.println("🎉 JACKPOT! You won ₹100!");
                balance += 100;
            } else if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {
                System.out.println("😊 Nice! You matched two symbols. You won ₹20.");
                balance += 20;
            } else {
                System.out.println("🙁 No match. Better luck next time!");
            }

            System.out.println("Your current balance is ₹" + balance);

            // Ask user if they want to play again
            if (balance < 10) {
                System.out.println("You don't have enough balance to play again. Game Over!");
                break;
            }

            System.out.print("Do you want to play again? (y/n): ");
            String choice = scanner.nextLine();
            playAgain = choice.equalsIgnoreCase("y");
        }

        System.out.println("\nThank you for playing! Your final balance: ₹" + balance);
        scanner.close();
    }
}


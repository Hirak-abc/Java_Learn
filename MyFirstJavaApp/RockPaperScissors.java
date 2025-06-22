import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);
        // Random object to generate computer's move
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter your move (rock, paper, or scissors): ");
        String userMove = scanner.nextLine().toLowerCase();

        // Validate user input
        if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
            System.out.println("Invalid move. Please enter rock, paper, or scissors.");
            return;
        }

        // Generate computer move
        String[] moves = {"rock", "paper", "scissors"};
        String computerMove = moves[random.nextInt(3)];

        System.out.println("Computer played: " + computerMove);

        // Decide winner
        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (
            (userMove.equals("rock") && computerMove.equals("scissors")) ||
            (userMove.equals("paper") && computerMove.equals("rock")) ||
            (userMove.equals("scissors") && computerMove.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close scanner
        scanner.close();
    }
}

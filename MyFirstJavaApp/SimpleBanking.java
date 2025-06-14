import java.util.Scanner;

// Main class
public class SimpleBanking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial balance
        double balance = 0.0;

        // Variable to store user choice
        int choice;

        // Menu-driven loop
        do {
            // Displaying menu options to the user
            System.out.println("\n=== Welcome to Simple Bank ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display current balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("₹" + depositAmount + " deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("₹" + withdrawAmount + " withdrawn successfully.");
                    } else {
                        System.out.println("Invalid or insufficient funds!");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank you for using Simple Bank!");
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        } while (choice != 4);

        // Close the scanner
        scanner.close();
    }
}

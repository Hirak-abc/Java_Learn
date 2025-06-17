import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many elements they want to store
        System.out.print("Enter the number of elements you want to store in the array: ");
        int size = scanner.nextInt();  // Read the array size from user

        // Create an integer array of the given size
        int[] numbers = new int[size];

        // Prompt the user to enter elements one by one
        System.out.println("Enter " + size + " numbers:");

        // Use a for loop to take input for each element in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Store each input into the array
        }

        // Display the elements entered by the user
        System.out.println("\nYou entered the following elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

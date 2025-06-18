import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        // Create Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Ask the user how many elements they want in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Declare the array with given size
        int[] numbers = new int[size];

        // Taking input for the array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Ask the user to enter the number they want to search
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        // Variable to store if the number was found
        boolean found = false;

        // Perform linear search
        for (int i = 0; i < size; i++) {
            if (numbers[i] == key) {
                System.out.println("Number " + key + " found at index " + i);
                found = true;
                break;  // Exit loop when found
            }
        }

        // If not found
        if (!found) {
            System.out.println("Number " + key + " not found in the array.");
        }

        sc.close();  // Close the Scanner object
    }
}

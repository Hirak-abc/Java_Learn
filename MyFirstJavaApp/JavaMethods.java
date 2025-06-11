// This Java program demonstrates the use of methods (functions) in Java

import java.util.Scanner;

public class JavaMethods {

    // A method that returns the sum of two integers
    public static int add(int a, int b) {
        return a + b; // Returns the result to the caller
    }

    // A method that returns the square of a number
    public static int square(int number) {
        return number * number;
    }

    // A void method that prints a greeting message
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }

    // A method that checks if a number is even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    // The main method – entry point of the program
    public static void main(String[] args) {

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Calling a void method (does not return a value)
        greetUser(name);

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        // Calling method that returns a value
        int result = add(x, y);
        System.out.println("Sum of " + x + " and " + y + " is: " + result);

        // Call method to find square
        System.out.println("Square of " + x + " is: " + square(x));

        // Call method to check even or odd
        checkEvenOdd(x);

        // Closing the scanner object
        scanner.close();
    }
}

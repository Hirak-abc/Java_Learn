// Java program explaining everything about arrays

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // -----------------------------
        // 🔹 What is an Array?
        // -----------------------------
        // An array is a data structure in Java used to store multiple values of the same data type in a single variable.
        // It is useful when you want to store a collection of data like marks of students, names, or any repeated data.
        // Arrays are fixed in size and indexed (starting from 0).

        System.out.println("🔰 Welcome to Java Array Tutorial");

        // -----------------------------
        // 🔹 Declaring and Initializing Arrays
        // -----------------------------

        // Method 1: Declare and then initialize
        int[] numbers = new int[5];  // An array of 5 integers, default values are 0

        // Method 2: Declare and assign values directly
        String[] fruits = {"Apple", "Banana", "Cherry", "Dates"};

        // Method 3: Using user input (Scanner)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int[] marks = new int[n];  // Array size based on user input

        System.out.println("\nEnter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i+1) + ": ");
            marks[i] = input.nextInt();  // Assign user input to array
        }

        // -----------------------------
        // 🔹 Accessing Elements in Arrays
        // -----------------------------
        System.out.println("\n🎯 Accessing Elements:");
        System.out.println("Marks of first student: " + marks[0]); // accessing first element
        System.out.println("Marks of last student: " + marks[n - 1]); // accessing last element

        // -----------------------------
        // 🔹 Looping through Arrays
        // -----------------------------

        // Using for loop
        System.out.println("\n📘 Marks using for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1) + ": " + marks[i]);
        }

        // Using enhanced for loop
        System.out.println("\n📘 Marks using for-each loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // -----------------------------
        // 🔹 Array Length
        // -----------------------------
        System.out.println("\n📏 Total number of students: " + marks.length);

        // -----------------------------
        // 🔹 Common Operations on Arrays
        // -----------------------------

        // Finding the maximum mark
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        System.out.println("\n🏆 Highest mark: " + max);

        // Calculating average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("📊 Average mark: " + average);

        // -----------------------------
        // 🔹 Multidimensional Arrays
        // -----------------------------
        // A 2D array is like a table with rows and columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n🔄 Printing 2D Array (3x3 Matrix):");
        for (int i = 0; i < matrix.length; i++) { // row
            for (int j = 0; j < matrix[i].length; j++) { // column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        input.close();
        System.out.println("\n✅ End of Array!");
    }
}

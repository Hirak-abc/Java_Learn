// Java program to demonstrate 2D Arrays
public class TwoDArray {
    public static void main(String[] args) {
        
        // Declare and initialize a 2D array (3 rows and 4 columns)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Display the matrix using nested for loops
        System.out.println("Matrix contents:");
        for (int row = 0; row < matrix.length; row++) { // outer loop for rows
            for (int col = 0; col < matrix[row].length; col++) { // inner loop for columns
                System.out.print(matrix[row][col] + "\t"); // print element with tab space
            }
            System.out.println(); // move to the next line after each row
        }

        // Calculate the sum of all elements
        int totalSum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                totalSum += value;
            }
        }
        System.out.println("Total sum of all elements: " + totalSum);

        // Access and print a specific element
        int specificElement = matrix[1][2]; // second row, third column (index starts from 0)
        System.out.println("Element at position [1][2]: " + specificElement);
    }
}

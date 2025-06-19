// VarargsExample.java

public class Varargs {

    // This method uses varargs to accept any number of integers
    // 'int... numbers' means it can accept zero or more int values
    public static void printSum(String message, int... numbers) {
        int sum = 0;

        // Loop through all the integers passed via varargs
        for (int num : numbers) {
            sum += num;
        }

        // Print the message along with the total sum
        System.out.println(message + " " + sum);
    }

    public static void main(String[] args) {
        // Call printSum with different numbers of arguments

        printSum("Sum of 1 number is:", 10);
        printSum("Sum of 3 numbers is:", 10, 20, 30);
        printSum("Sum with no numbers is:"); // zero arguments after the string
        printSum("Sum of 5 numbers is:", 1, 2, 3, 4, 5);
    }
}

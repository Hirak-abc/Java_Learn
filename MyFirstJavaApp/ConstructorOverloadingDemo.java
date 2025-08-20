// File: ConstructorOverloadingDemo.java

/*
 * This program demonstrates Constructor Overloading in Java.
 * ----------------------------------------------------------
 * Constructor overloading means:
 * - A class can have multiple constructors with the same name (class name).
 * - The difference is in the number or type of parameters.
 * - The compiler decides which constructor to call based on arguments.
 */

public class ConstructorOverloadingDemo {

    // ✅ Student is now a static inner class (avoids separate .class confusion)
    public static class Student {
        public String name;
        public int age;

        // 1️⃣ Default constructor (no parameters)
        public Student() {
            name = "Unknown";
            age = 0;
            System.out.println("Default constructor called!");
        }

        // 2️⃣ Constructor with one parameter (name only)
        public Student(String n) {
            name = n;
            age = 0;
            System.out.println("Constructor with name called!");
        }

        // 3️⃣ Constructor with two parameters (name + age)
        public Student(String n, int a) {
            name = n;
            age = a;
            System.out.println("Constructor with name and age called!");
        }

        // Method to display details
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display(); // Output: Unknown, 0

        // Using constructor with one parameter
        Student s2 = new Student("Alex");
        s2.display(); // Output: Alex, 0

        // Using constructor with two parameters
        Student s3 = new Student("Bob", 21);
        s3.display(); // Output: Bob, 21
    }
}

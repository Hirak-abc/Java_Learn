/*
 * A simple program to demonstrate:
 * 1. Encapsulation in Java (private fields + getters and setters)
 * 2. Constructor usage
 */
public class StudentDemo {

    // Inner Student class (so everything is in one file)
    static class Student {
        // Private fields (data hiding → Encapsulation)
        private String name;
        private int age;

        // Constructor to initialize object
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /*
         * GETTER METHODS
         * These allow us to access (read) the private fields safely
         * Naming convention: getFieldName()
         */

        // Getter for 'name'
        public String getName() {
            return name;
        }

        // Getter for 'age'
        public int getAge() {
            return age;
        }

        /*
         * SETTER METHODS
         * These allow us to modify (update) the private fields safely
         * Naming convention: setFieldName()
         * We can also add validation inside setters
         */

        // Setter for 'name'
        public void setName(String name) {
            this.name = name;
        }

        // Setter for 'age' with validation
        public void setAge(int age) {
            if (age > 0) { // Ensure age is positive
                this.age = age;
            } else {
                System.out.println("Invalid age! Age must be positive.");
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a Student object using constructor
        Student s1 = new Student("Alex", 20);

        // Access values using GETTERS
        System.out.println("Name: " + s1.getName());  // Output: Alex
        System.out.println("Age: " + s1.getAge());    // Output: 20

        // Modify values using SETTERS
        s1.setName("Bob"); // Changing name
        s1.setAge(22);     // Changing age

        // Access updated values
        System.out.println("Updated Name: " + s1.getName()); // Output: Bob
        System.out.println("Updated Age: " + s1.getAge());   // Output: 22

        // Try invalid age
        s1.setAge(-5); // Output: Invalid age! Age must be positive.
    }
}

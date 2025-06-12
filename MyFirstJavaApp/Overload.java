// Program to demonstrate Method Overloading and method signatures

public class Overload {

    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (Different number of parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double values (Different parameter types)
    public double add(double a, double b) {
        return a + b;
    }

    // Method 4: Adds one integer and one double (Different order of parameters)
    public double add(int a, double b) {
        return a + b;
    }

    // Method 5: Adds one double and one integer (Again, different order of parameters)
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overload obj = new Overload();

        // Calling overloaded methods
        System.out.println("Sum of 10 and 20 (int): " + obj.add(10, 20));                     // Method 1
        System.out.println("Sum of 10, 20, and 30 (int): " + obj.add(10, 20, 30));           // Method 2
        System.out.println("Sum of 5.5 and 4.5 (double): " + obj.add(5.5, 4.5));             // Method 3
        System.out.println("Sum of 10 (int) and 5.5 (double): " + obj.add(10, 5.5));         // Method 4
        System.out.println("Sum of 5.5 (double) and 10 (int): " + obj.add(5.5, 10));         // Method 5
    }
}

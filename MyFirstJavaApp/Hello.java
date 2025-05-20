//To accept user input we will need the class Scanner
//to do so we will import scanner from a package name Util
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//"scanner" is the object we will be working with
        //new Scanner(System.in) creates a new Scanner object that reads input from the keyboard (standard input stream).

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();//nextInt is used to read an integer
        System.out.println("Hello " + name + " You are " + age + "years");

        System.out.print("Enter your GPA: ");
        double GPA = scanner.nextDouble();//nextDouble is used to read an floating point numbers
        System.out.println("Hello " + name + " Your GPA is " + GPA);

        System.out.print("Are u a student(true/false): ");
        boolean isStudent = scanner.nextBoolean();//nextBoolean is used to read for true or false
        System.out.println("Hello " + name + " You are a student: " + isStudent);


        //Now,
        System.out.print("Enter your age: ");
        int ages = scanner.nextInt();//nextInt is used to read an integer
        scanner.nextLine();//If we dont do this,the outpt become distorted as it it opicks the new line character from the above line and uses it as an input .
        //This happens whenever we try to input a string after an integer or a double input is accepted in JAVA.

        System.out.print("Enter your favorite color: ");
        String color= scanner.nextLine();

        System.out.println("You are" + ages + " years old");
        System.out.println("You like the color" + color);
        
        
        //calculate area of a rectangle
        double width=0;
        double height=0;
        double area=0;

        System.out.print("Enter the width: " );
        width = scanner.nextDouble();

        System.out.print("Enter the height: " );
        height = scanner.nextDouble();

        System.out.println("The area is: " + area + "cm^2");
        area = width * height;



        scanner.close();//If we dont close the scanner,it may lead to unexpected behaviours.

    }

}

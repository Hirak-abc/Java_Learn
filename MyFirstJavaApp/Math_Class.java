import java.util.Scanner;

public class Math_Class {
    public static void main(String[] args){

        System.out.println(Math.PI);//For the value of pi,there is a constant value under the Math class
        System.out.println(Math.E);//For the value of e,there is a constant value under the Math class
    
        double result;
        double result_abs;
        double result_sqrt;
        double result_round;
        double result_ceil;
        double result_floor;
        double result_max;
        double result_min;

        result = Math.pow(2,3);//Under the pow function,the first number is raised to the power of the 2nd number

        System.out.println(result);

        result_abs = Math.abs(-5);//abs return the magnitude.
    
        System.out.println(result_abs);

        result_sqrt = Math.sqrt(9);//sqrt returns the square root

        System.out.println(result_sqrt);

        result_round = Math.round(3.14);//round returns the rounded off value to the nearest integer
    
        System.out.println(result_round);

        result_ceil = Math.ceil(3.14);//returns the ceiling value or the immediate integer after the given integer

        System.out.println(result_ceil);

        result_floor = Math.floor(3.14);//returns the floor value or the immediate previous integer

        System.out.println(result_floor);

        result_max = Math.max(2,5);//returns the maximum value out of two numbers

        System.out.println(result_max);

        result_min = Math.min(2,5);//returns the minimum out of two numbers

        System.out.println(result_min);

        //Now, we will learn to solve an exercise using the pythagoras theorem.
        //Hypotenuse^2 = side1^2 + side2^2

        Scanner scanner = new Scanner(System.in);

        double a;//side1
        double b;//side2
        double c;//hypotenuse

        System.out.print("Enter the length of a(side1): ");
        a= scanner.nextDouble();

        System.out.print("Enter the length of b(side2): ");
        b= scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is :" + c + "units");
        

        //Now, we will find the circumference,area and volume of a sphere

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        // Calculations
        circumference = 2 * Math.PI * radius;
        area = 4 * Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Output results
        System.out.println("Circumference: " + circumference);
        System.out.println("Surface Area: "+ area);
        System.out.println("Volume: "+ volume);


        scanner.close();



    }
    
}

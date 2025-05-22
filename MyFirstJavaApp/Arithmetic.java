public class Arithmetic {

    public static void main(String[] args){

        //We will learn the use of Arithmetic Operators here.....

        int x=10;
        int y=2;
        int z;//z is declared but not assigned

        z = x + y;//z is assigned the value of the addition of x and y
        System.out.println(z);

        z = x - y;//Subtraction
        System.out.println(z);

        z = x * y;//Multiplication
        System.out.println(z);

        z = x / y;//Division
        System.out.println(z);

        z = x % y;//"%" means return the remainder.z is storing the remainder after x is devided by y.
        System.out.println(z);

        //Augmented Assignment Operators

        int a =10;
        int b =3;

        a = a + b;//It means we are adding "a" and "b" and storing the result in "a"
        System.out.println(a);

        //Now to do the same thing we will uise the concept of augmented assignment operators
        a+=b;
        System.out.println(a);//This will show 16 as "a" has been updated to 13 in the above operation
        //Same goes for Subtraction,Multiplication,Division and Modulus(%)

         //Increment and Decrement Operators
         int c = 1;
         c++;//To specifically increment by 1,we use the double "+" or "++"
         System.out.println(c);

         int d = 1;
         d--;//To specifically decrement by 1,we use the double "-" or "--"
         System.out.println(d);

         //Order of Operations- [P-E-M-D-A-S]-Parenthesis,Exponents,Multiplication,Division,Addition,Subtraction
         double result = 3 + 4 * (7 - 5) / 2.0;
         System.out.println(result);



    }
    
}

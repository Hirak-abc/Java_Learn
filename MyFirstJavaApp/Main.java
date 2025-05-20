/*

  1)Install JDK(by oracle) through browser
  2)install the Java development kit extension on your VS Code
    
    And you are ready to go.......

 */

//Inside a folder create a file named Main.java and that file name would become the name of your public class.
/*You can name it anything (like Calculator, MyProgram, etc.)

But Java looks for a class named Main when running a program (by default).
 */

public class Main {
    public static void main(String[] args) {/*This is the method Java will run first. 
        It’s open to everyone (public), doesn't need an object (static), doesn't return anything (void), and it can take some input from the command line (String[] args). */

        System.out.println("Hello, world!");//print and println both are used to print.while "println" acts like "\n" and prints the new line on the next line while "print" prints the new line on the same line.
        System.out.println("I am a rookie");


        /*Data Types(primitive)- 1)Int  2)Double  3)Char  4)Boolean */
        //Data Types(reference)-1)String  2)Array  3)Object
        /*Data type creation in java has two steps- 1)declaration   2)assignment */
         
        
        //int age = 21; ---->This is declaration and assignment.
        //age is a variable.A variable is a reusable container
        int age=21;
        System.out.println(age);
        System.out.println("The age of the student is: " + age);


        //decimal point data type = Double

        double temperature=21.76;
        System.out.println("The temperature is : " + temperature);
        //doube can contain integer value directly.It will show int.0 .If we enter 19 ,it will become 19.0


        //characters-seemingly letters and symbols comes under the datatype = Char
        char grade = 'A';
        System.out.println(grade);

        //True or False comes under the datatype = Boolean
        boolean isStudent = false;
        System.out.println(isStudent);
        //Booleans are generally used internally to check the Truth-Value of a statement

        if (isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

    //There are other datatypes as well- byte,short,long,float,void


        String name = "Ouroboros";
        System.out.println(name);
        System.out.println("Hello ," + name + ". You are " + age + " years old");

    }
}


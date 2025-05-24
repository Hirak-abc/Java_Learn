import java.util.Scanner;


public class If_Statement {

    public static void main(String[] args){

        //if statements are statements which performs a block of statements if its condition is true
        Scanner scanner = new Scanner(System.in);
        //int age = 75;
        

        String name;
        
        int age;

        boolean isStudent;

        //Group 1
        System.out.print("Enter your name: ");//If we don't enter any name and just hit enter ,it will be skipped,therefore we will check whether the name is provided or not.
        name = scanner.nextLine();

        
        if (name.isEmpty()){//isEmpty is a string method which checks whether something is empty or not and returns a Boolean(True/False).
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + " !" );
        }

        //Group 2
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18){//"()" are to provide the condition to check and "{}" contains the block of statements to execute if the condition is true
            System.out.println("You are an adult👨‍🦰");
        }
        //If the statement is false,skip the block which was supposed to run when the statement is true

        //Alternatively we can add an else statement ,which runs when the if statement is false.
        
        //Or we can add an else if statement where we can put another specific condition to check
        
        /*
         But here comes the question,why don't we add another if-Statement if we want to check another statement?
        Adding an else-if statement is better because whenever we have multiple else-if statements,
        it checks until it finds a true value and then skips the rest of the else-if statements but adding multiple if statements,
        will check all the if statements even if it finds a true value.(even if the first statement is true,it will check for all other statements)
        */
        else if(age <0){
            System.out.println("You haven't been born yet!👻");//We can add as many else-if clause as we want.
        }

        else if(age == 0){//"==" is to check whether RHS=LHS or not while "=" is to declare LHS is equal to RHS.
            System.out.println("You are a baby!👶");
        }
        else if(age >= 70){//This will never be checked.=
            System.out.println("You are a senior!🧓");//For this condition even if the age is 75,it will return "You are adult" instead of "you are senior" because once a clause is satisfied it skips all the other clause.
        }//Thus the else if statement for age >= 70 is never checked because the any age above 70 will also be greater than 18(satisfying the condition),thus it will only show "You are adult".
        
        else{
            System.out.println("You are a child!👦");
            }


        //Group 3
        System.out.print("Are you a student?(True/False): ");        
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You are a student🧑‍🎓!");
        }
        else{
            System.out.println("You are not a student🙅‍♂️!");
        }

        scanner.close();
        }
    }



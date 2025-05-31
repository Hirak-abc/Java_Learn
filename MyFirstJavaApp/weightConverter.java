import java.util.Scanner;

public class weightConverter {

    public static void main(String[] args) {

        //Weight Conversion Program

        Scanner scanner = new Scanner(System.in);

        //Declare Variables
        double weight;

        double newWeight;

        int choice;

        //Welcome Message
        System.out.println("Weight Conversion Program");


        //Prompt for User Choice
        System.out.println("1 : Convert lbs to kgs");

        System.out.println("2 : Convert kgs to lbs");

        System.out.print("Choose an option : ");

        choice = scanner.nextInt();

        //Option 1 : Convert lbs to kgs
        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kgs",newWeight);

        }

        //Option 2 : Convert kgs to lbs
        else if(choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs",newWeight);

        }

        //else print : not a valid choice
        else{
            System.out.println("That was not a valid choice.");
        }

        scanner.close();
    }

}

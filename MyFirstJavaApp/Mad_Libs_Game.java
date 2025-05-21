import java.util.Scanner;

public class Mad_Libs_Game {
    public static void main(String[] args){

        //MAD LIBS GAME - Its a game where you have a story and the user fills in different words.

        Scanner scanner = new Scanner(System.in);

        String adjective1;//an adjective defines something like fast,slow,etc.
        String noun1;//noun refers to a name like Alex.
        String adjective2;
        String verb1;//describes an action like sleep,walk,etc.
        String adjective3;

        System.out.println("Enter an adjective(description): ");
        adjective1=scanner.nextLine();//store the adjective entered by the user in a variable adjective1
        System.out.println("Enter a noun(name): ");
        noun1=scanner.nextLine();//store the noun entered by the user in a variable noun1
        System.out.println("Enter an adjective: ");
        adjective2=scanner.nextLine();//store the adjective entered by the user in a variable adjective2
        System.out.println("Enter a verb(action with -ing)");
        verb1=scanner.nextLine();//store the verb entered by the user in a variable verb1
        System.out.println("Enetr an adjective: ");
        adjective3=scanner.nextLine();//store the adjective entered by the user in a variable adjective3

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + " .");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " ! ");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();//we need to close the scanner since we opened it.
    }

}

public class enhancedSwitch {
    public static void main(String[] args) {

        //Enhanced Switch = A replacement to many else if statements
        //(Java14 feature)

        String day = "Monday";

        switch(day){
            case "Monday" -> System.out.print("It is a week day");
            //Whatever isinside the parenthesis,we match it with the cases.If it matches we,execute the code....and "->" is used to map the case with what it should do if the case matches.        }
            case "Tuesday" -> System.out.print("It is a week day");
            case "Wednesday" -> System.out.print("It is a week day");
            case "Thursday" -> System.out.print("It is a week day");
            case "Friday" -> System.out.print("It is a week day");
            case "Saturday" -> System.out.print("It is a week end");
            case "Sunday" -> System.out.print("It is a week end");
            default -> System.out.print(day + " is not a day");//default case is similar to an else statement
    }
}
}

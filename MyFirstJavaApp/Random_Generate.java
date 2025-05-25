import java.util.Random;//Random is imported to generate random integers,doubles or booleans.

public class Random_Generate{
    public static void main(String[] args){

        Random random = new Random();//This line is much like the scanner class

        int number;

        number = random.nextInt(1, 6);//If no bound is provided ,a very large random number would be generated which will lie between -2 billion and +ve 2 billion.
        //Therefore we will set a bound and in the bound 1st number is inclusive while the 2nd number is exclusive.(6 will never be generated)
        System.out.println(number);

        //Random can also be used to generate a double

        double decimal;

        decimal = random.nextDouble(1,6);

        System.out.println(decimal);

        //Random can also be used to generate a boolean

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }


    }
    
}

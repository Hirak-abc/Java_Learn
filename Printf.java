public class Printf {
    public static void main(String[] args){

        //printf() = is a method used to format output

        //%[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed =true;

        System.out.printf("Hello %s\n" , name );//If we want to enter a String then we are goona put a %s as place holder for the string.
        //We must add newline character manually in printf

        System.out.printf("Your name starts with a %c\n",firstLetter);// %c for a char......variables are comma seperated instead of using a "+" sign.

        System.out.printf("You are %d years old\n", age);//%d is for int

        System.out.printf("You are %f inches tall\n", height);//%f is for double(floating point numbers)

        System.out.printf("Employed: %b\n" , isEmployed);//%b is for boolean
    
        System.out.printf("%s is %d years old", name,age);//Inserting multiple variables within the same line
    
        
        double price1 = 9000.99;
        double price2 =1000.15;
        double price3 = -5400.01;


        System.out.printf("% .1f\n",price1);
        System.out.printf("% .1f\n",price2);
        System.out.printf("% .1f\n",price3);
        //To display 1 digit after the decimal,".1f" is used.--->Thus we will get the rounded off numbers

        //+ = output a plus
        //, = comma grouping seperator
        //( = negative numbers are enclosed in ()
        // space = display a minus if negative,space if positive
        //Try adding everything after the percent("%"),I have added space after the percent.

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
        //04 after the % is used to pad zero before the number,if we dont add zero we will just have the digits with spaces so that the ones digit allign vertically
        //If a - sign is added in place of 0,then the digits will be alligned from the left.
    }

}

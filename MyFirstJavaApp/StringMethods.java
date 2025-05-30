public class StringMethods {
    public static void main(String[] args){

        String name = " Might Guy ";

        int length = name.length();
        char letter = name.charAt(0);//This method is used to find the character at the specified index inside the parenthesis.
        //Beginning index is 0.
        //From front(index): 0,1,2,3,.....n
        

        int index = name.indexOf("o");
        int LastIndex = name.lastIndexOf("o");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);//Index of the character from first(1st spotted)
        System.out.println(LastIndex);//Index of character from last(1st spotted)

        name =name.toUpperCase();
        System.out.println(name);

        name =name.toLowerCase();
        System.out.println(name);

        name = name.trim();//removes spaces
        System.out.println(name);

        name = name.replace("g", "x");//replaces the target character with the the replacement character
        System.out.println(name);

        System.out.println(name.isEmpty());//returns whether a string is empty or not

        System.out.println(name.contains("x"));//checks whether the string contains the character in the parenthesis.

        System.out.println(name.equals("Mixht xuy"));//checks whether the string is equal to the string inside the parenthesis
        //equals method also checks for case sensitivity.
        //To ignore it,
        System.out.println(name.equalsIgnoreCase("Mixht xuy"));

    }
}

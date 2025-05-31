public class substrings {

    public static void main(String[] args){

        //Substring method(.substring()) = A method used to extract a portion of a string.
        //.substring(start,end)---> start and end are indices

        String email = "alpha123@gmail.com";

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);//If we don't know the end index,just entering the beginning index would be enough.

        System.out.println(username);
        System.out.println(domain);
        


    }
    
}

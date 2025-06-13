public class variableScope {

    static int x = 3;//variable for this class(global)
    //can be accessed from anywhere inside the class


    public static void main(String[] args) {

        //int x = 1;//local variable
        //Local Variable as its declared under a set of curly braces and only works inside it
        System.out.print(x);
        
        //variable scope = where a variable can be accessed
        //Two types = Local and Global
    }

    static void doSomething(){
        //int x = 2;//This is also a local variable for doSomething()

        System.out.print(x);



    }


}

public class Constructor {
    //constructor = A special method to initialize objects
    //              You can pass arguments to a constructor
    //              and set up initial values
    public static void main(String[] args) {
        Student student1 = new Student("Alex",21,7.23,true);
        Student student2 = new Student("Bob",22,8.5,false);

        //Use Methods
        student1.study();
        student2.study();

    }

}


class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //Constructor

    Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;


    }

    void study(){
        System.out.println(name + " of " + age + " and " + gpa + " is studying only if his enrollment is " + isEnrolled);
    }

}
/*
1. Why Constructor has public

In Java, the class that contains the main method is usually made public because it serves as the entry point of the program.

Also, Java allows only one public class per .java file, and the file name must match that public class name.
 */
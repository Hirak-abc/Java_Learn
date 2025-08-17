public class OOP {

    public static void main(String[] args) {
        //Object=An entity that holds data(attributes) and behavior(methods)
        //       and can perform actions.It is a reference data type.

                // Create Car objects
                Car car1 = new Car("Tesla", "Model S", 2025, "Red");
                Car car2 = new Car("Toyota", "Corolla", 2020, "Blue");

                 // Use methods
                car1.start();
                car1.drive();
                car1.stop();

                System.out.println();

                car2.start();
                car2.drive();
                car2.stop();
            }

}


//Car class

class Car{
    String brand;
    String model;
    int year;
    String color;

    // Constructor
    Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        //this refers to the current object of the class
    }

    // Methods
    void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }

    void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }
}
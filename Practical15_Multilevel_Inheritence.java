/**
 * Demonstrates multilevel inheritance in Java.
 * ElectricCar inherits from Car, which inherits from Vehicle.
 */
class Vehicle {

    /**
     * Prints a message indicating the vehicle is starting.
     */
    void start() {
        System.out.println("Vehicle is starting");
    }

}

class Car extends Vehicle {

    /**
     * Prints a message indicating the car is refueling.
     */
    void fuel() {
        System.out.println("Car is refueling");
    }

}

class ElectricCar extends Car {

    /**
     * Prints a message indicating the electric car is charging.
     */
    void charge() {
        System.out.println("Electric car is charging");
    }

}

public class Practical15_Multilevel_Inheritence {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        // Calls child class method
        tesla.charge();

        // Calls parent class method
        tesla.fuel();

        // Calls grandparent class method
        tesla.start();
    }

}

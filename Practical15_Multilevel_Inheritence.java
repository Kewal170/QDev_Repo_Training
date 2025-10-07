// Grandparent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Parent class
class Car extends Vehicle {
    void fuel() {
        System.out.println("Car is refueling");
    }
}

// Child class
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

// Main class
public class Practical15_Multilevel_Inheritence {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();

        tesla.charge(); // Child class method
        tesla.fuel();   // Parent class method
        tesla.start();  // Grandparent class method
    }
}

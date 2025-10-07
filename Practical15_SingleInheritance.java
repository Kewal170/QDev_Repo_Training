/**
 * Demonstrates single inheritance in Java.
 * Parrot class inherits from Bird class.
 */
class Bird {

    /**
     * Prints a message indicating the bird is flying.
     */
    void fly() {
        System.out.println("Bird is flying");
    }

}

class Parrot extends Bird {

    /**
     * Prints a message indicating the parrot is speaking.
     */
    void speak() {
        System.out.println("Parrot is speaking");
    }

}

public class Practical15_SingleInheritance {

    public static void main(String[] args) {
        Parrot parrot = new Parrot(); // Create object of child class

        // Call child method
        parrot.speak();

        // Call inherited method from parent class
        parrot.fly();
    }

}

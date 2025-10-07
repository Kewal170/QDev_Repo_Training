/**
 * Demonstrates hybrid inheritance in Java using interfaces and class inheritance.
 * Duck inherits from Animal and implements Flyable and Swimmable interfaces.
 */
interface Flyable {
    /**
     * Method to make an object fly.
     */
    void fly();
}

interface Swimmable {
    /**
     * Method to make an object swim.
     */
    void swim();
}

class Animal {

    /**
     * Prints a generic eating message for Animal.
     */
    void eat() {
        System.out.println("Animal is eating");
    }

}

class Duck extends Animal implements Flyable, Swimmable {

    /**
     * Implements flying behavior for Duck.
     */
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    /**
     * Implements swimming behavior for Duck.
     */
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

}

public class Practical15_Hybrid_Inheritence {

    public static void main(String[] args) {
        Duck duck = new Duck();

        // Calls method from parent class
        duck.eat();

        // Calls interface methods implemented in Duck
        duck.fly();
        duck.swim();
    }

}

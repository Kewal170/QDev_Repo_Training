/**
 * Practical 13: Write a program to demonstrate data abstraction. 
 */
abstract class Animal {

    /**
     * Abstract method to be implemented by subclasses.
     */
    abstract void walk();

    /**
     * Concrete method available to all subclasses.
     */
    void stop() {
        System.out.println("Animal Stops");
    }

}

class Tiger extends Animal {

    /**
     * Implements the abstract walk method for Tiger.
     */
    @Override
    void walk() {
        System.out.println("Tiger walks");
    }

}

public class Practical13 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        // Calls overridden method
        tiger.walk();

        // Calls method from abstract parent class
        tiger.stop();
    }

}

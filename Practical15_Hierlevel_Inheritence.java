/**
 * Demonstrates hierarchical inheritance in Java.
 * Dog and Cat classes inherit from the parent Animal class.
 */
class Animal {

    /**
     * Prints a generic eating message for Animal.
     */
    void eat() {
        System.out.println("Animal eats");
    }

}

class Dog extends Animal {

    /**
     * Prints a barking message for Dog.
     */
    void bark() {
        System.out.println("Dog barks");
    }

}

class Cat extends Animal {

    /**
     * Prints a meowing message for Cat.
     */
    void meow() {
        System.out.println("Cat meows");
    }

}

public class Practical15_Hierlevel_Inheritence {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // inherited from Animal
        dog.bark();  // Dog's own method

        Cat cat = new Cat();
        cat.eat();   // inherited from Animal
        cat.meow();  // Cat's own method
    }

}

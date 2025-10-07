// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Practical15_Hierlevel_Inheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited from Animal
        dog.bark(); // Dog's own method

        Cat cat = new Cat();
        cat.eat();  // inherited from Animal
        cat.meow(); // Cat's own method
    }
}

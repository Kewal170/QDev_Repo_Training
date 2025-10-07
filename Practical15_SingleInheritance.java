// Parent class
class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

// Child class
class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot is speaking");
    }
}

// Main class
public class Practical15_SingleInheritance {
    public static void main(String[] args) {
        Parrot parrot = new Parrot(); // create object of child class
        parrot.speak(); // call child method
        parrot.fly();   // call inherited method from Bird
    }
}

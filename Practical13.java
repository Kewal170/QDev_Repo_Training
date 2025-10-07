abstract class Animal {
    abstract void walk();

    void stop() {
        System.out.println("Animal Stops");
    }
}

class Tiger extends Animal {
    @Override
    void walk() {
        System.out.println("Tiger walks");
    }
}

public class Practical13 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.walk();
        tiger.stop();
    }
}

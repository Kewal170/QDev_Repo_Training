interface Flyable{
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void fly(){
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}

class Practical15_Hybrid_Inheritence{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }

}
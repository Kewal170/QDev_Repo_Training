class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}

class Lion extends Animal {
    void eat(){
        System.out.println("Lion eats");
    }

    void show(){
        super.eat();
    }
}

class PrintNumber {
    int number;

    PrintNumber(int number){
        // here using this we have set userinput "number" from parameter to PrintNumber "number" variable.
        this.number = number;
    }

    void showNumber(){
        System.out.println("Number : " + number);
    }
}

public class Practical11 {
    public static void main(String[] args) {
        Lion lion =  new Lion();
        // here Lion (child) class method is called
        lion.eat();

        // here Animal (parent) class method is called
        lion.show();

        PrintNumber printNumber = new PrintNumber(23);
        printNumber.showNumber();
    }
    
}

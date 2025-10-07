/**
 * Practical 11: Write a practical to use this/super variable. 
 */
class Animal {

    /**
     * Prints a generic eating message for Animal.
     */
    void eat() {
        System.out.println("Animal eats");
    }
}

class Lion extends Animal {

    /**
     * Overrides the eat method for Lion.
     */
    @Override
    void eat() {
        System.out.println("Lion eats");
    }

    /**
     * Calls the parent class eat method using super.
     */
    void show() {
        super.eat();
    }

}

class PrintNumber {
    int number;

    /**
     * Constructor that initializes the number using this keyword.
     *
     * @param number number to set
     */
    PrintNumber(int number) {
        this.number = number;
    }

    /**
     * Prints the number.
     */
    void showNumber() {
        System.out.println("Number : " + number);
    }

}

public class Practical11 {

    public static void main(String[] args) {
        Lion lion = new Lion();

        // Calls overridden method in Lion (child class)
        lion.eat();

        // Calls method that uses super to invoke parent class method
        lion.show();

        PrintNumber printNumber = new PrintNumber(23);
        printNumber.showNumber();
    }

}

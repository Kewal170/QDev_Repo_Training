/**
 * Practical 7: Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula). 
 */
class MathFormula {
    int num1 = 1;
    int num2 = 2;

    /**
     * Default constructor.
     */
    MathFormula() {
        System.out.println("Constructor called and number " + num1 + " + " + num2 + " : " + (num1 + num2));
    }

    /**
     * Parameterized constructor.
     */
    MathFormula(int number1, int number2) {
        System.out.println("Parameterized constructor called and number " + number1 + " + " + number2 + " : " + (number1 + number2));
    }

}

public class Practical7 {

    public static void main(String[] args) {
        // If the number parameters are passed, the parameterized constructor will be called
        MathFormula mf = new MathFormula(34, 45);
    }

}

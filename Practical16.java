/**
 * Practical 16: Write a program to demonstrate two types of polymorphism like compile-time and runtime polymorphism. 
 */
class Calculator {

    /**
     * Adds two numbers (method overloading example).
     *
     * @param num1 first number
     * @param num2 second number
     * @return sum of num1 and num2
     */
    int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Adds three numbers (method overloading example).
     *
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     * @return sum of num1, num2, and num3
     */
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}

class Car {

    /**
     * Prints average car speed.
     */
    void speed() {
        System.out.println("Average car speed is 50 km/h");
    }

}

class Bmw extends Car {

    /**
     * Overrides speed method to show BMW speed.
     */
    @Override
    void speed() {
        System.out.println("Bmw car speed is 150 km/h");
    }

}

public class Practical16 {

    public static void main(String[] args) {
        System.out.println("Compile time example - Method Overloading");
        Calculator calculator = new Calculator();
        int result = calculator.add(12, 34, 50);
        System.out.println("Result : " + result);

        System.out.println();

        System.out.println("Runtime example - Method Overriding");
        Bmw bmw = new Bmw();
        bmw.speed();
    }

}

class Calculator { 
    // here it is compile time - Method overloading
    int add(int num1, int num2) { 
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

class Car {
    void speed(){
        System.out.println("Average car speed is 50 km/h");
    }
}

class Bmw extends Car {
    // here it is runtime - Method overriding
    @Override 
    void speed (){
        System.out.println("Bmw car speed is 150 km/h");
    }
}

public class Practical16 {
    public static void main(String[] args) {
        System.out.println("Compile time example - Method Overloading");
        Calculator calculator = new Calculator();
        int result = calculator.add(12,34,50);
        System.out.println("Result : " + result);

        System.out.println();

        System.out.println("Runtime example - Method Overriding");
        Bmw bmw = new Bmw();
        bmw.speed();
    }
}

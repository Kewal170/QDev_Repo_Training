class MathFormula{
    int num1 = 1;
    int num2 = 2;

    MathFormula(){
        System.out.println("Constructor called and number " + num1 + " + " + num2 + " : " + (num1 + num2));
    }

    MathFormula(int number1 , int number2){
        System.out.println("Parameterized  Constructor called and number " + number1 + " + " + number2 + " : " + (number1 + number2));
    }
}

public class Practical7 {
    public static void main(String[] args) {

        // If the number parameter has not been passed then default number will be used, if parameter is passed then Parameterized constructor will be called.
        MathFormula mf = new MathFormula(34,45);

    }
}

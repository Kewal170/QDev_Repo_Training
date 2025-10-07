/**
 * Practical 9: Create a practical to compare two variables of Wrapper class using Wrapper classes. 
 */
public class Practical9 {

    public static void main(String[] args) {
        Integer num1 = 12;
        Integer num2 = 32;

        int result = num1.compareTo(num2);

        if (result == 0) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else if (result > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is smaller than " + num2);
        }
    }

}

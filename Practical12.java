/**
 * Practical 12: Write a program to demonstrate static methods, variables, and blocks. 
 */
class StaticExample {
    static String schoolName = "Navodaya High School";
    static int count;

    /**
     * Constructor increments the static count variable.
     */
    StaticExample() {
        count++;
    }

    /**
     * Adds two numbers using a static method.
     *
     * @param num1 first number
     * @param num2 second number
     * @return sum of num1 and num2
     */
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Static block executed when class is loaded
    static {
        System.out.println("StaticExample class is loaded");
    }

}

public class Practical12 {

    public static void main(String[] args) {

        // Accessing static variable
        System.out.println("School name : " + StaticExample.schoolName);

        // Calling static method
        System.out.println("Adding 10 and 20 : " + StaticExample.add(10, 20));

        // Creating objects, constructor increments static count
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();
        StaticExample s3 = new StaticExample();

        // Display static count
        System.out.println("Number of instances created: " + StaticExample.count);
    }

}

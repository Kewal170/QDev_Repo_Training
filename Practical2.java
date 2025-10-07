import java.util.Scanner;

/**
 * Practical 2: Write a program to demonstrate the use of if / else statements. (E.g Define an 'age' variable and check your age). 
 */
public class Practical2 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        Integer userAge = scanner.nextInt();

        // Check if user is of legal age
        if (userAge >= 18) {
            System.out.println("You have entered legal age.");
        } else {
            System.out.println("You are below 18.");
        }

        // Close the scanner
        scanner.close();
    }

}

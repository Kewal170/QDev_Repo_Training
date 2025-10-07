import java.util.Scanner;

/**
 * Practical 5: Write a program to demonstrate the example of the ‘for’ loop and print the below-mentioned pattern. 
 */
public class Practical5 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to print star pattern: ");
        int userInput = scanner.nextInt();

        // Print star pattern
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

}

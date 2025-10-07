import java.util.Scanner;

/**
 * Practical 3: Write a program to find the current month name from the given number of the switch case. 
 */
public class Practical3 {

    public static void main(String[] args) {
        // Try-with-resources to automatically close Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of the month (1-12): ");
            int userInput = scanner.nextInt();

            // Print month name based on user input
            switch (userInput) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid month number!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}

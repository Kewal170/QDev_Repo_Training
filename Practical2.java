import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        Integer userAge = scanner.nextInt();

        if (userAge >= 18) {
            System.out.println("You have entered legal age.");
        } else {
            System.out.println("You are below 18.");
        }
        scanner.close();
    }
}

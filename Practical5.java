import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print star pattern : ");
        int userInput = scanner.nextInt();

        for (int i = 1; i <= userInput; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
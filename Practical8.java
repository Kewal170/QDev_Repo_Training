import java.util.Scanner;

class EMICalculatorLogic {
    double rate;
    double emi;

    double calculateEMI(double principal, double annualRate, int months) {
        rate = annualRate / 12 / 100;
        emi = (principal * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        return emi;
    }

}

public class Practical8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            double principal;
            double annualRate;
            int months;
            double emi;

            EMICalculatorLogic ecl = new EMICalculatorLogic();

            System.out.println("Enter your Principal amount : ");
            principal = scanner.nextDouble();

            System.out.println("Enter your Annual Interest Rate : ");
            annualRate = scanner.nextDouble();

            System.out.println("Enter your Months : ");
            months = scanner.nextInt();

            emi = ecl.calculateEMI(principal, annualRate, months);
            System.out.printf("Your EMI : %.2f", emi);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}

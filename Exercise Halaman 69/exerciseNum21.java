import java.util.Scanner;

public class exerciseNum21 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double investment, annualInterestRate, monthlyInterestRate, years, totalValue;
        System.out.println("------ Calculate Future Investment Value ------");
        System.out.print("Enter investment amount: ");
        investment = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        years = scanner.nextDouble();

        monthlyInterestRate = ((double)(annualInterestRate/100) / 12);

        totalValue = investment * Math.pow((1 + monthlyInterestRate), (years * 12));

        System.out.printf("Accumulated value is $%.2f", totalValue);
    }
}

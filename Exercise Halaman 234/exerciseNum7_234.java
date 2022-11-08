import java.util.Scanner;

public class exerciseNum7_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("The amount invested: ");
        double invesmentAmount = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterestRate = annualInterest / 1200;

        System.out.printf("%-15s%s\n", "Years", "Future Value");
        for(int years = 1; years <= 30; years++){
            System.out.printf("%-15d%.2f\n", years, futureInvestmentValue(invesmentAmount, monthlyInterestRate, years));
        }
    }
    public static double futureInvestmentValue(double invesmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = invesmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        return futureInvestmentValue;
    }
}

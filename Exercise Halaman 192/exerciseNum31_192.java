import java.util.Scanner;

public class exerciseNum31_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the initial deposit amount: ");
        double deposit = scanner.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualYield = scanner.nextDouble();
        System.out.print("Enter the maturity period (number of months): ");
        int months = scanner.nextInt();

        System.out.println("\nMonth \tCD Value: ");
        double previousBalance = deposit;
        double newBalance = 0;
        for(int i = 1; i <= months; i++){
            newBalance = previousBalance + (previousBalance * (annualYield/1200));
            previousBalance = newBalance;
            System.out.printf("%d\t%.2f\n", i, newBalance);
        }
    }
}

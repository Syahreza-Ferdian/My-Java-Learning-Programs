import java.util.Scanner;

public class exerciseNum13 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int saving;
        int months = 6;
        final double interestRate = 0.00417;
        System.out.println("====[FINANCIAL APPLICATION]====");
        System.out.print("Enter the monthly saving amount: ");
        saving = scanner.nextInt();
        double balance = 0;

        for(int i = 1; i <= months; i++ ){
            balance = (saving + balance) * (1 + interestRate);
        }
        System.out.printf("After the sixth month, the account value is $%.2f", balance);
    }
}

import java.util.Scanner;

public class exerciseNum20 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double interest, balance, interestRate;
        System.out.println("====[Calculate Interest]====");
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = scanner.nextDouble();
        interestRate = scanner.nextDouble();

        interest = balance * (interestRate/1200);

        System.out.printf("The interest is %.5f", interest);
    }
}

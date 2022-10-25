import java.util.Scanner;

public class exerciseNum5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double subtotal, total, percent, gratuity;
        System.out.println("---- CALCULATE TIPS ----");
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = scanner.nextDouble();
        percent = scanner.nextDouble();
        
        gratuity = subtotal * (double) percent/100;
        total = subtotal + gratuity;

        System.out.printf("The gratuity is $%.2f and total is $%.2f", gratuity, total);
    }
}

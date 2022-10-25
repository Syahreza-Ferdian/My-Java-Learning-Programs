import java.util.Scanner;

public class exerciseNum7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int minutes, daysRemaining, years, daysTotal;
        System.out.println("---- CALCULATE THE NUMBER OF YEARS ----");
        System.out.print("Enter the number of minutes: ");
        minutes = scanner.nextInt();

        daysTotal = minutes / 60 /24;
        years = daysTotal / 365;
        daysRemaining = daysTotal - years * 365;

        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, daysRemaining);

    }
}

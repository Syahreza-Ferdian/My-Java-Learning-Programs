import java.util.Scanner;

public class exerciseNum14 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double pounds, inches, kilograms, meters, bmi;
        final double poundsToKilograms = 0.45359237;
        final double inchesToMeters = 0.0254;
        System.out.println("---- Health Application (Computing BMI) ----");
        System.out.print("Enter weight in pounds: ");
        pounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        inches = scanner.nextDouble();

        kilograms = pounds * poundsToKilograms;
        meters = inches * inchesToMeters;

        bmi = kilograms / Math.pow(meters, 2);

        System.out.printf("BMI is %.4f", bmi);
    }
}

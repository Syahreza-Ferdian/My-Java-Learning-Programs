import java.util.Scanner;

public class exerciseNum23 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double mileage, mpg, gasPrice, costTotal, fuelConsumed;
        System.out.println("====[Cost of Driving Calculator]====");
        System.out.print("Enter the driving distance: ");
        mileage = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        mpg = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        gasPrice = scanner.nextDouble();

        fuelConsumed = mileage / mpg;
        costTotal = fuelConsumed * gasPrice;

        System.out.printf("The cost of driving is $%.2f", costTotal);
    }
}
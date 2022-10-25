import java.util.Scanner;

public class exerciseNum10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=====[ CALCULATE ENERGY ]=====");
        System.out.print("Enter the amount of water in kilograms: ");
        double water = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();

        double energy = water * (finalTemp - temp) * 4184;

        System.out.printf("The energy needed is %.2f", energy);
    }
}

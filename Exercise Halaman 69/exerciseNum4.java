import java.util.Scanner;

public class exerciseNum4 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double pounds, kilograms;
        System.out.println("----- CONVERT POUNDS INTO KILOGRAMS -----");
        System.out.print("Enter a number in pounds: ");
        pounds = scanner.nextDouble();
        kilograms = pounds * 0.454;
        System.out.printf("%s pounds is %.3f kilograms", Double.toString(pounds), kilograms);
    }
}

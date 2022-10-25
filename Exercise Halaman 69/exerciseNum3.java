import java.util.Scanner;

public class exerciseNum3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====[ CONVERT FEET INTO METERS ]=====");
        double feet, meters;
        System.out.print("Enter the value for feet: ");
        feet = scanner.nextDouble();
        meters = feet * 0.305;

        System.out.printf("%s feet is %.4f meters", Double.toString(feet), meters);
    }
}

import java.util.Scanner;

public class exerciseNum9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double v0, v1, t, a;
        System.out.println("=======[ CALCULATE ACCELERATION ]======");
        System.out.print("Enter v0, v1, and t: ");
        v0 = scanner.nextDouble();
        v1 = scanner.nextDouble();
        t = scanner.nextDouble();

        a = (v1 - v0)/t;

        System.out.printf("The average acceleration is %.4f", a);
    }
}

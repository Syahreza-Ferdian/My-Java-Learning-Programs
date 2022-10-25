import java.util.Scanner;

public class exerciseNum12 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double speed, accel, length;
        System.out.println("=====[CALCULATE AIRPLANE'S MINIMUM RUNWAY LENGTH]=====");
        System.out.print("Enter speed and acceleration: ");
        speed = scanner.nextDouble();
        accel = scanner.nextDouble();

        length = (Math.pow(speed, 2))/(2 * accel);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }
}

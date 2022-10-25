import java.util.Scanner;

public class exerciseNum2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double radius, length, area, volume;
        final double pi = (double) 22/7;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = scanner.nextDouble();
        length = scanner.nextDouble();

        area = radius * radius * pi;
        volume = area * length;

        System.out.printf("The area is %.4f", area);
        System.out.printf("\nThe volume is %.1f", volume);
    }
}

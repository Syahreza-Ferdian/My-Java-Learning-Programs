import java.util.Scanner;

public class exerciseNum15 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        System.out.println("====[Compute Distance Between Two Points]====");
        System.out.print("Enter x1 and y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        System.out.printf("The Distance between the two points is %.15f", distance);
    }
}

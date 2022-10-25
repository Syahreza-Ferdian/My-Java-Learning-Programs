import java.util.Scanner;

public class exerciseNum19 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=====[AREA OF A TRIANGLE]=====");
        System.out.println("Enter three points for a triangle:  ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double sisi1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        double sisi2 = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
        double sisi3 = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));

        double s = (sisi1 + sisi2 + sisi3)/2;
        double luas = Math.sqrt(s*(s - sisi1)*(s - sisi2)*(s - sisi3));
        System.out.printf("The area of the triangle is %.2f", luas);
    }
}

import java.util.Scanner;

public class exerciseNum3_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        System.out.print("Enter a, b, c, d, e, and f: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        x = (e*d - b*f)/(a*d - b*c);
        y = (a*f - e*c)/(a*d - b*c);

        if ((a*d) - (b*c) != 0) {
            System.out.printf("x is %s and y is %s\n", Double.toString(x), Double.toString(y));
        }
        else System.out.println("The equation has no solution");
    }
}
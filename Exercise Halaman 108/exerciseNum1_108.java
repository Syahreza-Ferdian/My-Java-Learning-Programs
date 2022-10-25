import java.util.Scanner;

public class exerciseNum1_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2, diskriminan;
        System.out.print("Enter a, b, c: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        diskriminan = Math.pow(b, 2) - (4*a*c);
        r1 = (double)(-b + Math.sqrt(diskriminan))/2*a;
        r2 = (double)(-b - Math.sqrt(diskriminan))/2*a;

        if (diskriminan == 0) {
            System.out.printf("The equation has one root %f", r1);
        }
        else if(diskriminan > 0){
            System.out.printf("The equation has two roots %f and %f", r1, r2);
        }
        else System.out.printf("The equation has no real roots");
    }
}
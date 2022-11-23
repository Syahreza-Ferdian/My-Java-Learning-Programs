import java.util.Scanner;

public class exerciseNum36_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double sides = scanner.nextDouble();
        System.out.printf("The area of the polygon is %s", Double.toString(area(n, sides)));
    } 
    public static double area(int n, double side){
        double area = (n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n));
        return area;
    }
}

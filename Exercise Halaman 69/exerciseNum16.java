import java.util.Scanner;

public class exerciseNum16 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double sisi, luas;
        
        System.out.println("---------- CALCULATE AREA OF A HEXAGON ---------");
        System.out.print("Enter the side : ");
        sisi = scanner.nextDouble();

        luas = (3 * Math.sqrt(3) * Math.pow(sisi, 2))/2;

        System.out.printf("The area of the hexagon is %.4f", luas);
    }
}
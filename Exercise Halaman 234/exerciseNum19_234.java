import java.util.Scanner;

public class exerciseNum19_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan panjang ketiga sisi segitiga: ");
        double sisi1 = scanner.nextDouble();
        double sisi2 = scanner.nextDouble();
        double sisi3 = scanner.nextDouble();
        if(isValid(sisi1, sisi2, sisi3)){
            System.out.printf("Luas segitiga tersebut adalah: %.3f", area(sisi1, sisi2, sisi3));
        }
        else System.out.print("Invalid Input!");
    }
    public static boolean isValid(double sisi1, double sisi2, double sisi3){
        boolean valid = true;
        if((sisi1 + sisi2 <= sisi3)||(sisi1 + sisi3 <= sisi2)||(sisi2 + sisi3 <= sisi1)) valid = false;
        else valid = true;
        return valid;
    }
    public static double area(double sisi1, double sisi2, double sisi3){
        double semiperimater = (sisi1 + sisi2 + sisi3)/2.0;
        double area = Math.sqrt(semiperimater*(semiperimater - sisi1)*(semiperimater - sisi2)*(semiperimater - sisi3));
        return area;
    }
}

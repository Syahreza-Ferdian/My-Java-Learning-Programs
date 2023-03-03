package Praktikum;
import java.util.Scanner;

public class loop1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan nilai n ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i)*2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}

import java.util.Scanner;

public class exerciseNum6_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah baris pada pola Pyramid yang ingin ditampilkan: ");
        int baris = scanner.nextInt();
        System.out.println("Pyramid Pattern: \n");
        displayPattern(baris);
    }
    public static void displayPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i)*2; j++){
                System.out.print("  ");
            }
            for(int k = i; k >= 1; k--){
                System.out.printf("%2d  ", k);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class exerciseNum4_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah angka integer: ");
        int angka = scanner.nextInt();
        reverse(angka);
    }
    public static void reverse(int angka){
        String konversi = String.valueOf(angka);
        String reverse = "";
        for(int i = 0; i < konversi.length(); i++){
            String digit = konversi.substring(i, i+1);
            reverse = digit + reverse;
        }
        System.out.printf("Angka tersebut apabila dibalik adalah: %s", reverse);
    }
}

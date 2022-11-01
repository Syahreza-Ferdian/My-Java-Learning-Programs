import java.util.Scanner;

public class exerciseNum38_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=====[PROGRAM KONVERSI ANGKA DESIMAL KE OCTAL]=====");
        System.out.print("Masukkan angka dalam integer: ");
        int angka = scanner.nextInt();
        String sisa, octal = "";

        do {
            sisa = String.valueOf(angka % 8);
            angka /= 8;
            octal = sisa + octal;
        } while (angka != 0);
        System.out.printf("Hasil konversi Octal dari bilangan tersebut adalah:\n%s", octal);
    }    
}

import java.util.Scanner;

public class exerciseNum37_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("======[PROGRAM KONVERSI ANGKA DESIMAL KE BINER]======");
        System.out.print("Masukkan angka integer: ");
        int angka = scanner.nextInt();
        String biner = "", sisa;
        do {
            sisa = String.valueOf(angka % 2);
            angka /= 2;
            biner = sisa + biner;
        } while (angka != 0);

        System.out.printf("\nKonversi biner dari angka tersebut adalah:\n%s", biner);
    }
}

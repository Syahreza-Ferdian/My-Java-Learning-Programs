import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.println("=====[PROGRAM INI AKAN MENAMPILKAN APAKAH BILANGAN YANG DIINPUT GANJIL ATAU GENAP]=====");
        System.out.println("Masukkan bilangan: ");
        angka = input.nextInt();

        if (angka%2 == 0) {
            System.out.println("Bilangan tersebut adalah bilangan Genap.");
        }
        else System.out.println("Bilangan tersebut adalah bilangan Ganjil.");

        input.close();
    }
}

package Praktikum;
import java.util.Scanner;

public class method1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Program penghitung kombinasi dan permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = scanner.nextInt();
            switch(pilihan){
                case 1: hitungPermutasi(); break;
                case 2: hitungKombinasi(); break;
                default: {
                    if(pilihan != 3) System.out.println("ERROR: Harap masukkan pilihan yang benar! (1-3)\n");
                }
            }
        } while (pilihan != 3);
    }
    public static void hitungPermutasi(){
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = scanner.nextInt();
        int hasil = hitungFaktorial(n)/hitungFaktorial(n - r);
        System.out.printf("%11s\n%s %s %s %s %d\n%13s\n", "n!", "nPr", "=", "-------", "=", hasil, "(n-r)!");
        System.out.printf("Maka hasil permutasinya adalah: %d\n\n", hasil);
    }
    public static void hitungKombinasi(){
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = scanner.nextInt();
        int hasil = hitungFaktorial(n)/(hitungFaktorial(n - r) * hitungFaktorial(r));
        System.out.printf("%13s\n%s %s %s %s %d\n%17s\n", "n!", "nCr", "=", "-----------", "=", hasil, "(n-r)! x r!");
        System.out.printf("Maka hasil kombinasinya adalah: %d\n\n", hasil);
    }
    public static int hitungFaktorial(int angka){
        int faktorial = 1;
        for(int i = 1; i <= angka; i++){
            faktorial *= i;
        }
        return faktorial;
    }
}

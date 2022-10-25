package Praktikum;
import java.util.Scanner;

public class seleksiKondisi1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)   {
        int choice;
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.printf("%-20s: ", "Pilihan anda");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.printf("%-35s: ", "Masukkan panjang persegi panjang");
                int panjang = scanner.nextInt();
                System.out.printf("%-35s: ", "Masukkan lebar persegi panjang");
                int lebar = scanner.nextInt();
                System.out.println();
                System.out.printf("%-35s: %d cm\n", "Keliling persegi panjang", 2*(panjang+lebar));
                System.out.printf("%-35s: %d cm2\n", "Luas persegi panjang", (panjang*lebar));
                break;
            }
            case 2: {
                System.out.printf("%-35s: ", "Masukkan jari-jari lingkaran");
                int jariJari = scanner.nextInt();
                double luas = Math.PI * Math.pow(jariJari, 2);
                double keliling = 2 * Math.PI * jariJari;
                System.out.printf("\n%-35s: %s cm", "Keliling lingkaran", Double.toString(keliling));
                System.out.printf("\n%-35s: %s cm2", "Luas lingkaran", Double.toString(luas));
                break;
            }
            case 3: {
                System.out.println("===================================================================");
                System.out.println("Pilih jenis segitiga!");
                System.out.println("1. Segitiga sama kaki");
                System.out.println("2. Segitiga sama sisi");
                System.out.println("3. Segitiga siku-siku");
                System.out.println("4. Segitiga sembarang");
                System.out.println("===================================================================");
                System.out.printf("%-40s: ","Masukkan pilihan anda! (1-4)");
                int pilihanSegitiga = scanner.nextInt();
                switch(pilihanSegitiga){
                    case 1: {
                        System.out.printf("%-40s: ", "Masukkan panjang sisi miring");
                        int sisiMiring = scanner.nextInt();
                        System.out.printf("%-40s: ", "Masukkan panjang alas");
                        int alas = scanner.nextInt();
                        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2)-Math.pow((double)alas/2, 2));
                        double luas = 0.5 * alas * tinggi;
                        System.out.printf("%-40s: %s cm2\n", "Luas segitiga sama kaki tersebut adalah", Double.toString(luas));
                        System.out.printf("%-40s: %d cm", "Keliling segitiga sama kaki tersebut adalah", (alas + sisiMiring + sisiMiring));
                        break;
                    }
                    case 2: {
                        System.out.printf("%-40s: ", "Masukkan panjang sisi segitiga");
                        int sisi = scanner.nextInt();
                        double tinggi = Math.sqrt(Math.pow(sisi, 2)-Math.pow((double)sisi/2, 2));
                        double luas = 0.5 * sisi * tinggi;
                        System.out.printf("%-40s: %s cm2\n", "Luas segitiga sama sisi tersebut adalah", Double.toString(luas));
                        System.out.printf("%-40s: %d cm", "Keliling segitiga sama sisi tersebut adalah", (sisi*3));
                        break;
                    }
                    case 3: {
                        System.out.printf("%-40s: ", "Masukkan panjang kedua sisi tegak");
                        int alas = scanner.nextInt();
                        int tinggi = scanner.nextInt();
                        double sisiMiring = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2));
                        double luas = 0.5 * alas * tinggi;
                        System.out.printf("%-40s: %s cm2\n", "Luas segitiga sama siku-siku tersebut", Double.toString(luas));
                        System.out.printf("%-40s: %s cm", "Keliling segitiga siku siku tersebut", Double.toString(alas + tinggi + sisiMiring));
                        break;
                    }
                    case 4: {
                        System.out.printf("%-40s: ", "Masukkan ketiga sisi segitiga");
                        int sisi1 = scanner.nextInt();
                        int sisi2 = scanner.nextInt();
                        int sisi3 = scanner.nextInt();
                        double semiperimeter = 0.5 * (sisi1 + sisi2 + sisi3);
                        double luas = Math.sqrt(semiperimeter*(semiperimeter-sisi1)*(semiperimeter-sisi2)*(semiperimeter-sisi3));
                        System.out.printf("%-40s: %s cm2\n", "Luas segitiga sembarang tersebut", Double.toString(luas));
                        System.out.printf("%-40s: %d cm", "Keliling segitiga sembarang tersebut", (sisi1 + sisi2 + sisi3));
                        break;
                    }
                    default: System.out.println("ERROR: Masukkan angka sesuai dengan pilihan yang benar!");
                }
                break;
            }
            default: System.out.println("ERROR: Data tidak ditemukan, program dihentikan...");
        }
    }
}
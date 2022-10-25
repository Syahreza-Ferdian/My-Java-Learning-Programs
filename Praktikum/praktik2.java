package Praktikum;
import java.util.Scanner;

public class praktik2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nama, kelurahan;
        int posAwal, posAkhir, beban, ppj, tarifListrik, pajak, totalBayar;

        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukkan nama\t\t\t: ");
        nama = scanner.nextLine();
        System.out.print("Kelurahan\t\t\t: ");
        kelurahan = scanner.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter\t: ");
        posAwal = scanner.nextInt();
        System.out.print("Masukkan posisi akhir KwH Meter\t: ");
        posAkhir = scanner.nextInt();
        System.out.print("Masukkan biaya beban saat ini\t: ");
        beban = scanner.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)\t: ");
        ppj = scanner.nextInt();

        tarifListrik = beban * (posAkhir - posAwal);
        pajak = tarifListrik * ppj/100;
        totalBayar = pajak + tarifListrik;

        System.out.println("=================PLN Java===================");
        System.out.printf("Nama\t\t\t: %s", nama);
        System.out.printf("\nKelurahan\t\t: %s", kelurahan);
        System.out.printf("\nPemakaian bulan ini\t: %d Kwh Meter", posAkhir - posAwal);
        System.out.printf("\nTarif Listrik\t\t: Rp %d,-", tarifListrik);
        System.out.printf("\nPPJ %d %% \t\t: Rp %d,-", ppj, pajak);
        System.out.printf("\nTotal Bayar\t\t: Rp %d,-", totalBayar);
        System.out.println("\n============================================");
    }
}

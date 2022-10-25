package Praktikum;
import java.util.Scanner;

public class seleksiKondisi3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int jamKerja, upahKerja, upahLembur, denda, totalGaji;
        final int KERJA_PER_JAM = 5000;
        final int LEMBUR_PER_JAM = 6000;
        final int DENDA_PER_JAM = 1000;

        System.out.printf("%-15s: ", "Jam kerja");
        jamKerja = scanner.nextInt();
        upahKerja = jamKerja * KERJA_PER_JAM;

        if(jamKerja > 60){
            upahLembur = (jamKerja - 60) * LEMBUR_PER_JAM;
        }
        else upahLembur = 0;
        
        if(jamKerja < 50){
            denda = (50 - jamKerja) * DENDA_PER_JAM;
        }
        else denda = 0;
        totalGaji = upahKerja + upahLembur - denda;

        System.out.printf("%-10s= Rp. %d\n", "Upah", upahKerja);
        System.out.printf("%-10s= Rp. %6d\n", "Lembur", upahLembur);
        System.out.printf("%-10s= Rp. %6d\n", "Denda", denda);
        System.out.println("--------------------------------");
        System.out.printf("%-10s= RP. %d", "Total", totalGaji);
    }
}
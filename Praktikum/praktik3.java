package Praktikum;

import java.util.Scanner;

public class praktik3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan operator pertama\t: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan operator kedua\t\t: ");
        int num2 = scanner.nextInt();

        int penjumlahan = num1 + num2;
        int pengurangan = num1 - num2;
        int perkalian = num1 * num2;
        double pembagian = (double)num1/num2;

        System.out.printf("Hasil Penjumlahan\t\t: %d", penjumlahan);
        System.out.printf("\nHasil pengurangan\t\t: %d", pengurangan);
        System.out.printf("\nHasil perkalian\t\t\t: %d", perkalian);
        System.out.printf("\nHasil pembagian\t\t\t: %s", Double.toString(pembagian));
        System.out.printf("\n%-32s: %s", "Hasil Pembagian", Double.toString(pembagian));
    }
}

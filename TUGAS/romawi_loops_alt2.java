package TUGAS;

import java.util.Scanner;

public class romawi_loops_alt2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String hasil = "";
        System.out.print("Masukkan sebuah bilangan integer: ");
        int bilangan = scanner.nextInt();

        for(int i = 1; i <= 13; i++){
            while(bilangan - angkaSpesial(i) >= 0){
                hasil += romawi(i);
                bilangan -= angkaSpesial(i);
            }
        }
        System.out.println(hasil);
    }   
    public static String romawi(int countRomawi){
        String romawi = "";
        switch (countRomawi) {
            case 1: romawi = "M"; break;
            case 2: romawi = "CM"; break;
            case 3: romawi = "D"; break;
            case 4: romawi = "CD"; break;
            case 5: romawi = "C"; break;
            case 6: romawi = "XC"; break;
            case 7: romawi = "L"; break;
            case 8: romawi = "XL"; break;
            case 9: romawi = "X"; break;
            case 10: romawi = "IX"; break;
            case 11: romawi = "V"; break;
            case 12: romawi = "IV"; break;
            case 13: romawi = "I"; break;
        }
        return romawi;
    }
    public static int angkaSpesial(int countAngka){
        int angka = 0;
        switch(countAngka){
            case 1: angka = 1000; break;
            case 2: angka = 900; break;
            case 3: angka = 500; break;
            case 4: angka = 400; break;
            case 5: angka = 100; break;
            case 6: angka = 90; break;
            case 7: angka = 50; break;
            case 8: angka = 40; break;
            case 9: angka = 10; break;
            case 10: angka = 9; break;
            case 11: angka = 5; break;
            case 12: angka = 4; break;
            case 13: angka = 1; break;
        }
        return angka;
    }

}

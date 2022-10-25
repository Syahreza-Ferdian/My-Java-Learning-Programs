package TUGAS;

import java.util.Scanner;

public class romawi {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int angka, ribuan, ratusan, puluhan, satuan;
        final int HARD_LIMIT = 3999;
        String romawi = "";
        System.out.printf("Masukkan sebuah angka (1 - %d)\t: ", HARD_LIMIT);
        angka = scanner.nextInt();

        if(angka < 1 || angka > HARD_LIMIT){
            System.out.println("ERROR: Di luar range! Coba lagi di bawah!");
            System.out.println();
            main(args);
        }
        else {
            ribuan = angka /1000;
            ratusan = (angka / 100) % 10;
            puluhan = (angka / 10) % 10;
            satuan = angka % 10;

            switch(ribuan){
                case 1: romawi = "M"; break;
                case 2: romawi = "MM"; break;
                case 3: romawi = "MMM"; break;
                //case 4: romawi = "MMMM"; break;
            }
            switch(ratusan){
                case 1: romawi += "C"; break;
                case 2: romawi += "CC"; break;
                case 3: romawi += "CCC"; break;
                case 4: romawi += "CD"; break;
                case 5: romawi += "D"; break;
                case 6: romawi += "DC"; break;
                case 7: romawi += "DCC"; break;
                case 8: romawi += "DCCC"; break;
                case 9: romawi += "CM"; break;
            }
            switch(puluhan){
                case 1: romawi += "X"; break;
                case 2: romawi += "XX"; break;
                case 3: romawi += "XXX"; break;
                case 4: romawi += "XL"; break; 
                case 5: romawi += "L"; break;
                case 6: romawi += "LX"; break;
                case 7: romawi += "LXX"; break;
                case 8: romawi += "LXXX"; break;
                case 9: romawi += "XC"; break;
            }
            switch(satuan){
                case 1: romawi += "I"; break;
                case 2: romawi += "II"; break;
                case 3: romawi += "III"; break;
                case 4: romawi += "IV"; break;
                case 5: romawi += "V"; break;
                case 6: romawi += "VI"; break;
                case 7: romawi += "VII"; break;
                case 8: romawi += "VIII"; break;
                case 9: romawi += "IX"; break;
            }
            System.out.printf("Angka romawi untuk %d adalah\t\t: %s", angka, romawi);
        }
    }
}

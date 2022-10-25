package TUGAS;
import java.util.Scanner;

public class angkaKalimat_loops {
    private static final Scanner in = new Scanner(System.in);
    public static String angkaKeKalimat(long bilangan) {
        long[] ANGKA_CAST = {1000000000000L, 1000000000, 1000000, 1000, 100, 90, 80, 70, 60, 50, 40, 30, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] ANGKA_TERBILANG = {"Triliun", "Milyar", "Juta", "Ribu", "Ratus", "Sembilan Puluh", "Delapan Puluh", "Tujuh Puluh", "Enam Puluh", "Lima Puluh", "Empat Puluh", "Tiga Puluh", "Dua Puluh",
                                    "Sembilan Belas", "Delapan Belas", "Tujuh Belas", "Enam Belas", "Lima Belas", "Empat Belas", "Tiga Belas", "Dua Belas", "Sebelas", "Sepuluh",
                                    "Sembilan", "Delapan", "Tujuh", "Enam", "Lima", "Empat", "Tiga", "Dua", "Satu"};

        String hasil = "";
        for (int i = 0; i < ANGKA_CAST.length; i++) {
            if (ANGKA_CAST[i] <= bilangan) {
                if(bilangan/ANGKA_CAST[i] == 1 && (ANGKA_CAST[i] == 1000 || ANGKA_CAST[i] == 100)){
                    hasil = "Se";
                }
                else if (bilangan >= 100) {
                    hasil += angkaKeKalimat(bilangan/ANGKA_CAST[i]);
                }
                hasil += ANGKA_TERBILANG[i] + " " + angkaKeKalimat(bilangan % ANGKA_CAST[i]);
                break; //keluar loop
            }
        }
        return hasil;
    }

    public static void fixKalimat(String kalimat){
        String[] kata = kalimat.split(" ");
        for(int i = 0; i<kata.length; i++){
            kalimat = kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1).toLowerCase();
            System.out.print(kalimat + " ");
        }
    }

    public static void main(String[] args) {
        String terbilang = "";
        System.out.println("=========[KONVERSI SEBUAH INTEGER MENJADI KALIMAT TERBILANG]=========");
        System.out.println("Support input hingga ratusan triliun dan support nilai negatif!");
        System.out.print("Masukkan sebuah integer: ");
        long bilangan = in.nextLong();
        if(bilangan == 0) terbilang = "Zero";
        else if(bilangan < 0) terbilang = "Negatif " + angkaKeKalimat(Math.abs(bilangan));
        else terbilang = angkaKeKalimat(bilangan);
        System.out.println("=====================================================================");
        System.out.println("Bentuk terbilang dari angka tersebut adalah: ");
        fixKalimat(terbilang);
    }
}
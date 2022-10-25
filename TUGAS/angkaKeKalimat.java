package TUGAS;
import java.util.Scanner;

public class angkaKeKalimat {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=====[PROGRAM KONVERSI ANGKA KE KALIMAT]=====");
        System.out.println("LIMIT MAKSIMAL: 999,999 Triliun\nSupport angka negatif!");
        System.out.println();
        System.out.print("Masukkan angka: ");
        long angka = scanner.nextLong();
        System.out.println("================================================");
        System.out.println("Bentuk kalimat dari bilangan tersebut adalah: \n");

        if(angka > 0){
            bilanganKeKalimat(angka);
        }
        else {
            System.out.print("Negatif ");
            bilanganKeKalimat(Math.abs(angka));
        }
        System.out.println("\n================================================");
    }
    public static void satuan(long angka){
        String satuan = "";

        if(angka == 1) satuan = "Satu ";
        else if(angka == 2) satuan = "Dua "; 
        else if(angka == 3) satuan = "Tiga ";
        else if(angka == 4) satuan = "Empat ";
        else if(angka == 5) satuan = "Lima "; 
        else if(angka == 6) satuan = "Enam "; 
        else if(angka == 7) satuan = "Tujuh "; 
        else if(angka == 8) satuan = "Delapan "; 
        else if(angka == 9) satuan = "Sembilan ";
        else if(angka == 10) satuan = "Sepuluh ";
        else if(angka == 11) satuan = "Sebelas ";
            
        System.out.printf("%s", satuan);
    }
    public static void bilanganKeKalimat(long angka){
        if(angka <= 11) {
            satuan(angka);
        } 
        else if(angka <= 19) {
            bilanganKeKalimat(angka%10);
            System.out.print("Belas ");
        } 
        else if(angka <= 99){
            bilanganKeKalimat(angka/10);
            System.out.print("Puluh ");
            bilanganKeKalimat(angka%10);
        }
        else if(angka <= 199){
            System.out.print("Seratus ");
            bilanganKeKalimat(angka%100);
        }
        else if(angka <= 999){
            bilanganKeKalimat(angka/100);
            System.out.print("Ratus ");
            bilanganKeKalimat(angka%100);
        }
        else if(angka <= 1999){
            System.out.print("Seribu ");
            bilanganKeKalimat(angka%1000);
        }
        else if(angka <= 999999){ 
            bilanganKeKalimat(angka/1000);
            System.out.print("Ribu ");
            bilanganKeKalimat(angka%1000);
        }
        else if(angka <= 999999999){ //juta
            bilanganKeKalimat(angka/1000000);
            System.out.print("Juta ");
            bilanganKeKalimat(angka%1000000);
        }
        else if(angka <= 999999999999L){ //milyar
            bilanganKeKalimat(angka/1000000000);
            System.out.print("Milyar ");
            bilanganKeKalimat(angka%1000000000);
        }
        else if(angka <= 999999999999999L){ //trilyun
            bilanganKeKalimat(angka/1000000000000L);
            System.out.print("Trilyun ");
            bilanganKeKalimat(angka%1000000000000L);
        }
        else System.out.print("ERROR: Di luar range!");
    }
}

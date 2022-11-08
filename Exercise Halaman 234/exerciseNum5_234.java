import java.util.Scanner;

public class exerciseNum5_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan 3 angka: ");
        double angka1 = scanner.nextDouble();
        double angka2 = scanner.nextDouble();
        double angka3 = scanner.nextDouble();
        displaySortedNumbers(angka1, angka2, angka3);
    }
    public static void displaySortedNumbers(double angka1, double angka2, double angka3){
        double terbesar, tengah, terkecil;
        if(angka1 >= angka2){
            tengah = angka1;
            terkecil = angka2;
        }
        else {
            tengah = angka2;
            terkecil = angka1;
        }
        if(tengah >= angka3){
            terbesar = tengah;
            if(terkecil >= angka3){
                tengah = terkecil;
                terkecil = angka3;
            }
            else{
                tengah = angka3;
            }
        }
        else terbesar = angka3;
        
        System.out.printf("Urutan ketiga angka tersebut dari terkecil ke terbesar adalah: %s, %s, %s", Double.toString(terkecil), Double.toString(tengah), Double.toString(terbesar));

    }
}
/*
angka1 = 10
angka2 = 9
angka3 = 11

 */
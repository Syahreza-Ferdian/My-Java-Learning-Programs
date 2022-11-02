import java.util.Scanner;

public class exerciseNum50_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String ekstrak;
        char huruf;
        int hitungKapital = 0;
        for(int i = 0; i < kalimat.length(); i++){
            ekstrak = kalimat.substring(i, i+1);
            huruf = ekstrak.charAt(0);
            if(huruf >= (int)'A' && huruf <= (int)'Z'){
                hitungKapital++;
            }
        }
        System.out.printf("Jumlah huruf kapital pada kalimat tersebut adalah %d", hitungKapital);
    }
    
}
/*
System.out.printf("%d", (int)'A'); Nilai ASCII 'A' = 65
System.out.printf("%d", (int)'Z'); Nilai ASCII 'Z' = 90
 */
import java.util.Scanner;

public class exerciseNum20_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.printf("Jumlah huruf pada kalimat tersebut adalah (tidak termasuk spasi dan angka): %d", hitungHuruf(kalimat));
    }
    public static int hitungHuruf(String kalimat){
        int panjangKalimat = kalimat.length();
        int hitung = 0;
        for(int i = 0; i < panjangKalimat; i++){
            if(((int)kalimat.charAt(i) >= 65 && (int)kalimat.charAt(i) <= 90)||((int)kalimat.charAt(i) >= 97) && (int)kalimat.charAt(i) <= 122){
                hitung++;
            }
            else continue;
        }
        return hitung;
    }
}

import java.util.Scanner;

public class exerciseNum12_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan karakter awal: ");
        char ch1 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter terakhir: ");
        char ch2 = scanner.next().charAt(0);
        System.out.print("Masukkan jumlah karakter per baris: ");
        int jumlahCharPerBaris = scanner.nextInt();
        System.out.printf("Semua karakter berurutan dari %c sampai %c adalah: \n", ch1, ch2);
        printChars(ch1, ch2, jumlahCharPerBaris);
    }
    public static void printChars(char ch1, char ch2, int jumlahCharPerBaris){
        int countKarakter = 0;
        for(int i = (int)ch1; i <= (int)ch2; i++){
            System.out.printf("%c ", (char)i);
            countKarakter++;
            if(countKarakter % jumlahCharPerBaris == 0) System.out.println();
        }
    }
}

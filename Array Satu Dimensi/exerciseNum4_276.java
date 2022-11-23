import java.util.Scanner;

public class exerciseNum4_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nilai = new int[101];
        int total= 0, hitungData = 0, hitungDiBawahRata = 0, hitungDiAtasRata = 0;
        double rataRata;
        System.out.print("Masukkan nilai (input berhenti jika memasukkan nilai negatif): ");
        for(int i = 0; i <= nilai.length; i++){
            nilai[i] = scanner.nextInt();
            if(nilai[i] < 0) break;
            total += nilai[i];
            hitungData++;
        }
        rataRata = (double)total/hitungData;
        for(int i = 0; i < hitungData; i++){
            if(nilai[i] >= rataRata) hitungDiAtasRata++;
            else hitungDiBawahRata++;
        }
        System.out.printf("Jumlah semua nilai adalah: %d\n", total);
        System.out.printf("Jumlah data: %d\n", hitungData);
        System.out.printf("Rata-rata nya adalah: %.2f\n", rataRata);
        System.out.printf("Jumlah nilai di bawah rata - rata adalah: %d\n", hitungDiBawahRata);
        System.out.printf("Jumlah nilai di atas rata-rata adalah: %d\n", hitungDiAtasRata);

    }
}

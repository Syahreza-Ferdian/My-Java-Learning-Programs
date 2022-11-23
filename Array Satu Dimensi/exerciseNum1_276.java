import java.util.Scanner;

public class exerciseNum1_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = scanner.nextInt();
        int[] nilai = new int[n];
        int nilaiTertinggi = 0;
        System.out.printf("Masukkan %d nilai: ", n);
        for(int i = 0; i < n; i++){
            nilai[i] = scanner.nextInt();
            if(nilai[i] > nilaiTertinggi) nilaiTertinggi = nilai[i];
        }
        for(int i = 0; i < n; i++){
            System.out.printf("Mahasiswa %d mendapatkan skor %d dan nilainya adalah %c\n", i + 1, nilai[i], penilaian(nilaiTertinggi, nilai[i]));
        }
    }
    public static char penilaian(int nilaiTertinggi, int nilaiSiswa){
        if(nilaiSiswa >= nilaiTertinggi - 10) return 'A';
        else if(nilaiSiswa >= nilaiTertinggi - 20) return 'B';
        else if(nilaiSiswa >= nilaiTertinggi - 30) return 'C';
        else if(nilaiSiswa >= nilaiTertinggi - 40) return 'D';
        else return 'F';
    }
}

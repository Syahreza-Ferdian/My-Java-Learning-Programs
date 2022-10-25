import java.util.Scanner;

public class exerciseNum8_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 1, tertinggi = 0;
        String siswaNilaiTertinggi = "";

        System.out.print("Masukkan jumlah siswa keseluruhan: ");
        int totalSiswa = scanner.nextInt(); 
        scanner.nextLine();

        do {
            count++;
            System.out.print("Masukkan nama siswa dan nilainya (Reza 90): ");
            String input = scanner.nextLine();
            String namaSiswa = input.substring(0, input.indexOf(" "));
            int nilai = Integer.parseInt(input.substring(input.indexOf(" ")+1, input.length()));
            if(nilai > tertinggi){
                tertinggi = nilai;
                siswaNilaiTertinggi = namaSiswa;
            }

        } while (count <= totalSiswa);

        System.out.printf("\nSiswa dengan nilai tertinggi adalah %s", siswaNilaiTertinggi);
        System.out.printf("\nDengan nilai %d", tertinggi);
    }
}

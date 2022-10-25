import java.util.Scanner;

public class cekNIM {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String nim = scanner.nextLine();
        String nimTahunMasuk = nim.substring(0, 2);
        String nimProdi = nim.substring(5, 8);
        String nimJalur = nim.substring(8, 12);

        String jalurMasuk = "", prodi = "";
        switch(nimProdi){
            case "020" : prodi = "Teknik Komputer"; break;
            case "030" : prodi = "Teknik Informatika"; break;
            case "070" : prodi = "Teknologi Informasi"; break;
            case "080" : prodi = "Sistem Informasi"; break;
            case "090" : prodi = "Pendidikan Teknologi Informasi"; break;
        }
        switch(nimJalur){
            case "1111" : jalurMasuk = "SNMPTN"; break;
            case "0111" : jalurMasuk = "SBMPTN"; break;
            case "7111" : jalurMasuk = "Mandiri"; break;
        }

        System.out.printf("Tahun masuk : 20%s", nimTahunMasuk);
        System.out.printf("\nJalur masuk : %s", jalurMasuk);
        System.out.printf("\nProgram studi : %s", prodi);
    }    
}
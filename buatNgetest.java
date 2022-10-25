import java.util.Scanner;

public class buatNgetest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int berat = scanner.nextInt();
        scanner.nextLine();
        String[] inputTanggal= scanner.nextLine().split("/");
        String status = scanner.nextLine();

        int tanggal = Integer.parseInt(inputTanggal[0]);
        int bulan = Integer.parseInt(inputTanggal[1]);
        int tahun = Integer.parseInt(inputTanggal[2]);
        int lama = lamaWaktuLaundry(berat);
        
        double harga = 7500 * lama;
        if (status.equalsIgnoreCase("kirim")) {
            double totalHarga = harga + (harga * 0.1);
            System.out.printf("Lama hari proses laundry : %d hari", lama);
            System.out.printf("\nTanggal selesai : ");
            tanggalSelesaiLaundry(tanggal, bulan, tahun, lama);
            System.out.print(" (Diantarkan)");
            System.out.printf("\nTotal harga yang harus dibayar : Rp %,.2f", totalHarga);
        }
        else if(status.equalsIgnoreCase("ambil")){
            double totalHarga = harga;
            System.out.printf("Lama hari proses laundry : %d hari", lama);
            System.out.printf("\nTanggal selesai : ");
            tanggalSelesaiLaundry(tanggal, bulan, tahun, lama);
            System.out.print(" (Diambil)");
            System.out.printf("\nTotal harga yang harus dibayar : Rp %,.2f", totalHarga);
        }


    }
    public static int lamaWaktuLaundry(int berat){
        final int MAX_LAUNDRY_PER_HARI = 4;
        int lamaLaundry = berat / MAX_LAUNDRY_PER_HARI;
        int sisa = berat % MAX_LAUNDRY_PER_HARI;
        if(sisa <= 4){
            lamaLaundry += 1;
            if(sisa == 0){
                lamaLaundry = berat / MAX_LAUNDRY_PER_HARI;
            }
        }
        else lamaLaundry = lamaWaktuLaundry(sisa);
        return lamaLaundry;
    }
    public static void tanggalSelesaiLaundry(int tanggalMulai, int bulan, int tahun, int lamaLaundry){
        int tanggalSelesai = 0;
        if(lamaLaundry <= 360){
            tanggalSelesai = tanggalMulai + lamaLaundry;
            while(tanggalSelesai > 30){
                tanggalSelesai -= 30;
                bulan += 1;
            }
        }
        System.out.printf("%d - %d - %d", tanggalSelesai, bulan, tahun);
    }
}
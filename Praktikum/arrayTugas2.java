package Praktikum;
import java.util.Scanner;

public class arrayTugas2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihanUser, jumlahTiket = 0;
        String pesanKereta = "";
        String[][] data = {{"Ekonomi", "50000", "2 %", "Tidak Ada", "Tidak Ada"},
                            {"Bisnis", "100000", "5 %", "Ada", "Tidak Ada"},
                            {"Eksekutif", "200000", "7 %", "Ada", "Tidak Ada"},
                            {"Pariwisata", "300000", "10 %", "Ada", "Ada"}};
        do {
            System.out.println("\nPilihan menu: ");
            System.out.println("1. Melihat Daftar Kereta Api\n2. Melihat Daftar Kereta Api yang ada AC\n3. Melihat Daftar Kereta Api yang ada colokan\n4. Memesan Tiket Kereta Api\n5. Melihat Pesanan Tiket");
            System.out.println("INFO: Masukkan input selain dari menu di atas jika ingin keluar dari program.");
            System.out.print("Masukkan nilai : ");
            pilihanUser = scanner.nextInt(); 
            switch(pilihanUser){
                case 1: {
                    System.out.println("Daftar Kereta Api: ");
                    for(int i = 0; i < data.length; i++){
                        System.out.printf("%d. %s\n", i+1, data[i][0]);
                    }
                    break;
                }
                case 2: {
                    int count = 0;
                    System.out.println("Daftar Kereta Api yang ada AC-nya: ");
                    for(int i = 0; i < data.length; i++){
                        if(data[i][3].equalsIgnoreCase("ada")) {
                            count++;
                            System.out.printf("%d. %s\n", count, data[i][0]);
                        }
                    }
                    break;
                }
                case 3: {
                    int count = 0;
                    System.out.println("Daftar Kereta Api yang ada colokannya: ");
                    for(int i = 0; i < data.length; i++){
                        if(data[i][4].equalsIgnoreCase("ada")) {
                            count++;
                            System.out.printf("%d. %s\n", count, data[i][0]);
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Masukkan jenis kereta api yang ingin anda pesan: ");
                    pesanKereta = scanner.next();
                    if(rowKeretaYangDipesan(pesanKereta, data) == -1) System.out.println("Kereta yang anda pilih tidak tersedia. Input 1 untuk melihat daftar kereta.");
                    else{
                        System.out.print("Masukkan jumlah tiket yang ingin anda pesan: ");
                        jumlahTiket = scanner.nextInt();
                        System.out.printf("Anda telah berhasil memesan kereta %s dengan jumlah tiket %d\n", data[rowKeretaYangDipesan(pesanKereta, data)][0], jumlahTiket);
                        System.out.println("NOTE: Input 5 jika ingin melihat pesanan anda.");
                    }
                    break;
                }
                case 5: {
                    int indexKereta = rowKeretaYangDipesan(pesanKereta, data);
                    if(indexKereta == -1) System.out.println("ERROR: Anda belum memesan tiket! Input 4 untuk pemesanan tiket.");
                    else{
                        System.out.println("=====[ BUKTI PESANAN TIKET ]=====");
                        System.out.printf("%-30s: %s\n", "Jenis Kereta", data[indexKereta][0]);
                        System.out.printf("%-30s: %d\n", "Jumlah tiket", jumlahTiket);
                        System.out.printf("%-30s: Rp %,.2f\n", "Harga Satuan", Double.parseDouble(data[indexKereta][1]));
                        System.out.printf("%-30s: %s\n", "Diskon Satuan", data[indexKereta][2]);
                        System.out.printf("%-30s: Rp %,.2f\n", "Total yang harus dibayar", hargaBayar(indexKereta, data, jumlahTiket));
                        System.out.println("------- FASILITAS KERETA --------");
                        System.out.printf("%-15s: %s\n", "AC", data[indexKereta][3]);
                        System.out.printf("%-15s: %s\n", "Stopkontak", data[indexKereta][4]);
                    }
                    break;
                }
            }
        } while (pilihanUser <= 5 && pilihanUser >= 1);
    }
    public static int rowKeretaYangDipesan(String pesan, String[][] data){
        int indexKereta = -1;
        for(int i = 0; i < data.length; i++){
            if(data[i][0].equalsIgnoreCase(pesan)) indexKereta = i;
        }
        return indexKereta;
    }
    public static double hargaBayar(int rowKereta, String[][] data, int jumlahPesan){
        int harga = Integer.parseInt(data[rowKereta][1]);
        int diskon = Integer.parseInt(String.valueOf(data[rowKereta][2].substring(0, 2).replace(" ", "")));
        double hargaSetelahDiskon = harga - ((diskon/100.0) * harga);
        return hargaSetelahDiskon * jumlahPesan;
    }
}

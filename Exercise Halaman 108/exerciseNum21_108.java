import java.util.Scanner;

public class exerciseNum21_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tahun, bulan, tanggal, h;
        System.out.print("Enter year: (e.g., 2012): ");
        tahun = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        bulan = scanner.nextInt();

        if(bulan == 1){
            bulan = 13;
            tahun -= 1;
        }
        else if(bulan == 2){
            bulan = 14;
            tahun -= 1;
        }
        else bulan += 0; tahun +=0;

        System.out.printf("Enter the day of the month: 1-%d: ", jmlHariDlm1Bulan(bulan, tahun));
        tanggal = scanner.nextInt();

        h = (tanggal + (26*(bulan + 1)/10) + (tahun % 100) + ((tahun % 100)/4) + ((tahun/100)/4) + 5*(tahun/100))%7;

        System.out.printf("\nDay of the week is %s", angkaKeHari(h));
    }
    public static String angkaKeHari(int angka){
        String hari = " ";
        switch(angka){
            case 0: hari = "Saturday"; break;
            case 1: hari = "Sunday"; break;
            case 2: hari = "Monday"; break;
            case 3: hari = "Tuesday"; break;
            case 4: hari = "Wednesday"; break;
            case 5: hari = "Thursday"; break;
            case 6: hari = "Friday"; break;
        }
        return hari;
    }
    public static int jmlHariDlm1Bulan(int angka, int tahun){
        int jumlahHari = 0;
        switch (angka) {
            case 3: jumlahHari = 31; break;
            case 4: jumlahHari = 30; break;
            case 5: jumlahHari = 31; break;
            case 6: jumlahHari = 30; break;
            case 7: jumlahHari = 31; break;
            case 8: jumlahHari = 31; break; 
            case 9: jumlahHari = 30; break;
            case 10: jumlahHari = 31; break;
            case 11: jumlahHari = 30; break;
            case 12: jumlahHari = 31; break;
            case 13: jumlahHari = 31; break;
            case 14: {
                if (tahun % 4 == 0) {
                    jumlahHari = 29;
                }
                else jumlahHari = 28;
            }break;
        }
        return jumlahHari;
    }
}
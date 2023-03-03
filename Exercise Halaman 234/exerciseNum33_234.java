public class exerciseNum33_234 {
    public static void main(String[] args) {
        long waktu = System.currentTimeMillis();
        long totalDetik = waktu / 1000;
        int detikSaatIni = (int)totalDetik % 60;
        int totalMenit = (int)totalDetik / 60;
        int menitSaatIni = totalMenit % 60;
        int totalJam = (totalMenit / 60) + 7; //Indonesia WIB: GMT +7
        int jamSaatIni = totalJam % 24;
        int totalHari = (totalJam / 24) + 1;
        int hariSaatIni = totalHari - jumlahHariSejak1970();
        int totalTahun = totalHari / 365;
        int tahunSaatIni = totalTahun + 1970;
        int bulanSaatIni = penentuanBulan(hariSaatIni, tahunSaatIni);
        int tanggalSaatIni = tanggalSekarang(hariSaatIni, tahunSaatIni, bulanSaatIni);
        String bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.printf("%s %d, %d  %02d:%02d:%02d", bulan[bulanSaatIni - 1],tanggalSaatIni, tahunSaatIni, jamSaatIni, menitSaatIni, detikSaatIni);
    }
    public static int jumlahHariDlmSetahun(int year){
        if(afakahKabisat(year)) return 366;
        else return 365;
    }
    public static boolean afakahKabisat(int year){
        boolean kabisat = false;
        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) kabisat = true;
        return kabisat;
    }
    public static int jumlahHariSejak1970(){
        int jumlah = 0;
        for(int i = 1970; i < 2022; i++){
            jumlah += jumlahHariDlmSetahun(i);
        }
        return jumlah;
    }
    public static int penentuanBulan(int hari, int year){
        int bulan = 0;
        int jumlahHari = jumlahHariDlmSetahun(year);
        for(int i = 12; i >= 1; i--){
            if(i >= 8){
                if(i % 2 == 0) jumlahHari -= 31;
                else jumlahHari -= 30;
            }
            else if(i <= 7){
                if(i % 2 == 1) jumlahHari -= 31;
                else if(i % 2 == 0 && i != 2) jumlahHari -= 30;
                else if(i == 2){
                    if(afakahKabisat(year)) jumlahHari -= 29;
                    else jumlahHari -= 28;
                }
            }
            if((hari - jumlahHari <= 28 || hari-jumlahHari <= 29 || hari - jumlahHari <= 30 || hari - jumlahHari <= 31) && hari - jumlahHari > 0){
                bulan = i;
                break;
            }
        }
        return bulan;
    }
    public static int jumlahHariDalamSatuBulan(int bulan, int tahun){
        int hariFebruari = (afakahKabisat(tahun)) ? 29 : 28;
        int jmlhari[] = {31, hariFebruari, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return jmlhari[bulan - 1];
    }
    public static int tanggalSekarang(int hari, int tahun, int bulan){
        int i = 1;
        if(hari == 365 || hari == 366) return 31;
        while(hari >= jumlahHariDalamSatuBulan(bulan, tahun)){
            hari -= jumlahHariDalamSatuBulan(i, tahun);
            i++;
        }
        return hari;
    }
}

public class exerciseNum16_234 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t%s\n", "Tahun", "Jumlah Hari");
        // int jumlah = 0;
        for(int i = 2000; i <= 2020; i++){
            System.out.printf("%d\t\t%d\n", i, numberOfDaysInAYear(i));
            // jumlah += numberOfDaysInAYear(i);
        }
        // System.out.printf("==========================\n");
        // System.out.printf("%s\t\t%d", "TOTAL", jumlah);
    }
    public static int numberOfDaysInAYear(int year){
        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)){
            return 366;
        }
        else return 365;
    }
}
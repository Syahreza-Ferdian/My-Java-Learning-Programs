import java.util.Calendar;

public class exerciseNum5_360 {
    public static void main(String[] args) {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        // kalender.setTimeInMillis(1234567898765L);
        System.out.printf("Tanggal, bulan, dan tahun: %d/%02d/%d\n", kalender.get(Calendar.DAY_OF_MONTH), kalender.get(Calendar.MONTH), kalender.get(Calendar.YEAR));
    }
}

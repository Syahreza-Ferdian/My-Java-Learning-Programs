public class exerciseNum3_360 {
    public static void main(String[] args) {
        for(long i = 10000; i <= 100000000000L; i*= 10){
            java.util.Date tanggal = new java.util.Date(i);
            System.out.printf("The Elapsed time since Jan 1, 1970 is %d milliseconds\n", i);
            System.out.println(tanggal.toString());
            System.out.println();
        }
    }
}

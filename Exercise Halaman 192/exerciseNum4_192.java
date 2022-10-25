public class exerciseNum4_192 {
    public static void main(String[] args) {
        final double MILE_TO_KILOMETERS = 1.609;

        System.out.printf("%-15s%s", "Miles", "Kilometers");
        for(int mi = 1; mi <= 10; mi++){
            System.out.printf("\n%2d%20.3f", mi, mi * MILE_TO_KILOMETERS);
        }
    }   
}

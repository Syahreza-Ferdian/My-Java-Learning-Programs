public class exerciseNum4_360 {
    public static void main(String[] args) {
        java.util.Random acak = new java.util.Random(1000);
        for(int i = 1; i <= 50; i++){
            System.out.printf("%2d ", acak.nextInt(100));
            if(i % 10 == 0) System.out.println();
        }
    }
}

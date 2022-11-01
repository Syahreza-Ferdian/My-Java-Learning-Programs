public class exerciseNum26_192 {
    public static void main(String[] args) {
        for(int i = 10000; i <= 100000; i += 10000){
            double e = 1;
            double faktorial = 1;
            for(int j = 1; j <= i; j++){
                faktorial *= j;
                e += 1.0/faktorial;
            }
            System.out.printf("Nilai e untuk i = %d adalah %s\n", i, Double.toString(e));
        }
    }
}

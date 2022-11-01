public class exerciseNum25_192 {
    public static void main(String[] args) {
        for(int n = 10000; n <= 100000; n += 10000){
            double jumlah = 0;
            for(int i = 1; i <= n; i++){
                double pembilang = Math.pow(-1, i + 1);
                double penyebut = (2 * i) - 1;
                double pembagian = (double)pembilang / penyebut;
                jumlah += pembagian;
            }
            System.out.printf("Nilai PHI untuk i = %d adalah %s\n", n, Double.toString(4 * jumlah));
        }
    }
}

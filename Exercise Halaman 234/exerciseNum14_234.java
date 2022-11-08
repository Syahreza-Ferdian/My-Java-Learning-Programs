public class exerciseNum14_234 {
    public static void main(String[] args) {
        System.out.println("=====[MEMPERKIRAKAN NILAI PHI]=====");
        System.out.printf("%s\t\t%s\n", "i", "m(i)");
        for(int i = 1; i < 1000; i += 100){
            System.out.printf("%d\t\t%.4f\n", i, hitungJumlahDeret(i));
        }
    }
    public static double hitungJumlahDeret(int n){
        double jumlah = 0;
        for(int i = 1; i <= n; i++){
            jumlah += (Math.pow(-1, i + 1))/(2*i - 1);
        }
        return 4 * jumlah;
    }
}

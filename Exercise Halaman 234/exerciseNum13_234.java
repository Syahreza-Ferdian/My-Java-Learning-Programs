public class exerciseNum13_234 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t%s\n", "i", "m(i)");
        for(int i = 1; i <= 20; i++){
            System.out.printf("%d\t\t%.4f\n", i, hitungJumlah(i));
        }
    }
    public static double hitungJumlah(int n){
        double jumlah = 0;
        for(int i = 1; i <= n; i++){
            jumlah += (double)i/(i+1);
        }
        return jumlah;
    }
}

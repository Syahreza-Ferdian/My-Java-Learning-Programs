public class exerciseNum23_192 {
    public static void main(String[] args) {
        int n = 50000;
        double jumlah1 = 0, jumlah2 = 0;
        //perhitungan dari kiri ke kanan
        for(int i = 1; i <= n; i++){
            double pembagian = 1.0/i;
            jumlah1 += pembagian;
        }   
        System.out.printf("Perhitungan dari kiri ke kanan: %s\n", Double.toString(jumlah1));

        for(int i = n; i >= 1; i--){
            double pembagian = 1.0/i;
            jumlah2 += pembagian;
        }
        System.out.printf("Perhitungan dari kanan ke kiri: %s", Double.toString(jumlah2));
    }
}

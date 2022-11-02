public class exerciseNum35_192 {
    public static void main(String[] args) {
        double penyebut, pembagian, hasil = 0;
        for(int i = 1; i <= 624; i++){
            penyebut = Math.sqrt(i) + Math.sqrt(i + 1);
            pembagian = 1.0/penyebut;
            hasil += pembagian;
        }
        System.out.printf("Hasil perhitungan deret tersebut adalah: %s", Double.toString(hasil));
    }
}

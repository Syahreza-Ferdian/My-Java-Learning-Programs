public class exerciseNum24_192 {
    public static void main(String[] args) {
        double jumlah = 0;
        for(int pembilang = 1, penyebut = 3; pembilang <= 97 && penyebut <= 99; pembilang += 2, penyebut += 2){
            double pembagian = (double)pembilang/penyebut;
            jumlah += pembagian;
        }
        System.out.println(jumlah);
    }
}

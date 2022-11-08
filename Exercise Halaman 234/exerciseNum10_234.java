public class exerciseNum10_234 {
    public static void main(String[] args) {
        int jumlah = 0;
        final int LIMIT = 10000;
        for(int i = 1; i <= LIMIT; i++){
            if(isPrime(i)) jumlah++;
        }
        System.out.printf("Jumlah semua bilangan prima kurang dari %d adalah %d", LIMIT, jumlah);
    }
    public static boolean isPrime(int angka){
        boolean cekPrima;
        int count = 0;
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0){
                count++;
            }
        }
        if(count == 2) cekPrima = true;
        else cekPrima = false;
        return cekPrima;
    }
}

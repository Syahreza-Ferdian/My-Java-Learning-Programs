public class exerciseNum28_234 {
    public static void main(String[] args) {
        System.out.printf("%s\t\t\t%s\n", "p", "2^p-1");
        for(long i = 1; i <= 31; i++){
            if(cekPrima(i)) System.out.printf("%d\t\t\t%d\n", i, (int)(Math.pow(2, i)-1));
        }
    }
    public static boolean cekPrima(long angka){
        int count = 0;
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0) count++;
        }
        boolean cekPrima = (count == 2)?true:false;
        return cekPrima;
    }
}

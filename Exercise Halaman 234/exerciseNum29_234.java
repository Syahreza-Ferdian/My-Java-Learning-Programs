public class exerciseNum29_234 {
    public static void main(String[] args) {
        System.out.println("Bilangan Twin Prime dibawah 1000");
        for(int i = 1; i <= 1000; i++){
            if(cekPrima(i) && cekPrima(i + 2)){
                System.out.printf("(%d, %d)\n", i, i+2);
            }
        }
    }
    public static boolean cekPrima(int angka){
        int count = 0;
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0) count++;
        }
        boolean cekPrima = (count == 2)?true:false;
        return cekPrima;
    }
}

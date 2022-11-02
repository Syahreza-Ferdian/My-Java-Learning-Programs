public class exerciseNum40_192 {
    public static void main(String[] args) {
        int koin, angka = 0, gambar = 0;
        for(int i = 1; i <= 1000000; i++){
            koin = (int)(Math.random()*2);
            if(koin == 0) angka++;
            else gambar++;
        }
        System.out.printf("Koin dilempar sebanyak 1 juta kali, maka: \n");
        System.out.printf("Muncul sisi angka sebanyak %d kali\n", angka);
        System.out.printf("Muncul sisi gambar sebanyak %d kali\n", gambar);
    }
}

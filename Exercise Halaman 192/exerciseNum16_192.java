import java.util.Scanner;

public class exerciseNum16_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah bilangan: ");
        int angka = scanner.nextInt();
        System.out.print("Faktor prima dari bilangan tersebut adalah: \n");
        for(int i = 2; i <= angka; i++){
            while(angka % i == 0){
                System.out.printf("%d ", i);
                angka /= i;
            }
        }
    }
}

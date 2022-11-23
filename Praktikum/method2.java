package Praktikum;
import java.util.Scanner;
public class method2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan prima: ");
        int bil = scanner.nextInt();
        if(cekPrima(bil)) System.out.printf("Bilangan %d adalah bilangan prima\n", bil);
        else System.out.printf("Bilangan %d bukan bilangan prima\n", bil);
        System.out.println("Program menentukan bilangan prima dari 1 -100: ");
        for(int i = 1; i <= 100; i++){
            if(cekPrima(i)) System.out.printf("%d ", i);
        }
    }
    public static boolean cekPrima(int angka){
        boolean cekPrima = true;
        if(angka <= 1) cekPrima = false;
        else{
            for(int i = 2; i <= angka/2; i++){
                if(angka % i == 0) cekPrima = false;
            }
        }
        return cekPrima;
    }
}
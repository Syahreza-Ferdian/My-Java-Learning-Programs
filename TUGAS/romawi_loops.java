package TUGAS;
import java.util.Scanner;

public class romawi_loops {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String hasil = "";
        System.out.print("Masukkan sebuah bilangan integer: ");
        int bilangan = scanner.nextInt();
        String romawi [] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int angkaSpesial [] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i = 0; i < angkaSpesial.length; i++){
            while(bilangan - angkaSpesial[i] >= 0){
                hasil += romawi[i];
                bilangan -= angkaSpesial[i];
            }
        }
        System.out.println(hasil);
    }
    
}
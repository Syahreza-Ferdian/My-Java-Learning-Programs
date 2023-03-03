package Praktikum;
import java.util.Scanner;

public class fibonacciSequence {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah bilangan fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();
        System.out.printf("Berikut ini adalah %d bilangan fibonacci pertama: \n", n);
        fibonacci(n);
    }
    public static void fibonacci(int n){
        int first = 0, second = 1;
        for(int i = 1; i <= n; i ++){
            int sum = first + second;
            first = second;
            second = sum;
            System.out.printf("%d ", first);
        }
    }
}

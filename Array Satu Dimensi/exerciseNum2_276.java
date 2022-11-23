import java.util.Scanner;

public class exerciseNum2_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] angka = new int[10];
        System.out.print("Masukkan 10 digit angka: ");
        for(int i = 0; i < 10; i++){
            angka[i] = scanner.nextInt();
        }
        System.out.println("Susunan terbalik dari angka tersebut adalah: ");
        for(int i = 9; i >= 0; i--){
            System.out.printf("%d ", angka[i]);
        }
    }
}

import java.util.Scanner;

public class exerciseNum2_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program penghitung jumlah semua digit dari bilangan yang dimasukkan: ");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        System.out.printf("Jumlah semua digit pada bilangan tersebut adalah: %d", jumlahDigit(bilangan));
    }
    public static int jumlahDigit(int bilangan){
        int jumlah = 0, digit;
        do {
            digit = bilangan % 10;
            jumlah += digit;
            bilangan /= 10;
        } while (bilangan > 0);
        return jumlah;
    }
}

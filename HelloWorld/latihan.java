/**
 * latihan
 */
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 20000.69;
        double amountToDeposit;
        double updatedBalance;
        System.out.println("Masukkan jumlah uang yang telah ditabung: ");
        amountToDeposit = input.nextInt();
        updatedBalance = balance + amountToDeposit;
        
        boolean balanceHasChanged = balance != updatedBalance; //boolean buat ngecek saldonya berubah apa engga

        if (balanceHasChanged == true) {
            System.out.printf("Saldo anda telah berubah. Saldo sekarang: %f\n", updatedBalance); //jika saldonya berubah
        }
        else System.out.println("Saldo anda tidak berubah"); //jika tidak terjadi perubahan saldo

        input.close();
    }
    
}
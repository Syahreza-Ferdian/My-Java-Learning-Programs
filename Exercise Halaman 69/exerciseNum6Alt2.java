import java.util.Scanner;

public class exerciseNum6Alt2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===========[ SUM THE DIGITS IN AN INTEGER ]==========");
        System.out.print("This program will reads an integer between 0 to 1000");
        System.out.println(" and adds all the digits in that integer.");
        System.out.println(" ");
        inputProcessPrint();   //memanggil method yg dibuat di bawah ke main
    }
    public static void inputProcessPrint(){   //method yg berisi input, extraction digit dari bilangan yg dimasukkan, dan penampilan hasil
        System.out.print("Enter a number between 0 and 1000: ");
        int bilangan = scanner.nextInt();
        int digit1 = (bilangan/100) % 10;
        int digit2 = (bilangan/10) % 10;
        int digit3 = bilangan % 10;
        int jumlah = digit1 + digit2 +digit3;

        if (bilangan >= 1000 || bilangan <= 0) {  //pemakaian if jika bilangan yang di-input tidak di antara 0 dan 1000
            System.out.println("ERROR: The entered number must be between 0 and 1000. TRY AGAIN BELOW!"); //program menampilkan error message
            System.out.println(" ");
            inputProcessPrint(); //program mengulang proses input kembali dari awal
        }
        else System.out.printf("The sum off all digits in %d is %d", bilangan, jumlah);  //jika bilangan yg di-input sesuai dalam range 0-1000, maka akan tampil jumlah digit dari bilangan tsb
    }
}

package TUGAS;
import java.util.Scanner;

public class menentukanKPK {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("======[PROGRAM UNTUK MENENTUKAN NILAI KPK DARI 2 BUAH BILANGAN YANG DIINPUTKAN]======");
        System.out.print("Masukkan bilangan pertama dan kedua (dipisahkan oleh spasi): ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        int bilangan1 = Integer.parseInt(input1);
        int bilangan2 = Integer.parseInt(input2);
        int kpk = (bilangan1 > bilangan2) ? bilangan1 : bilangan2;

        while(true){
            if(kpk % bilangan1 == 0 && kpk % bilangan2 == 0){
                System.out.printf("Nilai KPK dari %d dan %d adalah %d", bilangan1, bilangan2, kpk);
                break;
            }
            else kpk++;
        }
    }
}

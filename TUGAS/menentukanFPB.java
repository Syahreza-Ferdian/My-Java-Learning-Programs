package TUGAS;

import java.util.Scanner;

public class menentukanFPB {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("======[PROGRAM UNTUK MENGHITUNG FPB DARI 2 BILANGAN YANG DIINPUTKAN]======");
        System.out.print("Silahkan masukkan bilangan pertama dan kedua (dipisahkan oleh spasi): ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        int fpb = 0;
        int bilangan1 = Integer.parseInt(input1);
        int bilangan2 = Integer.parseInt(input2); //asumsi bilangan 2 lebih kecil

        if(bilangan2 > bilangan1){ //jika bilangan 2 lebih besar, maka tukar bilangan 1 dan bilangan 2
            int temp = bilangan2;
            bilangan2 = bilangan1;
            bilangan1 = temp;
        }
        for(int i = 1; i <= bilangan2; i++){
            if(bilangan1 % i == 0 && bilangan2 % i == 0){
                fpb = i;
            }
        }
        System.out.printf("Nilai FPB dari %d dan %d adalah %d", bilangan1, bilangan2, fpb);
    }
}
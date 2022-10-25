package TUGAS;
import java.util.Scanner;

public class romawi_alt2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int angka;
        System.out.print("Masukkan angka: ");
        angka = scanner.nextInt();
        desimalKeRomawi(angka);
        System.out.println(desimalKeRomawi(angka));
    }
    public static String desimalKeRomawi(int angka){
        String romawi = " ";
        if(angka >= 1000){
            romawi = "M" + desimalKeRomawi(angka - 1000);
        }
        else if(angka >= 900){
            romawi = "CM" + desimalKeRomawi(angka - 900);
        }
        else if(angka >= 500){
            romawi = "D" + desimalKeRomawi(angka - 500);
        }
        else if(angka >=400){
            romawi = "CD" + desimalKeRomawi(angka - 400);
        }
        else if(angka >=100){
            romawi = "C" + desimalKeRomawi(angka - 100);
        }
        else if(angka >= 90){
            romawi = "XC" + desimalKeRomawi(angka - 90);
        }
        else if(angka >= 50){
            romawi = "L" + desimalKeRomawi(angka - 50);
        }
        else if(angka >= 40){
            romawi = "XL" + desimalKeRomawi(angka - 40);
        }
        else if(angka >= 10){
            romawi = "X" + desimalKeRomawi(angka - 10);
        }
        else if(angka >= 9){
            romawi = "IX" + desimalKeRomawi(angka - 9);
        }
        else if(angka >= 5){
            romawi = "V" + desimalKeRomawi(angka - 5);
        }
        else if(angka >=4){
            romawi = "IV" + desimalKeRomawi(angka - 4);
        }
        else if(angka >= 1){
            romawi = "I" + desimalKeRomawi(angka - 1);
        }
        return romawi;
    }
}

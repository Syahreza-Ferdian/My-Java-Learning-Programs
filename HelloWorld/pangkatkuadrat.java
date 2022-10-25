import java.util.Scanner;

public class pangkatkuadrat {
    public static void main(String[] args) {
        int bilangan, pangkat, hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("=======[PROGRAM UNTUK MENGHITUNG PANGKAT SUATU BILANGAN]=======");
        System.out.println("Masukkan bilangan: ");
        bilangan = input.nextInt();
        System.out.println("Masukkan pangkat: ");
        pangkat = input.nextInt();
        hasil = (int) Math.pow(bilangan, pangkat);
        System.out.println("Hasil pangkat "+pangkat + " dari bilangan tersebut adalah: "+hasil);
        input.close();
    }
}

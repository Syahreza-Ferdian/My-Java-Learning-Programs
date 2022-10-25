import java.util.Scanner;

public class circle {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double pi;
        System.out.println("PRORAM UNTUK MENGHITUNG LUAS LINGKARAN");
        System.out.println("Masukkan jari jari lingkaran (dalam cm)");
        int jari2 = scanner.nextInt();

        if (jari2%7 == 0) {   //Kondisi saat jari jarinya merupakan kelipatan 7. Maka digunakan nilai pi = 22/7
            pi = (double) 22/7;
        }
        else pi = 3.14;

        double luas = pi * Math.pow(jari2, 2);  //Penghitungan luas
        System.out.println("Luas lingkaran dengan jari jari tersebut adalah: " +luas +" cm^2");  //Displays the output
    }
}
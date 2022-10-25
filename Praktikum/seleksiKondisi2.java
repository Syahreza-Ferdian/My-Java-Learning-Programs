package Praktikum;
import java.util.Scanner;

public class seleksiKondisi2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double beratBadan, tinggiBadan, imt;
        String kriteria;
        System.out.printf("%-20s: ", "Berat badan (kg)");
        beratBadan = scanner.nextDouble();
        System.out.printf("%-20s: ", "Tinggi badan (m)");
        tinggiBadan = scanner.nextDouble();
        imt = beratBadan / Math.pow(tinggiBadan, 2);

        if(imt <= 18.5){
            kriteria = "kurus";
        }
        else if(imt <= 25){
            kriteria = "normal";
        }
        else if(imt <= 30){
            kriteria = "gemuk";
        }
        else kriteria = "kegemukan";

        System.out.printf("%-10s= %.2f%20s %s", "IMT", imt, "Termasuk", kriteria);
    }
}
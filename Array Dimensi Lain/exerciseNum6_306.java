import java.util.Scanner;

public class exerciseNum6_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matriks1 = new double[3][3];
        double[][] matriks2 = new double[3][3];

        System.out.print("Masukkan matriks pertama (3x3): ");
        for(int i = 0; i < matriks1.length; i++){
            for(int j = 0; j < matriks1[i].length; j++){
                matriks1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Masukkan matriks kedua (3x3): ");
        for(int i = 0; i < matriks2.length; i++){
            for(int j = 0; j < matriks2[i].length; j++){
                matriks2[i][j] = scanner.nextDouble();
            }
        }
        double[][] perkalian = kalikanMatriks(matriks1, matriks2);
        //tampilkan matriks
        System.out.println("Perkalian dari kedua matriks tersebut adalah: ");
        for(int i = 0; i < matriks1.length; i++){
            for(int j = 0; j < matriks1[i].length; j++){
                System.out.printf("%.1f ", matriks1[i][j]);
            }
            if(i == 1) System.out.print("   *   ");
            else System.out.print("       ");
            for(int k = 0; k < matriks2[i].length; k++){
                System.out.printf("%.1f ", matriks2[i][k]);
            }
            if(i == 1) System.out.print("   =   ");
            else System.out.print("       ");
            for(int l = 0; l < perkalian[i].length; l++){
                System.out.printf("%.1f ", perkalian[i][l]);
            }
            System.out.println();
        }
    }
    public static double[][] kalikanMatriks(double[][] matriks1, double[][] matriks2){
        double[][] perkalian = new double[3][3];
        for(int baris = 0; baris < matriks1.length; baris++){
            for(int kolom = 0; kolom < matriks1[baris].length; kolom++){
                double penjumlahan = 0;
                for(int i = 0; i < matriks1[baris].length; i++){
                    penjumlahan += matriks1[baris][i] * matriks2[i][kolom];
                }
                perkalian[baris][kolom] = penjumlahan;
            }
        }
        return perkalian;
    }
}

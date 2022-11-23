import java.util.Scanner;

public class exerciseNum2_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        System.out.println("Masukkan matrix 4x4 baris per baris: ");
        for(int baris = 0; baris < matrix.length; baris++){
            for(int kolom = 0; kolom < matrix[baris].length; kolom++){
                matrix[baris][kolom] = scanner.nextDouble();
            }
        }
        System.out.printf("Jumlah semua elemen pada diagonal matriks adalah %.1f", sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
}

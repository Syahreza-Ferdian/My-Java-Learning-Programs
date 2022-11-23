import java.util.Scanner;

public class exerciseNum5_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Masukkan matrix 1 3x3: ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Masukkan matrix 2 3x3: ");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = scanner.nextDouble();
            }
        }
        double[][] jumlahMatriks = addMatrix(matrix1, matrix2);

        //tampilkan matriks
        System.out.println("Penjumlahan matriks tersebut adalah: ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                System.out.printf("%.1f ", matrix1[i][j]);
            }
            if(i == 1) System.out.print("  +   ");
            else System.out.print("      ");
            for(int k = 0; k < matrix2[i].length; k++){
                System.out.printf("%.1f ", matrix2[i][k]);
            }
            if(i == 1) System.out.print("  =   ");
            else System.out.print("      ");
            for(int l = 0; l < jumlahMatriks[i].length; l++){
                System.out.printf("%.1f ", jumlahMatriks[i][l]);
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] jumlah = new double[3][3];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                jumlah[i][j] = a[i][j] + b[i][j];
            }
        }
        return jumlah;
    }
}

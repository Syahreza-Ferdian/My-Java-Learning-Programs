import java.util.Scanner;

public class exerciseNum1_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        System.out.println("Masukkan elemen matiks 3x4 per baris: ");
        for(int baris = 0; baris < matrix.length; baris++){
            for(int kolom = 0; kolom < matrix[baris].length; kolom++){
                matrix[baris][kolom] = scanner.nextDouble();
            }
        }
        for(int i = 0; i < matrix.length; i++){
            System.out.printf("Jumlah semua elemen pada kolom %d adalah %.1f\n", i, sumColoumn(matrix, i));
        }
    }   
    public static double sumColoumn(double[][] m, int coloumnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][coloumnIndex];
        }
        return sum;
    }
}

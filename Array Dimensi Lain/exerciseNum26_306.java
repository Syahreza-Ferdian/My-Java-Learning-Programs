import java.util.Scanner;
public class exerciseNum26_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matriks = new double[3][3];
        System.out.println("Masukkan matriks 3x3 baris per baris:");
        for(int baris = 0; baris < matriks.length; baris ++){
            for(int kolom = 0; kolom < matriks[baris].length; kolom++){
                matriks[baris][kolom] = scanner.nextDouble();
            }
        }
        double[][] newArr = sortRows(matriks);
        System.out.println("Matriks yang telah diurutkan berdasarkan baris: ");
        for(int baris = 0; baris < newArr.length; baris++){
            for(int kolom = 0; kolom < newArr[baris].length; kolom++){
                System.out.printf("%s ", Double.toString(newArr[baris][kolom]));
            }
            System.out.println();
        }
    }
    public static double[][] sortRows(double[][] array){
        double[][] duplicateArr = new double[3][3];
        System.arraycopy(array, 0, duplicateArr, 0, array.length);

        for(int i = 0; i < duplicateArr.length; i++){
            double[] baris = new double[duplicateArr[i].length];
            for(int j = 0; j < duplicateArr[i].length; j++){
                baris[j] = duplicateArr[i][j];
            }
            duplicateArr[i] = sort(baris);
        }
        return duplicateArr;
    }
    public static double[] sort(double[] baris){
        for(int i = 0; i < baris.length - 1; i++){
            for(int j = 1; j < baris.length; j++){
                if(baris[j] < baris[i]){
                    double temp = baris[i];
                    baris[i] = baris[j];
                    baris[j] = temp;
                }
            }
        }
        return baris;
    }
}

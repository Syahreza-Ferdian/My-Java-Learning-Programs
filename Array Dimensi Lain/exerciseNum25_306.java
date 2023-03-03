import java.util.Scanner;
public class exerciseNum25_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matrix = new double [3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }
        if (isMarkovMatrix(matrix)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not markov matrix");
    }
    public static boolean isMarkovMatrix(double[][] array){
        boolean markov = true;
        for(int kolom = 0; kolom < array[0].length; kolom++){
            if(jumlahElemenKolom(array, kolom) != 1.0 && afakahPositif(array) == false) markov = false;
        }
        return markov;
    }
    public static boolean afakahPositif(double[][] array){
        boolean positif = true;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] < 0) positif = false;
            }
        }
        return positif;
    }
    public static int jumlahElemenKolom(double[][] array, int kolom){
        int jumlah = 0;
        for(int baris = 0; baris < array.length; baris++){
            jumlah += array[baris][kolom];
        }
        return jumlah;
    }
}

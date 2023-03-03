import java.util.Scanner;
public class exerciseNum13_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] array = new double[scanner.nextInt()][scanner.nextInt()];
        System.out.println("Enter the array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = scanner.nextDouble();
            }
        }
        int[] indexTerbesar = locateLargest(array);
        System.out.printf("The location of the largest element is at (%d, %d)", indexTerbesar[0], indexTerbesar[1]);
    }
    public static int[] locateLargest(double[][] array){
        int[] indexNilaiTerbesar = new int[2];
        double nilaiTerbesar = array[0][0];
        int row = 0, kolom = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array[i].length; j++){
                if(array[i][j] > nilaiTerbesar){
                    nilaiTerbesar = array[i][j];
                    row = i;
                    kolom = j;
                }
            }
        }
        indexNilaiTerbesar[0] = row;
        indexNilaiTerbesar[1] = kolom;
        return indexNilaiTerbesar;
    }
}

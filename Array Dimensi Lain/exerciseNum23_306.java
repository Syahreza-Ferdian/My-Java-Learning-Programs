import java.util.Scanner;
public class exerciseNum23_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriks = new int[6][6];
        for(int baris = 0; baris < matriks.length; baris++){
            for(int kolom = 0; kolom < matriks[baris].length; kolom++){
                matriks[baris][kolom] = scanner.nextInt();
            }
        }

        int baris = barisGanjil(matriks);
        int kolom = kolomGanjil(matriks);

        System.out.printf("The flipped cell is at (%d, %d)", baris, kolom);
    }
    public static int kolomGanjil(int[][] array){
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array[i].length; j++){
                if(array[j][i] == 1){
                    count++;
                }
            }
            if(count %2 == 1){
                return i;
            }
        }
        return -1;
    }
    public static int barisGanjil(int[][] array){
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == 1){
                    count++;
                }
            }
            if(count %2 == 1){
                return i;
            }
        }
        return -1;
    }
}

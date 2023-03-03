import java.util.Scanner;

public class exerciseNum14_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix: ");
        int n = scanner.nextInt();
        int[][] matriks = new int[n][n];
        System.out.println("Masukkan matriks: ");
        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[i].length; j++){
                // matriks[i][j] = (int)(Math.random()*2);
                matriks[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[i].length; j++){
                System.out.printf("%d", matriks[i][j]);
            }
            System.out.println();
        }
        System.out.println(sameDiagonalSekunder(matriks, n));
        System.out.println(sameDiagonalPrimer(matriks, n));
    }   
    public static boolean allZeroRow(int[][] array, int baris){
        boolean allZero = true;
        for(int kolom = 0; kolom < array[baris].length; kolom++){
            if(array[baris][kolom] != 0) allZero = false;
        }
        return allZero;
    }
    public static boolean allOneRow(int[][] array, int baris){
        boolean allOne = true;
        for(int kolom = 0; kolom < array[baris].length; kolom++){
            if(array[baris][kolom] != 1) allOne = false;
        }
        return allOne;
    }
    public static boolean allZeroKolom(int[][] array, int kolom){
        boolean allZero = true;
        for(int baris = 0; baris < array.length; baris++){
            if(array[baris][kolom] != 0) allZero = false;
        }
        return allZero;
    }
    public static boolean allOneKolom(int[][] array, int kolom){
        boolean allOne = true;
        for(int baris = 0; baris < array.length; baris++){
            if(array[baris][kolom] != 1) allOne = false;
        }
        return allOne;
    }
    public static boolean sameDiagonalPrimer(int[][] array, int size){
        boolean afakahSama = true;
        int count = 0;
        while(count < size - 1){
            for(int i = 0; i < array.length; i++){
                if(count == size - 1) break;
                for(int j = 1; j < array.length; j++){
                    if(array[i][count] != array[j][count+1]){
                        afakahSama = false;
                        break;
                    }
                }
                count++;
            }
        }
        return afakahSama;
    }
    public static boolean sameDiagonalSekunder(int[][] array, int size){
        boolean afakahSama = true;
        int count = size - 1;
        while(count > 1){
            for(int i = 0; i < array.length; i++){
                if(count == 0) break;
                for(int j = 1; j < array.length; j++){
                    if(array[j][count-1] != array[i][count]){
                        afakahSama = false;
                        break;
                    }
                }
                count--;
            }
        }
        return afakahSama;
    }
}

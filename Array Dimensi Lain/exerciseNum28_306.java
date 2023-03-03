import java.util.Scanner;
public class exerciseNum28_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriks1 = new int[3][3];
        int[][] matriks2 = new int[3][3];
        System.out.print("Masukkan matriks pertama: ");
        for(int i = 0; i < matriks1.length; i++){
            for(int j = 0; j < matriks1[i].length; j++){
                matriks1[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Masukkan matriks kedua: ");
        for(int i = 0; i < matriks2.length; i++){
            for(int j = 0; j < matriks2[i].length; j++){
                matriks2[i][j] = scanner.nextInt();
            }
        }
        if (equals(matriks1, matriks2)) System.out.println("Kedua matriks tersebut sama persis");
        else System.out.println("Kedua matriks tersebut tidak sama persis");
    }
    public static boolean equals(int[][] array1, int[][] array2){
        boolean afakahSama = true;
        for(int i = 0; i < array1. length; i++){
            for(int j = 0; j < array1.length; j++){
                if(array1[i][j] != array2[i][j]){
                    afakahSama = false;
                }
            }
        }
        return afakahSama;
    }
}

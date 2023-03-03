import java.util.Scanner;
public class exerciseNum29_306 {
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
        System.out.println(equals(matriks1, matriks2));
    }   
    public static boolean equals(int[][] array1, int[][] array2){
        int indexYgDiSkip[] = {-1,-1};
        int count = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                for(int k = 0; k < array2.length; k++){
                    for(int l = 0; l < array2[k].length; l++){
                        if(array1[i][j] == array2[k][l]  && l != indexYgDiSkip[1]){
                            indexYgDiSkip[1] = l;
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        boolean sama = (count < array1.length * array1[0].length)?true:false;
        return sama;
    }
}
/*
51 25 22   51 22 25
6   1  4   6   1  4
24 54  6   24 54  6
 */
import java.util.Arrays;
import java.util.Scanner;
public class buatNgetest4 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //bilangan ganjil dari 11 sampai 188 menggunakan for, while, do-while loops
        // for(int i = 11; i <= 188; i++){
        //     if(i % 2 == 1){
        //         System.out.printf("%d ", i);
        //     }
        // }
        
        // int i = 11;
        // while(i <= 188){
        //     if(i % 2 == 1){
        //         System.out.printf("%d ", i);
        //     }
        //     i++;
        // }
        // int i = 11;
        // do {
        //     if(i % 2 == 1) System.out.printf("%d ", i);
        //     i++;
        // } while (i <= 188);
        
        // System.out.print("Masukkan ukuran pattern: ");
        // int n = scanner.nextInt();
        // for(int i = 1; i <= n; i ++){
        //     for(int j = n; j >= i; j--){
        //         System.out.printf("* ");
        //     }
        //     System.out.println();
        // }
        // String kalimat = "Hello World";
        // if(kalimat.indexOf(" ") > -1){
        //     System.out.println(kalimat.substring(0, kalimat.indexOf(' ')));
        // }
        // else System.out.println(kalimat);
        
        //SORT ARRAY PROGRAM:
        // for(int i = 0; i < array.length; i++){
        //     for(int j = i + 1; j < array.length; j++){
        //         int temp = 0;
        //         if(array[i] > array[j]){
        //             temp = array[i];
        //             array[i] = array[j];
        //             array[j] = temp;
        //         }
        //     }
        //     System.out.printf("%d ", array[i]);
        // }
        
        // int[][] arry = {{1,0}, 
        //                 {4,1}, 
        //                 {6,2},
        //                 {5,3}, 
        //                 {3,4}};
        // int[][] duplicate = new int[arry.length][arry[0].length];
        // System.arraycopy(arry, 0, duplicate, 0, arry.length);
        // // 6 2
        // // 5 3
        // // 4 1
        // // 3 4
        // // 1 0
        // sortMulti(arry, 1);
        // for(int i = 0; i < arry.length; i++){
        //     for(int j = 0; j < duplicate.length; j++){
        //         if(arry[i][1] == duplicate[j][0]) System.out.println(j);
        //     }
        //     // System.out.print(arry[i][1]);
        // }
        int[] array = {5, 1, 3, 4};
        urutkan(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void sortMulti(int[][] array, int kolom){
        for(int baris = 0; baris < array.length; baris++){
            for(int j = baris + 1; j < array.length; j++){
                int temp = 0;
                if(array[j][kolom] > array[baris][kolom]){
                    temp = array[baris][kolom];
                    array[baris][kolom] = array[j][kolom];
                    array[j][kolom] = temp;
                }
            }
        }
    }
    public static void urutkan(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

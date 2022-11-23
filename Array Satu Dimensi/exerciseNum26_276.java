import java.util.Scanner;

public class exerciseNum26_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan array pertama\n(angka pertama menandakan jumlah elemen array (tidak termasuk angka tersebut!)): ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for(int i = 0; i < array1.length; i++){
            array1[i] = scanner.nextInt();
        }
        System.out.print("Masukkan array kedua\n(angka pertama menandakan jumlah elemen array (tidak termasuk angka tersebut!)): ");
        n = scanner.nextInt();
        int[] array2 = new int[n];
        for(int i = 0; i < array2.length; i++){
            array2[i] = scanner.nextInt();
        }
        if(equals(array1, array2)) System.out.printf("Dua array tersebut sama persis");
        else System.out.printf("Dua array tersebut tidak sama persis");
    }
    public static boolean equals(int[] array1, int[] array2){
        boolean isEquals = true;
        for(int i = 0; i < array1.length && i < array2.length; i++){
            if(array1[i] == array2[i]) isEquals = true;
            else isEquals = false;
        }
        return isEquals;
    }   
}

import java.util.Scanner;
public class exerciseNum27_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan array pertama (dalam integer)\nAngka pertama menandakan jumlah elemen array: ");
        int[] array1 = new int[scanner.nextInt()];
        for(int i = 0; i < array1.length; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.print("Masukkan array kedua (dalam integer)\nAngka pertama menandakan jumlah elemen array: ");
        int[] array2 = new int[scanner.nextInt()];
        for(int i = 0; i < array2. length; i++){
            array2[i] = scanner.nextInt();
        }
        if(equals(array1, array2)) System.out.print("Kedua array tersebut identik");
        else System.out.print("Kedua array tersebut tidak identik");
    }
    public static boolean equals(int[] array1, int[] array2){
        int indexYgDiSkip = -1;
        int count = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j] && j != indexYgDiSkip){
                    indexYgDiSkip = j;
                    count++;
                    break;
                }
            }
        }
        boolean isEquals = (count == array1.length)?true:false;
        return isEquals;
    }
}
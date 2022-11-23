import java.util.*;

public class exerciseNum31_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Masukkan array pertama dalam integer: ");
        int[] a = new int[scanner.nextInt()];
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        System.out.printf("Masukkan array kedua dalam integer: ");
        int[] b = new int[scanner.nextInt()];
        for(int i = 0; i < b.length; i++){
            b[i] = scanner.nextInt();
        }
        int[] gabung = merge(a, b);
        urutkan(gabung);
        System.out.print("Array yang telah digabungkan dan diurutkan adalah: ");
        for(int i = 0; i < gabung.length; i++){
            System.out.printf("%d ", gabung[i]);
        }
    }
    public static int[] merge(int[] array1, int[] array2){
        int[] merge = new int[array1.length + array2.length];
        int i = 0, k= 0;
        for(i = 0; i < array1.length; i++){
            merge[i] = array1[i];
        }
        for(int j = i; j < i + array2.length; j++){
            merge[j] = array2[k];
            k++;
        }
        return merge;
    }
    public static void urutkan(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int minimum = array[i];
            int indexNilaiMinimum = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < minimum){
                    minimum = array[j];
                    indexNilaiMinimum = j;
                }
            }
            if(indexNilaiMinimum != i){
                array[indexNilaiMinimum] = array[i];
                array[i] = minimum;
            }
        }
    }
}

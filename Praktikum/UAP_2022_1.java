package Praktikum;
import java.io.*;
import java.util.*;

public class UAP_2022_1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int jmlPenumpang = in.nextInt();
        int jmlBus = in.nextInt();
        int[] kursiKosongBus = new int[jmlBus];
        for(int i = 0; i < kursiKosongBus.length; i++){
            kursiKosongBus[i] = in.nextInt();
        }
        int[] duplicateArr = new int[kursiKosongBus.length];
        System.arraycopy(kursiKosongBus, 0, duplicateArr, 0, kursiKosongBus.length);
        System.out.printf("%d %d", hargaMaksimal(kursiKosongBus, jmlPenumpang), hargaMinimal(duplicateArr, jmlPenumpang));
    }
    public static int hargaMaksimal(int[] dataBus, int jmlPenumpang){
        int harga = 0;
        int count = 0;
        while(count < jmlPenumpang){
            urutkan(dataBus);
            harga += dataBus[dataBus.length-1];
            dataBus[dataBus.length - 1]--;
            count++;
        }

        return harga;
    }
    public static int hargaMinimal(int[] dataBus, int jmlPenumpang){
        int count = 0;
        int harga = 0;
        while(count < jmlPenumpang){
            urutkan(dataBus);
            for(int i = 0; i < dataBus.length; i++){
                if(dataBus[i] > 0){
                    harga += dataBus[i];
                    dataBus[i]--;
                    break;
                }
            }
            count++;
        }
        return harga;
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
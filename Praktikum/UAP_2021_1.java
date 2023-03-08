package Praktikum;
import java.io.*;
import java.util.*;

public class UAP_2021_1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int total = input.nextInt();
       int aktif = input.nextInt();
       int range = input.nextInt();
       final int HALAMAN_MINIMAL = 1, HALAMAN_MAKSIMAL = total;
       if(aktif > HALAMAN_MINIMAL) System.out.print("Prev ");
       int output[] = new int[range + 1];
       int j = aktif + 1;
       int k = aktif;
       for(int i = 0; i <= range; i++){
            if(aktif == HALAMAN_MINIMAL){
                output[i] = aktif + i;
            }
            else if(aktif == HALAMAN_MAKSIMAL){
                output[i] = aktif - i;
            }
            else if(aktif + range/2 > HALAMAN_MAKSIMAL){
                output[i] = total;
                total--;
            }
            else{
                if(i % 2 == 0){
                    output[i] = aktif;
                    aktif--;
                }
                else if (i %2 == 1){
                    output[i] = j;
                    j++;
                }
            }
       }
       urutkan(output);
       for (int i : output) {
            System.out.printf("%d ", i);
       }
       if(aktif < HALAMAN_MAKSIMAL) System.out.print("Next");
    }
    public static void urutkan(int[] array){
        for(int i = 0; i < array.length; i++){
            int temp = 0;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}

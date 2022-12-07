import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int[][] data = new int[5][5];
        for(int baris = 0; baris < data.length; baris++){
            for(int kolom = 0; kolom < data[baris].length; kolom++){
                data[baris][kolom] = input.nextInt();
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.printf("Jumlah row-%d: %d\n", i+1, cariJumlahPerRow(data, i));
        }
        System.out.println();
        for(int i = 0; i < data.length; i++){
            System.out.printf("Angka Terbesar row-%d: %d\n", i+1, cariMaksimalPerRow(data, i));
        }
        
    }
    public static int cariJumlahPerRow(int[][] array, int baris){
        int jumlah = 0;
        for(int kolom = 0; kolom < array[baris].length; kolom++){
            jumlah += array[baris][kolom];
        }
        return jumlah;
    }
    public static int cariMaksimalPerRow(int[][] array, int baris){
        int maksimal = array[baris][0];
        for(int kolom = 1; kolom < array[baris].length; kolom++){
            if(array[baris][kolom] > maksimal) maksimal = array[baris][kolom];
        }
        return maksimal;
    }
}

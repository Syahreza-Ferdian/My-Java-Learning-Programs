package Praktikum;
import java.util.*;

public class UAP_2021_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputan = input.nextLine();
        char[] convert = inputan.toCharArray();
        int ascii[] = new int[convert.length];
        for(int i = 0; i < ascii.length; i++){
            ascii[i] = getAsciiNumber(convert[i]);
        }
        sort(ascii);
        solve(ascii, inputan);
    }
    public static int getAsciiNumber(char c){
        return (int)c;
    }
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp = 0;
                if(array[j] < array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
    public static void solve(int[] array, String kalimat){
        int current = array[0];
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (current == array[i] && !found) {
                found = true;
            } else if (current != array[i]) {
                System.out.printf("%c: %d\n", (char)current, getOccurence(kalimat, (char)current));
                current = array[i];
                found = false;
            }
        }
        System.out.printf("%c: %d\n", (char)current, getOccurence(kalimat, (char)current));
    }
    public static int getOccurence(String kalimat, char key){
        int count = 0;
        char[] konvert = kalimat.toCharArray();
        for(int i = 0; i < konvert.length; i++){
            if(key == konvert[i]) count++;
        }
        return count;
    }
}

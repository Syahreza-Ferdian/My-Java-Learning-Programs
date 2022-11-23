import java.util.Scanner;

public class exerciseNum3_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] bilangan = new int[100];
        System.out.print("Masukkan bilangan integer dari 1 sampai 100 (input berhenti jika memasukkan angka 0): ");
        for(int i = 0; i < 100; i++){
            bilangan[i] = scanner.nextInt();
            if(bilangan[i] == 0) break;
        }
        for(int i = 1; i < 100; i++){ //loop angka
            int sudahTampil;
            for(int j = 0; j < 100; j++){ //loop index
                if(i == bilangan[j]){
                    hitung(bilangan, i);
                    sudahTampil = i;
                    if(bilangan[j] == sudahTampil) break;
                }
            }
        }
    }
    public static void hitung(int[] array, int x){
        int hitung = 0;
        for(int i = 0; i < array.length; i++){
            if(x == array[i]) hitung++;
        }
        if(hitung == 1) System.out.printf("Bilangan %d muncul sebanyak %d time\n", x, hitung);
        else System.out.printf("Bilangan %d muncul sebanyak %d times\n", x, hitung);
        
    }
}

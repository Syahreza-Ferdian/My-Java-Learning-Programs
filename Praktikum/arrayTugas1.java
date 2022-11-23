package Praktikum;
import java.util.Scanner;

public class arrayTugas1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihanUser;
        int[] data = new int[100];
        do {
            System.out.println("\nPilihan program: ");
            System.out.println("1. Input Data\n2. Lihat Data\n3. Average\n4. Sum\n5. Max\n6. Min\n7. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihanUser = scanner.nextInt();
            
            switch(pilihanUser){
                case 1: {
                    data = inputData(); 
                    System.out.println("Data telah berhasil di-inputkan");
                    break;
                }
                case 2: {
                    if(afakahKosong(data)) System.out.println("ERROR: Anda belum memasukkan data! Pilih 1 untuk memasukkan data\n");
                    else tampilkanData(data);
                    break;
                }
                case 3: {
                    if(afakahKosong(data)) System.out.println("ERROR: Anda belum memasukkan data! Pilih 1 untuk memasukkan data\n");
                    else System.out.printf("Rata-rata dari data tersebut adalah %.3f\n", (double)hitungJumlah(data)/data.length);
                    break;
                }
                case 4: {
                    if(afakahKosong(data)) System.out.println("ERROR: Anda belum memasukkan data! Pilih 1 untuk memasukkan data\n");
                    else System.out.printf("Jumlah semua data adalah %d\n", hitungJumlah(data));
                    break;
                }
                case 5: {
                    if(afakahKosong(data)) System.out.println("ERROR: Anda belum memasukkan data! Pilih 1 untuk memasukkan data\n");
                    else cariMinimalMaksimal(data, "Maksimal");
                    break;
                }
                case 6: {
                    if(afakahKosong(data)) System.out.println("ERROR: Anda belum memasukkan data! Pilih 1 untuk memasukkan data\n");
                    else cariMinimalMaksimal(data, "Minimal");
                    break;
                }
                default:{
                    if(pilihanUser != 7) System.out.println("ERROR: Harap masukkan pilihan yang benar sesuai menu!");
                    break;
                }
            }
        } while (pilihanUser != 7);
        System.out.println("USERINFO: Program berhenti.");
    }
    public static boolean afakahKosong(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0) count++;
        }
        boolean kosong = (count == array.length)?true:false;
        return kosong;
    }
    public static int[] inputData(){
        System.out.print("Masukkan jumlah data: ");
        int[] data = new int[scanner.nextInt()];

        System.out.print("Inputkan data dalam bentuk integer: ");
        for(int i = 0; i < data.length; i++){
            data[i] = scanner.nextInt();
        }
        return data;
    }
    public static void tampilkanData(int[] array){
        System.out.print("Data yang anda inputkan adalah: ");
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
    public static int hitungJumlah(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void cariMinimalMaksimal(int[] array, String pilihan){
        if(pilihan.equalsIgnoreCase("Minimal")){
            int minimal = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] < minimal) minimal = array[i];
            }
            System.out.printf("Nilai minimal pada data tersebut adalah %d\n", minimal);
        }
        else if(pilihan.equalsIgnoreCase("Maksimal")){
            int maksimal = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] > maksimal) maksimal = array[i];
            }
            System.out.printf("Nilai maksimal pada data tersebut adalah %d\n", maksimal);
        }
    }
}

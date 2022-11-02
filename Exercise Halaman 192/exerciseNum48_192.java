import java.util.Scanner;

public class exerciseNum48_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String hasil = "";
        System.out.println("Karakter pada posisi ganjil di kalimat tersebut adalah: ");
        for(int i = 0; i < kalimat.length(); i++){
            if(i % 2 == 0){
                hasil += kalimat.substring(i, i+1);
            }
        }
        System.out.printf("%s", hasil);
    }
}
/*
Beijing Chicago
123456789012345
0123456789
 */
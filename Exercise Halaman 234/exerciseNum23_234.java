import java.util.Scanner;

public class exerciseNum23_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah string: ");
        String kalimat = scanner.nextLine();
        System.out.print("Masukkan karakte yang ingin dihitung: ");
        char karakter = scanner.nextLine().charAt(0);
        System.out.printf("Jumlah karakter %s pada kalimat tersebut adalah: %d", karakter, count(kalimat, karakter));
    }
    public static int count(String str, char a){
        int hitung = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                hitung++;
            }
        }
        return hitung;
    }
}

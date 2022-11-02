import java.util.Scanner;

public class exerciseNum49_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String huruf;
        int countVokal = 0, countKonsonan = 0;
        for(int i = 0; i < kalimat.length(); i++){
            huruf = kalimat.substring(i, i+1);
            if(huruf.equalsIgnoreCase("A")||huruf.equalsIgnoreCase("I")||huruf.equalsIgnoreCase("U")
            ||huruf.equalsIgnoreCase("E")||huruf.equalsIgnoreCase("O")){
                countVokal++;
            }
            else if(huruf.equals(" ")) continue;
            else countKonsonan++;
        }
        System.out.printf("Banyaknya huruf vokal pada kalimat tersebut adalah %d\n", countVokal);
        System.out.printf("Banyaknya huruf konsonan pada kalimat tersebut adalah %d\n", countKonsonan);
    }    
}

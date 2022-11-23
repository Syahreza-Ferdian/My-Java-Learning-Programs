import java.util.Scanner;
public class exerciseNum34_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan beberapa huruf acak: ");
        String karakterInput = scanner.nextLine();
        System.out.printf("Urutan alfabetis dari huruf tersebut adalah: %s", sort(karakterInput));
    }
    public static String sort(String s){
        char[] konversi = new char[s.length()];
        String hasil = "";
        for(int i = 0; i < s.length(); i++){
            konversi[i] = s.charAt(i);
        }
        for(int i = 0; i < konversi.length; i++){
            for(int j = i+1; j < konversi.length; j++){
                char temp = ' ';
                if(konversi[j] < konversi[i]){ //bila konversi[j] lebih kecil dari konversi[i], maka tukar keduanya
                    temp = konversi[i];
                    konversi[i] = konversi[j];
                    konversi[j] = temp;
                }
            }
            hasil += konversi[i];
        }
        return hasil;
    }
}

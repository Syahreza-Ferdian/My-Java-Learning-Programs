import java.util.Scanner;

public class exerciseNum18_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Kriteria Password: ");
        System.out.println("1. Harus terdiri dari minimal 8 karakter.\n2. Hanya boleh mengandung huruf(A-Z/a-z) dan angka(0-9)\n3. Harus terdiri dari setidaknya 2 digit angka.");
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        afakahValdi(password);
    }
    public static void afakahValdi(String password){
        boolean hasil = true;
        int countDigit = 0;
        if(password.length() >= 8){
            for(int i = 0; i < password.length(); i++){
                int perKarakter = (int)(password.charAt(i));
                if(perKarakter >= 48 && perKarakter <= 57) countDigit ++;
                if((perKarakter >= 48 && perKarakter <= 57)
                ||(perKarakter >= 65 && perKarakter <= 90)
                ||(perKarakter >= 97 && perKarakter <= 122)){
                    if(countDigit >= 2) hasil = true;
                    else hasil = false;
                }
                else{
                    hasil = false;
                    break;
                }
            }
        }
        else hasil = false;

        if(hasil == true) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }
}

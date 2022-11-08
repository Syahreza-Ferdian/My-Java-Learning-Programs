import java.util.Scanner;

public class exerciseNum3_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sebuah angka integer: ");
        int bilangan = scanner.nextInt();
        isPalindrome(bilangan);
        
        if(isPalindrome(bilangan)) System.out.println("Bilangan tersebut adalah bilangan Palindrome");
        else System.out.println("Bilangan tersebut bukan bilangan Palindrome");

    }
    public static int reverse(int angka){
        String konversi = String.valueOf(angka);
        String hasil = "";
        int reverse = 0;
        for(int i = 0; i < konversi.length(); i++){
            String digits = konversi.substring(i, i+1);
            hasil = digits + hasil;
        }
        reverse = Integer.parseInt(hasil);
        return reverse;
    }
    public static boolean isPalindrome(int angka){
        boolean cekPalindrome;
        if(angka == reverse(angka)) cekPalindrome = true;
        else cekPalindrome = false;
        return cekPalindrome;
    }
}

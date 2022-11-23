public class exerciseNum26_234 {
    public static void main(String[] args) {
        System.out.println("Palindromic Prime adalah bilangan prima yang juga palindrome\nBerikut ini adalah 100 bilangan Palindrome yang pertama: ");
        int countDisplay = 0;
        int i = 2;
        while (countDisplay < 100) {
            if(afakahPrima(i) && afakahPalindrome(i)){
                countDisplay++;
                System.out.printf("%d ", i);
                if(countDisplay % 10 == 0) System.out.println();
            } 
            i++;
        }
    }   
    public static boolean afakahPrima(int angka){
        int hitung = 0;
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0) hitung++;
        }
        boolean cekPrima = (hitung == 2)?true:false;
        return cekPrima;
    }
    public static boolean afakahPalindrome(int angka){
        String konversi = String.valueOf(angka);
        String reverse = "";
        for(int i = konversi.length(); i >= 1; i--){
            reverse += konversi.substring(i - 1, i);
        }
        boolean cekPalindrome = (konversi.equals(reverse))?true:false;
        return cekPalindrome;
    }
}

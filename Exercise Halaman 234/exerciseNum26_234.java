public class exerciseNum26_234 {
    public static void main(String[] args) {
        System.out.println("Palindromic Prime adalah bilangan prima yang juga palindrome\nBerikut ini adalah 100 bilangan Palindrome yang pertama: ");
        int tampil = 0;
        int i = 2; 
        while (tampil < 100) {
            if(afakahPrima(i) && afakahPalindrome(i)){
                tampil++;
                System.out.printf("%d ", i);
                if(tampil % 10 == 0) System.out.println();
            } 
            i++;
        }
    }   
    public static boolean afakahPrima(int angka){
        for(int i = 2; i <= angka/2; i++){
            if(angka % i == 0) return false;
        }
        return true;
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

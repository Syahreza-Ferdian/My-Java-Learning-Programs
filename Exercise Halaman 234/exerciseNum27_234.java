public class exerciseNum27_234 {
    public static void main(String[] args) {
        int countDisplay = 0;
        int i = 2;
        while(countDisplay < 100){
            if(afakahPalindrome(i, reverseNumber(i))==false && afakahPrima(i)==true && afakahPrima(reverseNumber(i))==true){
                countDisplay++;
                System.out.printf("%d ", i);
                if(countDisplay % 10 == 0) System.out.println();
            }
            i++;
        }
    }
    public static boolean afakahPalindrome(int angka, int reverse){
        String konversi = String.valueOf(angka);
        boolean palindrome = (String.valueOf(reverse).equals(konversi))?true:false;
        return palindrome;
    }
    public static boolean afakahPrima(int angka){
        int count = 0;
        for(int i = 1; i <= angka; i++){
            if(angka % i == 0) count++;
        }
        boolean cekPrima = (count == 2)?true:false;
        return cekPrima;
    }
    public static int reverseNumber(int angka){
        String konversi = String.valueOf(angka);
        String reverse = "";
        for(int i = konversi.length(); i >= 1; i--){
            reverse += konversi. substring(i-1, i);
        }
        return Integer.parseInt(reverse);
    }
}

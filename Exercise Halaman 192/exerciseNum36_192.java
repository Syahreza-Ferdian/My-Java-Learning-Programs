import java.util.Scanner;

public class exerciseNum36_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = scanner.nextLine();
        String digitTerakhir = "";
        int jumlah = 0, digitISBN, checksum;
        for(int i = 1; i <= 9; i++){
            digitISBN = Integer.parseInt(isbn.substring(i-1, i));
            jumlah += digitISBN * i;
        }
        checksum = jumlah % 11;
        
        if(checksum == 10) digitTerakhir = "X";
        else digitTerakhir = String.valueOf(checksum);

        System.out.printf("The ISBN-10 number is %s%s", isbn, digitTerakhir);
    }
}

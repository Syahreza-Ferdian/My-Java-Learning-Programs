import java.util.Scanner;

public class exerciseNum47_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String isbn, digitTerakhir = "";
        int jumlah = 0, konversi, checksum;
        System.out.print("Enter the first 12 digits of an ISBN-13: ");
        isbn = scanner.nextLine();
        if(isbn.length() < 12){
            System.out.printf("%s is an invalid input!", isbn);
        }
        else {
            for(int i = 0; i < isbn.length(); i++){
                if(i % 2 == 0){
                    konversi = Integer.parseInt(isbn.substring(i, i+1));
                    jumlah += konversi;
                }
                if(i % 2 == 1){
                    konversi = Integer.parseInt(isbn.substring(i, i+1));
                    jumlah += 3*konversi;
                }
            }
            checksum = 10 - (jumlah % 10);
            if(checksum == 10) digitTerakhir = "0";
            else digitTerakhir = String.valueOf(checksum);
            System.out.printf("The ISBN-13 number is %s%s", isbn, digitTerakhir);
        }
    }   
}
/*
123456
012345

digit genap dikali 3
 */
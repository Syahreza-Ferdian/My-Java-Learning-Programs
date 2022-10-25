import java.util.Scanner;

public class exerciseNum9_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String isbn;
        String digit10;
        System.out.print("Enter the first 9 digit of an ISBN as integer: ");
        isbn = scanner.nextLine();

        int digit[] = new int[10];
        for (int i = 1; i<=9; i++){
            digit[i] = Integer.valueOf(isbn.substring((i-1), i));
        }
        int checksum = (digit[1]*1 + digit[2]*2 + digit[3]*3 + digit[4]*4 + digit[5]*5 + digit[6]*6 + digit[7]*7
                            +digit[8]*8 + digit[9]*9)%11;
        
        if(checksum == 10){
            digit10 = "X";
        }
        else digit10 = String.valueOf(checksum);

        System.out.printf("The ISBN-10 number is %s%s", isbn, digit10);
    }
    
}
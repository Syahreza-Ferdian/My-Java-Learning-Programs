import java.util.Scanner;

public class exerciseNum21_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan nomor telepon: ");
        String noTelp = scanner.nextLine();
        String output = "";
        for(int i = 0; i < noTelp.length(); i++){
            if(((int)noTelp.charAt(i) >= 48 && (int)noTelp.charAt(i) <= 57) || noTelp.charAt(i) == '-'){
                output += noTelp.charAt(i);
            }
            else{
                output += String.valueOf(getNumber(Character.toUpperCase(noTelp.charAt(i))));
            }
        }
        System.out.printf("%s", output);
    }
    public static int getNumber(char letter){
        int num = 0;

        if(letter == 'A' || letter == 'B' || letter == 'C') num = 2;
        else if(letter == 'D'||letter == 'E'||letter == 'F') num = 3;
        else if(letter == 'G'||letter == 'H'||letter == 'I') num = 4;
        else if(letter == 'J'||letter == 'K'||letter == 'L') num = 5;
        else if(letter == 'M'||letter == 'N'||letter == 'O') num = 6;
        else if(letter == 'P'||letter == 'Q'||letter == 'R'||letter == 'S') num = 7;
        else if(letter == 'T'||letter == 'U'||letter == 'V') num = 8;
        else if(letter == 'W'||letter == 'X'||letter == 'Y'||letter == 'Z') num = 9;

        return num;
    }
}

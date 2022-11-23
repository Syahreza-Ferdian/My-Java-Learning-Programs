import java.util.Scanner;

public class exerciseNum46_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String perKarakter, hasil = "";
        int panjangInput = input.length();

        for(int i = 0; i < panjangInput; i++){
            perKarakter = input.substring(i, i+1);
            hasil = perKarakter + hasil;
        }
        System.out.printf("The reversed string is %s", hasil);
    }
}

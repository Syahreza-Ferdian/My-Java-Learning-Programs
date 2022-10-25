import java.util.Scanner;

public class exerciseNum12_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a three-digit integer: ");
        String bilangan = scanner.nextLine();
        int digit1 = Integer.valueOf(bilangan.substring(0,1));
        int digit3 = Integer.valueOf(bilangan.substring(2,3));

        if(digit1 == digit3){
            System.out.printf("%s is a palindrome", bilangan);
        }
        else System.out.printf("%s is not a palindrome", bilangan);
    }
}

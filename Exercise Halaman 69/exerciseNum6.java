import java.util.Scanner;

public class exerciseNum6 {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        int bilangan, jumlah, digit1, digit2, digit3;

        System.out.println("===========[ SUM THE DIGITS IN AN INTEGER ]==========");
        System.out.print("This program will reads an integer between 0 to 1000");
        System.out.println(" and adds all the digits in that integer.");
        System.out.println("");
        System.out.print("Enter a number between 0 and 1000: ");
        bilangan = scanner.nextInt();

        digit1 = (bilangan/100) % 10;
        digit2 = (bilangan/10) % 10;
        digit3 = bilangan % 10;
        jumlah = digit1 + digit2 + digit3;

        if (bilangan <= 0 || bilangan >= 1000) {
            System.out.println("ERROR: The entered number must be between 0 and 1000!");
        }
        else System.out.printf("The sum of all the digits in %d is %d.", bilangan, jumlah);

    }
}

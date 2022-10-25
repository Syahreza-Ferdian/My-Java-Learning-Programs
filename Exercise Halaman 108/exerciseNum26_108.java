import java.util.Scanner;

public class exerciseNum26_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bilangan;
        System.out.printf("%-20s: ", "Enter an integer");
        bilangan = scanner.nextInt();

        boolean isDivisibleBy5And6 = bilangan % 5 == 0 && bilangan % 6 == 0;
        boolean isDivisibleBy5Or6 = bilangan % 5 == 0 && bilangan % 6 == 0;
        boolean isDivisibleBy5Or6ButNotBoth = bilangan % 5 == 0 ^ bilangan % 6 == 0;

        System.out.printf("Is %d divisible by 5 and 6? %s", bilangan, isDivisibleBy5And6);
        System.out.printf("\nIs %d divisible by 5 or 6? %s", bilangan, isDivisibleBy5Or6);
        System.out.printf("\nIs %d divisible by 5 or 6, but not both? %s", bilangan, isDivisibleBy5Or6ButNotBoth);
    
    }

}
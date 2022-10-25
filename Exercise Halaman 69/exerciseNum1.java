import java.util.Scanner;

public class exerciseNum1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double celcius, fahrenheit;
        System.out.println("----- CONVERT CELCIUS TO FAHRENHEIT -----");
        System.out.print("Enter a degree in celcius: ");
        celcius = scanner.nextDouble();
        fahrenheit = ((double) 9/5 * celcius) + 32;

        System.out.printf("%s celcius is %s fahrenheit.", Double.toString(celcius), Double.toString(fahrenheit));
    }
}

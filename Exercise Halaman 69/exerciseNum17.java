import java.util.Scanner;

public class exerciseNum17 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("====[ WIND-CHILL TEMPERATURE ]====");    
        compute();
    }
    public static void compute(){
        double temp, windSpeed, windChill;
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        temp = scanner.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        windSpeed = scanner.nextDouble();

        windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));

        if (temp <= -58 || temp >= 41) {
            System.out.println("ERROR: Temperature must be between -58F and 41F! TRY AGAIN BELOW!");
            if (windSpeed <= 2){
                System.out.println("ERROR: The wind speed inputted must be above 2mph! TRY AGAIN BELOW!");
                System.out.println(" ");
                compute();
            }
            System.out.println(" ");
            compute();
        }
        if (windSpeed <= 2){
            System.out.println("ERROR: The wind speed inputted must be above 2mph! TRY AGAIN BELOW!");
            System.out.println(" ");
            compute();
        }
        else System.out.printf("The wind chill index is %.5f", windChill);
    }
}
import java.util.Scanner;

public class exerciseNum8 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----- PROGRAM THAT DISPAYS CURRENT TIME -----");
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZoneOffset = scanner.nextInt();
        long totalMilliSeconds = System.currentTimeMillis(); 
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24 + timeZoneOffset;

        System.out.printf("Current time is %d:%d:%d \n", currentHour, currentMinute, currentSecond);
        /*System.out.println(totalMilliSeconds);
        System.out.println(totalSeconds);
        System.out.println(currentSecond);*/
    }
}

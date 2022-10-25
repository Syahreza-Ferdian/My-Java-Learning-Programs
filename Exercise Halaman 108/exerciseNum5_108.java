import java.util.Scanner;

public class exerciseNum5_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int today, daysElapsed, futureDay;
        System.out.print("Enter today's day (Sunday is 0, Monday is 1, etc): ");
        today = scanner.nextInt();
        if(today >= 7){
            System.out.println("ERROR: Invalid number! Try again below!");
            System.out.println();
            main(args);
        }
        else {
        System.out.print("Enter the number of days elapsed since today: ");
        daysElapsed = scanner.nextInt();

        futureDay = (today + daysElapsed)%7;
        System.out.printf("Today is %s and the future day is %s", numToDays(today), numToDays(futureDay));
        }
    }
    public static String numToDays(int num){
        String days = " ";
        switch(num){
            case 0: days = "Sunday"; break;
            case 1: days = "Monday"; break;
            case 2: days = "Tuesday"; break;
            case 3: days = "Wednesday"; break;
            case 4: days = "Thursday"; break;
            case 5: days = "Friday"; break;
            case 6: days = "Saturday"; break;
        }
        return days;
    }
}

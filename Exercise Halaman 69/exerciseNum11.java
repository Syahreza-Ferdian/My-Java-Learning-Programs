import java.util.Scanner;

public class exerciseNum11 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int currentPopulation = 312032486, futurePopulation, birth, death, immigrant;
        int years, seconds;
        System.out.println("======[ POPULATION PROJECTION ]======");
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        seconds = years * 365 * 24 * 3600;

        birth = seconds / 7;
        death = seconds / 13;
        immigrant = seconds / 45;

        futurePopulation = currentPopulation + birth + immigrant - death;

        System.out.printf("The population in %d years is %d", years, futurePopulation);
    }
}

import java.util.Scanner;

public class exerciseNum21_192 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Loan Amount: ");
        double pinjaman = in.nextDouble();
        System.out.print("Number of years: ");
        int tahun = in.nextInt();

        System.out.printf("%-20s%s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for(double bungaTahun = 5.0; bungaTahun <= 8.0; bungaTahun += 0.125){
            double bungaBulan = bungaTahun/1200;
            double bayarPerBulan = pinjaman * bungaBulan/(1 - 1/Math.pow(1 + bungaBulan, tahun * 12));
            double totalBayar = bayarPerBulan * 12 * tahun;
            System.out.printf("%.3f %% %18.2f %23.2f\n", bungaTahun, bayarPerBulan, totalBayar);
        }
    }
}

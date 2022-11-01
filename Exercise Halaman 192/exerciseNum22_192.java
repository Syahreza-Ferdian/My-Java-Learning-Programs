import java.util.Scanner;

public class exerciseNum22_192 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Loan Amount: ");
        double pinjaman = in.nextDouble();
        System.out.print("Number of Years: ");
        int tahun = in.nextInt();
        System.out.print("Annual Interest Rate: ");
        double bungaTahun = in.nextDouble();

        double bungaBulan = bungaTahun/1200;
        double bayarPerBulan = pinjaman * bungaBulan/(1 - 1/Math.pow(1 + bungaBulan, tahun * 12));
        double totalBayar = bayarPerBulan * 12 * tahun;
        double saldo = pinjaman;

        System.out.printf("\nMonthly Payment: %.2f\n", bayarPerBulan);
        System.out.printf("Total Payment: %.2f\n\n", totalBayar);
        
        System.out.printf("%-20s%s%21s%20s\n", "Payment#", "Interest", "Principal", "Balance");
        for(int payment = 1; payment <= tahun * 12; payment++){
            double bunga = bungaBulan * saldo;
            double bayarPokok = bayarPerBulan - bunga;
            saldo -= bayarPokok;

            System.out.printf("%-20d%.2f%21.2f%23.2f\n", payment, bunga, bayarPokok, saldo);
        }
    }
}

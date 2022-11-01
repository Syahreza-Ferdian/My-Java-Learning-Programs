import java.util.Scanner;

public class exerciseNum30_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan banyaknya uang yang ditabung: ");
        double deposit = scanner.nextDouble();
        System.out.print("Masukkan tingkat bunga per tahun dalam persen: ");
        double bungaTahunan = scanner.nextDouble();
        System.out.print("Masukkan jumlah bulan yang ingin dihitung: ");
        int bulan = scanner.nextInt();

        System.out.printf("\n%-15s%s\n", "Bulan Ke-", "Saldo");
        double saldoSebelumnya = 0;
        double saldoBaru = 0;
        for(int i = 1; i <= bulan; i++){
            saldoBaru = (deposit + saldoSebelumnya)*(1 + (bungaTahunan/1200));
            saldoSebelumnya = saldoBaru;
            System.out.printf("%-15d%.3f\n", i, saldoBaru);
        }
    }   
}

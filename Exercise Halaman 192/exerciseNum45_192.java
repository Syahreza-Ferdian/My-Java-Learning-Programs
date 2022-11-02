import java.util.Scanner;

public class exerciseNum45_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double angka, jumlah = 0, jumlahKuadrat = 0;
        System.out.print("Masukkan 10 angka: ");
        for(int i = 1; i <= 10; i++){
            angka = scanner.nextDouble();
            jumlah += angka;
            jumlahKuadrat += Math.pow(angka, 2);
        }
        double deviasi = Math.sqrt((jumlahKuadrat - (Math.pow(jumlah, 2)/10))/9);
        System.out.printf("Rata-ratanya adalah: %.2f\n", (jumlah/10));
        System.out.printf("Standar deviasinya adalah: %f", deviasi);
    }
}

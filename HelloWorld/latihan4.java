import java.util.Scanner;

public class latihan4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Input bilangan bulat n. Program akan menampilkan semua bilangan dari 1 hingga n.");
        System.out.println("Jika bilangan merupakan kelipatan 3, tampilkan \"FILKOM\".");
        System.out.println("Jika bilangan merupakan kelipatan 4, tampilkan \"UB\".");
        System.out.println("Jika bilangan merupakan kelipatan 3 dan 4, tampilkan \"BRAWIJAYA\".");
        System.out.println(" ");
        System.out.println("Masukkan sebuah bilangan bulat: ");
        int n = scanner.nextInt();
        int i;

        System.out.println("Semua bilangan bulat dari 1 sampai " +n +" adalah: ");
        for(i=1; i<=n; i++){
            if (i%3 == 0 && i%4 == 0) {
                System.out.println("BRAWIJAYA");
            }
            else if (i%3 == 0) {
                System.out.println("FILKOM");
            }
            else if (i%4 == 0) {
                System.out.println("UB");
            }
            else System.out.println(i);
        }
    }
}

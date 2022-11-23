import java.util.Scanner;

public class exerciseNum22_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("====[Program Memperkirakan Nilai Akar Kuadrat Menggunakan Babylonian Method]====");
        System.out.print("Masukkan bilangan yang ingin dihitung: ");
        int bilangan = scanner.nextInt();
        System.out.printf("Hasil akar kuadrat dari bilangan tersebut adalah: %s", Double.toString(squareRoot(bilangan)));
    }
    public static double squareRoot(int n){
        double akarKuadrat = 0;
        double lastGuess = 1;
        double nextGuess;
        while (true) {
            nextGuess = (lastGuess + (n / lastGuess))/2.0;
            if(Math.abs(nextGuess - lastGuess) < 1.0/10000){
                akarKuadrat = nextGuess;
                break;
            }
            else{
                lastGuess = nextGuess;
            }
        }
        return akarKuadrat;
    }
}

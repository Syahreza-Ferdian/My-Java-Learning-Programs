import java.util.Scanner;

public class exerciseNum17_234 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=====[PROGRAM PENAMPIL MATRIKS RANDOM ORDO n x n]=====");
        System.out.print("Masukkan ordo matriks: ");
        int n = scanner.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int elemenMatriks = (int)(Math.random()*2);
                System.out.printf("%d ", elemenMatriks);
            }
            System.out.println();
        }
    }
}

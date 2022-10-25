import java.util.Scanner;

public class exerciseNum17_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();
        for (int i = 1; i <= lines; i++){
            for(int j = 1; j <= (lines-i)*2; j++){
                System.out.print(" ");
            }
            for(int k = i; k >=1; k--){
                System.out.printf("%d ", k);
            }
            for(int l = 2; l <= i; l++){
                System.out.printf("%d ", l);
            }
            System.out.println();
        }
    }
}
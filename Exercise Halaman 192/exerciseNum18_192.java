import java.util.Scanner;

public class exerciseNum18_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lines = 6;
        System.out.print("Please select a pyramid pattern (A, B, C, D): ");
        String selection = scanner.next();
        switch (selection) {
            case "A": {
                System.out.print("Pattern A: \n");
                for(int i = 1; i <= lines; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.printf("%d ",j);
                    }
                    System.out.println();
                }
                break;
            }
            case "B": {
                System.out.print("Pattern B: \n");
                for(int i = lines; i >= 1; i--){
                    for(int j = 1; j <= i; j++){
                        System.out.printf("%d ", j);
                    }
                    System.out.println();
                }
                break;
            }
            case "C": {
                System.out.print("Pattern C: \n");
                for(int i = 1; i <= lines; i++){
                    for(int j = 1; j <= (lines-i)*2; j++){
                        System.out.print(" ");
                    }
                    for(int k = i; k >= 1; k--){
                        System.out.printf("%d ", k);
                    }
                    System.out.println();
                }
                break;
            }
            case "D": {
                System.out.print("Pattern D: \n");
                for(int i = lines; i >= 1; i--){
                    for(int j = 1; j <= (lines-i)*2; j++){
                        System.out.printf(" ");
                    }
                    for(int k = 1; k <= i; k++){
                        System.out.printf("%d ", k);
                    }
                    System.out.println();
                }
                break;
            }
            default: System.out.println("Please enter the right pattern!"); break;
        }
    }        
}    


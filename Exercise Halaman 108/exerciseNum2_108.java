import java.util.Scanner;

public class exerciseNum2_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bilangan1, bilangan2, bilangan3, jawaban, jumlah;
        bilangan1 = (int)(System.currentTimeMillis()%10);
        bilangan2 = (int)(System.currentTimeMillis()/7 % 10);
        bilangan3 = (int)(System.currentTimeMillis()/60 % 10);
        jumlah = bilangan1 + bilangan2 + bilangan3;
        System.out.printf("What is %d + %d + %d? ", bilangan1, bilangan2, bilangan3);
        jawaban = scanner.nextInt();
        
        System.out.printf("%d + %d + %d = %d is %s", bilangan1, bilangan2, bilangan3, jawaban, (jumlah == jawaban));
    }
}
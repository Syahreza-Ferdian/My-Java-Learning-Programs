import java.util.Scanner;

public class exerciseNum41_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int angka, max = 0, hitung = 0;
        System.out.print("Enter number: ");
        do {
            angka = scanner.nextInt();
            if(angka > max){
                max = angka;
                hitung = 1;
            }
            else if(angka == max){
                hitung++;
            }
        } while (angka != 0);
        System.out.printf("The largest number is %d\n", max);
        System.out.printf("The occurence count of the largest number is %d", hitung);
    }
}

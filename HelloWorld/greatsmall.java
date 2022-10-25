import java.util.Scanner;

public class greatsmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3, totalValue;
        double average;
        System.out.println("=======[DETERMINE THE LARGEST AND SMALLEST OF THREE NUMBERS");
        System.out.println("COUNTING ITS TOTAL VALUE, AND AVERAGE]=======");
        System.out.println("Masukkan 3 buah bilangan: ");
        bilangan1 = input.nextInt();
        bilangan2 = input.nextInt();
        bilangan3 = input.nextInt();

        totalValue = bilangan1 + bilangan2 + bilangan3;
        average = totalValue/3;

        if (bilangan1 <= bilangan2 && bilangan1 <= bilangan3) {
            System.out.println("Bilangan terkecil: " +bilangan1);
        }
        else if (bilangan2 <= bilangan3) {
            System.out.println("Bilangan terkecil: " +bilangan2);
        }
        else System.out.println("Bilangan terkecil: " +bilangan3);

        if (bilangan1 >= bilangan2 && bilangan1 >= bilangan3) {
            System.out.println("Bilangan terbesar: " +bilangan1);
        }
        else if (bilangan2 >= bilangan3) {
            System.out.println("Bilangan terbesar: " +bilangan2);
        }
        else System.out.println("Bilangan terbesar: " +bilangan3);
        
        System.out.println("Rata-rata ketiga bilangan: " +average);
        System.out.println("Total ketiga bilangan: " +totalValue);
        input.close();
    }
}

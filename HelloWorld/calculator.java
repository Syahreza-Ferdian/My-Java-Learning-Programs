import java.util.Scanner;

public class calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("======================= CALCULATOR ==========================");
        System.out.println("HANYA SUPPORT INPUT BILANGAN BULAT!");
        mainProcess();
        System.out.println("\n=============================================================");
    }

    public static void mainProcess() {
        int bilangan1, bilangan2;
        String operator;
        System.out.print("Masukkan bilangan pertama\t\t: ");
        bilangan1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan operator (+ - * / ^)\t\t: ");
        operator = scanner.nextLine();
        System.out.print("Masukkan bilangan kedua\t\t\t: ");
        bilangan2 = scanner.nextInt();

        //menggunakan .equals untuk compare string inputan dari scanner dengan tanda operator matematika
        if (operator.equals("+") == true) {
            System.out.printf("Hasil penjumlahan kedua bilangan\t: %d", bilangan1 + bilangan2);
        }
        else if (operator.equals("-") == true) {
            System.out.printf("Hasil pengurangan kedua bilangan\t: %d", bilangan1 - bilangan2);
        }
        else if (operator.equals("*") == true) {
            System.out.printf("Hasil perkalian kedua bilangan\t\t: %d", bilangan1 * bilangan2);
        }
        else if (operator.equals("/") == true) {
            System.out.printf("Hasil pembagian kedua bilangan\t\t: %s", Double.toString((double)bilangan1/bilangan2));
        }
        else if (operator.equals("^") == true) {
            System.out.printf("Hasil pangkat dari kedua bilangan\t: %s", Double.toString(Math.pow(bilangan1, bilangan2)));
        }
        else {
            System.out.println("ERROR: Harap masukkan operator yang sesuai! Coba lagi di bawah!");
            System.out.println();
            mainProcess();
        }
    }
}
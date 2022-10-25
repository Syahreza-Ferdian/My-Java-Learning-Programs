import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        String nilaiString; byte nilaiByte; int nilaiInt;
        float nilaiFloat; double nilaiDouble;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai String: ");
        nilaiString=input.nextLine();
        System.out.println("Masukkan nilai Byte: ");
        nilaiByte=input.nextByte();
        System.out.println("Masukkan nilai integer: ");
        nilaiInt=input.nextInt();
        System.out.println("Masukkan nilai float: ");
        nilaiFloat=input.nextFloat();
        System.out.println("Masukkan nilai Double: ");
        nilaiDouble=input.nextDouble();
        System.out.println("\nDATA YANG SUDAH DIINPUTKAN:");
        System.out.printf("Nilai String     : %s\n", nilaiString);
        System.out.printf("Nilai Byte       : %d\n", nilaiByte);
        System.out.printf("Nilai Integer    : %d\n", nilaiInt);
        System.out.printf("Nilai Float      : %.5f\n", nilaiFloat);
        System.out.printf("Nilai Double     : %.5f\n", nilaiDouble);

        input.close();
    }
}

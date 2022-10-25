import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        int panjang; int lebar; int luas;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang segiempat: ");
        panjang=input.nextInt();
        System.out.println("Masukkan lebar segiempat: ");
        lebar=input.nextInt();
        luas=panjang*lebar;
        System.out.printf("Maka luas bangun segi empat tersebut: %d\n", luas);

        input.close();
    }
}
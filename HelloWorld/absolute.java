import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        int bilangan; int absolute;
        System.out.println("========[Menentukan nilai absolut/nilai mutlak]========= ");
        System.out.println("Masukkan bilangan integer: ");
        try (Scanner input = new Scanner(System.in)){
            bilangan = input.nextInt();
        }
        absolute = (bilangan >= 0)?bilangan:-bilangan;
        System.out.printf("Nilai absolut dari bilangan tersebut adalah: %d\n", absolute);
    }
}
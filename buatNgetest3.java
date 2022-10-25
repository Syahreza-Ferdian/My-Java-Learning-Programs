// import java.util.Scanner;

public class buatNgetest3 {
    // private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String hasil = "SeRiBu Sembilan RAtus Empat Puluh Lima";
        String[] kata = hasil.split(" ");
        for(int i = 0; i<kata.length; i++){
            hasil = kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1).toLowerCase();
            System.out.print(hasil + " ");
        }

        // int jumlah = 0;
        // System.out.print("Enter an integer (the input ends if it is 0): ");
        // int angka = scanner.nextInt();
        // while(angka != 0){
        //     jumlah += angka;
        //     System.out.print("Enter an integer (the input ends if it is 0): ");
        //     angka = scanner.nextInt();
        // }
        // System.out.printf("The sum of all that integers is: %d", jumlah);

        // int jumlah = 0;
        // int angka;
        // do {
        //     System.out.print("Enter an integer (the input ends if it is 0): ");
        //     angka = scanner.nextInt();
        //     jumlah += angka;
        // } while (angka != 0);

        // System.out.printf("The sum of all that integers is: %d", jumlah);
    }
}

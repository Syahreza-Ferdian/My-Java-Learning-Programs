// import java.util.Scanner;

public class buatNgetest3 {
    // private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // String hasil = "SeRiBu Sembilan RAtus Empat Puluh Lima";
        // String[] kata = hasil.split(" ");
        // for(int i = 0; i<kata.length; i++){
        //     hasil = kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1).toLowerCase();
        //     System.out.print(hasil + " ");
        // }

        // for(int i = 0; i <= 10; i++){
        //     if(i >=5 && i <= 8) continue;
        //     System.out.printf("%d ", i); 
        // }
        
        // for(int i = 0, j = 1; i < 8; i++, j++){
        //     System.out.printf("%d + %d = %d\n", i, j, i+j);
        // }

        // int x, y;
        // for(x = 1; x <= 3; x++);{
        //     for(y = 3; y >= 1; y--){
        //         System.out.printf("%d %d\n", x, y);
        //     }
        // }

        // int i;
        // for(i = 0; i <= 5; i++);{
        //     System.out.println(i);
        // }

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

        // for(int i = 1; i <= 5; i++){
        //     for(int k = 5; k >= 1; k--){
        //         System.out.printf("%d %d ", i, k);
        //     }
        // }

        System.out.println("=====[ BUKTI PESANAN TIKET ]=====");
        System.out.printf("%-30s: %s\n", "Jenis Kereta", "Bisnis");
        System.out.printf("%-30s: %d\n", "Jumlah tiket", 1);
        System.out.printf("%-30s: %s\n", "Harga", "100000");
        System.out.printf("%-30s: %s\n", "Diskon", "5 %");
        System.out.printf("%-30s: Rp %,.2f\n", "Total yang harus dibayar", 95000.0);
        System.out.println("------- FASILITAS KERETA --------");
        System.out.printf("%-15s: %s\n", "AC", "Ada");
        System.out.printf("%-15s: %s\n", "Stopkontak", "Tidak Ada");
    }
    public static int hitungFaktorial(int angka){
        int faktorial = 1;
        for(int i = 1; i <= angka; i++){
            faktorial *= i;
        }
        return faktorial;
    }
}

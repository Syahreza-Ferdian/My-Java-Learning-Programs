import java.util.Scanner;
public class exerciseNum11_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 511: ");
        int angka = scanner.nextInt();
        if(angka > 511 || angka < 0){
            System.out.println("Invalid input!");
        }
        else{
            String angkaKeBiner = binerKonv(angka);
            String[][] binerKeMultidimensi = binerKeMultidimensiArr(binerSplit(angkaKeBiner));
            String[][] posisiKoin = statusCoin(binerKeMultidimensi);
            for(int i = 0; i < posisiKoin.length; i++){
                for(int j = 0; j < posisiKoin[i].length; j++){
                    System.out.printf("%s ", posisiKoin[i][j]);
                }
                System.out.println();
            }
        }
        
    }
    public static String binerKonv(int angka){
        String biner = "", sisa;
        int output;
        do {
            sisa = String.valueOf(angka % 2);
            angka /= 2;
            biner = sisa + biner;
        } while (angka != 0);
        output = Integer.parseInt(biner);
        biner = String.format("%09d", output);
        return biner;
    }
    public static String[][] statusCoin(String[][] biner){
        String[][] koin = new String[3][3];
        for(int baris = 0; baris < koin.length; baris++){
            for(int kolom = 0; kolom < koin[baris].length; kolom++){
                koin[baris][kolom] = headTail(Integer.parseInt(biner[baris][kolom]));
            }
        }
        return koin;
    }
    public static String[] binerSplit(String biner){
        String[] output = new String[3];
        for(int i = 0, j = 0; i < biner.length() && j < 3; i+=3, j++){
            output[j] = biner.substring(i, i + 3);
        }
        return output;
    }
    public static String[][] binerKeMultidimensiArr(String[] binerSplit){
        String[][] biner2dArr = new String[3][3];
        for(int baris = 0; baris < biner2dArr.length; baris++){
            for(int kolom = 0; kolom < biner2dArr[baris].length; kolom++){
                biner2dArr[baris][kolom] = binerSplit[baris].substring(kolom, kolom + 1);
            }
        }
        return biner2dArr;
    }
    public static String headTail(int status){
        String output = "";
        if(status == 1) output = "T";
        else if(status == 0) output = "H";
        return output;
    }
}

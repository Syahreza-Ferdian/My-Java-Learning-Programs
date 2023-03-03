import java.util.Scanner;

public class exerciseNum13_360 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah baris dan kolom pada array: ");
        double[][] array = new double[scanner.nextInt()][scanner.nextInt()];
        System.out.println("Masukkan array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = scanner.nextDouble();
            }
        }
        
        Location cariTerbesar = locateLargest(array);

        System.out.printf("Lokasi elemen terbesar adalah %s pada (%d, %d)", String.valueOf(cariTerbesar.nilaiTerbesar), cariTerbesar.baris, cariTerbesar.kolom);
    }
    public static Location locateLargest(double[][] array){
        return new Location(array);
    }
}
class Location{
    public int baris, kolom;
    public double nilaiTerbesar;

    Location(double[][] array){
        nilaiTerbesar = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > nilaiTerbesar){
                    nilaiTerbesar = array[i][j];
                    baris = i;
                    kolom = j;
                }
            }
        }
    }
}
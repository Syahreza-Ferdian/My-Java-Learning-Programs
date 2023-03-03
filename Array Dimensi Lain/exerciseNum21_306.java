import java.util.Scanner;
public class exerciseNum21_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah kota: ");
        double[][] dataKota = new double[scanner.nextInt()][2];
        System.out.println("Masukkan koordinat setiap kota berurutan: ");
        for(int i = 0; i < dataKota.length; i++){
            for(int j = 0; j < dataKota[i].length; j++){
                dataKota[i][j] = scanner.nextDouble();
            }
        }
        double[] jarakAntarKota = cariJarakSetiapKota(dataKota);
        int indexPusatKota = indexKotaJarakTerkecil(jarakAntarKota);
        System.out.printf("Pusat kota adalah kota pada koordinat: (%s, %s)\n", Double.toString(dataKota[indexPusatKota][0]), Double.toString(dataKota[indexPusatKota][1]));
        System.out.printf("Jarak total kota tersebut ke kota yang lain: %.2f", jarakAntarKota[indexPusatKota]);
    }
    public static double hitungJarak(double koordinatX1, double koordinatY1, double koordinatX2, double koordinatY2){
        return Math.sqrt(Math.pow((koordinatX2 - koordinatX1), 2) + Math.pow((koordinatY2 - koordinatY1), 2));
    }
    public static double[] cariJarakSetiapKota(double[][] data){
        double[] jarak = new double[data.length];
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                if(j != i){
                    double koordinatX1 = data[i][0];
                    double koordinatY1 = data[i][1];
                    double koordinatX2 = data[j][0];
                    double koordinatY2 = data[j][1];
                    jarak[i] += hitungJarak(koordinatX1, koordinatY1, koordinatX2, koordinatY2);
                }
            }
        }
        return jarak;
    }
    public static int indexKotaJarakTerkecil(double[] jarak){
        double terdekat = jarak[0];
        int indexKotaTerdekat = 0;
        for(int i = 1; i < jarak.length; i++){
            if(jarak[i] < terdekat){
                terdekat = jarak[i];
                indexKotaTerdekat = i;
            }
        }
        return indexKotaTerdekat;
    }
} 
//TEST CASE
/*
X    Y
2.5  5 
5.1  3
1    9
5.4  54
5.5  2.1
method rumus jarak --> cari rumus jarak --> params koordinat x dan y
pake method rumus jarak --> implement ke data kota --> ketemu jarak setiap kota
simpan jarak setiap kota ke array
sort array --> sort kecil ke besar
ketemu jarak paling kecil --> simpan index nya
panggil index ke main --> ketemu central city
panggil jarak terkecil ke main --> ketemu total distance
 */
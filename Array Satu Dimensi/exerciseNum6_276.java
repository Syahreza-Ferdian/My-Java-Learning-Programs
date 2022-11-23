public class exerciseNum6_276 {
    public static void main(String[] args) {
        int[] prima = new int[51];
        prima[0] = 2;
        int count = 0, angkaTest = 2;
        while(count <= 49){
            if(afakahPrima(angkaTest, prima)){
                count++;
                prima[count] = angkaTest;
            }
            angkaTest++;
        }
        for(int i = 1; i <= count; i++){
            System.out.printf("%3d ", prima[i]);
            if(i % 10 == 0) System.out.println();
        }
    }   
    public static boolean afakahPrima(int angka, int[]prima){
        boolean cekPrima = true;
        for(int i = 0; prima[i] <= Math.sqrt(angka); i++){
            if(angka % prima[i] == 0){
                cekPrima = false;
            }
        }
        return cekPrima;
    }
}

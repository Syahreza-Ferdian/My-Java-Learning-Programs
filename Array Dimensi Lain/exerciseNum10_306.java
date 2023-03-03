public class exerciseNum10_306 {
    public static void main(String[] args) {
        int[][] matriks = new int[4][4];
        for(int baris = 0; baris < matriks.length; baris++){
            for(int kolom = 0; kolom < matriks[baris].length; kolom++){
                matriks[baris][kolom] = (int)(Math.random()*2);
            }
        }
        printMatriks(matriks);
        System.out.printf("The largest row index %d\n", barisTerbesar(matriks));
        System.out.printf("The largest coloumn index %d\n", kolomTerbesar(matriks));
    }
    public static void printMatriks(int[][] array){
        for(int baris = 0; baris < array.length; baris++){
            for(int kolom = 0; kolom < array[baris].length; kolom++){
                System.out.printf("%d", array[baris][kolom]);
            }
            System.out.println();
        }
    }
    public static int barisTerbesar(int[][] array){
        int[] sum = new int[array.length];
        for(int baris = 0; baris < array.length; baris++){
            for(int kolom = 0; kolom < array[baris].length; kolom++){
                sum[baris] += array[baris][kolom];
            }
        }
        int terbesar = sum[0];
        int indexTerbesar = 0;
        for(int i = 1; i < sum.length; i++){
            if(sum[i] > terbesar){
                terbesar = sum[i];
                indexTerbesar = i;
            }
        }
        return indexTerbesar;
    }
    public static int kolomTerbesar(int[][] array){
        int[] sum = new int[array.length];
        for(int kolom = 0; kolom < array.length; kolom++){
            for(int baris = 0; baris < array.length; baris++){
                sum[kolom] += array[baris][kolom];
            }
        }
        int terbesar = sum[0];
        int indexTerbesar = 0;
        for(int i = 1; i < sum.length; i++){
            if(sum[i] > terbesar){
                terbesar = sum[i];
                indexTerbesar = i;
            }
        }
        return indexTerbesar;
    }
}

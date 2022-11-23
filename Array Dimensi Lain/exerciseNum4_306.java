import java.util.Arrays;

public class exerciseNum4_306 {
    public static void main(String[] args) {
        int[][] dataPegawai = {{2, 4, 3, 4, 5, 8, 8},
                                {7, 3, 4, 3, 3, 4, 4},
                                {3, 3, 4, 3, 3, 2, 2},
                                {9, 3, 4, 7, 3, 4, 1},
                                {3, 5, 4, 3, 6, 3, 8},
                                {3, 4, 4, 6, 3, 4, 4}, 
                                {3, 7, 4, 8, 3, 8, 4},
                                {6, 3, 5, 9, 2, 7, 9}};
        int[] jamKerjaPegawai = new int[8];
        String[] output = new String[jamKerjaPegawai.length];
        for(int baris = 0; baris < dataPegawai.length; baris++){
            for(int kolom = 0; kolom < dataPegawai[baris].length; kolom++){
                jamKerjaPegawai[baris] += dataPegawai[baris][kolom];
            }
            output[baris] = String.format("Jam kerja pegawai %d adalah %d", baris, jamKerjaPegawai[baris]);
        }
        sort(output);
        for (String string : output) {
            System.out.println(string);
        }
    }
    public static void sort(String[] array){
        int maksimal, maksimal2;
        for(int i = 0; i < array.length; i++){
            int panjangArr = array[i].length();
            maksimal = Integer.valueOf(array[i].substring(panjangArr - 2, panjangArr));
            for(int j = i + 1; j < array.length; j++){
                String temp = " ";
                maksimal2 = Integer.valueOf(array[j].substring(panjangArr - 2, panjangArr));
                if(maksimal2 > maksimal){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // for(int i = 0; i < array.length; i++){
        //     System.out.println(array[i]);
        // }
    }
    // public static void urutkan(int[] array){
    //     for(int i = 0; i < array.length; i++){
    //         for(int j = i + 1; j < array.length; j++){
    //             int temp;
    //             if(array[i] < array[j]){
    //                 temp = array[i];
    //                 array[i] = array[j];
    //                 array[j] = temp;
    //             }
    //         }
    //     }
    // }
}
/*
Jam kerja pegawai 2 adalah 20
01234567891123456789212345678
substring (27, 29)
 */
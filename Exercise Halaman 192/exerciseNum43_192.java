public class exerciseNum43_192 {
    public static void main(String[] args) {
        int jumlah = 0;
        System.out.println("Kombinasi 2 angka berbeda dari 1 sampai 7: ");
        for(int i = 1; i <= 7; i ++){
            for(int j = 1; j <= 7; j++){
                if(i != j && i < j){
                    System.out.printf("%d %d\n", i, j);
                    jumlah++;
                }
            }
        }
        System.out.printf("Jumlah kombinasi tersebut adalah: %d", jumlah);
    }
}
/*
1 2
1 3
1 4
1 5
1 6
1 7
2 3
2 4
2 5
2 6
2 7
3 4
3 5
...
 */
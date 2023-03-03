import java.util.Scanner;

public class UAP_2021_3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[][] data = new int[N][N];
        int permen = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = scanner.nextInt();
            }
        }
        int baris = N - 1, kolom = 0;
        int permenBerikutnya = 0;
        final int LIMIT_BARIS = 0;
        final int LIMIT_KOLOM = N - 1;
        do{
            
            // int permenBerikutnya = (data[baris-1][kolom] > data[baris][kolom + 1])? data[baris-1][kolom] : data[baris][kolom+1];
            
                if(data[baris-1][kolom] > data[baris][kolom + 1]) {
                    permenBerikutnya = data[baris - 1][kolom];
                    baris = baris - 1;
                    kolom = kolom + 0;
                }
                else if(data[baris-1][kolom] < data[baris][kolom + 1]) {
                    permenBerikutnya = data[baris][kolom + 1];
                    baris = baris + 0;
                    kolom = kolom + 1;
                }
                else if(data[baris-1][kolom] == data[baris][kolom + 1]){
                    if(baris - 1 >= 0 && kolom + 2 < N){
                        if((data[baris-1][kolom + 1] > data[baris][kolom + 2])){
                            permenBerikutnya = data[baris-1][kolom+1];
                            baris = baris - 1;
                            kolom = kolom + 1;
                        }
                        else if((data[baris-1][kolom + 1] < data[baris][kolom + 2])){
                            permenBerikutnya = data[baris][kolom + 2];
                            baris = baris + 0;
                            kolom = kolom + 2;
                        }
                    }
                    else{
                        permenBerikutnya = data[baris][kolom + 1];
                        kolom = kolom + 1;
                        baris = baris + 0;
                    }
                }
                // baris = (data[baris-1][kolom] > data[baris][kolom + 1])?baris-1:baris;
                // kolom = (data[baris-1][kolom] > data[baris][kolom + 1])?kolom:kolom+1;
                if(baris == LIMIT_BARIS){
                    permenBerikutnya = data[baris][kolom + 1];
                }
                if(kolom == LIMIT_KOLOM){
                    permenBerikutnya = data[baris - 1][kolom];
                }
                permen +=  data[baris][kolom] + permenBerikutnya;
        }while(baris >= LIMIT_BARIS && kolom >= LIMIT_KOLOM);
        System.out.println(permenBerikutnya);
    }
    
}

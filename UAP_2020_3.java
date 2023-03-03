import java.util.Scanner;

public class UAP_2020_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int b = in.nextInt();
        in.nextLine();
        String[][] peta = new String[m][n];
        for(int i = 0; i < peta.length; i++){
            String input = in.nextLine();
            for(int j = 0; j < input.length(); j++){
                peta[i][j] = input.substring(j, j+1);
            }
        }
        int baris = 0, kolom = 0;
        int count = 0;
        while(baris < m){
            kolom += r;
            baris += b;
            if(baris > m - 1) break;
            if(kolom > n - 1) kolom -= n;
            if(peta[baris][kolom].equals("#")) count++;
        }
        System.out.println(count);
    }
    
}

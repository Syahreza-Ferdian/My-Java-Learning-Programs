package Praktikum;

public class pyramidNumLoop {
    public static void main(String[] args) {
        int baris = 20;
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= (baris - i)*2; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k ++){
                System.out.printf("%2d  ", k);
            }
            for(int j = i-1; j >= 1; j--){
                System.out.printf("%2d  ", j);
            }
            System.out.println();
        }
    }
}

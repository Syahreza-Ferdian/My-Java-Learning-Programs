package Praktikum;

public class loop3 {
    public static void main(String[] args) {
        int barisVertikal = 10;
        for(int i = barisVertikal; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        // for(int i = 1; i <= barisVertikal; i++){
        //     for(int j = barisVertikal; j >= i; j--){
        //         System.out.printf("%d ", j);
        //     }
        //     System.out.println();
        // }
        for(int i = 1; i <= barisVertikal; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}

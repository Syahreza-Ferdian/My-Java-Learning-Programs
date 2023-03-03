package Praktikum;

public class loop2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++){
            System.out.print("R ");
            if(i == 1){
                for(int j = 1; j <= 5; j++){
                    System.out.print("R ");
                }
            }
            if(i >= 2 && i <= 4){
                for(int k = 1; k <= 5; k++){
                    System.out.print("a ");
                }
            }
            System.out.println();
        }
    }   
}

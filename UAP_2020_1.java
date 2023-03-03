import java.util.Scanner;

public class UAP_2020_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int count = 0, i = 2;
        long primorial = 1;
        while(count < n){
            if(afakahPrima(i)){
                primorial *= i;
                count++;
            }
            i++;
        }
        System.out.println(primorial);
    }
    public static boolean afakahPrima(int angka){
        for(int i = 2; i <= angka/2; i++){
            if(angka % i == 0) return false;
        }
        return true;
    }
}

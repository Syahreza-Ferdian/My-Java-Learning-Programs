import java.util.Scanner;
public class exerciseNum30_276 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the values: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        if (isConsecutiveFour(array)) System.out.print("The list has consecutive fours");
        else System.out.print("The list has no consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] array){
        int count = 0 ;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < i + 4 && j < array.length; j++){
                if(array[i] == array[j]) count++;
            }
            if(count == 3) break;
        }
        boolean empatSamaBerurutan = (count == 3)?true:false;
        return empatSamaBerurutan;
    }
}

import java.util.Scanner;
public class exerciseNum16_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] test = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        sort(test);

        System.out.print("{");
        for(int i = 0; i < test.length; i++){
            System.out.print("{");
            for(int j = 0; j < test[i].length; j++){
                if(j == 0) System.out.printf("%d, ", test[i][j]);
                else System.out.printf("%d", test[i][j]);
            }
            if(i == test.length - 1) System.out.print("}");
            else System.out.print("}, ");
        }
        System.out.print("}");
    }
    public static void sort(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j][0] < array[i][0]){
                    int temp[] = {array[i][0], array[i][1]};
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j][1] < array[i][1] && array[j][0] == array[i][0]){
                    int temp[] = {array[i][0], array[i][1]};
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
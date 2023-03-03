import java.util.ArrayList;

public class klinikKoding1 {
    public static void main(String[] args) {
        //LOOPING
        // int sum = 0;
        // for (int i = 0; i < 10; i++) {
        //     if(i == 5) continue;
        //     // if(i == 5) break;
        //     System.out.println(i);
        //     sum += i;
        // }
        // System.out.println(sum);

        // int[] i = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        // for (int item : i) {
        //     System.out.println(item);
        // }

        // int i = 0, sum = 0;
        // while (i < 10) {
        //     System.out.println(i);
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);

        //ARRAY
            //ARRAY LIST
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(1.0);
        array.add(2.0);
        array.add(3.5);
        
        for (double a : array) {
            System.out.println(a);
        }
        
    }
}

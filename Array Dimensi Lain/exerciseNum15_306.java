import java.util.Scanner;
public class exerciseNum15_306 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] point = new double[5][2];
        System.out.print("Masukkan 5 titik koordinat: ");
        for(int i = 0; i < point.length; i++){
            for(int j = 0; j < point[i].length; j++){
                point[i][j] = scanner.nextDouble();
            }
        }
        sameLine(point);
    }
    public static double kedudukanTitik(double x0, double y0, double x1, double y1, double x2, double y2){
        return ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
    }
    public static void sameLine(double[][] point){
        double total = 0;
        for(int i = 0; i < point.length; i++){
            for(int j = 0; j < point[i].length; j++){
                for(int k = 0; k < point[i].length; k++){
                    if(i != j && i != k && j != k && i != j && j > i && k > i && k > j){
                        double x0 = point[i][0];
                        double y0 = point[i][1];
                        double x1 = point[j][0];
                        double y1 = point[j][1];
                        double x2 = point[k][0];
                        double y2 = point[k][1];
                        total += kedudukanTitik(x0, y0, x1, y1, x2, y2);
                    }
                }
            }
        }
        System.out.println(total);
        
    }
}
/*
TEST CASE
X Y
1 1
2 2
3 3
4 4 
5 5
 */
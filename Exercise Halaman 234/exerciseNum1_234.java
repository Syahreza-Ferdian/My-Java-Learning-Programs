public class exerciseNum1_234 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 100; i++){
            System.out.printf("%d, ", getPentagonalNumber(i));
            count++;
            if(count % 10 == 0) System.out.println();
        }
    }
    public static int getPentagonalNumber(int n){
        int pentagonal = (n*(3*n - 1))/2;
        return pentagonal;
    }
}

public class array {
    public static void main(String[] args){
        int n;
        int [] square = new int [10];

        for(n = 0; n<=9; n++){
            square [n] = (int) Math.pow((double)n, (double)2);
            System.out.println(square[n]);
        }
    }
}

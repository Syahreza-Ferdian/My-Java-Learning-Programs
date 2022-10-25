public class exerciseNum19_192 {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= (8-i)*2; j++){
                System.out.print("   ");
            }
            for(int k = 1; k <= (int)(Math.pow(2, (i-1))); k=k*2){
                System.out.printf("%3d   ", k);
            }
            for(int l = (int)(Math.pow(2, (i-2))); l >=1 ; l=l/2){
                System.out.printf("%3d   ", l);
            }
            System.out.println();
        }
    }
}
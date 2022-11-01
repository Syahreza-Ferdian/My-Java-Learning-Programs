public class exerciseNum20_192 {
    public static void main(String[] args) {
        int countPerLine = 0;
        System.out.println("Bilangan prima antara 2 sampai 1000 adalah: ");
        for(int bil = 2; bil <=1000; bil++){
            int count = 0;
            for(int pembagi = 1; pembagi <= bil; pembagi++ ){
                if(bil % pembagi == 0){
                    count++;
                }
            }
            // System.out.println(count);
            if(count == 2){
                System.out.printf("%3d ", bil);
                countPerLine++;
                if(countPerLine % 8 == 0) System.out.println();
            }
        }
    }
}
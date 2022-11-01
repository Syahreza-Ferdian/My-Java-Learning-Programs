public class exerciseNum27_192 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Tahun kabisat dari tahun 101 sampai 2100: \n");
        for(int i = 101; i <= 2100; i++){
            if((i % 400 == 0)||(i % 4 == 0 && i % 100 != 0)){
                count++;
                System.out.printf("%d ", i);
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }   
}

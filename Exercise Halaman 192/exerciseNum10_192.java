public class exerciseNum10_192 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Di bawah ini adalah angka dari 100 sampai 1000 yang habis dibagi 5 dan 6: ");
        for(int i = 100; i <= 1000; i ++){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.printf("%d ", i);
                count ++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
            
        }
    }
}
